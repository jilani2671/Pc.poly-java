<Html>
<Body>

<%
      String message=request.getParameter("message");
      application.setAttribute("msg", message);
%>

<Form action="Application2.jsp">
<Input Type="Submit" Value="Submit">
</Form>

</Body>
</Html>



