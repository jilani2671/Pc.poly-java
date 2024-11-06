import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Radio1 extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>"); 
    out.println("<Body>");

     out.println("<Form action='Radio2'>");
     out.println("First No: <Input Type='Text' Name='fno'><Br>");
     out.println("Second No: <Input Type='Text' Name='sno'><Br>");
     out.println("Choose Operation:--");
     out.println("<Input Type='Radio' Name='oper' Value='sum'>Summation");
     out.println("<Input Type='Radio' Name='oper' Value='sub'>Substraction");
     out.println("<Input Type='Radio' Name='oper' Value='mult'>Multiplication");
     out.println("<Input Type='Radio' Name='oper' Value='div'>Division");
     out.println("<Input Type='Submit' Value='Result'><Br>");
     out.println("</Form>");

     out.println("</Body>");
     out.println("</Html>");

   }
}