import java.io.*;
class Pattern
{
 private int arr[]=new int[3];
 Pattern(int a,int b,int c)
 {
  arr[0]=a;
  arr[1]=b;
  arr[2]=c;
  }
  public void create()
  {
   for(int i=0;i<3;i++)
   {
    for(int j=0;j<3;j++)
    for(int k=0;k<3;k++)
    {
     if(i!=j&&i!=k&&j!=k)
     {
     System.out.print(arr[i]);
     System.out.print(arr[j]);
     System.out.println(arr[k]);
     }
    }
    }
   }}

  class Demo4
  {
   public static void main(String args[])throws IOException
   {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter three digits:");
    int a,b,c;
    a=Integer.parseInt(br.readLine());
    b=Integer.parseInt(br.readLine());
    c=Integer.parseInt(br.readLine());
    Pattern p=new Pattern(a,b,c);
    p.create();
    }
   }
    
     