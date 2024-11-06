<%@ page import="java.sql.*"%>

<Html>
<Body>
<Center>
<Table Border="1">

<Th colspan="5"><A Href="StudentAdd.jsp">Add New Student</A></Th>
<Tr>
<Th>Roll No</Th>
<Th>Name</Th>
<Th>Age</Th>
<Th Colspan="2">Operations</Th>
</Tr>

  <%
         Connection con=null;
         try
            {
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              con=DriverManager.getConnection("jdbc:odbc:MyOraDSN","shekhar","khairnar");
              String query="select * from student2 order by sno";
              Statement stmt=con.createStatement();
              ResultSet rs=stmt.executeQuery(query);
            
              while(rs.next())
               {
                  int sno=rs.getInt("sno");
  %>
 <Tr>
 <Td><%out.println(sno);%></Td>
 <Td><%out.println(rs.getString("sname"));%></Td>
 <Td><%out.println(rs.getInt("sage"));%></Td>
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
</Center>
</Body>
</Html>
