import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame implements ActionListener {

    JPanel labelPanel = new JPanel();
    JButton button = new JButton();
    JLabel label = new JLabel(); // Creates a JLabel
    GamePanel panel = new GamePanel();
    public static Boolean restart = false;
    Border border;
    Border noTBorder;
    Border noLBorder;
    Timer timer1 = new Timer(500, this);

    GameFrame(){
        border = BorderFactory.createLineBorder(Color.gray, 3);
        noTBorder = BorderFactory.createMatteBorder(0, 3, 3, 3, Color.gray);
        noLBorder = BorderFactory.createMatteBorder(3, 0, 3, 3, Color.gray);

        timer1.start();
        label.setText("I like to eat muffins!"); // Sets the text of the label
        label.setHorizontalTextPosition(JLabel.CENTER); // This would make the imageLabel and text overlap. Default is RIGHT.
        label.setVerticalTextPosition(JLabel.TOP); // Set text to be TOP, CENTER, or BOTTOM of imageLabel
        label.setForeground(new Color(0x808080)); // Set font color of text
        label.setBackground(Color.BLACK); // Sets the background to black
        label.setOpaque(true); // Displays the background color, as it paints all of the label.
        label.setVerticalAlignment(JLabel.CENTER); // CENTER default. Basically meaning everything is CENTERED. Even if resized.
        label.setHorizontalAlignment(JLabel.CENTER); // CENTER default. Basically meaning everything is CENTERED.
        label.setBorder(border);

        button.addActionListener(this);
        button.setText("Restart");
        button.setBorder(noLBorder);
        button.setBackground(Color.black);
        button.setForeground(new Color(0x808080));

        labelPanel.setBackground(Color.cyan);
        labelPanel.setLayout(new GridLayout());
        labelPanel.add(label);
        labelPanel.add(button);
        labelPanel.setPreferredSize(new Dimension(600, 50));
        labelPanel.setVisible(false);

        panel.setBorder(border);

        this.add(labelPanel);
        this.add(panel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        FlowLayout layout = new FlowLayout();
        layout.setVgap(0);
        setLayout(layout);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(GamePanel.running) {
            label.setText("Game Running");
            labelPanel.setVisible(false);
            panel.setBorder(border);
            this.setSize(new Dimension(616, 639));
        } else {
            label.setText("Game Not Running");
            labelPanel.setVisible(true);
            panel.setBorder(noTBorder);
            this.setSize(new Dimension(616, 689));
        }
        if(e.getSource() == button){
            panel.restart();
            System.out.println("Bad");
        }
    }
}
