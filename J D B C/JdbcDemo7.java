/*
Create Or Replace Procedure 
myproc(var_sno IN Number, var_age OUT Number) IS
Begin
  Select age INTO var_age from student
  where sno=var_sno;
End;
*/

import java.sql.*;
import java.io.*;

class JdbcDemo7
{
  public static void main(String args[ ]) throws IOException
   {
     DataInputStream dis=new DataInputStream(System.in);

      System.out.println("Enter sno");
      int sno=Integer.parseInt(dis.readLine());

     Connection con=null;

     try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("jdbc:odbc:oradsn","system","sachin");

         CallableStatement cstmt=con.prepareCall("{call myproc(?,?,?)}");

         cstmt.setInt(1, sno);

         cstmt.registerOutParameter(2, Types.VARCHAR);
         cstmt.registerOutParameter(3, Types.INTEGER);
         cstmt.execute();         
         
         String sname=cstmt.getString(2);   
         int age=cstmt.getInt(3);

         System.out.println(sname + "  " + age);

         cstmt.close();
         con.close();  
       }
     catch(Exception e)
       {
         System.out.println(e);
       }

   }
}