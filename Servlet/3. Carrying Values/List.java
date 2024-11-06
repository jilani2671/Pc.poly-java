import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class List extends HttpServlet
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

     out.println("<Select name='player' size='3' Multiple>");
     out.println("<Option value='Sachin'>Sachin</Option>");
     out.println("<Option value='Saurav'>Saurav</Option>");
     out.println("<Option value='Rahul'>Rahul</Option>");
     out.println("<Option value='Anil'>Anil</Option>");
     out.println("</Select >");

     out.println("<Input Type='Submit' Value='Submit'><Br>");
     out.println("</Form>");

     out.println("</Body>");
     out.println("</Html>");
   }

}