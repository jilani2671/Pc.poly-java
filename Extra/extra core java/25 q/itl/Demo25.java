import java.lang.Math;
import java.util.Random;
class Demo25
{
 public static void main(String args[])
 {
  Random r=new Random(999);  
  int val;
  for(int i=0;i<4;i++)
  {
   val=r.nextInt(9999);
   System.out.println("Square root of "+val+"="+Math.sqrt(val));
  }
 }
}