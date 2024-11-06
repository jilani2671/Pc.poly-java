import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Radio extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>"); 
    out.println("<Body>");

     out.println("<Form action='Radio' Method='Post'>");
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

   public void doPost(HttpServletRequest request,HttpServletResponse response)
   throws IOException,ServletException
   {
     response.setContentType("Text/Html");
     PrintWriter out=response.getWriter();
 
     out.println("<Html>"); 
    out.println("<Body>");

     int num1=Integer.parseInt(request.getParameter("fno"));    
     int num2=Integer.parseInt(request.getParameter("sno"));   
     String oper=request.getParameter("oper");
     int res=0;
    
     if(oper.equals("sum"))    
                   res=num1 + num2;  
     else if(oper.equals("sub"))    
                   res=num1 - num2;  
     else if(oper.equals("mult"))    
                   res=num1 * num2;  
     else if(oper.equals("div"))    
                   res=num1 / num2;  

     out.println("<Font color='Blue' Size='15'>");
     out.println("Result=" + res);
     out.println("</Font>");

     out.println("</Body>");
     out.println("</Html>");
   }

}