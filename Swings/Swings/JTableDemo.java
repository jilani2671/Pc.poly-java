import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*
<Applet code="JTableDemo" width="300" height="300">
</Applet>
*/

public class JTableDemo extends JApplet
{
  
  Container c;

  public void init()
   {
     c=getContentPane();
     c.setLayout(new FlowLayout());
     
     String[ ] colheads={"Student No", "Name", "Age"}; 
     Object[ ][ ] data={
                                    {"1", "Satish",22},
                                    {"2", "Sachin",32},
                                    {"3", "Shweta",4}
                                   };

     JTable jt=new JTable(data, colheads);
     c.add(jt);
   } 
}






