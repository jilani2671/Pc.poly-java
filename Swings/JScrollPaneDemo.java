import java.awt.*;
import javax.swing.*;

/*
   <applet code="JScrollPaneDemo" width=300 height=250>
   </applet>
*/

public class JScrollPaneDemo extends JApplet 
  {
     public void init()
      {
         Container c = getContentPane();
          c.setLayout(new BorderLayout());

          // Add 100 buttons to a panel
          JPanel jp = new JPanel();
          jp.setLayout(new GridLayout(10,10));
          int cnt = 0;

          for(int i = 0; i < 10; i++)
           {
               for(int j = 0; j < 10; j++)
                  {
                     jp.add(new JButton("Button " + (cnt+1)));
                    ++cnt;
                  }
              }

        // Add panel to a scroll pane
       int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
       int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
      JScrollPane jsp = new JScrollPane(jp, v, h);

      c.add(jsp, BorderLayout.CENTER);
   }
}