class MyException extends Exception
{
  private int i;

  MyException(int num)
   {
     i=num;
   }

  public String toString()
   {
     return "MyException: Value greater than 100. For Input No: " + i;
   }
}

class First
{
  void square(int num) throws MyException
   {
     if(num>100) 
      {
        MyException m=new MyException(num);
        throw m;
      }

     System.out.println("Square=" + num*num);
   }
}

class Demo
{
  public static void main(String args[ ])
   {
     First f=new First();     

      try
        {
          f.square(Integer.parseInt(args[0]));
        }
      catch(MyException me)
        {
          System.out.println(me);
        }

   }
}
