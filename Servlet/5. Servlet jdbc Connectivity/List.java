import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class List extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>");
     out.println("<Body>");



     out.println("<A Href='Add'>Add New Student</A><Br>");

     Connection con=null;

     try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");     
         con=DriverManager.getConnection("jdbc:odbc:MyDSN","system","sachin");

         String query="Select * from student order by sno";
      
         Statement stmt=con.createStatement();
         ResultSet rs=stmt.executeQuery(query);


         out.println("<Table Border='1'>");
         out.println("<Tr>");
         out.println("<Td>Student No</Td>");
         out.println("<Td>Student Name</Td>");
         out.println("<Td>Update</Td>");
         out.println("<Td>Delete</Td>");
         out.println("</Tr>");

         while(rs.next())
          {
            String sno=rs.getString("sno");

            out.println("<Tr>");
            out.println("<Td>" +  sno + "</Td>");
            out.println("<Td>" + rs.getString("sname") + "</Td>");
            out.println("<Td><A Href='Update?sno=" + sno + "'>Update</A></Td>");
            out.println("<Td><A Href='Delete?sno=" + sno + "'>Delete</A></Td>");
            out.println("</Tr>");
          } 

         out.println("</Table>");

         rs.close();
         stmt.close();
         con.close(); 
       }
    catch(Exception e)
       {
         out.println(e);
       }
  

     out.println("</Body>");
     out.println("</Html>");

   }
}