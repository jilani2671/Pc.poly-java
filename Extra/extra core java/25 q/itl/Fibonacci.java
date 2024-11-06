import java.io.*;
class Fibonacci
{
 static int a=0,b=1,lim;
 public static void main(String args[])throws IOException
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter the limit for the series:" );
 lim=Integer.parseInt(br.readLine());
 int sum=0;
 do
{
 System.out.println(a);
 sum=a+b;
 a=b;
 b=sum;
}while(a<=lim);
}
}