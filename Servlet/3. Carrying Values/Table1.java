import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Table1 extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>"); 
     out.println("<Body>");

     out.println("<Form action='Table2'>");
     out.println("First No: <Input Type='Text' Name='fno'><Br>");
     out.println("Second No: <Input Type='Text' Name='sno'><Br>");
     out.println("<Input Type='Submit' Value='Table'><Br>");
     out.println("</Form>");

     out.println("</Body>");
     out.println("</Html>");

   }
}