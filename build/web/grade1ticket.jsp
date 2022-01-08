<%-- 
    Document   : grade1ticket
    Created on : Apr 27, 2021, 4:19:01 AM
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
        <title>Grade 1</title>
         <link rel="stylesheet" type="text/css" href="bookFlight.css">
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
                <a href="staff.html">Profile</a>
                <a href="TicketView.jsp">Ticket View</a>
                <a href="EditProfileStaff.jsp">Edit Profile</a>
                <a href="javascript:void(0);" class="icon" onclick="myFunction()">
                    <i class="fa fa-bars"></i>
                </a>
	</div>
         <h1 style="margin-left:15px;">Updating & deleting the ticket details</h1>
        <div class="container">
         <table id="flight" >
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

String sql ="SELECT * FROM ticketdetails";
rs = st.executeQuery(sql);
while(rs.next()){

    %>

       <td><%=rs.getString("ticketID")%></td>
       <td><%=rs.getString("passengerName")%></td>
       <td><%=rs.getString("cabinClass")%></td>
        <td><%=rs.getString("seatType")%></td>
        <td><%=rs.getString("seatNum")%></td>
        <td><%=rs.getString("email")%></td>
        <td><%=rs.getString("phone")%></td>
        
        <td>
            <form action="updateTicket.jsp">
                <input type="hidden" name="ticketID" value="<%=rs.getString("ticketID")%>">
                <input type="submit" value="Update" >
            </form>
        </td>
        <td>
            <form action="deleteTicketServlet" method="POST">
                <input type="hidden" name="ticketID" value="<%=rs.getString("ticketID")%>">
                <input type="submit" value="Delete" >
            </form>
        </td>
            
</tr>  

<% }

}
catch(Exception e)
{
e.printStackTrace();
}

%>

</table>
         </div>
    </body>
</html>
