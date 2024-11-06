<Html>
<Body>
<Center>
<Form Action="StudentUpdateComplete.jsp">
<Table Border="1">
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
              String query="select * from student2 where sno="+sno;
              Statement stmt=con.createStatement();
              ResultSet rs=stmt.executeQuery(query);
                     
                while(rs.next())
                {
 %>
 <Tr>
<Td><Input Type="Hidden" Name="hidden_sno" Value="<%=sno%>"></Td>
<Td>Student No</Td><Td><Input Type="Text" Name="sno" Value="<%=sno%>"></Td>
<Td>Student Name</Td><Td><Input Type="Text" Name="sname" Value="<%=rs.getString("sname")%>"></Td>
<Td>Student Age</Td><Td><Input Type="Text" Name="sage" Value="<%=rs.getInt("sage")%>"></Td>
<Th Colspan="2"><Input Type="Submit" Name="btn_update" Value="UPDATE"></Th>
</Tr>
 <%
 
                }
               stmt.close();
               con.close();         
           }
         catch(Exception e)
           { 
              out.println(e);
           }
          
  %>

</Table>
</Form>
</Center>
</Body>
</Html>
