<%-- 
    Document   : ticket
    Created on : Apr 27, 2021, 11:26:33 AM
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
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="bookFlight.css">
        <script type="text/javascript" src="nav.js"></script>
        <link rel="stylesheet" type="text/css" href="nav.css">
        <link rel="stylesheet" type="text/css" href="page.css">
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
    <body>
        <div class="topnav" id="myTopnav">
		<a href="HomePage.html">Home</a>
                <a href="javascript:void(0);" class="icon" onclick="myFunction()">
                    <i class="fa fa-bars"></i>
                </a>
	</div><br><br><br><br><br><br>
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
int ticketID =Integer.parseInt(request.getParameter("ticketID"));
String sql ="SELECT * FROM ticketdetails WHERE  ticketID ="+ticketID+"";
rs = st.executeQuery(sql);
while(rs.next()){

    %>

       <td><%=rs.getString("ticketID")%></td>
       <td><%=rs.getString("passengerName")%></td>
       <td><%=rs.getString("cabinnClass")%></td>
        <td><%=rs.getString("seatType")%></td>
        <td><%=rs.getString("seatNum")%></td>
        <td><%=rs.getString("email")%></td>
        <td><%=rs.getString("phone")%></td>
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
