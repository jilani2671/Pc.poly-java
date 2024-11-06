import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Radio2 extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException, ServletException
    {
      response.setContentType("Text/Html");
      PrintWriter out=response.getWriter();
      
      out.println("<html>");
      out.println("<body>");

      int num1=Integer.parseInt(request.getParameter("fno"));
      int num2=Integer.parseInt(request.getParameter("sno"));
      String oper=request.getParameter("oper");
      int res=0;

      if(oper.equals("sum"))
         res=num1 + num2;
      else if(oper.equals("sub"))
         res=num1 - num2;
      else if(oper.equals("mult"))
         res=num1 * num2;
      else
         res=num1 / num2;

      out.println("Result=" + res);
        
      out.println("</body>");
      out.println("</html>");   
     }

}
