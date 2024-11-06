import p1.Room;
import java.io.*;
class TempStatus
{
 public boolean isRoomCool(float t)
 {
  if(t<=25.0)
  return true;
  else
  return false;
 }
}
class Demo20
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter room temp.:");
  float t=Float.parseFloat(br.readLine());
  Room r=new Room(t);
  TempStatus s=new TempStatus();
  float temp=r.settemp();
  System.out.println("Is room cool?:"+s.isRoomCool(temp));
 }
} 