import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class Edit extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>");
     out.println("<Body>");

     int sno=Integer.parseInt(request.getParameter("sno"));
     String sname=request.getParameter("sname");
     int age=Integer.parseInt(request.getParameter("age"));

     Connection con=null;

     try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");     
         con=DriverManager.getConnection("jdbc:odbc:MyDSN","system","sachin");

         String query="Update student set sname='" + sname + "', age=" + age + " where sno=" + sno;
      
         Statement stmt=con.createStatement();
         stmt.executeUpdate(query);

         stmt.close();
         con.close(); 
       }
    catch(Exception e)
       {
         out.println(e);
       }
    
     out.println("</Body>");
     out.println("</Html>");

     response.sendRedirect("List"); 
   }
}