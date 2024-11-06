import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Hidden1 extends HttpServlet 
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");

        out.println("<Form action='Hidden2'>");
        out.println("Name: <Input Type='Text' Name='uname1'><Br>");
        out.println("<Input Type='Submit' Value='Submit'>");
        out.println("</Form>");

        out.println("</body>");
        out.println("</html>");
 
   
   }
} 