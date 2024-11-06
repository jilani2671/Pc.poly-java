import java.io.*;
interface Stack
{
 void push(int item);
 int pop();
}
interface Queue
{
 void ins(int item);
 int del();
} 
class A implements Stack,Queue
{
 public int arr[]=new int[3],arr1[]=new int [3];
 public int top=-1,front=-1,rear=-1;
 public void push(int item)
 {
  if(top==2)
  System.out.println("Overflow!!!");
  else
  arr[++top]=item;
 } 
 public int pop()
 {
  if(top==-1)
  {
   System.out.println("Underflow");
   return -1;
  }
 return arr[top--];
 }
 public void ins(int item)
 {
  if(rear==2)
  System.out.println("Overflow");
  else
  {
   if(front==-1)
   {
    front++;
    rear++;
   }
   else rear++;
   arr1[rear]=item;
  }
 }
 public int del()
 {
  if(front==-1||front==rear+1)
  System.out.println("Underflow!!!");
  else  
  return arr1[front++];
  return -1;
  }
}
class B extends A
{
 public void disp()
 {
  int i;
  if(top==-1)
  System.out.println(" Stack Underflow!!!");
  else
  {
   System.out.println("STACK::");
   for(i=top;i>=0;i--)
   System.out.println(arr[i]);
  }
  if(front==-1||front==rear+1)
  System.out.println(" Queue Underflow!!!");
  else
  {
   System.out.println("QUEUE:");
   for(i=front;i<=rear;i++)
   System.out.println(arr1[i]);
  }
 }
}
class Multiple
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  B b=new B();
  int ch,c,i;
  do
{
  System.out.println("MENU:\n1.Stack\n2.Queue\n3.Display\n4.Exit\n\nEnter choice:");
  ch=Integer.parseInt(br.readLine());
  switch(ch)
  {
   case 1:
   System.out.println("Enter choice for push/pop(1/2):");
   c=Integer.parseInt(br.readLine());
   switch(c)
   {
    case 1:
    System.out.println("Enter item:");
    i=Integer.parseInt(br.readLine());
    b.push(i);
    break;
    case 2:
    System.out.println("Item popped="+b.pop());
    break;
    default:
    System.out.println("Invalid");
   }
   break;
   case 2:
   System.out.println("Enter choice for insert/delete(1/2):");
   c=Integer.parseInt(br.readLine());
   switch(c)
   {
    case 1:
    System.out.println("Enter item:");
    i=Integer.parseInt(br.readLine());
    b.ins(i);
    break;
    case 2:
    System.out.println("Item popped="+b.del());
    break;
    default:
    System.out.println("Invalid");
   }
   break;
   case 3:
   b.disp();
   break;
   case 4:
   break;
   default:
   System.out.println("Invalid");
   }
  }while(ch!=4);
 }
} 