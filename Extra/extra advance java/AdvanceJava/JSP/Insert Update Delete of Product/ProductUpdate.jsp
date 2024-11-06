<%@ page import="java.sql.*"%>


<Html>
<Body>
<Form Action="ProductUpdateComplete.jsp">
<Center>
<Table Bgcolor="cyan" Width="40%" Cellpadding="5">

<%
  Connection con=null;
  Statement stmt=null;
  ResultSet rs=null;
  String query="";

  String pname="";
  int pprice=0;
  String ptype="",p1="",p2="";
  String pmaterial="";
  String pdiscription="";
  String pid=request.getParameter("pid");

  try
    {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      con=DriverManager.getConnection("jdbc:odbc:MyOraDSN","shekhar","khairnar");
      query="select * from product where pid="+pid;
      stmt=con.createStatement();
      rs=stmt.executeQuery(query);
  
      if(rs.next())
      {
        
        pname=rs.getString("pname");
        pprice=rs.getInt("pprice");
        pmaterial=rs.getString("pmaterial");
        ptype=rs.getString("ptype");
        pdiscription=rs.getString("pdiscription");

        if(ptype.equals("consumable"))
           p1="selected";
        else
           p2="selected";
 %>

<Tr>
<Td>Product Id</Td>
<Td><%=pid%><Input Type="Hidden" Name="hdnpid" Value="<%=pid%>"></Td>
</Tr>

<Tr>
<Td>Product Name</Td>
<Td><Input Type="Text" Name="pname" Value="<%=pname%>"></Td>
</Tr>

<Tr>
<Td>Product Price</Td>
<Td><Input Type="Text" Name="pprice" Value="<%=pprice%>"></Td>
</Tr>

<Tr>
<Td>Product Material</Td>
<Td><Input Type="Text" Name="pmaterial" Value="<%=pmaterial%>"></Td>
</Tr>

<Tr>
<Td>Product Type</Td>
<Td>
<Select Name="ptype">
<Option Value="consumable" <%=p1%>>consumable</Option>
<Option Value="nonconsumable" <%=p2%>>nonconsumable</Option>
</Select>
</Td>
</Tr>

<Tr>
<Td>Product Discription</Td>
<Td>
<TextArea Name="pdiscription">
<%=pdiscription%>
</TextArea>
</Td>
</Tr>

<Tr>
<Th colspan="2"><Input Type="Submit" Value="Update"></Th>
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
</Form>
</Body>
</Html>