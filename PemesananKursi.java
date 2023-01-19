package PemesananKursiBioskop;

import javax.management.MBeanRegistration;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PemesananKursi extends JFrame {

    private JFrame previewpemesanan;
    private JButton d2Button;
    private JButton b2Button;
    private JButton a2Button;
    private JButton a1Button;
    private JButton b1Button;
    private JButton c2Button;
    private JButton a3Button;
    private JButton b5Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton b6Button;
    private JButton b3Button;
    private JButton d3Button;
    private JButton c3Button;
    private JButton d4Button;
    private JButton c4Button;
    private JButton c1Button;
    private JButton d1Button;
    private JButton d5Button;
    private JButton c5Button;
    private JButton c6Button;
    private JButton d6Button;
    private JButton c7Button;
    private JButton d7Button;
    private JButton e8Button;
    private JButton e9Button;
    private JButton e7Button;
    private JButton e6Button;
    private JButton e5Button;
    private JButton e4Button;
    private JButton e3Button;
    private JButton e2Button;
    private JButton e1Button;
    private JButton f1Button;
    private JButton f2Button;
    private JButton f3Button;
    private JButton f4Button;
    private JButton f5Button;
    private JButton f6Button;
    private JButton f7Button;
    private JButton f8Button;
    private JButton f9Button;
    private JButton NEXTButton;
    private JPanel mainPanel;

    public PemesananKursi() {
        super("Aplikasi Pemesanan Tiket Bioskop");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(450, 720);
        this.setContentPane(mainPanel);
        this.pack();
        previewpemesanan = new PreviewPemesanan();
        PemesananKursi pemesanankursi = new PemesananKursi();
        NEXTButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pemesanankursi.setVisible(false);
                previewpemesanan.setVisible(true);
            }
        });
    }

    private static JFrame mainFrame;

    public static void main(String[] args) {
        mainFrame = new PemesananKursi();
        mainFrame.setVisible(true);
        JButton NEXTButton = new JButton("Next");
        NEXTButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Menutup form PemesananKursi saat ini
                mainFrame.setVisible(false);

                // Membuat objek form PreviewPemesanan
                PreviewPemesanan previewPemesanan = new PreviewPemesanan();
                previewPemesanan.setVisible(true);

                JButton backButton = new JButton("Back");
                backButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Menutup form PreviewPemesanan saat ini
                        previewPemesanan.setVisible(false);
                        // Menampilkan form PemesananKursi
                        mainFrame.setVisible(true);
                    }
                });
                previewPemesanan.add(backButton);
            }
        });
        mainFrame.add(NEXTButton);
    }
}



