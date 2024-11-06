import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<Applet code="KeyDemo" width="300" height="300">
</Applet>
*/

public class KeyDemo extends Applet implements 
KeyListener
{
  String str="";

  public void init()
   {
     addKeyListener(this); 
   }

  public void keyPressed(KeyEvent ke)
   {
     setBackground(Color.red);
   }

  public void keyReleased(KeyEvent ke)
   {
     setBackground(Color.cyan);
   }

  public void keyTyped(KeyEvent ke)
   {
     str=str + ke.getKeyChar();
     repaint();
   }

  public void paint(Graphics g)
   {
     g.drawString(str, 20, 20);
   }
}