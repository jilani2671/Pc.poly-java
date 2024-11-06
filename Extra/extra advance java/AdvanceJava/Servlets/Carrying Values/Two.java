import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Two extends HttpServlet
{
   public void doPost(HttpServletRequest request,HttpServletResponse response)
   throws IOException, ServletException
    {
      response.setContentType("Text/Html");
      PrintWriter out=response.getWriter();
      
      out.println("<html>");
      out.println("<body>");

      int num1=Integer.parseInt(request.getParameter("fno"));
      int num2=Integer.parseInt(request.getParameter("sno"));
      int sum=num1 + num2;
      out.println("Summation=" + sum);
        
      out.println("</body>");
      out.println("</html>");   
     }

}
