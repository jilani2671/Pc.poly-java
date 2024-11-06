<%@ page import="java.sql.*"%>


<Html>
<Body>
<Center>
<Form Name="form_update" Action="StudentUpdateComplete.jsp">
<Table Bgcolor="cyan" Width="40%" Cellspacing="10">

<%
   Connection con=null;
   Statement stmt=null;
   ResultSet rs=null;
   String query="";
  
   String sno=request.getParameter("sno");
   int sage=0;
   String  gen1="",gen2="",sgender="";
   String hb1="",hb2="",hb3="";
   String sname="";

   try
     {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       con=DriverManager.getConnection("jdbc:odbc:MyOraDSN","shekhar","khairnar");
       query="select * from student where sno="+sno;
       stmt=con.createStatement();
       rs=stmt.executeQuery(query);
       
        if(rs.next())
        {
          sage=rs.getInt("sage");
          sname=rs.getString("sname");
          sgender=rs.getString("sgender");
          hb1=rs.getString("reading");
          hb2=rs.getString("swiming");
          hb3=rs.getString("cricket");

          if(sgender.equals("m"))
              gen1="checked";
          else
              gen2="checked";

          if(hb1.equals("1"))
            hb1="checked";
          if(hb2.equals("1"))
            hb2="checked";
          if(hb3.equals("1"))
            hb3="checked";
            
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
<Th><Input Type="Hidden" Name="hdn_sno" Value="<%=sno%>"></Th>
</Tr>

<Tr>
<Td Align="center">Student Nunber</Td>
<Td><Input Type="Text" Name="sno" Value="<%=sno%>"></Td>
</Tr>

<Tr>
<Td Align="center">Student Name</Td>
<Td><Input Type="Text" Name="sname" Value="<%=sname%>"></Td>
</Tr>

<Tr>
<Td Align="center">Student Age</Td>
<Td><Input Type="Text" Name="sage" Value="<%=sage%>"></Td>
</Tr>

<Tr>
<Td Align="center">Gender</Td>
<Td>
    <Input Type="Radio" Name="sgender" Value="m" <%=gen1%>>Male
    <Input Type="Radio" Name="sgender" Value="f" <%=gen2%>>Female
</Td>
</Tr>

<Tr>
<Td Align="center">Hobbies</Td>
<Td>
    <Input Type="CheckBox" Name="reading" <%=hb1%>>Reading
    <Input Type="CheckBox" Name="swiming" <%=hb2%>>Swiming 
    <Input Type="CheckBox" Name="cricket" <%=hb3%>>Cricket
</Tr>

<Tr>
<Th colspan="2"><Input Type="Submit" Name="btn_Submit" Value="UPDATE">
</Tr>


</Table>
</Form>
</Center>
</Body>
<Html>
