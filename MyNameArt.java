import java.awt.*;
import javax.swing.*;

public class MyNameArt extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set font size and style for GIO
        g2d.setFont(new Font("Arial", Font.BOLD, 250));

        // Draw the letters G, I, O
        g2d.drawString("G", 50, 200);
        g2d.drawString("I", 230, 200);
        g2d.drawString("O", 285, 200);

        // "Perfect" text
        g2d.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 50));
        g2d.setColor(Color.BLUE);
        g2d.drawString("perfect", 150, 350);

        // color of the heart
        g2d.setColor(Color.RED);
        // position of the heart
        int heartX = 400;
        int heartY = 270;
        int width = 100;
        int height = 100;

        // Draw the left half of the heart
        g2d.fillArc(heartX - 50, heartY - 50, width, height, 0, 180);

        // Draw the right half of the heart
        g2d.fillArc(heartX, heartY - 50, width, height, 0, 180);

        // Draw the triangle
        int[] xPoints = {heartX - 50, heartX + 30, heartX + 100};
        int[] yPoints = {heartY, heartY + 100, heartY};
        g2d.fillPolygon(xPoints, yPoints, 3);

        //additional text
        g2d.setFont(new Font("Arial", Font.PLAIN, 25));
        g2d.setColor(Color.BLACK);
        g2d.drawString("CC2 for Maam Anna Rhodora Quitaleg", 150, 450);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw GIO");
        MyNameArt panel = new MyNameArt();
        frame.add(panel);
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
