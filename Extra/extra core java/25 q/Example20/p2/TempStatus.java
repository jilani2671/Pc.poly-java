package p2;

import p1.Room;

public class TempStatus
{
  public boolean isRoomCool()
   {
     Room r=new Room();

     if(r.temp<25)     
         return true;
     else
         return false;
   }
}

