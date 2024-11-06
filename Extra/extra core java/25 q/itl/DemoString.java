import java.io.*;
import java.lang.*;
class DemoString
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter string:");
  String s=br.readLine().trim();
  int l=s.length(),cspc=1,cline=0,i;
  char c[]=new char[100],ch,cr[]=new char[100];
  for(i=0;i<l;i++)
  {
   ch=s.charAt(i);
   c[i]=ch;
   if(ch==' ')
   cspc++;
   if(ch=='.')
   cline++;
  }
  int j=0;
  System.out.println("The no. of words="+cspc); 
  System.out.println("The no. of lines="+cline);
  for(i=l-1;i>=0;i--)
   cr[j++]=c[i];
  String sr=new String(cr);
  System.out.println("Reverse:"+sr);
  System.out.print("Enter another string:");
  String s1=br.readLine();
  String s3=s1+" "+s;
  System.out.println("Concatenation:"+s3);
  System.out.println("Enter the positions for substring:");
  int p1=Integer.parseInt(br.readLine());
  int p2=Integer.parseInt(br.readLine());
  char sub[]=new char[100];
  j=0;
  for(i=p1;i<p2;i++)
  sub[j++]=c[i];
  String str=new String(sub);
  System.out.println("Substring:"+str);
 }
}
   
   
  