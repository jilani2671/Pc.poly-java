class MyClass
{
  public String toString()
   {
     return "This is myclass";
   }
}

class Demo
{
  public static void main(String args[ ])
   {
     try
        {
           int m=100, n=Integer.parseInt(args[0]);
           int k=m/n;
        }
    catch(ArithmeticException e)
        {
          System.out.println(e);
        }  
    catch(ArrayIndexOutOfBoundsException e)
        {
          System.out.println(e);
        } 
    catch(Exception e)
        {
          System.out.println(e);
        }  

      System.out.println("After Catch");

      MyClass m=new MyClass();
      System.out.println(m);
   }
}