import java.io.*;
class Person
{
 private String fname,lname;
 Person(String n1,String n2)
 {
  fname=n1;
  lname=n2;
 }
 public Person toString(Person p);
 {
  return p;
 }
 public void print()
 {
  System.out.println("Name:"+fname+" "+lname);
 }
}
class SurveyOperator extends Person
{
 private int no1,no2;
 private float time;
 SurveyOperator(int a,int b,float t,String n1,String n2)
 {
  super(n1,n2);
  no1=a;
  no2=b;
  time=t;
 }
 public void getno1(int n)
 {
  no1=n;
 }
 public void getno2(int n)
 {
  no2=n;
 }
 public boolean setavail(String ans)
 {
  if(ans=="yes");
   return true;
  else
  return false;
 }
 public boolean make(long no)
 {
  if(no==
 