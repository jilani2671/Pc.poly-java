<%@ page import="java.sql.*"%>


<Html>
<Body>
<Center>
<Table Width="30%">
<%
   Connection con=null;
   Statement stmt=null;
   ResultSet rs=null;
   String p1="",p2="";
   int pid=0;
   String pdis="";
   String ptype="";
   String query="";
   try
     {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
       con=DriverManager.getConnection("jdbc:odbc:MyOraDSN","shekhar","khairnar");
       query="select * from product1 where pid=2";
       stmt=con.createStatement();
       rs=stmt.executeQuery(query);
       
       if(rs.next())
       {
         pid=rs.getInt("pid"); 
         ptype=rs.getString("ptype");
         pdis=rs.getString("pdis");
         
         if(ptype.equals("consumable"))
           p1="selected";
         else
           p2="selected";
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

<Tr>
<Td>Product id</Td>
<Td><%=pid%></Td>
</Tr>

<Tr>
<Td>Product type</Td>
<Td>
<Select Name="ptype">
<Option Value="consumable" <%=p1%>>consumable</Option>
<Option Value="consumable" <%=p2%>>nonconsumable</Option>
</Select>
</Td>
</Tr>

<Tr>
<Td>Product Discrip</Td>
<Td>
<TextArea Name="pdis">
<%=pdis%>
</TextArea>
</Td>
</Tr>

</Table>
</Center>
</Body>
</Html>