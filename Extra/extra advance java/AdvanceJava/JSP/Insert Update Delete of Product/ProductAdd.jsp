<%@ page import="java.sql.*"%>


<Html>
<Body>
<Form Action="ProductAddComplete.jsp">
<Center>
<Table Bgcolor="cyan" Width="40%" Cellpadding="5">

<%
  Connection con=null;
  Statement stmt=null;
  ResultSet rs=null;
  String query="";

  
  int max_pid=0;

  try
    {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      con=DriverManager.getConnection("jdbc:odbc:MyOraDSN","shekhar","khairnar");
      query="select max(pid) max_pid from product";
      stmt=con.createStatement();
      rs=stmt.executeQuery(query);
  
      if(rs.next())
      {
        max_pid=rs.getInt("max_pid");
        max_pid++;
        
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
<Td>Product Id</Td>
<Td><%=max_pid%><Input Type="Hidden" Name="hdnpid" Value="<%=max_pid%>"></Td>
</Tr>

<Tr>
<Td>Product Name</Td>
<Td><Input Type="Text" Name="pname"></Td>
</Tr>

<Tr>
<Td>Product Price</Td>
<Td><Input Type="Text" Name="pprice"></Td>
</Tr>

<Tr>
<Td>Product Material</Td>
<Td><Input Type="Text" Name="pmaterial"></Td>
</Tr>

<Tr>
<Td>Product Type</Td>
<Td>
<Select Name="ptype">
<Option Value="consumable" selected>consumable</Option>
<Option Value="nonconsumable">nonconsumable</Option>
</Select>
</Td>
</Tr>

<Tr>
<Td>Product Discription</Td>
<Td>
<TextArea Name="pdiscription">
 Insert Discription
</TextArea>
</Td>
</Tr>

<Tr>
<Th colspan="2"><Input Type="Submit" Value="Add"></Th>
</Tr>



</Table>
</Center>
</Form>
</Body>
</Html>