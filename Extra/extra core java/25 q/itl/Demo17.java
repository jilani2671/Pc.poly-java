import java.io.*;

interface Shape
{
 double calcArea();
 double calcPerimeter();
}
class Square implements Shape
{
 private float s;
 Square(float s)
 {
  this.s=s;
  }
  public double calcArea()
  {
   return (s*s);
  }
  public double calcPerimeter()
  {
   return (4*s);
  }
 }
class Rectangle implements Shape
{
 private float l,b;
 Rectangle(float a1,float a2)
 {
  l=a1;
  b=a2;
  }
  public double calcArea()
  {
   return(l*b);
   }
  public double calcPerimeter()
  {
   return(2*(l+b));
   }
 }
class triangle implements Shape
{
 private float b,h;
 triangle(float a1,float a2)
 {
  b=a1;
  h=a2;
 }
 public double calcArea()
 {
  return((b*h)/2);
 }
 public double calcPerimeter()
 {
  return (3*b);
 }
}
class Demo17
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  float a,b;
  System.out.print("Enter the side of square:");
  a=Float.parseFloat(br.readLine());
  Square s=new Square(a);
  System.out.println("Area="+s.calcArea());
  System.out.println("Perimeter="+s.calcPerimeter());
  }
}
  
 