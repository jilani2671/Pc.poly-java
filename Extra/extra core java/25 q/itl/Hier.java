import java.io.*;
import java.lang.*;
class Shape
{
 private int side1,side2;
 Shape()
 {
  side1=0;
  side2=0;
 }
 Shape(int s)
 {
  side1=s;
  side2=s;
 }
 Shape(int s1,int s2)
 {
  side1=s1;
  side2=s2;
 }
 public int area()
 {
  return (side1*side2);
 }
}
class Rec extends Shape
{
 Rec(int a,int b)
 {
  super(a,b);
 }
 public void calcArea() 
 {
  System.out.println("Rectangle area="+area());
 }
}
class Cir extends Shape
{
 Cir(int a)
 {
  super(a);
 }
 public void calcArea()
 {
  System.out.println("Circle area="+((int)22/7*area()));
 }
}
class Hier
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter choice:");
  int ch=Integer.parseInt(br.readLine());
  switch(ch)
  {
   case 1:
   System.out.println("Enter two sides:");
   int a=Integer.parseInt(br.readLine());
   int b=Integer.parseInt(br.readLine());
   Rec r=new Rec(a,b);
   r.calcArea();
   break;
   case 2:
   System.out.print("Enter a side:");
   int c=Integer.parseInt(br.readLine());
   Cir c1=new Cir(c);
   c1.calcArea();
   break;
   default:
   Shape s=new Shape();
   System.out.println("The area of shape is:"+s.area());
  }
 }
}

 