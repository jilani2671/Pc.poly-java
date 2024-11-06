import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Table2 extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>"); 
     out.println("<Body>");

     int num1=Integer.parseInt(request.getParameter("fno"));
     int num2=Integer.parseInt(request.getParameter("sno"));

     out.println("<Table border='1'>");

      for(int i=1; i<=10; i++)
       {
           out.println("<Tr>");
           for(int j=num1; j<=num2; j++)
             {
               out.println("<Td>");
               out.println(i*j);
               out.println("</Td>");
             }
           out.println("</Tr>");
       } 


     out.println("</Table>");

     out.println("</Body>");
     out.println("</Html>");

   }
}




