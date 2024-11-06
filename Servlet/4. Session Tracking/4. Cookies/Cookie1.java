import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Cookie1 extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>");
     out.println("<Body>");

     String uname=request.getParameter("uname"); 
     String pass=request.getParameter("pass"); 

     Cookie c1=new Cookie("uid",uname);
     Cookie c2=new Cookie("pwd",pass);

     response.addCookie(c1); 
     response.addCookie(c2); 

     out.println("<Form action='Cookie2'>");
     out.println("<Input Type='Submit' Value='Submit'>");
     out.println("</Form>");

     out.println("</Body>");
     out.println("</Html>");

   }
}