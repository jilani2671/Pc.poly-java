import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Hidden3 extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>"); 
     out.println("<Body>");

     String uname2=request.getParameter("uname2"); 
     out.println("Hello " + uname2);

     out.println("</Body>");
     out.println("</Html>");

   }
}