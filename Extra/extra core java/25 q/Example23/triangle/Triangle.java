package triangle;

import shape.Shape;

public class Triangle implements Shape
{
  double base,height,side1,side2,side3;

  public Triangle(double b,double h,double s1,double s2,double s3)
   {
     base=b;
     height=h;
     side1=s1;
     side2=s2;
     side3=s3;
   }

    public double calcArea()
   {
     return 0.5*base*height;
   }  

    public double calcPerimeter()
   {
     return side1+side2+side3;
   }
}