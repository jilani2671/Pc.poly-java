import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class PostEx2 extends HttpServlet
{
  public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
  {
    response.setContentType("Text/Html");
    PrintWriter out=response.getWriter();

    int num1=Integer.parseInt(request.getParameter("fno"));
    int num2=Integer.parseInt(request.getParameter("sno"));
    int sum=num1+num2;
    
    out.println("<Html>");
    out.println("<Body>");  
    out.println("<Center>"+sum+"</Center>");
    out.println("</Body>");
    out.println("</Html>");  
  }
}