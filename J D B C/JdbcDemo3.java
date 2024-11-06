import java.sql.*;
import java.io.*;

class JdbcDemo3
{
  public static void main(String args[ ]) throws IOException
   {
     DataInputStream dis=new DataInputStream(System.in);

    System.out.println("Enter sno");
    int sno=Integer.parseInt(dis.readLine());

    System.out.println("Enter name");
    String sname=dis.readLine();

    System.out.println("Enter age");
    int age=Integer.parseInt(dis.readLine());

     Connection con=null;

     try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("jdbc:odbc:oradsn","system","sachin");

         preparedStatement pstmt=con.prepareStatement("Insert into student values(?,?,?)");

         pstmt.setInt(1, sno); 
         pstmt.setString(2, sname); 
         pstmt.setInt(3, age); 

         pstmt.executeUpdate();

        pstmt.close();
        con.close();  
       }
     catch(Exception e)
       {
       }

    System.out.println("Record added");
   }
}