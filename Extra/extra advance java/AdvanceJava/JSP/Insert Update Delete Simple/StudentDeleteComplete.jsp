<%@ page import="java.sql.*"%>

<Html>
<Body>

  <%
         Connection con=null;
         int sno=Integer.parseInt(request.getParameter("sno"));
        
         try
            {
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              con=DriverManager.getConnection("jdbc:odbc:MyOraDSN","shekhar","khairnar");
              String query="delete from student2 where sno="+sno;
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
	