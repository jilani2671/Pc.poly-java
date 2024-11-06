<Html>
<Body>

<%
      String user=(String)session.getAttribute("uid");
      String password=(String)session.getAttribute("pwd");
      out.println("Hello " + user + " Your password is: " + password);      
%>

<Form action="Session3.jsp">
<Input Type="Submit" Value="Submit">
</Form>

</Body>
</Html>