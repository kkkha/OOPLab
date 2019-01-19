import javax.swing.*;
import java.awt.*;

public class Bounce extends JPanel {
    int x=0,y=0;
    int angleX = 1,angleY = 1;
    private void move()
    {
        if(x + angleX < 0)
        {
            angleX = 1;
        }
        else if(x + angleX > getWidth() - 50)
        {
            angleX = -1;
        }
        else if(y + angleY < 0)
        {
            angleY = 1;
        }
        else if(y + angleY > getHeight() - 50)
        {
            angleY = -1;
        }
        x = x + angleX;
        y = y + angleY;
    }
    @Override
    public void paint(Graphics g)
    
    {
        super.paint(g);
        g.fillOval(x,y,50,50);
    }
    
    public static void main(String[] args)throws InterruptedException{
        // TODO Auto-generated method stub
        JFrame frame = new JFrame("Moving Ball!");
        Bounce bounce = new Bounce();
        frame.add(bounce);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        while(true)
        {
            bounce.move();
            bounce.repaint();
            Thread.sleep(10);
        }
    }
}
