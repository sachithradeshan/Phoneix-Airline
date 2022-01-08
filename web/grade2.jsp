<%-- 
    Document   : grade2
    Created on : Apr 27, 2021, 5:28:59 AM
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
        <title>Grade 2</title>
        <link rel="stylesheet" type="text/css" href="bookFlight.css">
    <title>Update Ticket</title>
        <link rel="stylesheet" type="text/css" href="bookFlight.css"> <script type="text/javascript" src="nav.js"></script>
        <link rel="stylesheet" type="text/css" href="nav.css">
         <style>
            body{
                background-image: url('flights2.jpg');
                opacity: 0.9;
                background-size: cover;
                margin: 0px;
                padding: 0p;
                font-size: 20px;
            }
            </style>
    </head>
    <center>
    <body>
         <div class="topnav" id="myTopnav">
		<a href="HomePage.html">Home</a>
                <a href="index.html">Flight</a>
                <a href="staff.html">Profile</a>
                <a href="javascript:void(0);" class="icon" onclick="myFunction()">
                    <i class="fa fa-bars"></i>
                </a>
	</div>
         <div class="container">
            
         <table id="flight">
          <tr>
            <th>Flight ID </th>
            <th>Departing From</th>
            <th>Destination</th>
            <th>Departing Date</th>
            <th>Departure Time</th>
            <th>Arrival Time</th>
            <th>Price($)</th>
            </tr><tr> 
              <%
  try
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
        
        
</tr> <tr> 


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
