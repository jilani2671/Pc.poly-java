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

</Body>
</Html>