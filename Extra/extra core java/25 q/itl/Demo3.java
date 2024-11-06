import java.io.*;
class Demo3
{
 public static void main(String args[])
 {
  int n=Integer.parseInt(args[0]);
  int i,spc,j,k,ctr=1;
  for(i=1;i<n;i++)
  System.out.print(" ");
  System.out.println("*");
  for(i=2;i<n;i++)
  {
   for(spc=i;spc<n;spc++)
   System.out.print(" ");
   for(j=1;j<=2;j++)
   {
    System.out.print("*");
    for(k=1;k<=ctr;k++)
    System.out.print(" ");
    }
   ctr+=2;
   System.out.println();
  }
  for(i=1;i<(n*2);i++)
  System.out.print("*");
 }
}