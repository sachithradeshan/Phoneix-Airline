<%-- 
    Document   : grade1staff
    Created on : Apr 27, 2021, 2:02:14 AM
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
        <h1 style="margin-left:15px;">Updating & deleting the flight details</h1>
        <div class="container">
         <table id=" flight" >
          <tr>
            <th>Flight ID </th>
            <th>Departing from</th>
            <th>Departing to</th>
            <th>Departing date</th>
            <th>Departure time</th>
            <th>Arrival time</th>
            <th>Price</th>
            </tr><tr> 
     <%   try
  {
DbCon db = new DbCon();
st  = db.Connection().createStatement();

String sql ="SELECT * FROM flightdetails";
rs = st.executeQuery(sql);
while(rs.next()){

    %>

       <td><%=rs.getString("flightID")%></td>
       <td><%=rs.getString("departing_from")%></td>
       <td><%=rs.getString("departing_to")%></td>
        <td><%=rs.getString("departing_date")%></td>
        <td><%=rs.getString("departureTime")%></td>
        <td><%=rs.getString("arrivalTime")%></td>
        <td><%=rs.getString("price")%></td>
        
        <td>
            <form action="updateFlight.jsp">
                <input type="hidden" name="flightID" value="<%=rs.getString("flightID")%>">
                <input type="submit" value="Update" >
            </form>
        </td>
        <td>
            <form action="deleteFlightServlet" method="POST">
                <input type="hidden" name="flightID" value="<%=rs.getString("flightID")%>">
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
