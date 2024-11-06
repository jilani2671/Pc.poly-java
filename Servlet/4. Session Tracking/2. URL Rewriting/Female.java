import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Female extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>");
     out.println("<Body Bgcolor='Yellow'>");

     String user=request.getParameter("user"); 
     String pwd=request.getParameter("pwd");   
     out.println("Hello " + user + " Your password is: " + pwd + "<Br>");
     out.println("This is page for female");

     out.println("</Body>");
     out.println("</Html>");

   }
}