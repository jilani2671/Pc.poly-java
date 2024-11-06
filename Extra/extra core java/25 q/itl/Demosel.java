import java.io.*;
class Arr
{
 int a[]=new int[25];
 int n=0,i=0,j=0,temp=0;
 void insert()throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter the no. of array elements:");
  n=Integer.parseInt(br.readLine());
  System.out.println("Enter the array elements:");
  for(i=0;i<n;i++)
  a[i]=Integer.parseInt(br.readLine());
  selsort();
 }
 void selsort()
 {
  System.out.println("Array input is:");
  disp();
  for(i=0;i<n;i++)
   for(j=i+1;j<n;j++)
    if(a[i]>a[j])
     {
      temp=a[i];
      a[i]=a[j];
      a[j]=temp;
      }
   System.out.println("Sorted array is:");
   disp();
   }
  void disp()
  {
   for(i=0;i<n;i++)
   System.out.println(a[i]);
  }
 }
 class Demosel
{
 public static void main(String args[])throws IOException
 {
  Arr a=new Arr();
  a.insert();
 }
}