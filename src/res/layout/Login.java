import javax.swing.*;

public class Login {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JButton daftarButton;
    private JLabel emaiLabel;
    private JLabel passwordLabel;

    public Login() {
        //Menentukan judul aplikasi
        super ("Cinema Self Ticketing System");
        //Menentukan apa yang terjadi jika tombol[x] ditekan
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Menentukan resolusi window/frame
        this.setSize(530, 550);
        //menentukan panel mana yang akan dijadikan konten
        this.setContentPane(mainPanel);
    }
}
