import java.io.*;

class First
{
  String revString(String str)
   {
      String rev="";

      for(int i=0; i<str.length(); i++)
                       rev=str.charAt(i) + rev;

      return rev;
   }
}

class Example8
{
  public static void main(String args[ ]) throws IOException
   {
     First f=new First();

     DataInputStream dis=new DataInputStream(System.in);     

     System.out.println("Enter 1 for arguments in reverse order");
     System.out.println("Enter 2 for arguments in reverse order & letters in reverse order");
     System.out.println("Enter 3 for arguments in proper order & letters in reverse order");
     System.out.println("Enter 4 for length of total string");


    int opt=Integer.parseInt(dis.readLine());


     if(opt==1)
      {
         for(int i=args.length-1;i>=0; i--)
                   System.out.print(args[i] + " ");
      }
     else if(opt==2)
      {
         for(int i=args.length-1;i>=0; i--)
                   System.out.print(f.revString(args[i]) + " ");
      }
     else if(opt==3)
      {
         for(int i=0;i<args.length; i++)
                   System.out.print(f.revString(args[i]) + " ");
      }
     else
      {
        String total="";

                 for(int i=0;i<args.length; i++)
                              total=total + args[i];
        
        System.out.println(total.length());
      }

   }
}

