<Html>
<Body Bgcolor="Cyan">

<jsp:useBean class="mypack.Student" id="myid" scope="session" />
</jsp:useBean>

<Br><Br>

<%
  out.println(myid.getSno());
  out.println(myid.getSname());
  out.println(myid.getAge());
%>

<Br>
Student No: <jsp:getProperty name="myid" property="sno" /><Br>
Student Name: <jsp:getProperty name="myid" property="sname" /><Br>
Age: <jsp:getProperty name="myid" property="age" /><Br>

</Body>
</Html>


