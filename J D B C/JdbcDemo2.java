import java.sql.*;
import java.io.*;

class JdbcDemo2
{
  public static void main(String args[ ]) throws IOException
   {
     DataInputStream dis=new DataInputStream(System.in);

     System.out.println("Enter student no");
     int sno=Integer.parseInt(dis.readLine());

     System.out.println("Enter student name");
     String sname=dis.readLine();

     System.out.println("Enter age");
     int age=Integer.parseInt(dis.readLine());

     Connection con=null;

     try
       {
         //Loading type1 driver in memory
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");     

         // Building bridge between java language & Database    
         con=DriverManager.getConnection("jdbc:odbc:MyOraDSN","system","system")

         //Building query
         String query="Insert Into student values(" + sno + ", '" + sname + "'," + age + ")";
      
         //Firing query to databse
         Statement stmt=con.createStatement();
         stmt.executeUpdate(query);

         stmt.close();
         con.close(); 
       }
    catch(Exception e)
       {
         System.out.println(e);
       }

    System.out.println("Record inserted succ");     
   }
}

/*
Method of 'DriverManager' class :--
getConnection() :--
public static synchronized Connection getConnection(String dsn, String uid,
String pwd) throws SQLException

Method of 'Connection' interface :--
createStatement() :--
Statement createStatement()

Methods of 'Statement' interface :--
i) executeQuery() :-- ResultSet executeQuery(String query) throws SQLException
ii) executeUpdate() :-- int executeUpdate(String query) throws SQLException

Methods of 'ResultSet' interface :--
i) next() :-- boolean next()
ii) getString() :-- String getString(String columnname)
iii) getInt() :-- int getInt(String columnname)
*/



