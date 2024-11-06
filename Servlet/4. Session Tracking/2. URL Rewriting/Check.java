import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Check extends HttpServlet
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
     String gender=request.getParameter("gender"); 

     if(gender.equals("M"))
        response.sendRedirect("Male?user=" + uname + "&pwd=" + pass);
     else
        response.sendRedirect("Male?user=" + uname + "&pwd=" + pass);

     out.println("</Body>");
     out.println("</Html>");

   }
}