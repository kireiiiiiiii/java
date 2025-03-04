/**
 * Author: Matěj Šťastný
 * Date created: 4/30/2024
 *
 * {@JFrame} app to display song artwork.
 */

package kirei.mplayer.ui;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.JFrame;

public class AlbumCoverDisplay extends JFrame {

    private ImagePanel coverPanel;

    public AlbumCoverDisplay() {
        setTitle("Album Cover Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(300, 300);
        setLocationRelativeTo(null); // Center the frame on the screen

        coverPanel = new ImagePanel();
        getContentPane().add(coverPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void setAlbumCoverImage(Image image) {
        coverPanel.setImage(image);
        coverPanel.repaint();
    }
}
