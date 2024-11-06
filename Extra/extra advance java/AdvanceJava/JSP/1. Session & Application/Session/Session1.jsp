<Html>
<Body>

<%
      String uname=request.getParameter("uname");
      String pass=request.getParameter("pass");

      session.setAttribute("uid", uname);
      session.setAttribute("pwd", pass);
%>

<Form action="Session2.jsp">
<Input Type="Submit" Value="Submit">
</Form>

</Body>
</Html>