import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Male extends HttpServlet 
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body bgcolor='Cyan'>");

        String user=request.getParameter("user");
        String pwd=request.getParameter("pwd");
        out.println("Hello " + user + ". Your password is: " + pwd + "<Br>");
        out.println("This is page for Male");

        out.println("</body>");
        out.println("</html>");
 
   
   }
} 