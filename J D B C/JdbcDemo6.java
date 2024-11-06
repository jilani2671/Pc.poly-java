import java.sql.*;

class JdbcDemo6
{
  public static void main(String args[ ])
   {
     Connection con=null;

     try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("jdbc:odbc:oradsn","system","sachin");

         Statement stmt=con.createStatement();

         String query="Select * from student order by sno"; 
         ResultSet rs=stmt.executeQuery(query);
         
         ResultSetMetaData rsmd=rs.getMetaData();

       System.out.println(rsmd.getColumnCount());

       for(int i=1; i<=rsmd.getColumnCount(); i++)
              System.out.println(rsmd.getColumnLabel(i) + "  " + rsmd.getColumnTypeName(i));

        stmt.close();
        con.close();  
       }
     catch(Exception e)
       {
       
       }

   }
}












/*Create Or Replace Procedure myproc(var_sno IN Number, var_sname OUT Varchar2,
var_age OUT Number) IS
Begin
   Select sname, age INTO var_sname, var_age
   from student where sno=var_sno;
End;*/
/
