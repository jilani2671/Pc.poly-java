interface Shape
{
  double calcArea();
  double calcPerimeter();
}

class Square implements Shape
{
  double side;

  Square(int s)
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

class Rectangle implements Shape
{
  double width,height;

  Rectangle(double w,double h)
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

class Triangle implements Shape
{
  double base,height,side1,side2,side3;

  Triangle(double b,double h,double s1,double s2,double s3)
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

class Example17
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