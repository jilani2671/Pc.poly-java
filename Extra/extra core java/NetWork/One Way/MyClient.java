import java.io.*;
import java.net.*;

class MyClient
{
  public static void main(String args[ ])
   {
     try
        {
          Socket s=new Socket("localhost", 47);


          //Sending data to server
          OutputStream os=s.getOutputStream();
          DataInputStream dis=new DataInputStream(System.in); 
          System.out.println("Enter data to be sent to server");
          String data=dis.readLine();
          byte b[ ]=data.getBytes();
          os.write(b);

          os.close();
          s.close();
        }
    catch(Exception e)
        {

        }

   }
}