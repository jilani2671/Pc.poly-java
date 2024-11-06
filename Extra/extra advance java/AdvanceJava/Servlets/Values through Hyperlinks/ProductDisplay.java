import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class ProductDisplay extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
      response.setContentType("Text/Html");
      PrintWriter out=response.getWriter();
      
      Connection conn=null;
      try
        {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          conn=DriverManager.getConnection("jdbc:odbc:MyOraDSN","shekhar","khairnar");
          String query="select pname from product_info";
          Statement stmt=conn.createStatement();
          ResultSet rs=stmt.executeQuery(query);
 
          out.println("<Html>");
          out.println("<Body style=>");
          out.println("<Table Border='5'>");
          out.println("<Tr>");
          while(rs.next())
          {
            String pname=rs.getString("pname");
            
            out.println("<Th><A Href='ProductInfo?proid="+pname+"'>"+pname+"</A></Th>");
          }
          out.println("</Tr>");
          out.println("</Table>");
          out.println("</Body>");
          out.println("</Html>");

          rs.close();
          stmt.close();
          conn.close();
        }
     catch(Exception e)
        {
          out.println(e);
        }
   }
}