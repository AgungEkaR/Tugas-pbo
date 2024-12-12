import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class LoginWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2, 5, 5));
 
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JButton cancelButton = new JButton("Cancel");
 
        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(cancelButton);
 
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
 
                if (username.equals("argya1") && password.equals("argya2")) {
                    JOptionPane.showMessageDialog(frame, "Login Berhasil!");
                    frame.dispose();
                    ImageViewer.showImageViewer();
                } else {
                    JOptionPane.showMessageDialog(frame, "Login Gagal. Periksa username atau password.");
                }
            }
        });
        cancelButton.addActionListener(e -> frame.dispose());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
