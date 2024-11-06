import java.io.*;
import java.lang.Math;
class Bank
{
 private float dep,time,rate,intr;
 Bank(float a,float b)
 {
  dep=a;
  time=b;
 }
 public void calcr()
 {
  if(dep<2000)
  {
   if(time>=2)
    rate=(float)5/100;
  }
  else
  if(dep>=2000&&dep<6000)
  {
   if(time>=2)
    rate=(float)7/100;
   }
  else
  if(dep>=6000)
  {
   if(time>=1)
   rate=(float)8/100;
  }
  else
  if(time>=5)
  rate=(float)10/100;
  else
  rate=(float)3/100;
  System.out.println("Rate is="+rate*100); 
}
 public void calci()
 {
  intr=dep*((float)Math.pow((1+rate),time));
  System.out.println("Interest="+intr);
 }
} 
class Demo5
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter the principle amount:");
  float p=Float.parseFloat(br.readLine());
  System.out.print("Enter the time period:");
  float t=Float.parseFloat(br.readLine());
  Bank b=new Bank(p,t);
  b.calcr();
  b.calci();
 }
}