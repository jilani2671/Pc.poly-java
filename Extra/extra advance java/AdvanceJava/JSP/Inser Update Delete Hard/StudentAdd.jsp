<%@ page import="java.sql.*"%>

<%
   Connection con=null;
   Statement stmt=null;
   ResultSet rs=null;
   String query="";
   int max_sno=0;

   try
     {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       con=DriverManager.getConnection("jdbc:odbc:MyOraDSN","shekhar","khairnar");
       query="select max(sno) max_sno from student";
       stmt=con.createStatement();
       rs=stmt.executeQuery(query);
       
       if(rs.next())
        {
        max_sno=rs.getInt("max_sno");
        max_sno=max_sno+1;
        }
       
     }     
   catch(Exception e)
     {
      out.println(e);
     }
     rs.close();
     stmt.close();
     con.close();
   
%>

<Html>
<Body>
<Center>
<Form Name="form_add" Action="StudentAddComplete.jsp">
<Table Bgcolor="cyan" Width="40%" Cellspacing="10">

<Tr>
<Td Align="center">Student Roll Number</Td>
<Td><%=max_sno%><Input Type="Hidden" Name="hdn_sno" Value="<%=max_sno%>"></Td>
</Tr>

<Tr>
<Td Align="center">Student Name</Td>
<Td><Input Type="Text" Name="sname"></Td>
</Tr>

<Tr>
<Td Align="center">Student Age</Td>
<Td><Input Type="Text" Name="sage"></Td>
</Tr>

<Tr>
<Td Align="center">Gender</Td>
<Td>
    <Input Type="Radio" Name="sgender" Value="m">Male
    <Input Type="Radio" Name="sgender" Value="f">Female
</Td>
</Tr>

<Tr>
<Td Align="center">Hobbies</Td>
<Td>
    <Input Type="CheckBox" Name="reading">Reading
    <Input Type="CheckBox" Name="swiming">Swiming 
    <Input Type="CheckBox" Name="cricket">Cricket
</Tr>

<Tr>
<Th colspan="2"><Input Type="Submit" Name="btn_Submit" Value="ADD">
</Tr>

</Table>
</Form>
</Center>
</Body>
<Html>
