import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class WalkerTest extends JPanel
{
  private Image leftShoe;
  private Image rightShoe;

  // Constructor
  public WalkerTest()
  {
    leftShoe = (new ImageIcon("leftshoe.gif")).getImage();
    rightShoe = (new ImageIcon("rightShoe.gif")).getImage();
  }

  // Called automatically when the panel needs repainting
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int x = 100;
    int y = 100;
    int stepLength = 100;

    Walker walker = new Walker(x, y, leftShoe, rightShoe);

    walker.draw(g);

  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Walker");
    window.setBounds(100, 100, 800, 480);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    WalkerTest panel = new WalkerTest();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);

    window.setVisible(true);
  }
}