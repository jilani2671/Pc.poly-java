import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Two extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>");
     out.println("<Body>");

     String user=(String)request.getAttribute("uid");
     out.println("Hello " + user + "<Br>");
     out.println("This is Two.java<Br>");     


     out.println("</Body>");
     out.println("</Html>");

   }
}