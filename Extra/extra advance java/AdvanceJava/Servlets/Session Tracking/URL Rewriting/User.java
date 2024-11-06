import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class User extends HttpServlet 
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");

        out.println("<Form action='Check'>");
        out.println("Name: <Input Type='Text' Name='uname'><Br>");
        out.println("Password: <Input Type='Password' Name='pass'><Br>");
        out.println("Gender: ");
        out.println("<Input Type='Radio' Name='gender' Value='M'>Male");
        out.println("<Input Type='Radio' Name='gender' Value='F'>Female<Br>");
        out.println("<Input Type='Submit' Value='Submit'>");
        out.println("</Form>");

        out.println("</body>");
        out.println("</html>");
 
   
   }
} 