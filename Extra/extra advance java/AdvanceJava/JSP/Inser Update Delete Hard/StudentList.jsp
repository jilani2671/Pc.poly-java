<%@ page import="java.sql.*"%>


<Html>
<Body>
<Center>
<Table Border="1" Width="30%">
<Tr>
<Th colspan="4"><A Href="StudentAdd.jsp">Add New Student</A></Th>
</Tr>
<Tr>
<Th>Roll No</Th>
<Th>Name</Th>
<Th colspan="2">Operation</Th>

<%
  Connection con=null;
  Statement stmt=null;
  ResultSet rs=null;
  String query="";
  int sno;

  try
    {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      con=DriverManager.getConnection("jdbc:odbc:MyOraDSN","shekhar","khairnar");
      query="select sno,sname from student order by sno";
      stmt=con.createStatement();
      rs=stmt.executeQuery(query);
  
      while(rs.next())
      {
        sno=rs.getInt("sno");
 %>

<Tr>
<Td><%=sno%></Td>
<Td><%=rs.getString("sname")%></Td>
<Td><A Href="StudentUpdate.jsp?sno=<%=sno%>">Update</A></Td>
<Td><A Href="StudentDeleteComplete.jsp?sno=<%=sno%>">Delete</A></Td>
</Tr>


<%
      }
      rs.close();
      stmt.close();
      con.close();
    }
  catch(Exception e)
    {
     out.println(e);
    }
 
%>


</Table>
</Center>
</Body>
</Html>