import java.awt.*;
import javax.swing.*;

/*
<Applet code="JLabelDemo" width="300" height="300">
</Applet>
*/

public class JLabelDemo extends JApplet
{
  JLabel L1,L2,L3;
  Container c;

  public void init()
   {
     c=getContentPane();
     c.setLayout(new FlowLayout());

     ImageIcon i1=new ImageIcon("red.jpg"); 
     ImageIcon i2=new ImageIcon("green.jpg"); 
     ImageIcon i3=new ImageIcon("blue.jpg"); 

     L1=new JLabel("Red" ,i1 ,JLabel.CENTER);
     L2=new JLabel("Green" ,i2 ,JLabel.CENTER);
     L3=new JLabel("Blue" ,i3 ,JLabel.CENTER);
     
     c.add(L1);
     c.add(L2);
     c.add(L3);
   }  
}