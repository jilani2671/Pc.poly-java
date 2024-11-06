import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Cookie2 extends HttpServlet
{
  public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
  {
    response.setContentType("Text/Html");
    PrintWriter out=response.getWriter();

    String uname=request.getParameter("uname");
    String pass=request.getParameter("pass");
  
    Cookie c1=new Cookie("uid",uname);
    Cookie c2=new Cookie("pwd",pass);

    response.addCookie(c1);
    response.addCookie(c2);

    out.println("<Html>");
    out.println("<Body>");
    out.println("<Form Action='Cookie3'>");
    out.println("<Input Type='Submit' Name='Submit' Value='Submit'>");
    out.println("</Form>");
    out.println("</Body>");
    out.println("</Html>");
  }
}