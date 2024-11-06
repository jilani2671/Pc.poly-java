import java.awt.*;
import java.applet.*;

/*
<Applet code="Bounce" width="600" height="300">
</Applet>
*/

public class Bounce extends Applet implements Runnable
{
  int x1=0,y1=0;
  Thread t;
  boolean b=true;
  boolean b2=true;

  public void start()
   {
     t=new Thread(this);
     t.start();
   }   

  public void run()
   {
      while(true)
       {
         repaint();

         try
           {
              Thread.sleep(30);
           }
         catch(InterruptedException ie)      {}
       

     if(b2)
      {
         if(b)
          {
            x1=x1+5;
            y1=y1+10;
          }

         if(y1>=270) b=false;

         if(!b)
          {
            x1=x1+5;
            y1=y1-10;
          }

         if(y1<=0) b=true;
       } 

      if(x1>=570) b2=false;

     if(!b2)
      {
         if(b)
          {
            x1=x1-5;
            y1=y1+10;
          }

         if(y1>=270) b=false;

         if(!b)
          {
            x1=x1-5;
            y1=y1-10;
          }

         if(y1<=0) b=true;
       } 

      if(x1<=0) b2=true;

       }
   }

  public void paint(Graphics g)
   {
     setBackground(Color.cyan);
     g.fillOval(x1,y1,30,30);
   }
}
