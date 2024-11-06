import java.io.*;
class Demoswitch
{
 static float a,b;
 static void calc(int ch)
 {
  float c=0;
  switch(ch)
{
 case 1:
 c=a+b;
 break;
 case 2:
 c=a-b;
 break;
 case 3:
 c=a*b;
 break;
 case 4:
 c=a/b;
 break;
 case 5:
 System.out.println("Thank you");
 break;
 default:
 System.out.println("Invalid choice");
} 
 if(ch>=1&&ch<=4)
 System.out.println("Result="+c);
}
public static void main(String args[])throws IOException
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 int choice;
 do
{
 System.out.println("****MENU****");
 System.out.println("1.Addition");
 System.out.println("2.Subtraction");
 System.out.println("3.Multiplication");
 System.out.println("4.Division");
 System.out.println("5.Exit");
 System.out.print("Enter your choice:");
 choice=Integer.parseInt(br.readLine());
 if(choice>=1&&choice<=4)
 {
 System.out.println("Enter the two values:");
 a=Float.parseFloat(br.readLine());
 b=Float.parseFloat(br.readLine());
 }
 calc(choice);
}while(choice!=5);
}
}
 