import java.io.*;
class Fact
{
public int facto(int num)
{
 if(num==0)
 return 1;
 return (facto(num-1)*num);
}
}
class Demofact
{
 public static void main(String args[])throws IOException
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.print("Enter the no. :");
 int n=Integer.parseInt(br.readLine());
 Fact f=new Fact();
 int f1=f.facto(n);
 System.out.println();
 System.out.println("The factorial of "+n+" is "+f1);
}
}