import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Cookie4 extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();

     Cookie arr[]=request.getCookies();
     
     out.println("<Html>");
     out.println("<Body>");
    
      for(Cookie c: arr)
        out.println("Hi "+c.getValue()+"<Br>");
     out.println("</Body>");
     out.println("</Html>");
   }
}

