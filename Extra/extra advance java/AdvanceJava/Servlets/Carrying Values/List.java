import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class List extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException, ServletException
    {
      response.setContentType("Text/Html");
      PrintWriter out=response.getWriter();
      
      out.println("<html>");
      out.println("<body>");

      out.println("<Form action='Check2'>");

      out.println("Choose Palyers:--"); 
      out.println("<Select name='player' size='3' Multiple>");
      out.println("<Option value='Sachin'>Sachin</Option>");
      out.println("<Option value='Saurav'>Saurav</Option>");
      out.println("<Option value='Rahul'>Rahul</Option>");
      out.println("<Option value='Anil'>Anil</Option>");
      out.println("</Select>");

      out.println("<Input Type='Submit' Value='Result'>");
      out.println("</Form>");
        
      out.println("</body>");
      out.println("</html>");   
     }

}
