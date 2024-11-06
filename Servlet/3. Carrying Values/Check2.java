import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Check2 extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>"); 
     out.println("<Body>");

     String arr[ ]=request.getParameterValues("player");

     out.println("<Font color='Red' Size='15'>");    
    for(int i=0; i<arr.length; i++)
              out.println(arr[i] + "<Br>"); 
     out.println("</Font>");

     out.println("</Body>");
     out.println("</Html>");

   }
}