package pack2;

public class Second extends pack1.First
{
  public void myMeth()
   {
     pack1.First f=new pack1.First();
     f.meth1();
     f.meth2();     
     //f.meth3();     
     //f.meth4();     
   }
}

