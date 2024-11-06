import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Hidden2 extends HttpServlet 
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body bgcolor='Cyan'>");

        String uname1=request.getParameter("uname1");

        out.println("<Form action='Hidden3'>");
        out.println("<Br><Br><Br>Name: <Input Type='Hidden' Name='uname2' Value='" + uname1 + "'><Br>");
        out.println("<Input Type='Submit' Value='Submit'>");
        out.println("</Form>");

        out.println("</body>");
        out.println("</html>");
 
   
   }
} 