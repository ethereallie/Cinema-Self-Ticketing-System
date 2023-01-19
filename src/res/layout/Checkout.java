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
            poppinsRegular = Font.createFont(Font.TRUETYPE_FONT, new File("src/res/font/Poppins-Regular.ttf")).deriveFont(30f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/res/font/Poppins-Regular.ttf")));

        }
        catch (IOException | FontFormatException e){}

        try{
            poppinsBold = Font.createFont(Font.TRUETYPE_FONT, new File("src/res/font/Poppins-Bold.ttf")).deriveFont(30f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/res/font/Poppins-Bold.ttf")));

        }
        catch (IOException | FontFormatException e){}

        JFrame checkoutFrame = new JFrame("Checkout");
        checkoutFrame.setSize(450, 720);
        checkoutFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        checkoutFrame.setLocationRelativeTo(null);
        checkoutFrame.setLayout(null);


        //checkout title label
        JLabel labelTitle = new JLabel("Checkout");
        labelTitle.setBounds(153,32,144,45);
        labelTitle.setFont(poppinsRegular);

        //image
        ImageIcon filmImage = new ImageIcon("src/res/image/image1.png");
        JLabel imageLabel = new JLabel(filmImage);
        imageLabel.setBounds(153,95,144,194);

//
        checkoutFrame.add(imageLabel);
        checkoutFrame.add(labelTitle);
        checkoutFrame.setVisible(true);
    }


}
