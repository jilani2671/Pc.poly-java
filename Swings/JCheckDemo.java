import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*
<Applet code="JCheckDemo" width="300" height="300">
</Applet>
*/

public class JCheckDemo extends JApplet
implements ItemListener
{
  JCheckBox ch1,ch2,ch3,ch4;
  JTextField jt;
  Container c;

  public void init()
   {
     c=getContentPane();
     c.setLayout(new FlowLayout());
     
     ch1=new JCheckBox("Sachin"); 
     ch2=new JCheckBox("Saurav"); 
     ch3=new JCheckBox("Rahul"); 
     ch4=new JCheckBox("Anil"); 

     jt=new JTextField(20); 

     c.add(ch1);
     c.add(ch2);
     c.add(ch3);
     c.add(ch4);
     c.add(jt);

     ch1.addItemListener(this);
     ch2.addItemListener(this);
     ch3.addItemListener(this);
     ch4.addItemListener(this);
   } 

  public void itemStateChanged(ItemEvent ie)
   {
     String str="";

     if(ch1.isSelected())
           str=str + ch1.getText() + " ";

     if(ch2.isSelected())
           str=str + ch2.getText() + " ";

     if(ch3.isSelected())
           str=str + ch3.getText() + " ";

     if(ch4.isSelected())
           str=str + ch4.getText();     

     jt.setText(str);
   }
}






