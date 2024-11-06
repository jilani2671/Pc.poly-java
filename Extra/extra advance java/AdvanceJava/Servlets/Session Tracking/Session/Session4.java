import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Session4 extends HttpServlet
{
  public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
  {
    response.setContentType("Text/Html");
    PrintWriter out=response.getWriter();

    HttpSession session=request.getSession();

    String user=(String)session.getAttribute("uid");
    String password=(String)session.getAttribute("pwd");
   
    out.println("<Html>");
     out.println("<Body Bgcolor='red'>");
    out.println("Hi "+user+"  "+"Your password is "+password);
    out.println("</Body>");
    out.println("<Html>");
  }
}