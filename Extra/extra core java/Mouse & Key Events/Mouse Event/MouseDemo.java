import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<Applet code="MouseDemo" width="300" height="300">
</Applet>
*/

public class MouseDemo extends Applet implements 
MouseListener, MouseMotionListener
{
  String str="";
  int x=0, y=0;

  public void init()
   {
     addMouseListener(this); 
     addMouseMotionListener(this); 
   }

 public void mouseClicked(MouseEvent me)
  {
    str="Clicked";
    x=100;
    y=100;
    repaint();
  }

 public void mousePressed(MouseEvent me)
  {
    str="Pressed";
    x=me.getX();
    y=me.getY();
    repaint();
  }

 public void mouseReleased(MouseEvent me)
  {
    str="Released";
    x=me.getX();
    y=me.getY();
    repaint();
  }

 public void mouseEntered(MouseEvent me)
  {
    setBackground(Color.cyan);
  }

 public void mouseExited(MouseEvent me)
  {
    setBackground(Color.yellow);
  }

 public void mouseMoved(MouseEvent me)
  {
    showStatus("Mouse is at x=" + me.getX() + " y=" + me.getY());
  }

 public void mouseDragged(MouseEvent me)
  {
    str="Click-In Plus";
    x=me.getX();
    y=me.getY();
    repaint();
  }

 public void paint(Graphics g)
  {
    g.drawString(str, x, y);
  }
}