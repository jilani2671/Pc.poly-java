import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class One extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>");
     out.println("<Body>");

     out.println("Before inclusion!!! <Br>");     

     request.setAttribute("uid","Sachin"); 
     RequestDispatcher rd=request.getRequestDispatcher("Two"); 
     rd.include(request,response);

     out.println("<Br>After inclusion!!!");     

     out.println("</Body>");
     out.println("</Html>");

   }
}