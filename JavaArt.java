import java.awt.*;
import javax.swing.*;
public class JavaArt extends Canvas{
    public void paint (Graphics g) {
        g.setColor(Color.GREEN);
        g.drawRect(50,50,150,100);
        g.setColor(Color.BLUE);
        g.fillRect(250,50,150,100);

        g.setColor(Color.RED);
        g.drawOval(450,50,100,100);
        g.fillOval(600,50,100,100);
        
        g.setColor(Color.BLACK);
        g.drawLine(50,200,700,200);
        g.drawLine(750,100,750,200);
        g.drawLine(800,100,800,200);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Java Art: Draw Shapes");
        Canvas canvas = new JavaArt();
        f.setSize(1000,500);
        f.add(canvas);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}