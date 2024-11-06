import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Hidden1 extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>"); 
     out.println("<Body>");

     out.println("<Form action='Hidden2'>");
     out.println("Name: <Input Type='Text' Name='uname1'><Br>");
     out.println("<Input Type='Submit' Value='Submit'><Br>");
     out.println("</Form>");

     out.println("</Body>");
     out.println("</Html>");

   }
}