<Html>
<Body>

<jsp:useBean class="mypack.Student" id="myid" scope="session" />
<jsp:setProperty name="myid" property="sno" param="TxtSno" />
<jsp:setProperty name="myid" property="sname" param="TxtSname" />
<jsp:setProperty name="myid" property="age"  param="TxtAge" />
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