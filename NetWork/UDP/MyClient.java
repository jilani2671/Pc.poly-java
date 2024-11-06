import java.net.*;
import java.io.*;

public class MyClient
{
  public static void main(String args[ ]) throws IOException
   {
     byte b[ ]=new byte[1024];

     DatagramSocket ds=new DatagramSocket(999);
     DatagramPacket dp=new DatagramPacket(b, b.length);
     ds.receive(dp); 

     String str=new String(dp.getData(), 0, dp.getLength());
     System.out.println(str);
   }
}