import java.io.*;
class Pattern
{
 public void create(int n)
 {
  int i;
  for(i=1;i<=n;i++)
  {
   for(int spc=n;spc>i;spc--)
    System.out.print(" \t");
   for(int j=2;j>=i;j++)
   {
   System.out.print("*");
   for(int k=n;k>i;k--)
   System.out.print(" \t");
   }
   System.out.println();
  }
 for(i=1;i<=n*2;i++)
 System.out.print("*\t");
 }
}
class Dempat
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter the limit:");
  int n=Integer.parseInt(br.readLine());
  Pattern p=new Pattern();
  p.create(n);
 }
}
    