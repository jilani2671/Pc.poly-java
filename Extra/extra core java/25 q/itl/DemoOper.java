import java.io.*;
import java.lang.Math;
class DemoOper
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter a no:");
  float n=Float.parseFloat(br.readLine());
  System.out.println("Results:");
  System.out.println("Square="+(float)Math.pow(n,2));
  System.out.println("Cube="+(float)Math.pow(n,3));
  System.out.println("Square root="+(float)Math.sqrt(n));
  System.out.println("Cube root="+(float)Math.pow(n,(float)1/3));
  System.out.println("Exponent="+(float)Math.exp(n));
  System.out.println("Log e="+(float)Math.log(n));
 }
}