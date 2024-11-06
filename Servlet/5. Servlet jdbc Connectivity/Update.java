import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class Update extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();

     int sno=Integer.parseInt(request.getParameter("sno"));
     String sname="";
     int age=0;

     Connection con=null;

     try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");     
         con=DriverManager.getConnection("jdbc:odbc:MyDSN","system","sachin");

         String query="Select * from student where sno=" + sno;
      
         Statement stmt=con.createStatement();
         ResultSet rs=stmt.executeQuery(query);

         if(rs.next())
          {
            sname=rs.getString("sname");
            age=rs.getInt("age"); 
          } 

         rs.close();
         stmt.close();
         con.close(); 
       }
    catch(Exception e)
       {
         out.println(e);
       }

 
     out.println("<Html>");
     out.println("<Body>");

     out.println("<Form action='Insert'>");
     out.println("Student No: <Input Type='Text' Name='sno' Value='" + sno + "'><Br>");     
     out.println("Student Name: <Input Type='Text' Name='sname'  Value='" + sname + "'><Br>");     
     out.println("Age: <Input Type='Text' Name='age'  Value='" + age + "'><Br>");     
     out.println("<Input Type='Submit' Value='Submit'>");     
     out.println("</Form>");

     out.println("</Body>");
     out.println("</Html>");

   }

}