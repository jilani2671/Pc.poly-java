//Stack-- First in Last Out

class Stack
{
  int arr[]=new int[10];
  int cnt;

 Stack()
  {
    cnt=-1;
  }  

 void push(int item)
  {
    if(cnt==9)
     System.out.println("Stack Overflow");
    else
      {
        cnt++;
        arr[cnt]=item;
      }
  }

  int pop()
   {
     if(cnt<0)
      {
        System.out.println("Stack Underflow"); 
        return 0;
      }
     else
        return arr[cnt--];         


   }
}

class Example10
{
  public static void main(String args[ ])
   {    
     Stack stk1=new Stack();
     Stack stk2=new Stack();

     for(int i=0; i<10; i++) stk1.push(i);
     for(int j=50; j<60; j++) stk2.push(j);

     System.out.println("First stack");
     for(int i=0; i<10; i++) 
           System.out.println(stk1.pop());     

     System.out.println("Second stack");
     for(int j=0; j<10; j++) 
           System.out.println(stk2.pop());     
   }
}