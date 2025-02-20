import java.awt.*;
import javax.swing.*;

public class BirthdayWish extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
    
        // Load the image
        Image image = new ImageIcon("C:\\Users\\onkar\\OneDrive\\Desktop\\Documents\\GitHub\\Java-Basic-\\SnapInsta.to_450803126_370228279141027_7065016660248285981_n (1).jpg").getImage();
        g2d.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
    
        // Create a gradient color
        GradientPaint gradient = new GradientPaint(0, 0, Color.MAGENTA, getWidth(), getHeight(), Color.CYAN);
    
        // Set the gradient color
        g2d.setPaint(gradient);
    
        // Set font and draw the text
        g2d.setFont(new Font("Serif", Font.BOLD, 50));
        g2d.drawString("Happy Birthday Somnath", 50, 100);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Birthday Wish");
        BirthdayWish panel = new BirthdayWish();
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}