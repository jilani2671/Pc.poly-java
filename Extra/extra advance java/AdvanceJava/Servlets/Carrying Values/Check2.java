import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Check2 extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException, ServletException
    {
      response.setContentType("Text/Html");
      PrintWriter out=response.getWriter();
      
      out.println("<html>");
      out.println("<body>");


      String arr[ ]=request.getParameterValues("player");

      for(int i=0; i<arr.length; i++)
                             out.println(arr[i] + "<Br>");
        
      out.println("</body>");
      out.println("</html>");   
     }

}
