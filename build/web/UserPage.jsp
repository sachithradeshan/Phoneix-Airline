<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Login.css" rel="stylesheet" type="text/css">
        <script type="text/javascript" src="nav.js"></script>
        <link rel="stylesheet" type="text/css" href="nav.css">
        <link rel="stylesheet" type="text/css" href="page.css">
        <title>User Page</title>
    </head>
    <body>
        <div class="topnav" id="myTopnav">
		
<a href="HomePage.html">Home</a>
<a href="TicketView.jsp">Ticket View</a>
<a href="index.html">Flight</a>
<a href="EditProfileUser.jsp">Edit Profile</a>
<a href="javascript:void(0);" class="icon" onclick="myFunction()">
<i class="fa fa-bars"></i>
</a>
	</div>
        <br><br><br><br>
        <h1>Welcome to User Page</h1>
        <p>You can easily find your needs by searching here</p>
    </body>
</html>
