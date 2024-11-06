import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class StudentUpdateComplete extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
     Connection con=null;
     int sno=Integer.parseInt(request.getParameter("sno"));
     String sname=request.getParameter("sname");
     int hiddensno=Integer.parseInt(request.getParameter("hiddensno"));
     int sage=Integer.parseInt(request.getParameter("sage"));

     try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("jdbc:odbc:MyOraDSN","shekhar","khairnar");
        
         String query="update student set sno="+sno+",sage="+sage+",sname='"+sname+"' where sno="+hiddensno;
         
         Statement stmt=con.createStatement();
         stmt.executeUpdate(query);
         
         response.sendRedirect("StudentList");
       }
    catch(Exception e)
       {
         out.println(e);
       }
   }
}