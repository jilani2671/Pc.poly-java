import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

/*
  <applet code="JTreeDemo" width=400 height=200>
  </applet>
*/

  class MyLogic extends MouseAdapter
   {
      JTreeDemo jtd;

      MyLogic(JTreeDemo jd)
       {
         jtd=jd;
       }

     public void mouseClicked(MouseEvent me)
      {
        TreePath tp = jtd.tree.getPathForLocation(me.getX(), me.getY());
         String str=tp.toString();

         if(str.equals("[Options, Color, Red]"))
            jtd.c.setBackground(Color.red);
         else if(str.equals("[Options, Color, Green]"))
            jtd.c.setBackground(Color.green);
         else if(str.equals("[Options, Color, Blue]"))
            jtd.c.setBackground(Color.blue);
      }
   }

  public class JTreeDemo extends JApplet
   {
      JTree tree;
      Container c;

      public void init()
       {
         c = getContentPane();
         c.setLayout(new FlowLayout());

         DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");

         DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
         top.add(color);

         DefaultMutableTreeNode c1 = new DefaultMutableTreeNode("Red");
         DefaultMutableTreeNode c2 = new DefaultMutableTreeNode("Green");
         DefaultMutableTreeNode c3 = new DefaultMutableTreeNode("Blue");

         color.add(c1);
         color.add(c2);
         color.add(c3);

         tree = new JTree(top); 
         c.add(tree);
         tree.addMouseListener(new MyLogic(this));
       }
}