import java.rmi.*;
import java.io.*;

public class MyClient
{
  public static void main(String args[ ])
   {
     try
        {
           DataInputStream dis=new DataInputStream(System.in);  

           System.out.println("Enter first no"); 
           int num1=Integer.parseInt(dis.readLine());
           System.out.println("Enter second no"); 
           int num2=Integer.parseInt(dis.readLine());

           MyInter m1=(MyInter)Naming.lookup("rmi://localhost:1099/myservice");
           long res=m1.calculate(num1, num2);
           System.out.println(res);
        }
    catch(Exception e)
        {
        }
   }
}