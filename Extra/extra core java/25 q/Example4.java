import java.io.*;

class Example4
{
  public static void main(String args[ ]) throws IOException
   {
     DataInputStream dis=new DataInputStream(System.in);
     String arr[ ]=new String[3];

      System.out.println("Enter First digit");
       arr[0]=dis.readLine();

      System.out.println("Enter Second digit");
      arr[1]=dis.readLine();

      System.out.println("Enter Third digit");
      arr[2]=dis.readLine();


      for(int i=0; i<=2; i++)      
      {         
        String str1="",str2="";
        str1=str1 + arr[i];
        str2=str2 + arr[i];

        for(int j=0; j<=2; j++)
         {
           if(i!=j)
             str1=str1+ arr[j];         
         }

        for(int k=2; k>=0; k--)
         {
           if(i!=k)
             str2=str2+ arr[k];         
         }

       System.out.println(str1);
       System.out.println(str2);
     }
 
   }
}