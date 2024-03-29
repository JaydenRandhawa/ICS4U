import java.awt.*;
import javax.swing.*;

public class Target extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    g.setColor(Color.RED);
    g.fillOval(xCenter-35, yCenter-35, 70, 70);
    g.setColor(getBackground());
    g.fillOval(xCenter-25, yCenter-25, 50, 50);
    g.setColor(Color.RED);
    g.fillOval(xCenter-10, yCenter-10, 20, 20);
    
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Target");
    window.setBounds(300, 300, 200, 200);
    window.setResizable(false);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Target panel = new Target();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}