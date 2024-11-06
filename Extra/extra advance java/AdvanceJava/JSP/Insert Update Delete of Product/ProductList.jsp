<%@ page import="java.sql.*"%>


<Html>
<Body>
<Head>
<Script language="JavaScript">

  function confirmDelete()
  {
    var confierm=confirm("Do You Want To Delete This Record ?")

    if(confierm==true)
    {
      return
    }
    else
    {
      return false
    }
  }

</Script>
</Head>

<Center>
<Table Border="1" Width="30%">
<Tr>
<Th colspan="4"><A Href="ProductAdd.jsp">Add New Product</A></Th>
</Tr>
<Tr>
<Th>product ID</Th>
<Th>Product Name</Th>
<Th colspan="2">Operation</Th>

<%
  Connection con=null;
  Statement stmt=null;
  ResultSet rs=null;
  String query="";
  int pid=0;

  try
    {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      con=DriverManager.getConnection("jdbc:odbc:MyOraDSN","shekhar","khairnar");
      query="select pid,pname from product order by pid";
      stmt=con.createStatement();
      rs=stmt.executeQuery(query);
  
      while(rs.next())
      {
        pid=rs.getInt("pid");
 %>

<Tr>
<Td><%=pid%></Td>
<Td><%=rs.getString("pname")%></Td>
<Td><A Href="ProductUpdate.jsp?pid=<%=pid%>">Update</A></Td>
<Td><A Href="ProductDeleteComplete.jsp?pid=<%=pid%>" onclick="return confirmDelete()">Delete</A></Td>
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