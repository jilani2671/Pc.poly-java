import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Check1 extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>"); 
    out.println("<Body>");

     out.println("<Form action='Check2'>");
     out.println("Choose Players:--");
     out.println("<Input Type='Checkbox' Name='player' Value='Sachin'>Sachin");
     out.println("<Input Type='Checkbox' Name='player' Value='Saurav'>Saurav");
     out.println("<Input Type='Checkbox' Name='player' Value='Rahul'>Rahul");
     out.println("<Input Type='Checkbox' Name='player' Value='Anil'>Anil");
     out.println("<Input Type='Submit' Value='Submit'><Br>");
     out.println("</Form>");

     out.println("</Body>");
     out.println("</Html>");
   }

}