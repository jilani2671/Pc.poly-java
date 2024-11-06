<Html>
<Body>

Before inclusion!!! <Br>

<%
       request.setAttribute("uid", "Sachin");
%>
<jsp:include page="Two.jsp" />
<Br> After inclusion!!!

</Body>
</Html>