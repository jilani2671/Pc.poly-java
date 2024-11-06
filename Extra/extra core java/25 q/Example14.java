import java.io.*;

class Person
{
  int id;
  String name;
  String dob;
  String address;

  Person(int person_id, String person_name, String person_dob, String person_address)
   {
     id=person_id;
     name=person_name;
     dob=person_dob;
     address=person_address;
   }  
}

class SurveyOperator extends Person
{
  int NumberOfCalls;
  int NumberOfSuccessfulCalls;
  int totaltime;
  boolean available;

  SurveyOperator(int id, String name, String dob, String address,int calls,int scalls,boolean available,int ttime)
   {
     super(id,name,dob,address);
     NumberOfCalls=calls;
     NumberOfSuccessfulCalls=scalls;
     this.available=available;
     totaltime=ttime;     
   }  

  int getNumberOfCalls()
   {
     return NumberOfCalls;
   }   

  int getNumberOfSuccessfulCalls()
   {
     return NumberOfSuccessfulCalls;
   }   

  void setAvailable(boolean available)
  {
     this.available=available;
  }
}

class Example14
{
  public static void main(String args[ ]) throws IOException
   {    
     SurveyOperator so=new SurveyOperator(1,"Satish","13-01-1977","Dhankawadi",100,50,true,4);
     System.out.println(so.getNumberOfCalls());
     System.out.println(so.getNumberOfSuccessfulCalls());
   }
}