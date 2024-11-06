class Library
{
 private int bno,nc,nci;
 private String bname,author,pub,status;
 private float price;
 Library()
 {
  bno=123;
  nc=0;
  nci=0;
  bname="Unknown";
  author="Unknown";
  pub="Unknown";
  price=0.0;
  status="Unavailable";
 }
 public void getdata(int bn,String bnm,String a,String p,float pr)
 {
  bno=bn;
  nc=n1;
  nci=n2;
  price=pr;
  bname=bnm;
  author=a;
  pub=p;
 }
 public void getstatus(String s)
 {
  status=s;
 }
 public boolean issue(Library l)
 {
  
  if(l.status.equals(status))
  {
    nci--;
    return true;
  }
 else return false;
 }
 public void returnb()
 {
  
  status="available";
  nci++;
 }
 public void disp()
 {
  System.out.println("Book No.:"+bno);
  System.out.println("Book name:"+bname);
  System.out.println("Author:"+author);
  System.out.println("Publisher:"+pub);
  System.out.println("Price:"+price);
  }
 }
class Demo16
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  Library l[]=new Library();
  int ch,a1,i=0;
  String a2,a3,a4;
  float a5;
  do
  {
   System.out.print("Enter details:(1/2)");
   ch=Integer.parseInt(br.readLine());
   System.out.println("Enter details:");
   System.out.print("Book no.:");
   a1=Integer.parseInt(br.readLine());
   System.out.print("Book name:");
   a2=br.readLine(); 
   System.out.print("Book Author:");
   a3=br.readLine();
   System.out.print("Publisher:");
   a4=br.readLine();
   System.out.print("Price:");
   a5=Float.parseFloat(br.readLine());
   l[i].getdata(a1,a2,a3,a4);
   l[i++].returnb();
  }while(ch!=2);
  System.out.println("The books available are as follows:");
  for(int j=0;j<i;j++)
  l[j].disp();
  do
  {
   System.out.println("MENU\n1.Issue book\n2.Return Book\n3.Details\n4.Exit\n\nEnter choice:");
   ch=Integer.parseInt(br.readLine());
    switch(ch)
   {
    case 1:
    
  
 
  
