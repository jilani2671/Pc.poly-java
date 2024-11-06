import java.io.*;
import java.lang.*;
interface Vehicle
{
 void getmodel(String nm,String col,String rn);
 void putmodel();
}
class TwoWheeler implements Vehicle
{
  private String a,b,c;
  TwoWheeler()
 {
  a="unknown";
  b="unknown";
  c="not registered";
 }
 public void getmodel(String nm,String col,String rn)
 {
  a=nm;
  b=col;
  c=rn;
 }
 public void putmodel()
 {
  System.out.println("2wheeler Model:"+a);
  System.out.println("Colour:"+b);
  System.out.println("registration no.:"+c);
 }
}
class FourWheeler implements Vehicle
{
 private String a,b,c;
 FourWheeler()
 {
  a="unknown";
  b="unknown";
  c="not registered";
 }
 public void getmodel(String nm,String col,String rn)
 {
  a=nm;
  b=col;
  c=rn;
 }
 public void putmodel()
 {
  System.out.println("4wheeler Model:"+a);
  System.out.println("Colour:"+b);
  System.out.println("Registration no.:"+c);
 }
}
class DemoI
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter choice:");
  int ch=Integer.parseInt(br.readLine());
  TwoWheeler t=new TwoWheeler();
  FourWheeler f=new FourWheeler();
  switch(ch)
  {
   case 1:
   
   System.out.println("Enter the following:");
   System.out.print("Model:");
   String n1=br.readLine();
   System.out.print("Colour:");
   String n2=br.readLine(); 
   System.out.print("Reg. no.:");
   String n3=br.readLine();
   t.getmodel(n1,n2,n3);
   break;
   case 2:
   
   System.out.println("Enter the following:");
   System.out.print("Model:");
   String n4=br.readLine();
   System.out.print("Colour:");
   String n5=br.readLine(); 
   System.out.print("Reg. no.:");
   String n6=br.readLine();
   f.getmodel(n4,n5,n6);
   break;
   default:
   System.out.println("Invalid");
  }
  t.putmodel();
  f.putmodel();
 }
}
   
  
