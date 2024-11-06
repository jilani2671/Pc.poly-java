import java.io.*;
class Pattern
{
 private int n;
 int i,j,spc;
 Pattern()
{
 n=0;
}
Pattern(int n)
{
 this.n=n;
}
 public void DispPat()
{
 for(i=1;i<=n;i++)
 {
  for(spc=n;spc>i;spc--)
 System.out.print(" ");
 for(j=1;j<=i;j++)
 System.out.print("* ");
 System.out.println();
 }
 for(i=n-1;i>=1;i--)
 {
  for(spc=n;spc>i;spc--)
  System.out.print(" ");
  for(j=1;j<=i;j++)
  System.out.print("* ");
  System.out.println();
 }
}
}
class Demo
{
 public static void main(String args[])throws IOException
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.print("Enter the no. of '*' to be printed:");
 int n=Integer.parseInt(br.readLine());
 Pattern p=new Pattern(n);
 p.DispPat();
}
}
 
  