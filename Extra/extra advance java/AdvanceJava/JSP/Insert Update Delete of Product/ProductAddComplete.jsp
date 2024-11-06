<%@ page import="java.sql.*"%>

<Html>
<Body>

<%
  Connection con=null;
  Statement stmt=null;
  String query="";

  String pid=request.getParameter("hdnpid");
  String pname=request.getParameter("pname");
  String pprice=request.getParameter("pprice");
  String ptype=request.getParameter("ptype");
  String pmaterial=request.getParameter("pmaterial");
  String pdiscription=request.getParameter("pdiscription");
  

  try
    {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      con=DriverManager.getConnection("jdbc:odbc:MyOraDSN","shekhar","khairnar");
      query="insert into product values("+pid+",'"+pname+"',"+pprice+",'"+pmaterial+"','"+ptype+"','"+pdiscription+"')";
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

  alert("Record Added Successfully.")
  document.location.href="ProductList.jsp"

</Script>

</Body>
</Html>