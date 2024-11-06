<%@ page import="mypack.First" %>

<Html>
<Body>

<%
      First f=new First();
      out.println(f.square(16));
%>

<Br>
<A Href="servlet/MyServlet?num=40">
Go To Servlet
</A>

</Body>
</Html>