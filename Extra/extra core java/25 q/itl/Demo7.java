import java.io.*;

class bank
{
 private float interest_rate,balance;
 bank(float i,float b)
 {
  interest_rate=i;
  balance=b;
 }
public float calcint()
{
 float interest=(balance*interest_rate)/100;
 return interest;
}
public void modifyint(float i)
{
 interest_rate=i;
}
}
class Demo7
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter the balance:");
  float bal=Float.parseFloat(br.readLine());
  System.out.print("Enter the interest rate:");
  float in=Float.parseFloat(br.readLine());
  bank b=new bank(in,bal);
  System.out.println("The interest is="+b.calcint());
  System.out.print("Enter new interest rate:");
  in=Float.parseFloat(br.readLine());
  b.modifyint(in);
  System.out.println("The new interest="+b.calcint());
 }
}
 