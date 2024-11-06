import javax.servlet.*;
import javax.servlet.http.*;

class MyWrapper extends HttpServletRequestWrapper
{
   MyWrapper(HttpServletRequest req)
    {
      super(req);
    }

  public String getParameter(String paramname)
   {
     String str=super.getParameter(paramname);
     return str.toUpperCase();
   }
}