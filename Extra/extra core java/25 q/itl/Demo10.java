import java.io.*;
class Stack
{
 private int stack[]=new int[5],top=-1;
 public void push(int item)
 {
  if(top==4)
  System.out.println("Overflow!!!");
 else
 stack[++top]=item;
 }
 public int pop()
 {
  if(top==-1)
  System.out.println("Underflow!!!");
  else
  return (stack[top--]);
  return -1;
   
 }
 public void disp()
 {
  if(top==-1)
  System.out.println("Underflow!!!");
  else
  {System.out.println("  TOP-->"+stack[top]);
  for(int i=top-1;i>=0;i--)
  System.out.println("\t"+stack[i]);
  }
 }
}
class Demo10
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int ch,item;
  Stack s=new Stack();
  do
  {
   System.out.println("MENU\n1.Push\n2.Pop\n3.Display\n4.Exit");
   System.out.println("Enter choice:");
   ch=Integer.parseInt(br.readLine());
   switch(ch)
   {
    case 1:
    System.out.print("Enter item::");
    item=Integer.parseInt(br.readLine());
    s.push(item);
    break;
    case 2:
    item=s.pop();
    if(item!=-1)
    System.out.println("Item popped::"+item);
    break;
     case 3:
     s.disp();
     break;
     case 4:
      System.out.println("Thank you");
      break;
      default:
      System.out.println("Invalid choice");
    }
   }while(ch!=4);
  }
 } 