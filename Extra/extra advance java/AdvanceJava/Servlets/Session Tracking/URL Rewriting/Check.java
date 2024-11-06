import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Check extends HttpServlet 
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body bgcolor='Cyan'>");

        String uname=request.getParameter("uname");
        String pass=request.getParameter("pass");
        String gender=request.getParameter("gender");

        if(gender.equals("M"))
                  response.sendRedirect("Male?user=" + uname + "&pwd=" + pass);
        else
                  response.sendRedirect("Female?user=" + uname + "&pwd=" + pass);

        out.println("</body>");
        out.println("</html>");
 
   
   }
} 