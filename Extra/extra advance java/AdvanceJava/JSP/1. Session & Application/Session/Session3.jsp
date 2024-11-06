<Html>
<Body Bgcolor="Cyan">

<%
      String user=(String)session.getAttribute("uid");
      String password=(String)session.getAttribute("pwd");
      out.println("<Br><Br>Hello " + user + " Your password is: " + password);      
%>

</Body>
</Html>