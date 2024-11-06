//Queue-- First in First Out

class Queue
{
  int arr[]=new int[10];
  int cnt;
  int num;

 Queue()
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
       {
          num=9-cnt;
          cnt--;
          return arr[num];         
       }

   }
}

class Example11
{
  public static void main(String args[ ])
   {    
     Queue Q1=new Queue();
     Queue Q2=new Queue();

     for(int i=0; i<10; i++) Q1.push(i);
     for(int j=50; j<60; j++) Q2.push(j);

     System.out.println("First Queue");
     for(int i=0; i<10; i++) 
           System.out.println(Q1.pop());     

     System.out.println("Second Queue");
     for(int j=0; j<10; j++) 
           System.out.println(Q2.pop());     
   }
}