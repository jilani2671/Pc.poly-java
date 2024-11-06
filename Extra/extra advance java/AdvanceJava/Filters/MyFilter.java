import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyFilter implements Filter
{
  private FilterConfig obj;

  public void init(FilterConfig obj)
   {
     this.obj=obj;
   }

 public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
 throws IOException, ServletException
  {
    HttpServletRequest req=(HttpServletRequest)request;
    HttpServletResponse res=(HttpServletResponse)response;

    MyWrapper mw=new MyWrapper(req); 

    chain.doFilter(mw, res);
  }
 
  public void destroy()
   {}
}