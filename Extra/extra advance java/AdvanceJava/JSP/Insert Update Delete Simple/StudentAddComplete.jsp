<%@ page import="java.sql.*"%>

<Html>
<Body>

  <%
         Connection con=null;
         int sno=Integer.parseInt(request.getParameter("sno"));
         String sname=request.getParameter("sname");
         int sage=Integer.parseInt(request.getParameter("sage"));

         try
            {
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              con=DriverManager.getConnection("jdbc:odbc:MyOraDSN","shekhar","khairnar");
              String query="insert into student2 values("+sno+",'"+sname+"',"+sage+")";
              Statement stmt=con.createStatement();
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
