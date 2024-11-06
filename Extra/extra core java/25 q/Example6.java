import java.io.*;

class ValidateDate
{
  int day, month, year;  
  int monthwiseday[]={31,28,31,30,31,30,31,31,30,31,30,31};

  ValidateDate(int d, int m, int y)  
   {
     day=d;
     month=m;
     year=y;
   }

  String incrementByOneDay()
   {
     day=day + 1;
     if(year%4==0) monthwiseday[1]=29;

     if(day>monthwiseday[month-1])
      {
        day=1; 
        month++;        

        if(month>12)
          {
            month=1;
            year++;
          }
      }

     return day + "-" + month + "-" + year;
   }


  String decrementByOneDay()
   {
     day=day - 1;
     if(year%4==0) monthwiseday[1]=29;

     if(day==0)
      {
        if((month-2)!=-1)
          day=monthwiseday[month-2];
        else
          {
            month=1;
            day=31;
           }

        month--;        

        if(month==0)
          {
            month=12;
            year--;
          } 
      }

     return day + "-" + month + "-" + year;
   } 
}

class Example6
{
  public static void main(String args[ ]) throws IOException
   {    
     DataInputStream dis=new DataInputStream(System.in);      

     System.out.println("Enter day");
     int day=Integer.parseInt(dis.readLine());

     System.out.println("Enter month");
     int month=Integer.parseInt(dis.readLine());

     System.out.println("Enter year");
     int year=Integer.parseInt(dis.readLine());
  
     ValidateDate vd=new ValidateDate(day,month,year);

     System.out.println("Enter 1 to increment date By One Day");      
     System.out.println("Enter 2 to decrement date By One Day");      
     String str=dis.readLine();

      if(str.equals("1"))
         System.out.println(vd.incrementByOneDay());
      else
         System.out.println(vd.decrementByOneDay());
   }
}