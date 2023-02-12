import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class FootTest extends JPanel
{
  private Image shoe;

  // Constructor
  public FootTest()
  {
    shoe = (new ImageIcon("FirstSteps/leftshoe.gif")).getImage();
  }

  // Called automatically when the panel needs repainting
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int x = 100;
    int y = 100;
    int stepLength = 100;

    Foot foot = new Foot(x, y, shoe);
    
    // part a

    foot.turn(-90);

    for(int i=0; i<=3;i++){
      foot.draw(g);
      foot.moveSideways(stepLength);
    }
    
    // part b

    foot.moveForward(-200);
    foot.moveSideways(-400);

    foot.turn(-90);

    for(int i=0; i<=3;i++){
      foot.draw(g);
      foot.moveForward(stepLength*-1);
    }

    // part c

    foot.moveForward(-100);
    foot.moveSideways(100);

    for(int i=0; i<=3;i++){
      foot.moveSideways(stepLength/2);
      foot.turn(90);
      foot.draw(g);
      foot.moveForward(stepLength/2);
    }
  

    // Draw a cursor at the expected center of the first "shoe":
    g.drawLine(x - 50, y, x + 50, y);
    g.drawLine(x, y - 50, x, y + 50);
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Feet");
    window.setBounds(100, 100, 800, 480);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    FootTest panel = new FootTest();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);

    window.setVisible(true);
  }
}