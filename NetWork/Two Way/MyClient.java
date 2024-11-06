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
          DataInputStream dis=new DataInputStream(System.in); 
          System.out.println("Enter data to be sent to server");
          String data=dis.readLine();

          OutputStream os=s.getOutputStream();
          ObjectOutputStream oos=new ObjectOutputStream(os);
          oos.writeObject(data);      

          //Reading data from server
          InputStream is=s.getInputStream();
          ObjectInputStream ois=new ObjectInputStream(is);
          data=(String)ois.readObject(); 
          System.out.println("Server Says:--" + data);

          oos.close();
          os.close();
          s.close();
        }
    catch(Exception e)
        {

        }

   }
}