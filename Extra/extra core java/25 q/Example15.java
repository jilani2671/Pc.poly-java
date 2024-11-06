import java.io.*;

class Person
{
  int id;
  String name;
  String dob;
  String address;

  void getInfo()
   {
     System.out.println("id=" + id);
     System.out.println("name=" + name);
     System.out.println("dob=" + dob);
     System.out.println("address=" + address);
   }  

  void putInfo(int person_id, String person_name, String person_dob, String person_address)
   {
     id=person_id;
     name=person_name;
     dob=person_dob;
     address=person_address;
   }  

  String getName()
   {
     return name;
   }
}

class Student extends Person
{
  int rollno;
  double marks[]=new double[5];
  double total=0;
  double percent;
  String result;
  String grade;

  void getData() throws IOException
   {
     DataInputStream dis=new DataInputStream(System.in);

     System.out.println("Enter Person Id for student");
     id=Integer.parseInt(dis.readLine());     

     System.out.println("Enter Student Name");
     name=dis.readLine();     

     System.out.println("Enter DOB");
     dob=dis.readLine();     

     System.out.println("Enter address");
     address=dis.readLine();     

     putInfo(id,name,dob,address);

     System.out.println("Enter RollNo");
     rollno=Integer.parseInt(dis.readLine());     

     System.out.println("Enter marks for subject1");
     marks[0]=Integer.parseInt(dis.readLine());

     System.out.println("Enter marks for subject2");
     marks[1]=Integer.parseInt(dis.readLine());

     System.out.println("Enter marks for subject3");
     marks[2]=Integer.parseInt(dis.readLine());

     System.out.println("Enter marks for subject4");
     marks[3]=Integer.parseInt(dis.readLine());

     System.out.println("Enter marks for subject5");
     marks[4]=Integer.parseInt(dis.readLine());

     total=marks[0] + marks[1] + marks[2] + marks[3] + marks[4];
     percent=(total*100)/500;
     
     if(percent>35) 
        result="Pass";
     else
        result="Fail";

     if(percent>60)
       grade="A";
     else if(percent>45)     
       grade="B";
     else 
       grade="C";
   }

  String getResult()
   {
     return result;
   }

  void printSheet()
   {
     System.out.println("******MarkSheet*********************");
     System.out.println("************************************");

     System.out.print("Id: " + id + "\t");
     System.out.println("Name: " + name);
     System.out.print("DOB: " + dob + "\t");
     System.out.println("Address: " + address);
     System.out.println("Roll No: " + rollno + "\t");

     System.out.println("************************************");

     System.out.print("Subject1: " + marks[0] + "\t");
     System.out.println("Subject2: " + marks[1]);
     System.out.print("Subject3: " + marks[2] + "\t");
     System.out.println("Subject4: " + marks[3]);
     System.out.println("Subject5: " + marks[4]);

     System.out.println("************************************");

     System.out.print("Total: " + total + "\t");
     System.out.println("Percent: " + percent);
     System.out.print("Grade: " + grade + "\t");
     System.out.println("Result: " + result);
   }   
}

class Example15
{
  public static void main(String args[ ]) throws IOException
   {    
     Student s=new Student();
     s.getData();
     s.printSheet();
   }
}