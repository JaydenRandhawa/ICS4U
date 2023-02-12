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

  private Image leftSandal;
  private Image rightSandal;

  // Constructor
  public WalkerTest()
  {
    leftShoe = (new ImageIcon("FirstSteps/leftshoe.gif")).getImage();
    rightShoe = (new ImageIcon("FirstSteps/rightshoe.gif")).getImage();

    leftSandal = (new ImageIcon("FirstSteps/leftsandal.gif")).getImage();
    rightSandal = (new ImageIcon("FirstSteps/rightsandal.gif")).getImage();
  }

  // Called automatically when the panel needs repainting
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int x = 100;
    int y = 100;
    int stepLength = 100;

    Walker maleWalker = new Walker(x, y, leftShoe, rightShoe);
    Walker femaleWalker = new Walker(x, y+200, leftSandal, rightSandal);
    // maleWalker.draw(g);

    for(int i=0;i<=6;i++){
      maleWalker.draw(g);
      maleWalker.nextStep();
    }

    for(int i=0;i<=2;i++){
      femaleWalker.draw(g);
      femaleWalker.nextStep();
    }

    femaleWalker.nextStep();
    femaleWalker.nextStep();
    femaleWalker.nextStep();
    femaleWalker.draw(g);

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