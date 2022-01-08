<%-- 
    Document   : confirm
    Created on : Apr 26, 2021, 8:26:07 PM
    Author     : Thuthi
--%>



<%@page import="model.DbCon"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Connection connection=null;
    Statement  st=null;
    ResultSet rs=null;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirm</title>
        <link rel="stylesheet" type="text/css" href="bookFlight.css">
        <script type="text/javascript" src="nav.js"></script>
        <link rel="stylesheet" type="text/css" href="nav.css">
        <style>
            body{
    background-image: url('flights2.jpg');
    opacity: 0.9;
    background-size: cover;
    margin: 0px;
    padding: 0px;
    font-size: 20px;
        </style>
    </head>
    <body>
        <div class="topnav" id="myTopnav">
		<a href="HomePage.html">Home</a>
                <a href="index.html">Flight</a>
                <a href="UserPage.jsp">Your Profile</a>
                <a href="javascript:void(0);" class="icon" onclick="myFunction()">
                    <i class="fa fa-bars"></i>
                </a>
	</div>
        <h1 style="margin-left:15px;">Your reservation went successfully!!</h1>
        <b><p style="margin-left:15px;color: dodgerblue">Ticket details</p></b>
        <div class="container">
         <table id="flight">
          <tr>
            <th>Ticket ID </th>
            <th>Passenger Name</th>
            <th>Cabin Class</th>
            <th>Seat Type</th>
            <th>Seat Number</th>
            <th>Email</th>
            <th>Phone number</th>
            </tr><tr> 
     <%   try
  {
DbCon db = new DbCon();
st  = db.Connection().createStatement();
int phonenum = Integer.parseInt(request.getParameter("pnum"));
String email = request.getParameter("email");
String sql ="SELECT * FROM ticketdetails WHERE phone="+phonenum+" AND email='"+email+"'";
rs = st.executeQuery(sql);
while(rs.next()){

    %>
<tr>
       <td><%=rs.getString("ticketID")%></td>
       <td><%=rs.getString("passengerName")%></td>
       <td><%=rs.getString("cabinClass")%></td>
        <td><%=rs.getString("seatType")%></td>
        <td><%=rs.getString("seatNum")%></td>
        <td><%=rs.getString("email")%></td>
        <td><%=rs.getString("phone")%></td>
        
        
</tr>  

</table>
         </div>
<% }

}
catch(Exception e)
{
e.printStackTrace();
}

%>
    </body>
</html>
