import java.io.*;

class Example2
{
  public static void main(String args[ ]) throws IOException
   {
     DataInputStream dis=new DataInputStream(System.in);

      System.out.println("Enter counter value");
     int num=Integer.parseInt(dis.readLine());

     int cnt;

     for(int i=num; i>=1; i--)
      {
         cnt=i;

         for(int j=1;j<=i; j++)
          {
            System.out.print(cnt);
            cnt--;
          }

            System.out.println("");
      }

   }
}