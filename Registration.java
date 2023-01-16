import javax.swing.*;

public class Registration extends JFrame{
    private JTextField namaLengkapField;
    private JPasswordField kataSandiField;
    private JRadioButton lakiLakiRadioButton;
    private JRadioButton perempuanRadioButton;
    private JButton submitButton;
    private JLabel namaLengkapLabel;
    private JPanel mainPanel;
    private JLabel kataSandiLabel;
    private JLabel jenisKelaminLabel;
    private JPasswordField passwordField1;
    private JTextField textField1;
    private JLabel email;
    private JLabel ulangSandi;

    public Registration() {
        //Menentukan judul aplikasi
        super ("Formulir Registration");
        //Menentukan apa yang terjadi jika tombol[x] ditekan
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Menentukan resolusi window/frame
        this.setSize(600, 800);
        //menentukan panel mana yang akan dijadikan konten
        this.setContentPane(mainPanel);

    }

    public static void main(String[] args) {
        JFrame mainFrame = new Registration();
        mainFrame.setVisible(true);
    }


}
