import java.io.*;
class Armstrong
 {
  private int lim;
  Armstrong()
  {
   lim=-1;
  }
  Armstrong(int lim)
  {
   this.lim=lim;
  }
  void calcArm()
  {
   System.out.println("Armstrong numbers upto "+lim+" are:");
   int num,sum=0,r,div;
   for(int i=1;i<=lim;i++)
   checkArm(i);     
   }
   void checkArm(int n)
  {
   int num,sum=0,r,div;
   num=n;
   do
       {
        r=num%10;
        div=r*r*r;
        sum+=div;
        num=num/10;
       }while(num!=0);
      if(sum==n)
      System.out.println("Armstrong no.:"+n);
   }
 }
  class DemoArm
  {
    public static void main(String args[])throws IOException
    {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("1.Print armstrong no.");
     System.out.println("2.Check if an armstrong no.");
     System.out.print("Enter choice(1/2)):");
     int ch=Integer.parseInt(br.readLine());
     if(ch==1)
     {
      System.out.print("Enter the limit:");
      int lim=Integer.parseInt(br.readLine());
      Armstrong a=new Armstrong(lim);
      a.calcArm();
     }
     else
     if(ch==2)
     {
      System.out.print("Enter the no.:");
      int num=Integer.parseInt(br.readLine());
      Armstrong a=new Armstrong();
      a.checkArm(num);
     }
     else
     System.out.println("Invalid choice");
    }
   }
   
     