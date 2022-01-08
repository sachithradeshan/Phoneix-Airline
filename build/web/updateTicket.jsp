<%-- 
    Document   : updateTicket
    Created on : Apr 27, 2021, 4:30:36 AM
    Author     : Thuthi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
                <a href="grade1ticket.jsp">Back</a>
                <a href="javascript:void(0);" class="icon" onclick="myFunction()">
                    <i class="fa fa-bars"></i>
                </a>
	</div>

        <h3>Updating ticket ID :<%out.println(request.getParameter("ticketID"));%></h3>
        <form action="updateTicketServlet" method="POST">
            <div class="container">
            <table  cellspacing="3" cellpadding="3">
                <tr>
                <td>Passenger name</td>
                <td><input type="text" class="input-field" name="pname"></td>
            </tr>
            <tr>
                <td>Select your Cabin Class</td>
                <td><select class="select-field" name="cclass">
                    <option>First Class</option>
                    <option>Economy Class</option>
                    <option>Business Class</option>
                </select></td>
            </tr>
            <tr>
                <td>Choose your seat</td>
                <td><select class="select-field" name="stype">
                    <option>Window</option>
                    <option>Center</option>
                    <option>Aisle</option>
                </select></td>
            </tr>
            <tr>
                <td>Select your seat number</td>
                <td><input type="text" name="seatNo" class="input-field"></td>
            </tr>
            
            <tr>
                <td>Email </td>
                <td><input type="email" name="email" class="input-field"></td>
            </tr>
            <tr>
                <td>Phone number </td>
                <td><input type="text" name="pnum" class="input-field"></td>
            </tr>
                <tr>
                    <td><input type="submit" value="Update Ticket"> <input type="hidden" name="ticketID" value="<%=request.getParameter("ticketID")%>"></td>
                    <td><input type="reset" value="Cancel"></td>
                </tr>
            </table>
            </div>
        </form>
    </body>
</html>
