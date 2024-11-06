import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class Delete extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();

     int sno=Integer.parseInt(request.getParameter("sno"));

     Connection con=null;

     try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");     
         con=DriverManager.getConnection("jdbc:odbc:MyDSN","system","sachin");

         String query="Delete from student where sno=" + sno;
      
         Statement stmt=con.createStatement();
         stmt.executeQuery(query);

         stmt.close();
         con.close(); 
       }
    catch(Exception e)
       {
         out.println(e);
       }

     response.sendRedirect("List");
   }

}