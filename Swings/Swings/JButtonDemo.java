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
  Container c;

  public void init()
   {
     c=getContentPane();
     c.setLayout(new FlowLayout());
     
     ImageIcon i1=new ImageIcon("red.jpg");
     ImageIcon i2=new ImageIcon("green.jpg");
     ImageIcon i3=new ImageIcon("blue.jpg");

     b1=new JButton("Red" ,i1);
     b2=new JButton("Green" ,i2);
     b3=new JButton("Blue" ,i3);

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






