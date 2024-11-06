import java.io.*;

class Example5
{
  public static void main(String args[ ]) throws IOException
   {    
     DataInputStream dis=new DataInputStream(System.in);      

     System.out.println("Enter amount"); 
     double p=Double.parseDouble(dis.readLine());

     System.out.println("Enter period in years"); 
     double y=Double.parseDouble(dis.readLine());

     double r=0;


     if(y>=5)
        r=10;
     else if((p>=6000) && (y>=1))
         r=8;
     else if((p>=2000) && (y>=2))
         r=7;
     else if((p<2000) && (y>=2))
         r=5;
      else
         r=3;

      System.out.println(p*(Math.pow(1 + (r/100),y)));
   }
}