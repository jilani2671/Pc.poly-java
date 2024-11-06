import java.io.*;
class Date
{
 private int day,month,year;
 Date(int a,int b,int c)
 {
  day=a;
  month=b;
  year=c;
 }
 public void incrementByOneDay()
 {
  if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
  {
  if(day<30)
  day+=1;
  }
  else if(month==2)
   {
   if(day<28)
   day++;
   }
 else
  day++;
 }
 public void decrementByOneDay()
 {
  if(day!=1)
  day-=1;
 }
 public boolean compareDates(Date d)
 {
  if(day==d.day&&month==d.month&&year==d.year)
  return true;
  return false;
 }
 public void print()
 {
  System.out.println("date:"+ day+"/"+month+"/"+year);
}
}
class Demo6
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int d1,m1,y1;
  System.out.println("Enter the following:");
  do
  {
   System.out.print("Day 1:");
   d1=Integer.parseInt(br.readLine());
   if(d1<1||d1>31)
   System.out.println("Invalid day.Enter again");
  }while(d1<1||d1>31);
  do
  {
   System.out.print("Month 1:");
   m1=Integer.parseInt(br.readLine());
   if(m1<1||m1>12)
   System.out.println("Invalid month.Enter again");
  }while(m1<1||m1>12);
  System.out.print("Year 1:");
  y1=Integer.parseInt(br.readLine());
  Date date1=new Date(d1,m1,y1);
  date1.print();
  date1.decrementByOneDay();
  System.out.println("Yesterday's date is:");
  date1.print();
  date1.incrementByOneDay();
  date1.incrementByOneDay();
  System.out.println("Tomorrow's date is:");
  date1.print();
  date1.decrementByOneDay();
  do
  {
   System.out.print("day 2:");
   d1=Integer.parseInt(br.readLine());
   if(d1<1||d1>31)
   System.out.println("Invalid day.Enter again");
  }while(d1<1||d1>31);
  do
  {
   System.out.print("Month 2:");
   m1=Integer.parseInt(br.readLine());
   if(m1<1||m1>12)
   System.out.println("Invalid month.Enter again");
  }while(m1<1||m1>12);
  System.out.print("Year 2:");
  y1=Integer.parseInt(br.readLine());
  Date date2=new Date(d1,m1,y1);
  System.out.println(date1.compareDates(date2));
 }
}
  
  
  
 