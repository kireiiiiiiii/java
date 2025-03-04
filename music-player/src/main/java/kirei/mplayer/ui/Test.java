package kirei.mplayer.ui;

import javax.swing.*;
import java.awt.event.*;

public class Test extends JFrame implements ActionListener {
    JButton button;

    public Test() {
        setTitle("Folder Chooser Example");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        button = new JButton("Choose Folder");
        button.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(button);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(this, "Selected folder: " + fileChooser.getSelectedFile().getPath());
            }
        }
    }

    public static void main(String[] args) {
        new Test();
    }
}
