class Num2
{
 public static void main(String args[])
 {
  int n=Integer.parseInt(args[0]);
  int i,j,ctr=1;
   for(i=1;i<=n;i++)
    {
     for(j=1;j<=i;j++)
     System.out.print(ctr++ + " ");
     System.out.println();
    }
  }
} 