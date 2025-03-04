/**
 * Author: Matěj Šťastný
 * Date created: 4/30/2024 (v2 - 3/3/2025)
 * Github link: https://github.com/kireiiiiiiii/flaggi
 */

package kirei.mplayer;

import java.awt.Image;
import java.io.File;
import java.util.List;

import javax.swing.SwingUtilities;

import kirei.mplayer.ui.AlbumCoverDisplay;

public class App {

    // Index of the song to be played by the MusicPlayer
    private static final int SONG_INDEX = 0;

    public static void main(String[] args) {

        // listFilesInJarDirectory("sounds/");

        // Makes the runnable for the app starup
        Runnable app = () -> {

            // Creates a new AlbumCover GUI
            AlbumCoverDisplay frame = new AlbumCoverDisplay();

            // Finds the path to the soundtrack folder
            String songPath = "sounds/";

            // Creates a new MusicPlayer object, and supresses the warning, because there
            // it's annoying
            @SuppressWarnings("resource")
            MusicPlayer mp = new MusicPlayer(songPath);

            List<String> titles = mp.getTitles();
            System.out.println(titles);

            List<String> names = mp.getNames();
            System.out.println(names);

            // Plays a song
            mp.play(titles.get(SONG_INDEX));

            // Finds the artwork of the song, and displays it in the frame
            Image artwork = mp.getCover(titles.get(SONG_INDEX));
            if (artwork != null) {
                frame.setAlbumCoverImage(artwork);
            }
        };

        // Runs the app
        SwingUtilities.invokeLater(app);
    }

    /* PATH GETTERS */

    /**
     * Finds the name of the java file it was executed in
     *
     * @return returns a string "fileName.java"
     */
    public static String getFileName() {
        // Get the name of the class (excluding the package) and append ".java"
        String className = new Object() {
        }.getClass().getEnclosingClass().getSimpleName();
        String fileName = className + ".java";
        return fileName;
    }

    /**
     * Finds the path of the folder, where the java file this method was executed in
     * is located
     *
     * @return String with path
     */
    public static String getPath() {
        String fileName = getFileName();
        int nameLenght = fileName.length();
        File folder = new File(fileName);
        String absolutePath = folder.getAbsolutePath();
        int pathLenght = absolutePath.length();
        return absolutePath.substring(0, pathLenght - nameLenght - 1);
    }

}
