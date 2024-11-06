import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class ProductInfo extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
      response.setContentType("Text/Html");
      PrintWriter out=response.getWriter();
      String proid=request.getParameter("proid");
      
      Connection conn=null;
      try
        {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          conn=DriverManager.getConnection("jdbc:odbc:MyOraDSN","shekhar","khairnar");

          String query="select * from product_info where pname='"+proid+"'";

          Statement stmt=conn.createStatement();
          ResultSet rs=stmt.executeQuery(query);
 
          out.println("<Html>");
          out.println("<Body>");
          out.println("<Center>");
          out.println("<Table>");
          out.println("<Th colspan='3'>Product Information</Th>");
          
          while(rs.next())
          {
          
          out.println("<Tr><td>Product Name </td><td><Input Tyep='Text' Name='pname' value='"+rs.getString("pname")+"'></td></Tr>"); 
          out.println("<Tr><td>Product Price</td><td> <Input Tyep='Text' Name='price' value='"+rs.getInt("price")+"'></td></Tr>");
          out.println("<Tr><td>Product Material</td><td> <Input Tyep='Text' Name='material' value='"+rs.getString("material")+"'></td></Tr>");
          
          }
          out.println("<Th colspan='3'><A Href='ProductDisplay'>Go To Product Display</A></Th>");
          out.println("</Table>");
          out.println("</Center>");
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