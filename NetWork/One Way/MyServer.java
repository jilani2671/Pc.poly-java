import java.io.*;
import java.net.*;

class MyServer
{
  public static void main(String args[ ])
   {
     try
        {
          ServerSocket ss=new ServerSocket(47);
          Socket s=ss.accept();
          InputStream is=s.getInputStream();

          int i=0;
          char ch=' ';

          while(i!=-1)
           {
             i=is.read();
             ch=(char)i;
             if(i!=-1) System.out.print(ch);
           }

          is.close();
          s.close();
          ss.close();
        }
    catch(Exception e)
        {

        }

   }
}