<%@ page import="java.sql.*"%>

<Html>
<Body>

<%
   Connection con=null;
   Statement stmt=null;
   String query="";
   String sno=request.getParameter("sno");
   int i;

   try
     {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       con=DriverManager.getConnection("jdbc:odbc:MyOraDSN","shekhar","khairnar");
       query="delete from student where sno="+sno;
       stmt=con.createStatement();
       stmt.executeUpdate(query);

       stmt.close();
       con.close();
     }
   catch(Exception e)
     {
       out.println(e);
     }
    response.sendRedirect("StudentList.jsp");
%>


</Body>
</Html>