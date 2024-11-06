import java.io.*;
class Name
{
 private String nm;
 Name()
 {
  nm="not known";
 }
 public void getdata(String n)
 {
  nm=n;
 }
 public void putdata()
 {
  System.out.println("NAME:"+nm);
 }
}
class DemoOA
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  Name n[]=new Name[5];
  int i;String a;
  for(i=0;i<5;i++)
  {
    System.out.print("Enter name:");
    a=br.readLine();
    n[i].getdata(a);
  }
  for(i=0;i<5;i++)
  n[i].putdata();
  }
 }
    