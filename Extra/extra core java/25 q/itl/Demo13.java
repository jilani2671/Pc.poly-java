import java.io.*;
class Demo13
{
 public static float convert(float inr)
 {
  float doll;
  doll=inr/45;
  return doll;
 }
 public static void main(String args[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter the amount in terms of INR:");
  float i=Float.parseFloat(br.readLine());
  float d=convert(i);
  System.out.println("The amount entered is:"+d+" $");
 }
} 
 