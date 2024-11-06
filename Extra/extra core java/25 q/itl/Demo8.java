import java.lang.*;
import java.io.*;
class Demo8
{
 public static void main(String args[])
 {
  int count=args.length,j,i=0,l,ctr=count-1;
  String s1[]=new String[15];
  j=count-1;
  while(i<count)
  s1[j--]=args[i++];
  System.out.println("Arguments in reverse order are::");
  for(i=0;i<count;i++)
  System.out.println(s1[i]);
  System.out.println("Arguments as well as letters in reverse order::");
  for(i=0;i<count;i++)
  {
   l=s1[i].length();
   for(j=l-1;j>=0;j--)
   System.out.print(s1[i].charAt(j));
   System.out.println();
  }
  System.out.println("Arguments in proper order and letters in reverse order::");
  for(i=0;i<count;i++)
  {
   l=args[i].length();
   for(j=l-1;j>=0;j--)
   {
   System.out.print(args[i].charAt(j));
   ctr++;
   }
   System.out.println();
  }
  System.out.println("The no. of characters are::"+ctr);
 }
}
   
   