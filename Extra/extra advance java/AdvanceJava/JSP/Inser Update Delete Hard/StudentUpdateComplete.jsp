<%@ page import="java.sql.*"%>

<Html>
<Body>

<%
   Connection con=null;
   Statement stmt=null;
   String query="";
   String hdn_sno=request.getParameter("hdn_sno");
   String sno=request.getParameter("sno");
   String sname=request.getParameter("sname");
   String sage=request.getParameter("sage");
   String sgender=request.getParameter("sgender");
   String reading=request.getParameter("reading");
   String swiming=request.getParameter("swiming");
   String cricket=request.getParameter("cricket");

   if(reading==null)
     reading="0";
   else
     reading="1";
    if(swiming==null)
     swiming="0";
   else
     swiming="1";
   if(cricket==null)
     cricket="0";
   else
     cricket="1";
     
   try
     {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       con=DriverManager.getConnection("jdbc:odbc:MyOraDSN","shekhar","khairnar");
       query="update student set sno="+sno+",sname='"+sname+"',sage="+sage+",sgender='"+sgender+"',reading="+reading+",swiming="+swiming+",cricket="+cricket+" where sno="+hdn_sno;
       stmt=con.createStatement();
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