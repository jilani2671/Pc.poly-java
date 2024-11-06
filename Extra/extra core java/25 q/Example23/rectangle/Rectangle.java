package rectangle;

import shape.Shape;

public class Rectangle implements Shape
{
  double width,height;

  public Rectangle(double w,double h)
   {
     width=w;
     height=h;
   }

    public double calcArea()
   {
     return width*height;
   }  

    public double calcPerimeter()
   {
     return (2*(width + height)); 
   }
}