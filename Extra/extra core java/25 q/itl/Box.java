import java.io.*;
class BoxDim
{
  private int length,width,height;
 BoxDim()
{
 length=width=height=-1;
}
 BoxDim(int a,int b,int c)
 {
  length=a;
  width=b;
  height=c;
 }
 BoxDim(int a)
 {
  length=width=height=a;
 }
 int calcvol()
 {
  return(length*width*height);
 }
}
class Boxdensity extends BoxDim
{
 private int mass;
 Boxdensity()
{
 mass=0;
}
 Boxdensity(int m,int a,int b,int c)
 {
  super(a,b,c);
  mass=m;
 }
 Boxdensity(int m,int a)
{
 super(a);
 mass=m;
 }
 float calcDen()
 {
  int v=calcvol();
  float d=mass/v;
  return d;
 }
 }
class Boxcol extends Boxdensity
{
 private String color;
 Boxcol()
 {
  color="Grey";
 }
 Boxcol(String col,int m,int a,int b,int c)
 {
  super(m,a,b,c);
  color=col;
 }
 Boxcol(String col,int m,int a)
 {
 super(m,a);
 color=col;
 }
 void disp()
{
 int vol=calcvol();
 System.out.println("Volume="+vol);
 float den=calcDen();
 System.out.println("Density="+den);
 System.out.println("Colour:"+color);
}
}
class Box
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int a=0,b=0,c=0,m=0,ch;
  String color;
  System.out.println("Construct Box/Cube(1/2)?");
  ch=Integer.parseInt(br.readLine());
  if(ch==1)
  {
   System.out.println("Enter dimensions:");
   System.out.print("Length:");
   a=Integer.parseInt(br.readLine());
   System.out.print("Width:");
   b=Integer.parseInt(br.readLine());
   System.out.print("Height:");
   c=Integer.parseInt(br.readLine());
   System.out.print("Enter Mass:");
   m=Integer.parseInt(br.readLine());
   System.out.print("Enter colour:");
   color=br.readLine();
   Boxcol cl=new Boxcol(color,m,a,b,c);
   cl.disp();
  }
  else if(ch==2)
  {
   System.out.print("Enter side of cube:");
   a=Integer.parseInt(br.readLine());
   System.out.print("Enter Mass:");
   m=Integer.parseInt(br.readLine());
   System.out.print("Enter colour:");
   color=br.readLine();
   Boxcol cl=new Boxcol(color,m,a);
   cl.disp();
  }
    else
  {
  System.out.println("Invalid choice");
  Boxcol cl=new Boxcol();
  }
}
}
   