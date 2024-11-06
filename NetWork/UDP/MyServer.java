import java.io.*;
import java.net.*;

class MyServer
{
  public static void main(String args[ ]) throws IOException
   {
     DataInputStream dis=new DataInputStream(System.in);

     System.out.println("Enter data");
     byte b[ ]=(dis.readLine()).getBytes();
    
     DatagramSocket ds=new DatagramSocket(998);
     DatagramPacket dp=new DatagramPacket(b, b.length, InetAddress.getLocalHost(), 999);
     ds.send(dp);
   }
}