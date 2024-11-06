import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Select extends HttpServlet
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
      out.println("<Select name='oper'>");
      out.println("<Option Value='sum'>Summation</Option>");
      out.println("<Option Value='sub'>Substraction</Option>");
      out.println("<Option Value='mult'>Multiplication</Option>");
      out.println("<Option Value='div'>Division</Option>");
      out.println("</Select>");

      out.println("<Input Type='Submit' Value='Result'>");

      out.println("</Form>");
        
      out.println("</body>");
      out.println("</html>");   
     }

}
