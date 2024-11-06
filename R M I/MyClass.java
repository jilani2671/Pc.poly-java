import java.rmi.*;
import java.rmi.server.*;

public class MyClass extends UnicastRemoteObject
implements MyInter
{
 public MyClass() throws RemoteException
 {
   super();
 }  

 public long calculate(long a, long b)
 throws RemoteException
  {
    System.out.println("Calculating sum of " + a + " and " + b);
    return a+b;
  }
  
}