import java.io.*;
class Arr
{
 public static void main(String args[])throws IOException
 {
  int a[]=new int [10];
  int i=0,j=0,temp=0;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter 10 array elements:" );
  for(i=0;i<10;i++)
  a[i]=Integer.parseInt(br.readLine());
  for(i=0;i<10;i++)
   {
    for(j=i+1;j<10;j++)
      {
       if(a[i]>a[j])
         { 
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
          }
        }
    }
   System.out.println("The sorted array after selection sort is:");
   for(i=0;i<10;i++)
   System.out.println(a[i]); 
  for(i=0;i<10;i++)
   {
    for(j=0;j<9-i;j++)
      {
       if(a[j]>a[j+1])
        {
         temp=a[i]; 
         a[i]=a[j];
         a[j]=temp;
        }
      }
    }
  System.out.println("The sorted array after bubble sort is:");
   for(i=0;i<10;i++)
   System.out.println(a[i]);
  for(i=1;i<10;i++)
  {
   temp=a[i];
   for(j=i-1;j>=0&&temp<a[j];j--)
   a[j+1]=a[j];
   a[j+1]=temp;
  }
  System.out.println("The sorted array insertion sort is:");
   for(i=0;i<10;i++)
   System.out.println(a[i]);
 }
}