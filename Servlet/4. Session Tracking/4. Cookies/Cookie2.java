import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Cookie2 extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>");
     out.println("<Body>");


     Cookie arr[ ]=request.getCookies();

     for(int i=0; i<arr.length; i++) 
           out.println(arr[i].getName() + "  " + arr[i].getValue() + "<Br>");

     out.println("<Form action='Cookie3'>");
     out.println("<Input Type='Submit' Value='Submit'>");
     out.println("</Form>");

     out.println("</Body>");
     out.println("</Html>");

   }
}