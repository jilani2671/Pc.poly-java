import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Two extends HttpServlet
{
   public void doPost(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>"); 
     out.println("<Body>");

     int num1=Integer.parseInt(request.getParameter("fno"));    
     int num2=Integer.parseInt(request.getParameter("sno"));   
     int sum=num1 +num2;  

     out.println("<Font color='Red' Size='15'>");
     out.println("Sum=" + sum);
     out.println("</Font>");

     out.println("</Body>");
     out.println("</Html>");

   }
}