import javax.swing.*;
import java.awt.*;

/*
  <applet code="JTabbedPaneDemo" width=400 height=100>
  </applet>
*/

public class JTabbedPaneDemo extends JApplet 
 {
    Container c;
     Panel p1=new Panel();
     Panel p2=new Panel();
     Checkbox ch1,ch2,ch3,ch4; 

    public void init()
     { 
        c=getContentPane();
        c.setLayout(new FlowLayout()); 

       ch1=new Checkbox("Core Java"); 
       ch2=new Checkbox("Adv Java"); 
       p1.add(ch1);
       p1.add(ch2);

       ch3=new Checkbox("ASP.Net"); 
       ch4=new Checkbox("VB.Net"); 
       p2.add(ch3);
       p2.add(ch4);

       JTabbedPane jtp = new JTabbedPane();
       jtp.addTab("Sun", p1);
       jtp.addTab("Microsoft", p2);
       c.add(jtp);
      }
}