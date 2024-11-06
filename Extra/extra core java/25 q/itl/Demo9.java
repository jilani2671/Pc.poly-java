import java.io.*;
class Array
{
 private int n,a[]=new int [10];
 Array(int n)
{ 
 this.n=n;
 for(int i=0;i<n;i++)
 a[i]=i+1;
} 
 public void create()
 {
  for(int i=n-1;i>=0;i--)
  {
   for(int j=i;j>=0;j--)
   System.out.print(a[j]);
   System.out.println();
  }
 }
}
class Demo9
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter the limit:");
  int n=Integer.parseInt(br.readLine());
  Array arr=new Array(n);
  arr.create();
  }
 }
  