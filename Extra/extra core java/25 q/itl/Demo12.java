import java.io.*;

class Person
{
 private String FirstName,LastName;
 Person()
 {
  FirstName="Unknown";
  LastName="Person";
  System.out.println("Default constructor invoked");
  }
  Person(String n1,String n2)
  {
   Person per=new Person();
   System.out.println("Parameterised constructor:");
   FirstName=n1;
   LastName=n2;
  }
  Person(Person p)
  {
   Person per=new Person();
   System.out.println("Copy Constructor");
   FirstName=p.FirstName;
   LastName=p.LastName;
  }
 public Person toString(String n1,String n2)
 {
  Person p=new Person(n1,n2);
  System.out.println("Overriding toString method:");
  return p;
 }
 public void print()
 {
  System.out.println("Name: "+FirstName+" "+LastName);
 }
 }
 class Demo12
 {
  public static void main(String args[])throws IOException
  {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter details:");
   System.out.print("First name:");
   String n1=br.readLine();
   System.out.print("Last name:");
   String n2=br.readLine();
   Person p1=new Person();
   p1.print();
   Person p2=new Person(n1,n2);
   p2.print();
   Person p3=new Person(p2);
   p3.print();
   System.out.println("Enter name again:");
   n1=br.readLine();
   n2=br.readLine();
   Person p4=new Person();
   p4=p4.toString(n1,n2);
   p4.print();
  }
}

 
  