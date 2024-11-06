import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Select extends HttpServlet
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

     out.println("<Select name='oper'>");
     out.println("<Option value='sum'>Summation</Option>");
     out.println("<Option value='sub'>Substarction</Option>");
     out.println("<Option value='mult'>Multiplication</Option>");
     out.println("<Option value='div'>Division</Option>");
     out.println("</Select>");

     out.println("<Input Type='Submit' Value='Result'><Br>");
     out.println("</Form>");

     out.println("</Body>");
     out.println("</Html>");
   }

}