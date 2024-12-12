import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
 
public class ImageViewer {
    public static void showImageViewer() {
        JFrame frame = new JFrame("Image Viewer");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
 
        JLabel imageLabel = new JLabel("No Image Selected", SwingConstants.CENTER);
        imageLabel.setFont(new Font("Arial", Font.BOLD, 16));
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JButton openButton = new JButton("Open Image");
 
        frame.add(imageLabel, BorderLayout.CENTER);
        frame.add(openButton, BorderLayout.SOUTH);
 
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
                        "Image Files", "jpg", "jpeg", "png", "gif"));
 
                int result = fileChooser.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
                    Image scaledImage = imageIcon.getImage().getScaledInstance(
                            imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
                    imageLabel.setIcon(new ImageIcon(scaledImage));
                    imageLabel.setText("");
                }
            }
        });
 
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}