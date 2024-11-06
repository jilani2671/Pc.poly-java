import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Radio2 extends HttpServlet
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

     out.println("<Font color='Red' Size='15'>");
     out.println("Result=" + res);
     out.println("</Font>");

     out.println("</Body>");
     out.println("</Html>");

   }
}