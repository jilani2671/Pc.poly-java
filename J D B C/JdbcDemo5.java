import java.sql.*;

class JdbcDemo5
{
  public static void main(String args[ ])
   {
     Connection con=null;

     try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("jdbc:odbc:oradsn","system","sachin");

         Statement stmt=con.createStatement();

         con.setAutoCommit(false);
         stmt.addBatch("Insert into Student values(5,'Five',5)");
         stmt.addBatch("Insert into Student values(6,'Six',6)");
         stmt.addBatch("Insert into Student values(7,'Seven',7)");

         int arr[ ]=stmt.executeBatch();
         con.commit();

        stmt.close();
        con.close();  
       }
     catch(Exception e)
       {
       }

   }
}