import java.io.*;

class Exchange
{
  static void convert(double rs)
   {
     System.out.println(rs/50);     
   }
}

class Example13
{
  public static void main(String args[ ]) throws IOException
   {    
     DataInputStream dis=new DataInputStream(System.in);      

     System.out.println("Enter rupees");
     double amt=Double.parseDouble(dis.readLine());
     
     Exchange.convert(amt);
   }
}