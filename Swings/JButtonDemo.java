import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*
<Applet code="JButtonDemo" width="500" height="300">
</Applet>
*/

public class JButtonDemo extends JApplet
implements ActionListener
{
  JButton b1,b2,b3;
  

  public void init()
   {
     

     b1=new JButton("Red");
     b2=new JButton("Green");
     b3=new JButton("Blue" );

     c.add(b1);
     c.add(b2);
     c.add(b3);

     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
   } 

  public void actionPerformed(ActionEvent ae)
   {
     String str=ae.getActionCommand();

     if(str.equals("Red"))
         c.setBackground(Color.red);
     else if(str.equals("Green"))
         c.setBackground(Color.green);
     else if(str.equals("Blue"))
         c.setBackground(Color.blue);
   }
}






