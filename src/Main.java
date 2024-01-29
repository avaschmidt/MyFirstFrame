import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //Step 1: Create a Frame
        JFrame frame = new JFrame("My First Frame");
        frame.setSize(500,500);
        //Step 2: Create a panel
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255,182,193));
        //Step 3: Create Components
        JLabel label = new JLabel("Goodbye World");
        JButton button = new JButton("Push me!");
        JTextField textField = new JTextField(5);
        JSlider slider = new JSlider();

        // add an image
        ImageIcon icon = new ImageIcon("Images/MyCards/2C.png");
        ImageIcon icon2 = new ImageIcon("Images/MyCards/2D.png");
        // scaling image before putting it on the label
        icon.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        icon2.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        // creating a label with an icon on it
        JLabel picLabel = new JLabel(icon);
        JLabel picLabel2 = new JLabel(icon2);



        //Step 4: Add Components to the Panel
        // Default layout is flow layout
        panel.add(picLabel);
        panel.add(picLabel2);
        panel.add(label);
        panel.add(button);
        panel.add(textField);
        panel.add(slider);


        //Step 5: Add Panel to the Frame
        frame.add(panel);
        //Step 6: Set Frame Visible
        frame.setVisible(true);


    }
}