import java.io.*;
class Pattern
{
 public void disp(int n)
{
 for(int i=n;i>=1;i--)
{
 for(int j=i;j>=1;j--)
 System.out.print(j);
 System.out.println();
 }
}
}
class Demo2
{
 public static void main(String args[])throws IOException
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.print("Enter the limit:");
 int n=Integer.parseInt(br.readLine());
 Pattern p=new Pattern();
 p.disp(n);
}
}