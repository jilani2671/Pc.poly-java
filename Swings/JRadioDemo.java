import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*
<Applet code="JRadioDemo" width="300" height="300">
</Applet>
*/

public class JRadioDemo extends JApplet
implements ActionListener
{
  JRadioButton b1,b2,b3;
  ButtonGroup bg=new ButtonGroup();
  Container c;

  public void init()
   {
     c=getContentPane();
     c.setLayout(new FlowLayout());
     
     b1=new JRadioButton("Red"); 
     b2=new JRadioButton("Green"); 
     b3=new JRadioButton("Blue"); 

     bg.add(b1); 
     bg.add(b2); 
     bg.add(b3); 

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






