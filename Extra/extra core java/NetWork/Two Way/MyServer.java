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

          //Reading data from client
          InputStream is=s.getInputStream();
          ObjectInputStream ois=new ObjectInputStream(is);
          String data=(String)ois.readObject(); 
          System.out.println("Client Says:--" + data);

          //Sending data to client
          DataInputStream dis=new DataInputStream(System.in); 
          System.out.println("Enter data to be sent to client");
          data=dis.readLine();

          OutputStream os=s.getOutputStream();
          ObjectOutputStream oos=new ObjectOutputStream(os);
          oos.writeObject(data);      

          is.close();
          s.close();
          ss.close();
        }
    catch(Exception e)
        {

        }

   }
}