import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Radio1 extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException, ServletException
    {
      response.setContentType("Text/Html");
      PrintWriter out=response.getWriter();
      
      out.println("<html>");
      out.println("<body>");

      out.println("<Form action='Radio2'>");

      out.println("First No:"); 
      out.println("<Input Type='Text' Name='fno'><Br>");

      out.println("Second No:"); 
      out.println("<Input Type='Text' Name='sno'><Br>");

      out.println("Operation:");
      out.println("<Input Type='Radio' Name='oper' Value='sum'>Summation");
      out.println("<Input Type='Radio' Name='oper' Value='sub'>Substraction");
      out.println("<Input Type='Radio' Name='oper' Value='mult'>Multiplication");
      out.println("<Input Type='Radio' Name='oper' Value='div'>Division<Br>");

      out.println("<Input Type='Submit' Value='Result'>");

      out.println("</Form>");
        
      out.println("</body>");
      out.println("</html>");   
     }

}
