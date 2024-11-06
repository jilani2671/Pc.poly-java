import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class PostEx1 extends HttpServlet
{
  public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
  {
    response.setContentType("Text/Html");
    PrintWriter out=response.getWriter();

    out.println("<Html>");
    out.println("<Body>");
    out.println("<Form Action='PostEx2' Method='post'>");
    out.println("<Table>");
    out.println("<Tr>");
    out.println("<td>Enter First Number </td>"+"<td><Input Type='Text' Name='fno' Value=''></Td>");
    out.println("</Tr>");

    out.println("<Tr>");
    out.println("<td>Enter Second Number</td>"+"<td><Input Type='Text' Name='sno' Value=''></td>");
    out.println("</Tr>");
   
    out.println("<Th colspan='2'>");
    out.println("<Input Type='submit' Name='add' Value='ADD'>");
    out.println("</Th>");
    out.println("</Table>");
    out.println("</From>");
    out.println("</Body>");
    out.println("</Html>");
  }
}