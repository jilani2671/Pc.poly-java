import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Session3 extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
  {
    response.setContentType("Text/Html");
    PrintWriter out=response.getWriter();

    HttpSession session=request.getSession();
    String uid=(String)session.getAttribute("uid");
    //String pwd=(String)session.getAttribute("pwd");
    
     out.println("<Html>");
     out.println("<Body Bgcolor='cyan'>");
     out.println("<Form Action='Session4'>");
     out.println("Hi "+uid);
     out.println("<Br><Input Type='Submit' Name='Submit' Value='Submit'>");
     out.println("</Form>");
     out.println("</Body>");
     out.println("</Html>");
  }
}