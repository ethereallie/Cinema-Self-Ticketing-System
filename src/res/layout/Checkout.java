package src.res.layout;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class Checkout extends JFrame{

    Font poppinsBold;
    Font poppinsRegular;
    public static void main(String[] args) {
        new Checkout();
    }
    public Checkout(){
        initComponent();
    }
    private void initComponent(){
        // Font Configuration
        try{
            poppinsRegular = Font.createFont(Font.TRUETYPE_FONT, new File("src/res/font/Poppins-Regular.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/res/font/Poppins-Regular.ttf")));

        }
        catch (IOException | FontFormatException e){}

        try{
            poppinsBold = Font.createFont(Font.TRUETYPE_FONT, new File("src/res/font/Poppins-Bold.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/res/font/Poppins-Bold.ttf")));

        }
        catch (IOException | FontFormatException e){}

        JFrame checkoutFrame = new JFrame("Checkout");
        checkoutFrame.setSize(480, 720);
        checkoutFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        checkoutFrame.setLocationRelativeTo(null);
        checkoutFrame.setLayout(null);


        //checkout title label
        JLabel labelTitle = new JLabel("Checkout");
        labelTitle.setBounds(153,32,144,45);
        labelTitle.setFont(poppinsRegular.deriveFont(30f));

        //image
        ImageIcon filmImage = new ImageIcon("src/res/image/image1.png");
        JLabel imageLabel = new JLabel(filmImage);
        imageLabel.setBounds(153,95,144,194);

        //Movie Detail
        JLabel movieTitle = new JLabel("Star Wars (2030)");
        movieTitle.setBounds(50,309,152,27);
        movieTitle.setFont(poppinsRegular.deriveFont(18f));

        JLabel labelStudio = new JLabel("Studio 3");
        labelStudio.setBounds(334,311,79,24);
        labelStudio.setFont(poppinsBold.deriveFont(16f));
        labelStudio.setForeground(Color.RED);

        JLabel labelDate = new JLabel("Minggu, 1 Maret 2023");
        labelDate.setBounds(50,342,150,18);
        labelDate.setFont(poppinsRegular.deriveFont(14f));

        JLabel labelTime = new JLabel("17:00");
        labelTime.setBounds(50,366,100,18);
        labelTime.setFont(poppinsRegular.deriveFont(14f));

        JLabel labelSeat = new JLabel("D1 | D2");
        labelSeat.setBounds(331,346,100,33);
        labelSeat.setFont(poppinsRegular.deriveFont(22f));


        JLabel labelSubTotal = new JLabel("Sub Total");
        labelSubTotal.setBounds(51,416,100,18);
        labelSubTotal.setFont(poppinsRegular.deriveFont(14f));

        JLabel labelPajak = new JLabel("Pajak");
        labelPajak.setBounds(51,433,100,18);
        labelPajak.setFont(poppinsRegular.deriveFont(14f));

        JLabel labelSubTotalValue = new JLabel("200.000");
        labelSubTotalValue.setBounds(349,416,100,18);
        labelSubTotalValue.setFont(poppinsRegular.deriveFont(14f));


        JLabel labelPajakValue = new JLabel("22.000");
        labelPajakValue.setBounds(357,433,100,18);
        labelPajakValue.setFont(poppinsRegular.deriveFont(14f));

        JLabel labelTotal = new JLabel("Total Pembayaran");
        labelTotal.setBounds(51,461,150,18);
        labelTotal.setFont(poppinsBold.deriveFont(14f));

        JLabel labelTotalValue = new JLabel("222.000");
        labelTotalValue.setBounds(349,461,100,18);
        labelTotalValue.setFont(poppinsBold.deriveFont(14f));

        JLabel labelMetodePembayaran = new JLabel("Metode Pembayaran");
        labelMetodePembayaran.setBounds(51,507,150,18);
        labelMetodePembayaran.setFont(poppinsRegular.deriveFont(14f));

        JRadioButton radioButtonQris = new JRadioButton("QRIS");
        radioButtonQris.setBounds(51,538,150,18);
        radioButtonQris.setFont(poppinsRegular.deriveFont(14f));

        JRadioButton radioButtonCard = new JRadioButton("Credit Card/ Debit Card");
        radioButtonCard.setBounds(51,561,200,18);
        radioButtonCard.setFont(poppinsRegular.deriveFont(14f));

        JRadioButton radioButtonMBanking = new JRadioButton("Mobile Banking (Mandiri)");
        radioButtonMBanking.setBounds(51,584,200,18);
        radioButtonMBanking.setFont(poppinsRegular.deriveFont(14f));

        ButtonGroup paymentGroup = new ButtonGroup();
        paymentGroup.add(radioButtonCard);
        paymentGroup.add(radioButtonMBanking);
        paymentGroup.add(radioButtonQris);

        JButton paymentButton = new JButton("Lanjut ke Pembayaran");
        paymentButton.setBounds(101,632,248,29);
        paymentButton.setFont(poppinsRegular.deriveFont(14f));



        JLabel[] arrayUI = {
                movieTitle, imageLabel, labelTitle, labelStudio, labelDate, labelTime, labelSeat, labelSubTotal, labelPajak, labelPajakValue, labelSubTotalValue, labelTotal, labelTotalValue, labelMetodePembayaran
        };

        for (JLabel jLabel : arrayUI) {
            checkoutFrame.add(jLabel);
        }
        checkoutFrame.add(radioButtonQris);
        checkoutFrame.add(radioButtonCard);
        checkoutFrame.add(radioButtonMBanking);
        checkoutFrame.add(paymentButton);
        checkoutFrame.setVisible(true);
    }



}
