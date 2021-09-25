import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame {

    JPanel labelPanel = new JPanel();
    JButton button = new JButton();
    JLabel label = new JLabel(); // Creates a JLabel
    GamePanel panel = new GamePanel();
    Boolean restart = false;

    GameFrame(){
        /*label.setText("I like to eat muffins!"); // Sets the text of the label
        label.setHorizontalTextPosition(JLabel.CENTER); // This would make the imageLabel and text overlap. Default is RIGHT.
        label.setVerticalTextPosition(JLabel.TOP); // Set text to be TOP, CENTER, or BOTTOM of imageLabel
        label.setForeground(new Color(0x00FF00)); // Set font color of text
        label.setIconTextGap(-15); // Set margins between text and image
        label.setBackground(Color.BLACK); // Sets the background to black
        label.setOpaque(true); // Displays the background color, as it paints all of the label.
        label.setVerticalAlignment(JLabel.CENTER); // CENTER default. Basically meaning everything is CENTERED. Even if resized.
        label.setHorizontalAlignment(JLabel.CENTER); // CENTER default. Basically meaning everything is CENTERED.


        button.setBounds(200, 100, 250, 150);
        button.addActionListener(this);
        button.setText("Click me or else");

        labelPanel.setBackground(Color.cyan);
        labelPanel.setLayout(new FlowLayout());
        labelPanel.add(label);
        labelPanel.add(button);
        labelPanel.setVisible(false);

        this.add(labelPanel);*/
        this.add(panel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /*public void setNew(boolean restart){
        labelPanel.setVisible(true);
        this.restart = restart;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            if(restart) {
                // Restarting code
            }
            System.out.println("Bad");
        }
    }*/
}
