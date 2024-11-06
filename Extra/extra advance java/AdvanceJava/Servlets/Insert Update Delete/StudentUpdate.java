import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class StudentUpdate extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
     Connection con=null;
 
     int sno=Integer.parseInt(request.getParameter("sno"));

     try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("jdbc:odbc:MyOraDSN","shekhar","khairnar");

         String query="select * from student where sno="+sno;

         Statement stmt=con.createStatement();    
         ResultSet rs=stmt.executeQuery(query);

    	 out.println("<Html>");
         out.println("<Body>");
         out.println("<Form Action='StudentUpdateComplete'>");
         out.println("<Center>");
         out.println("<Table>");
        
         if(rs.next())
         {
           out.println("<Tr>");
           out.println("<Th colspan='2'><Input Type='Hidden' Name='hiddensno' value='"+sno+"'></Th>");
           out.println("</Tr>");

           out.println("<Tr>");
           out.println("<Td>Student No</Td>");
           out.println("<Td><Input Type='Text' Name='sno' Value='"+sno+"'></Td>");
           out.println("</Tr>");
 
           out.println("<Tr>");
           out.println("<Td>Student Name</Td>");
           out.println("<Td><Input Type='Text' Name='sname' Value='"+rs.getString("sname")+"'></Td>");
           out.println("</Tr>");
 
           out.println("<Tr>");
           out.println("<Td>Student Age</Td>");
           out.println("<Td><Input Type='Text' Name='sage' Value='"+rs.getInt("sage")+"'></Td>");
           out.println("</Tr>");  
  
           out.println("<Tr>");
           out.println("<Th colspan='2'><Input Type='Submit' Value='UPDATE'>");
           out.println("</Tr>"); 
         }

         

         out.println("</Table>");
         out.println("</Center>");
         out.println("</Form>");
         out.println("</Body>");
         out.println("</Html>");
       }
    catch(Exception e)
       { 
         out.println(e);
       }
   }
}