import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Cookie3 extends HttpServlet
{
  public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
  {
    response.setContentType("Text/Html");
    PrintWriter out=response.getWriter();

    Cookie[] arr=request.getCookies();

    out.println("<Html>");
    out.println("<Body Bgcolor='cyan'>");
    out.println("<Form Action='Cookie4'>");
    
    for(Cookie c: arr)
    out.println(c.getValue()+" "+c.getName());

    out.println("<Input Type='Submit' Name='Submit' Value='Submit'>");
    out.println("</Form>");
    out.println("</Body>");
    out.println("</Html>");
  }
}