import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Session2 extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();

     String uname=request.getParameter("uname");    
     String pass=request.getParameter("pass");
   
     HttpSession session=request.getSession();
     session.setAttribute("uid",uname);
     session.setAttribute("pwd",pass);    
     
     out.println("<Html>");
     out.println("<Body>");
     out.println("<Form Action='Session3'>");
     out.println("<Input Type='Submit' Name='Submit' Value='Submit'>");
     out.println("</Form>");
     out.println("</Body>");
     out.println("</Html>");
   }
}