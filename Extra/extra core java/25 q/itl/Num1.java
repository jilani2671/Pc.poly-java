class Num1
{
 public static void main(String args[])
 {
  int n=Integer.parseInt(args[0]);
  int i,j;
  for(j=n;j>=1;j--)
  {
   for(i=1;i<=j;i++)
   System.out.print("&");
   System.out.println();
  } 
 }
}