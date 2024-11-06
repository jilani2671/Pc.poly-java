import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Session3 extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>");
     out.println("<Body Bgcolor='Cyan'>");


     HttpSession session=request.getSession();
     String user=(String)session.getAttribute("uid");
     String pass=(String)session.getAttribute("pwd");

     out.println("<Br><Br><Br>Hello " + user + " Ur password is: " + pass + "<Br>");


     out.println("</Body>");
     out.println("</Html>");

   }
}