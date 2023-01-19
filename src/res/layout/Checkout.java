package src.res.layout;
import javax.swing.*;
import java.awt.*;


public class Checkout extends JFrame{
    public static void main(String[] args) {
        new Checkout();
    }
    public Checkout(){
        initComponent();
    }
    private void initComponent(){
        JFrame checkoutFrame = new JFrame("Checkout");
        checkoutFrame.setSize(450, 720);
        checkoutFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        checkoutFrame.setLocationRelativeTo(null);
        checkoutFrame.setLayout(null);


        //checkout title label
        JLabel labelTitle = new JLabel("Checkout");
        labelTitle.setBounds(153,32,144,45);
        labelTitle.setFont(new Font("Poppins", Font.TYPE1_FONT, 30));

        //image
        ImageIcon filmImage = new ImageIcon("assets/image1.png");
        JLabel imageLabel = new JLabel(filmImage);
        imageLabel.setBounds(153,95,144,194);

//
        checkoutFrame.add(imageLabel);
        checkoutFrame.add(labelTitle);
        checkoutFrame.setVisible(true);
    }


}
