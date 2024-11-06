import java.rmi.*;

public class MyServer
{
  public static void main(String args[ ])
   {
     try
        {
          MyClass m=new MyClass();
          Naming.rebind("rmi://localhost:1099/myservice", m);
        }
    catch(Exception e)
        {
        }
   }
}