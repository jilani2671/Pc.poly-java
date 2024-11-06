import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class StudentList extends HttpServlet
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
         String query="select * from student";
         Statement stmt=con.createStatement();
         ResultSet rs=stmt.executeQuery(query);
  
         out.println("<Html>");
         out.println("<Body>");
         out.println("<Center>"); 
         out.println("<Table Border='5' cellpadding='5'>");
         out.println("<Tr>");
         out.println("<Th colspan='5'><A Href='StudentAdd'>Add Student</A></Th>");
         out.println("</Tr>");
         out.println("<Tr>");
         out.println("<Th colspan='5'>Student List</Th>");
         out.println("</Tr>");
         out.println("<Tr>");
         out.println("<Th>Student No</Th>");
         out.println("<Th>Student Name</Th>");
         out.println("<Th>Student Age</Th>");
         out.println("<Th colspan='2'>Operations</Th>");
         out.println("</Tr>");
       
         while(rs.next())
         {
            int sno=rs.getInt("sno");

            out.println("<Tr>");
            out.println("<Td>"+sno+"</Td>");
            out.println("<Td>"+rs.getString("sname")+"</Td>");
            out.println("<Td>"+rs.getInt("sage")+"</Td>");
            out.println("<Td><A Href='StudentUpdate?sno="+sno+"'>"+"Update</A></Td>");
            out.println("<Td><A Href='StudentDeleteComplete?sno="+sno+"'>"+"Delete</A></Td>");
            out.println("</Tr>");
         }
         out.println("</Table>");
         out.println("</Center>");
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