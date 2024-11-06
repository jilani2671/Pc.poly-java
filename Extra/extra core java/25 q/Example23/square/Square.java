package square;

import shape.Shape;

public class Square implements Shape
{
  double side;

  public Square(int s)
   {
     side=s;
   }

  public double calcArea()
   {
     return side*side;
   }  

   public double calcPerimeter()
   {
     return 4*side; 
   }
}