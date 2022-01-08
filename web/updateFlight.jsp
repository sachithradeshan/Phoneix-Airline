<%-- 
    Document   : updateFlight
    Created on : Apr 27, 2021, 2:58:38 AM
    Author     : Thuthi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Flight</title>
        <link rel="stylesheet" type="text/css" href="bookFlight.css">
        <script type="text/javascript" src="nav.js"></script>
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
                <a href="staff.html">Profile</a>
                <a href="grade1staff.jsp">Back</a>
                <a href="javascript:void(0);" class="icon" onclick="myFunction()">
                    <i class="fa fa-bars"></i>
                </a>
	</div>
        <h3>Updating flight ID :<%out.println(request.getParameter("flightID"));%></h3>
        <form action="updateFlightServlet" method="POST">
            <div class="container">
            <table id="flight">
                <tr>
                    <td>Departing from </td>
                    <td><input type="text" name="departingFrom"></td>
                </tr>
                <tr>
                    <td>Departing to </td>
                    <td><input type="text" name="departingTo"></td>
                </tr>
                <tr>
                    <td>Departing date </td>
                    <td><input type="text" name="departingDate"></td>              
                </tr>
                <tr>
                    <td>Departure time</td>
                    <td><input type="text" name="departureTime"></td>              
                </tr>
                <tr>
                    <td>Arrival time</td>
                    <td><input type="text" name="arrivalTime"></td>              
                </tr>
                <tr>
                    <td>Price</td>
                    <td><input type="text" name="price"></td>              
                </tr>
                <tr>
                    <td><input type="submit" value="Update Flight"> <input type="hidden" name="flightID" value="<%=request.getParameter("flightID")%>"></td>
                    <td><input type="reset" value="Cancel"></td>
                </tr>
            </table>
            </div>
        </form>
    </body>
    </center>
</html>
