import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Cookie1 extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();

     out.println("<Html>");
     out.println("<Body>");
     out.println("<Form Action='Cookie2'>");
     out.println("Name <Input Type='Text' Name='uname'><Br>");
     out.println("Password <Input Type='Password' Name='pass'><Br>");
     out.println("<Input Type='Submit' Name='Submit' Value='Submit'>");
     out.println("</Form>");
     out.println("</Body>");
     out.println("</Html>");
   }
}