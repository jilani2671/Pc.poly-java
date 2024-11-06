import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Session1 extends HttpServlet
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

     HttpSession session=request.getSession();
     session.setAttribute("uid", uname);
     session.setAttribute("pwd", pass);

     out.println("<Form action='Session2'>");
     out.println("<Input Type='Submit' Value='Submit'>");
     out.println("</Form>");

     out.println("</Body>");
     out.println("</Html>");

   }
}