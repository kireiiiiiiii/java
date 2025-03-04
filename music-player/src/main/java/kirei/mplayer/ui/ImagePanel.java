/**
 * Author: Matěj Šťastný
 * Date created: 4/30/2024
 *
 * Image panel to display song artwork on a {@code JFrame}.
 */

package kirei.mplayer.ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class ImagePanel extends JPanel {

    // Artwork reference
    private Image artwork;

    /**
     * Artwork accesor.
     *
     * @return {@code Image} object reference of the artwork.
     */
    public Image getImage() {
        return artwork;
    }

    /**
     * Artwork modifier.
     *
     * @param artwork - {@code Image} object reference as the new artwork.
     */
    public void setImage(Image artwork) {
        this.artwork = artwork;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (artwork != null) {
            g.drawImage(artwork, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
