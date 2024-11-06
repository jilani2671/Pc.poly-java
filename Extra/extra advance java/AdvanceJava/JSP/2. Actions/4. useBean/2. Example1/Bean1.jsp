<Html>
<Body>

<jsp:useBean class="mypack.Student" id="myid" scope="session" />
<jsp:setProperty name="myid" property="sno" value="100" />
<jsp:setProperty name="myid" property="sname" value="Sachin" />
<jsp:setProperty name="myid" property="age" value="35" />
</jsp:useBean>

<%
  out.println(myid.getSno());
  out.println(myid.getSname());
  out.println(myid.getAge());
%>

<Form action="Bean2.jsp">
<Input Type="Submit" Value="Submit">
</Form>

</Body>
</Html>