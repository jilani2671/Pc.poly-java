import java.io.*;
class Figure
{
 private int a,b;
 Figure()
 {
  a=0;
  b=0;
 }
 Figure(int n)
 {
  a=n;
  b=n;
 }
 Figure(int n1,int n2)
 {
  a=n1;
  b=n2;
 }
 public int infig()
 {
  System.out.println("Inside class Figure");
  return (a*b);
 }
}
final class rec extends Figure
{
 rec(int a,int b)
 {
  super(a,b); 
 }
 public void disp()
 {
  System.out.println("Area="+infig());
 }
}
class Demofinal
{
 public static void main(String args[])
 {
  int a=Integer.parseInt(args[0]);
  int b=Integer.parseInt(args[1]);
  rec r=new rec(a,b);
  r.disp();
 }
}