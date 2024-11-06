import java.io.*;
class Employee
{
 private float b1,r1;
 private int t1;
 Employee()
 {
  b1=-1;
  r1=-1;
  t1=-1;
 }
 Employee(float b1,float r1,int time)
 {
  this.b1=b1;
  this.r1=r1;
  this.t1=time;
 }
 float calci()
 {
  System.out.println("Inside Employee:"  );
  float a=b1*r1*t1/100;
  return a;
 }
}
class Customer extends Employee
{
 private float b2,r2;
 private int t2;
 Customer()
 {
  super();
  b2=-1;
  t2=-1;
  r2=-1;
 }
 Customer(float b2,float r2,int time1,float b1,float r1,int time2)
 {
  //to execute calci inspite of overriding
  super(b1,r1,time2);
  this.b2=b2;
  this.r2=r2;
  this.t2=time1;
 }
 float calci()
 {
  float a=b2*r2*t2/100;
  float b=super.calci();
  System.out.println("Employee interest="+b);
  System.out.println("Inside customer:");
  return a;
 }
}
class MethOver
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter the balance for Employee:");
  float b2=Float.parseFloat(br.readLine());
  System.out.print("Enter interest rate:");
  float r2=Float.parseFloat(br.readLine());
  System.out.print("Enter the time:");
  int t2=Integer.parseInt(br.readLine());
  System.out.print("Enter the balance for Customer:");
  float b1=Float.parseFloat(br.readLine());
  System.out.print("Enter interest rate:");
  float r1=Float.parseFloat(br.readLine());
  System.out.print("Enter the time:");
  int t1=Integer.parseInt(br.readLine());
  Customer c=new Customer(b1,r1,t1,b2,r2,t2);
  float amt=c.calci();
  System.out.println("Customer interest="+amt);
 }
}

  


 