import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Cookie3 extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>");
     out.println("<Body Bgcolor='Cyan'><Br><Br>");


     Cookie arr[ ]=request.getCookies();

     for(int i=0; i<arr.length; i++) 
           out.println(arr[i].getName() + "  " + arr[i].getValue() + "<Br>");


     out.println("</Body>");
     out.println("</Html>");

   }
}