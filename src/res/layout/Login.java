package src.res.layout;

import javax.swing.*;

public class Login extends JFrame{
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JButton daftarButton;
    private JLabel emaiLabel;
    private JLabel passwordLabel;
    private JPanel mainPanel;

    public Login() {
        super("Cinema Self Ticketing System");
        this.setContentPane(mainPanel);
        this.setSize(530, 550);
        this.setVisible(true);
        daftarButton.addActionListener(e -> {
            new Registration();
            this.dispose();
        });
    }
}
