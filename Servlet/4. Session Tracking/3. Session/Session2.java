import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Session2 extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>");
     out.println("<Body>");


     HttpSession session=request.getSession();
     String user=(String)session.getAttribute("uid");
     String pass=(String)session.getAttribute("pwd");

     out.println("Hello " + user + " Ur password is: " + pass + "<Br>");

     out.println("<Form action='Session3'>");
     out.println("<Input Type='Submit' Value='Submit'>");
     out.println("</Form>");

     out.println("</Body>");
     out.println("</Html>");

   }
}