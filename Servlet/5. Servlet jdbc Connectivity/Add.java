import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Add extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>");
     out.println("<Body>");

     out.println("<Form action='Insert'>");
     out.println("Student No: <Input Type='Text' Name='sno'><Br>");     
     out.println("Student Name: <Input Type='Text' Name='sname'><Br>");     
     out.println("Age: <Input Type='Text' Name='age'><Br>");     
     out.println("<Input Type='Submit' Value='Submit'>");     
     out.println("</Form>");

     out.println("</Body>");
     out.println("</Html>");

   }

}