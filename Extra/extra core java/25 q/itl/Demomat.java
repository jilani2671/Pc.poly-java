import java.io.*;
class Arr
{
 int a[][]=new int[5][5];
 int b[][]=new int[5][5];
 int c[][]=new int[5][5];
 int i=0,j=0,r1=0,r2=0,c1=0,c2=0,r3=0,c3=0;
 void insert()throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int ch;
  do
  {
  System.out.println("****MENU****");
  System.out.println("1.Addition");
  System.out.println("2.Multiplication");
  System.out.println("3.Transpose");
  System.out.println("4.Exit");
  System.out.print("Enter your choice:");
  ch=Integer.parseInt(br.readLine());
  if(ch==1||ch==2)
  {
  System.out.println("Enter the no. of rows & columns for 1st matrix:");
  r1=Integer.parseInt(br.readLine());
  c1=Integer.parseInt(br.readLine());
  System.out.println("Enter the no. of rows & columns for 2nd matrix:");
  r2=Integer.parseInt(br.readLine());
  c2=Integer.parseInt(br.readLine());
  System.out.println("Enter 1st matrix:");
  for(i=0;i<r1;i++)
   for(j=0;j<c1;j++)
   a[i][j]=Integer.parseInt(br.readLine());
  System.out.println("Enter 2nd matrix:");
  for(i=0;i<r2;i++)
   for(j=0;j<c2;j++)
   b[i][j]=Integer.parseInt(br.readLine());
  }
  else if(ch==3)
  {
   
  System.out.println("Enter the no. of rows & columns for a matrix:");
  r1=Integer.parseInt(br.readLine());
  c1=Integer.parseInt(br.readLine());
  System.out.println("Enter a matrix:");
  for(i=0;i<r1;i++)
   for(j=0;j<c1;j++)
   a[i][j]=Integer.parseInt(br.readLine());
  }
  switch(ch)
  {
   case 1:
   if(r1==r2&&c1==c2)
    add();
    else System.out.println("Incompatible for addition");
    break;
   case 2:
   if(r2==c1)
   mult();
   else
   System.out.println("Incompatible for multiplication");
   break;
   case 3:
   transpose();
   break;
   case 4:
   System.out.println("Thank you");
   break;
   default:
   System.out.println("Invalid choice");
  }
  }while(ch!=4);
 }
void add()
{
 for(i=0;i<r1;i++)
  {
   for(j=0;j<c1;j++)
    {
     c[i][j]=a[i][j]+b[i][j];
     System.out.print(c[i][j]+"  ");
    }
   System.out.println();
 }
}
void mult()
{
 for(i=0;i<r1;i++)
 {
  for(j=0;j<c2;j++)
  {
   c[i][j]=0;
   for(int k=0;k<r2;k++)
   c[i][j]+=a[i][k]*b[k][j];
   System.out.print(c[i][j]+"  ");
   }
  System.out.println();
 }
}
void transpose()
{
 r3=c1;
 c3=r1;
 for(i=0;i<r3;i++)
  {
   for(j=0;j<c3;j++)
    c[i][j]=a[j][i];
  }
 for(i=0;i<r3;i++)
  {
   for(j=0;j<c3;j++)
    System.out.print(c[i][j]+"  ");
    System.out.println();
  }
}
}
class Demomat
{
 public static void main(String args[])throws IOException
{
  Arr a=new Arr();
  a.insert();
}
}
 
   
  
      
 