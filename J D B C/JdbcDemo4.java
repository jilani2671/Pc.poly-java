import java.sql.*;

class JdbcDemo4
{
  public static void main(String args[ ])
   {
     Connection con=null;

     try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("jdbc:odbc:oradsn","system","sachin");

         Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
         //Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

         String query="Select * from student order by sno";
         ResultSet rs=stmt.executeQuery(query);
       
         rs.last();
         System.out.println(rs.getInt("sno") + "  " + rs.getString("sname"));

         rs.previous();
         System.out.println(rs.getInt("sno") + "  " + rs.getString("sname"));

         rs.first();
         System.out.println(rs.getInt("sno") + "  " + rs.getString("sname"));

         rs.next();
         System.out.println(rs.getInt("sno") + "  " + rs.getString("sname"));

        rs.close();
        stmt.close();
        con.close();  
       }
     catch(Exception e)
       {
       }

   }
}