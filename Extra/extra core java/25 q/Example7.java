import java.io.*;

class Calculate
{
  double irate,balance;

  Calculate(double rate, double bal)  
   {
     irate=rate;
     balance=bal;
   }

  void calculateMonthlyInterest()
   {
       System.out.println(((balance/100)*irate)/12);
   }

  void modifyInterest(double rate)
   {
     irate=rate; 
   }
}

class Example7
{
  public static void main(String args[ ]) throws IOException
   {    
     DataInputStream dis=new DataInputStream(System.in);      

     System.out.println("Enter irate");
     double irate=Double.parseDouble(dis.readLine());

     System.out.println("Enter balance");
     double balance=Double.parseDouble(dis.readLine());

     Calculate c=new Calculate(irate,balance);

     System.out.println("Enter 1 to modify interest rate");      
     System.out.println("Enter 2 to calculate monthly interest");      
     String str=dis.readLine();

      if(str.equals("1"))
        {
           System.out.println("Enter new interest rate");      
           double d=Double.parseDouble(dis.readLine());
           c.modifyInterest(d); 
        }
      else
       c.calculateMonthlyInterest();
   }
}