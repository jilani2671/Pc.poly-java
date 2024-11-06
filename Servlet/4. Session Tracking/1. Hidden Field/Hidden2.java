import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Hidden2 extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>"); 
     out.println("<Body Bgcolor='Cyan'>");

     String uname1=request.getParameter("uname1"); 

     out.println("<Form action='Hidden3'>");
     out.println("<Br><Br><Br>Name:" + uname1 +"<Input Type='Hidden' Name='uname2' Value='" + uname1 + "'><Br>");
     out.println("<Input Type='Submit' Value='Submit'><Br>");
     out.println("</Form>");

     out.println("</Body>");
     out.println("</Html>");

   }
}