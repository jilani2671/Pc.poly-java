import java.rmi.*;

public interface MyInter extends Remote
{
  long calculate(long a, long b) throws RemoteException;
}