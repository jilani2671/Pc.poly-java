import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class One extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException, ServletException
    {
      response.setContentType("Text/Html");
      PrintWriter out=response.getWriter();
      
      out.println("<html>");
      out.println("<body>");

      out.println("<Form action='Two' Method='Post'>");

      out.println("First No:"); 
      out.println("<Input Type='Text' Name='fno'><Br>");

      out.println("Second No:"); 
      out.println("<Input Type='Text' Name='sno'><Br>");

      out.println("<Input Type='Submit' Value='Sum'>");

      out.println("</Form>");
        
      out.println("</body>");
      out.println("</html>");   
     }

}
