import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class TransformationsDriver {
    public static BufferedImage buffered = new BufferedImage(1000, 1000,
    BufferedImage.TYPE_INT_ARGB); //initalizes buffered image and sets size and color
    public static int good = 1; //used to help determine validity of lines 
    public static Color line = new Color(0, 0, 0); // color of line
    public static int lineRGB = line.getRGB();
    public static JFrame frame = new JFrame(); 
    public static Transformations passOver = new Transformations(); //Object of package class

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel base = new JPanel();
            base.setLayout(new FlowLayout());
            JLabel picLabel = new JLabel(new ImageIcon(buffered)); 
            base.add(picLabel); //adds the buffered image inside of the JPanel 
            frame.add(base); //Adds Jpanel to frame 
            frame.setSize(1000, 1000);
            frame.setTitle("Generated Lines");
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 


    }


}
