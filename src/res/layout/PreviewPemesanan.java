package src.res.layout;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PreviewPemesanan extends JFrame {
    private JButton BACKButton;
    private JButton NEXTButton;
    private JPanel mainPanel2;

    public PreviewPemesanan() {
        super("Aplikasi Pemesanan Tiket Bioskop");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(450, 720);
        this.setContentPane(mainPanel2);
        PemesananKursi pemesanankursi = new PemesananKursi();
        BACKButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mainPanel2.setVisible(false);
                pemesanankursi.setVisible(true);
            }
        });
    }
}
