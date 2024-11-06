import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*
<Applet code="JComboDemo" width="300" height="300">
</Applet>
*/

public class JComboDemo extends JApplet
implements ItemListener
{
  JComboBox jcb;
  Container c;

  public void init()
   {
     c=getContentPane();
     c.setLayout(new FlowLayout());
     
     jcb=new JComboBox();

     jcb.addItem("Red");
     jcb.addItem("Green");
     jcb.addItem("Blue");

     c.add(jcb);
     jcb.addItemListener(this);
   } 

  public void itemStateChanged(ItemEvent ie)
   {
     String str=(String)jcb.getSelectedItem();

     if(str.equals("Red"))
       c.setBackground(Color.red);
     else if(str.equals("Green"))
       c.setBackground(Color.green);
     else if(str.equals("Blue"))
       c.setBackground(Color.blue);
   }
}






