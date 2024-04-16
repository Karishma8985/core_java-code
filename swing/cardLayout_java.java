import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class cardLayout_java extends JFrame {

    // Initializing the value of currCard to 1 .
    private int currCard = 1;

    // Declaring of objects of the CardLayout class.
    private CardLayout cObjl;

    // constructor of the class
    public cardLayout_java() throws IOException {

        // Method to set the Title of the JFrame
        setTitle("Card Layout Methods");

        // Method to set the visibility of the JFrame
        setSize(700, 700);

        // Creating an Object of the "Jpanel" class
        JPanel jp = new JPanel();

        // Initializing of the object "cObjl" of the CardLayout class.
        cObjl = new CardLayout();

        // setting the layout
        jp.setLayout(cObjl);

        // Initializing the object "jPanel1" of the JPanel class.
        JPanel jP1 = new JPanel();
        JPanel jP2 = new JPanel();
        JPanel jP3 = new JPanel();
        JPanel jP4 = new JPanel();

        // taking image in card
        BufferedImage buImg1 = ImageIO.read(new File("image/scene.jpg"));
        Image image1 = buImg1.getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon img1 = new ImageIcon(image1);
        // Initializing the object "jl1" of the JLabel class.
        JLabel jL1 = new JLabel(img1);

        BufferedImage buImg2 = ImageIO.read(new File("image/flower.jpg"));
        Image image2 = buImg2.getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon img2 = new ImageIcon(image2);

        JLabel jL2 = new JLabel(img2);

        BufferedImage buImg3 = ImageIO.read(new File("image/green.jpg"));
        Image image3 = buImg3.getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(image3);
        JLabel jL3 = new JLabel(img3);

        BufferedImage buImg4 = ImageIO.read(new File("image/tiger.jpg"));
        Image image4 = buImg4.getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon img4 = new ImageIcon(image4);
        JLabel jL4 = new JLabel(img4);

        // Adding JLabel "jLabel1" to the JPanel "jPanel1".
        jP1.add(jL1);
        jP2.add(jL2);
        jP3.add(jL3);
        jP4.add(jL4);

        // Add the "jPanel1" on cPanel
        jp.add(jP1, "1");
        jp.add(jP2, "2");
        jp.add(jP3, "3");
        jp.add(jP4, "4");

        // Creating an Object of the "JPanel" class
        JPanel btnPanel = new JPanel();
        // Initializing the object of the JButton class.
        JButton firstButton = new JButton("First");
        JButton nextButton = new JButton("->");
        JButton previousButton = new JButton("<-");
        JButton lastButton = new JButton("Last");

        // Adding the JButton on the JPanel.
        btnPanel.add(firstButton);
        btnPanel.add(nextButton);
        btnPanel.add(previousButton);
        btnPanel.add(lastButton);

        // adding Button in the ActionListener
        firstButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                cObjl.first(jp);
                currCard = 1;
            }
        });

        lastButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                cObjl.last(jp);
                currCard = 4;
            }
        });

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                if (currCard < 4) {
                    currCard = currCard + 1;
                    cObjl.show(jp, "" + (currCard));
                } else {
                    currCard = 1;
                    cObjl.show(jp, "" + (currCard));
                }

            }
        });

        // add previousButton in ActionListener
        previousButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                if (currCard > 1) {

                    // decrease the value
                    // of currCard by 1
                    currCard = currCard - 1;

                    // show the value of currCard
                    cObjl.show(jp, "" + (currCard));

                } else {

                    currCard = 4;
                    cObjl.show(jp, "" + (currCard));
                }
            }

        });

        // using to get the content pane
        getContentPane().add(jp, BorderLayout.NORTH);

        // using to get the content pane
        getContentPane().add(btnPanel, BorderLayout.SOUTH);
    }

    // main method
    public static void main(String argvs[]) throws IOException {

        // Creating an object of the CardLayoutExample3 class.
        cardLayout_java cll = new cardLayout_java();

        // method to set the default operation of the JFrame.
        cll.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // aethod to set the visibility of the JFrame.
        cll.setVisible(true);
    }
}