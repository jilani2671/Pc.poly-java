import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import mypack.First;

public class MyServlet extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>");
     out.println("<Body>");

     int num=Integer.parseInt(request.getParameter("num"));

     First f=new First();
     int res=f.square(num);
     out.println("Square=" + res);


     out.println("<Br><A Href='../MyJsp.jsp'>Go To JSP</A>");

     out.println("</Body>");
     out.println("</Html>");

   }
}