package src.res.layout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame{
    private JTextField namaLengkapField;
    private JPasswordField passwordField1;
    private JRadioButton lakiLakiRadioButton;
    private JRadioButton perempuanRadioButton;
    private JButton submitButton;
    private JLabel namaLengkapLabel;
    private JPanel mainPanel;
    private JLabel kataSandiLabel;
    private JLabel jenisKelaminLabel;
    private JPasswordField passwordField2;
    private JTextField emailField;
    private JLabel emailLabel;
    private JLabel ulangSandiLabel;
    private JButton loginButton;
    private JSpinner umurSpinner;
    private JLabel umurLabel;
    private JLabel umurField;

    public Registration() {
        //Menentukan judul aplikasi
        super ("Cinema Self Ticketing System");
        //Menentukan apa yang terjadi jika tombol[x] ditekan
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Menentukan resolusi window/frame
        this.setSize(530, 550);
        //menentukan panel mana yang akan dijadikan konten
        this.setContentPane(mainPanel);
        //menentukan jika tombol submit ditekan
        submitButton.addActionListener(e -> {
           String nama = namaLengkapField.getText();
           String email = emailField.getText();
           char[] password = passwordField1.getPassword();
           char[] ulangPassword = passwordField2.getPassword();
           JOptionPane.showMessageDialog(null, "Hallo " + nama + " Data Anda Berhasil Terkirim, Silahkan Untuk Login" );
        });

        loginButton.addActionListener(e -> {
            new Login();
            this.dispose();
        });
    }

    public static void main(String[] args) {
        JFrame mainFrame = new Registration();
        mainFrame.setVisible(true);
    }


}
