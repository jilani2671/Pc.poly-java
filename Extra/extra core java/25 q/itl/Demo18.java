import java.io.*;

abstract class Customer
{
 private String nm,add;
 Customer(String a,String b)
 {
  nm=a;
  add=b;
 }
 public void set()
 {
  System.out.println("Name:"+nm);
  System.out.println("Address:"+add);
 }
}
interface Account
{
 boolean deposit(double amt);
 boolean withdraw(double amt);
 double checkbal();
}
class Savings extends Customer implements Account
{
 private double bal,amt;
 private long accn;
 private String doacc;
 Savings(String a,String b,long c,String f)
 {
 super(a,b);
 bal=0.0;
 amt=0.0;
 doacc=f;
 accn=c;
 }
 public void set()
 {
 super.set();
 System.out.println("Acc/No.:"+accn);
 System.out.println("Balance:"+bal);
 System.out.println("Date of Account opening:"+doacc);
 }
 public boolean deposit(long b,double a)
 {
  if(accn==b)
  {
   amt+=a;
   return true;
  }
  else
 return false;
 }
 public boolean withdraw(long b,double a)
 {
  if(b==accn)
  {
   if(amt>=a)
   {
    amt-=a;
    return true;
    }
   }
   return false;
  }
  public double checkbal()
  {
  return bal;
  }
}
class Demo18
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int ch;
  long d=123456;
  Savings s[]=new Savings();
   do
   {
    System.out.println("1.Open account\n2.Deposit\n3.Withdraw\n4.View Account details\n5.Exit");
    System.out.println("Enter choice:");
    ch=Integer.parseInt(br.readLine());
    switch(ch)
    {
     case 1:
     System.out.println("Enter details:");
     System.out.print("Name:");
     a=br.readLine();
     System.out.print("Add:");
     b=br.readLine();
     System.out.print("date of opening:");
     c=br.readLine();
     System.out.println("Account no:"+d);
     Savings s=new Savings(a,b,c,d);
     d++;
     break;
     }
 