import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class StudentAdd extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
     Connection con=null;
    try
     {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      con=DriverManager.getConnection("jdbc:odbc:MyOraDSN","shekhar","khairnar");
      String query="select Max(sno) autosno from student";
      Statement stmt=con.createStatement();
      ResultSet rs=stmt.executeQuery(query);
      int sno=0;
      if(rs.next())
      {
       sno=Integer.parseInt(rs.getString("autosno"));
       sno++;
      }
     
     out.println("<Html>");
     out.println("<Body>");
     out.println("<Form Action='StudentAddComplete'>");
     out.println("<Center>");
     out.println("<Table>");

     out.println("<Tr>");
     out.println("<Td>Student No</Td>");
     out.println("<Td><Input Type='Text' Name='sno' Value="+sno+"></Td>");
     out.println("</Tr>");

     out.println("<Tr>");
     out.println("<Td>Student Name</Td>");
     out.println("<Td><Input Type='Text' Name='sname'></Td>");
     out.println("</Tr>");
 
     out.println("<Tr>");
     out.println("<Td>Student Age</Td>");
     out.println("<Td><Input Type='Text' Name='sage'></Td>");
     out.println("</Tr>");  
 
    out.println("<Tr>");
    out.println("<Th colspan='2'><Input Type='Submit' Value='ADD'>");
    out.println("</Tr>"); 

    out.println("</Table>");
    out.println("</Center>");
    out.println("</Form>");
    out.println("</Body>");
    out.println("</Html>");
 
   
    rs.close();
    stmt.close();
    con.close();

   }
    catch(Exception e)
     {
      out.println(e);
     }
   }
}