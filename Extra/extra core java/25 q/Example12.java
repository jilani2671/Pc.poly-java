import java.io.*;

class Person
{
  String fname,lname;

  Person()
   {
     System.out.println("Default constructor is called");
   }

  Person(String firstname, String lastname)
   {
     
     fname=firstname;
     lname=lastname;
   }

  public String toString()
   {
     return fname + " " + lname;
   }
}

class Example12
{
  public static void main(String args[ ]) throws IOException
   {    
     Person p=new Person("Sachin","Patil");
     System.out.println(p);
   }
}