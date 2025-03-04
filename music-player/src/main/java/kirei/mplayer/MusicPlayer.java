package kirei.mplayer;

import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import javax.imageio.ImageIO;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.datatype.Artwork;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

public class MusicPlayer implements Closeable {

    private final Map<String, AdvancedPlayer> mps = new HashMap<>();
    private final Map<String, Image> covers = new HashMap<>();
    private final Map<String, String> songNames = new HashMap<>();
    private final List<String> titles = new ArrayList<>();
    private final String resourcePath;

    public MusicPlayer(String resourceFolder) {
        this.resourcePath = resourceFolder;
        updatePlayers();
    }

    @Override
    public void close() {
        for (AdvancedPlayer player : mps.values()) {
            player.close();
        }
    }

    public boolean play(String title) {
        if (!titles.contains(title.toLowerCase()))
            return false;

        AdvancedPlayer player = mps.get(title.toLowerCase());
        new Thread(() -> {
            try {
                player.play();
            } catch (JavaLayerException e) {
                System.err.println("Failed to play: " + title);
                e.printStackTrace();
            }
        }).start();

        return true;
    }

    public List<String> getTitles() {
        return new ArrayList<>(titles);
    }

    public List<String> getNames() {
        List<String> names = new ArrayList<>();
        for (String title : titles) {
            names.add(songNames.getOrDefault(title, title));
        }
        return names;
    }

    public Image getCover(String title) {
        return covers.getOrDefault(title, null);
    }

    private void updatePlayers() {
        mps.clear();
        titles.clear();

        List<String> mp3Files = getMusicFiles();
        System.out.println(mp3Files.size());
        int failedImports = 0;

        for (String fileName : mp3Files) {
            String title = extractTitle(fileName);
            System.out.println("TT: " + title);
            titles.add(title);

            Tag tag = getSongTag(fileName);
            songNames.put(title, tag != null ? tag.getFirst(FieldKey.TITLE) : title);
            covers.put(title, extractCover(tag));

            try (InputStream inputStream = getResourceStream(fileName)) {
                if (inputStream != null) {
                    mps.put(title, new AdvancedPlayer(new BufferedInputStream(inputStream)));
                } else {
                    throw new IOException("Failed to load stream: " + fileName);
                }
            } catch (IOException | JavaLayerException e) {
                System.err.println("Error loading: " + fileName);
                e.printStackTrace();
                failedImports++;
            }
        }

        if (failedImports > 0) {
            System.out.println("Failed to import " + failedImports + " files.");
        }
    }

    private InputStream getResourceStream(String fileName) {
        return getClass().getClassLoader().getResourceAsStream(resourcePath + "/" + fileName);
    }

    private Tag getSongTag(String fileName) {
        try (InputStream is = getResourceStream(fileName)) {
            if (is == null)
                return null;

            // Create a temporary file
            File tempFile = File.createTempFile("song", ".mp3");
            tempFile.deleteOnExit();
            Files.copy(is, tempFile.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);

            AudioFile audioFile = AudioFileIO.read(tempFile);
            return audioFile.getTag();
        } catch (Exception e) {
            System.err.println("Failed to read metadata for: " + fileName);
            e.printStackTrace();
            return null;
        }
    }

    private Image extractCover(Tag tag) {
        if (tag == null)
            return null;
        Artwork aw = tag.getFirstArtwork();
        if (aw == null)
            return null;

        try {
            return ImageIO.read(new ByteArrayInputStream(aw.getBinaryData()));
        } catch (IOException e) {
            return null;
        }
    }

    private List<String> getMusicFiles() {
        List<String> files = new ArrayList<>();
        try {
            // Get the JAR file location
            URL jarURL = App.class.getProtectionDomain().getCodeSource().getLocation();
            String jarFilePath = new java.io.File(jarURL.toURI()).getPath();

            // Open the JAR file
            try (JarFile jarFile = new JarFile(jarFilePath)) {
                Enumeration<JarEntry> entries = jarFile.entries();

                // Iterate through all entries
                while (entries.hasMoreElements()) {
                    JarEntry entry = entries.nextElement();
                    String entryName = entry.getName();

                    // Check if the entry is in the specified directory
                    if (entryName.startsWith(this.resourcePath) && !entry.isDirectory()) {
                        files.add(entryName.substring(this.resourcePath.length()));
                    }
                }
            }
        } catch (IOException | URISyntaxException e) {
            System.err.println("Error accessing JAR file: " + e.getMessage());
        }
        return files;
    }

    private String extractTitle(String fileName) {
        System.out.println("FF: " + fileName);
        int i = fileName.indexOf('/');
        fileName = i > -1 ? fileName.substring(i) : fileName;
        return fileName.substring(0, fileName.length() - 4).toLowerCase();
    }
}
