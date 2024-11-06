<%@ page import="java.sql.*"%>

<Html>
<Body>

<%
  Connection con=null;
  Statement stmt=null;
  String query="";

  String pid=request.getParameter("pid");
  

  try
    {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      con=DriverManager.getConnection("jdbc:odbc:MyOraDSN","shekhar","khairnar");
      query="delete from product where pid="+pid;
      stmt=con.createStatement();
      stmt.executeUpdate(query);
  
      
      stmt.close();
      con.close();
    }
  catch(Exception e)
    {
     out.println(e);
    }
    //response.sendRedirect("ProductList.jsp");
 
%>
<Script language="javascript">

  alert("Record Deleted Successfully.")
  document.location.href="ProductList.jsp"

</Script>

</Body>
</Html>