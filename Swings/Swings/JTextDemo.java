import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*
<Applet code="JTextDemo" width="300" height="300">
</Applet>
*/

public class JTextDemo extends JApplet
implements ActionListener
{
  JTextField jt1, jt2;
  Container c;

  public void init()
   {
     c=getContentPane();
     c.setLayout(new FlowLayout());
     
     jt1=new JTextField(20); 
     jt2=new JTextField(20); 
     c.add(jt1);
     c.add(jt2);

    jt1.addActionListener(this); 
   } 

  public void actionPerformed(ActionEvent ae)
   {
     jt2.setText(jt1.getText());
   }
}






