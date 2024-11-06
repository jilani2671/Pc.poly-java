import java.io.*;
class Num
{
 public static void main(String args[])
 {
  int n=Integer.parseInt(args[0]);
  int i,j,k,spc;
  for(i=1;i<=n;i++)
  {
   for(spc=i;spc<n;spc++)
   System.out.print(" ");
   for(j=1;j<=i;j++)
   System.out.print(j);
   for(k=0;k<j-1;k++)
    if(k!=0)
    System.out.print(k);
   System.out.println();
  }
 }
}
    