import java.io.*;
import java.lang.*;
class Shape
{
 private int dim1;
 Shape()
 {
  dim1=0;
 }
 Shape(int a)
 {
  dim1=a;
 }
 public void printdim()
 {
  System.out.println("Dimension="+dim1);
 }
 public int getdim()
 {
  return dim1;
 }
}
class Circle extends Shape
{
 Circle(int a)
 {
  super(a);
  System.out.println("Initialises shape:");
 }
 public int area() 
 {
  int d=getdim();
  return((int)22/7*d*d);
 }
}
class Area extends Circle
{
 Area(int a)
 {
  super(a);
  System.out.println("Initialises circle:");
 }
 public void print()
 {
  System.out.println("Area="+area());
 }
}
class Mlevel
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  Shape s=new Shape();
  s.printdim();
  System.out.print("Enter the radius:");
  int n=Integer.parseInt(br.readLine());
  Circle c=new Circle(n) ;
  Area a=new Area(n);
  a.print();
 }
}