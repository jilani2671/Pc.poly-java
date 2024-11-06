import shape.Shape;
import rectangle.Rectangle;
import triangle.Triangle;
import square.Square;

class Demo
{
  public static void main(String args[ ])
   {
     Square s=new Square(12);
     Rectangle r=new Rectangle(3,4);
     Triangle t=new Triangle(10,5,10,11,12);

     System.out.println("Area of square=" + s.calcArea());
     System.out.println("Perimeter of square=" + s.calcPerimeter());

     System.out.println("Area of rectangle=" + r.calcArea());
     System.out.println("Perimeter of rectangle=" + r.calcPerimeter());

     System.out.println("Area of triangle=" + t.calcArea());
     System.out.println("Perimeter of triangle=" + t.calcPerimeter());
   }
}