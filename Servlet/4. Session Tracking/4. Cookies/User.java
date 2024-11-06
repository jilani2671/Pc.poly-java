import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class User extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>");
     out.println("<Body>");

     out.println("<Form action='Cookie1'>");
     out.println("Name: <Input Type='Text' Name='uname'><Br>");
     out.println("Password: <Input Type='Password' Name='pass'><Br>");
     out.println("<Input Type='Submit' Value='Submit'>");
     out.println("</Form>");


     out.println("</Body>");
     out.println("</Html>");

   }
}