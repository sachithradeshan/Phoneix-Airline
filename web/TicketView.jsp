<%-- 
    Document   : TicketView
    Created on : Apr 25, 2021, 9:25:06 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Login.css" rel="stylesheet" type="text/css">
        <script type="text/javascript" src="nav.js"></script>
        <link rel="stylesheet" type="text/css" href="nav.css">
          <link rel="stylesheet" type="text/css" href="page.css">
        <title>Ticket View</title>
    </head>
    <body>
        <div class="topnav" id="myTopnav">
		
<a href="HomePage.html">Home</a>
<a href="UserPage.jsp">Your Profile</a>
<a href="index.html">Flight</a>
<a href="javascript:void(0);" class="icon" onclick="myFunction()">
<i class="fa fa-bars"></i>
</a>
	</div><center>
            <p class="topic">Ticket Information:</p>
        <form action="filterTicket" method="POST">
            <table border="0" cellspacing='12'>
                <tr style="font-size: 20px;" >
                        <td>Ticket No:</td>
                        <td><input class="input-field" type="text" name="ticketID" value=""/></td>
                    </tr>
                    <tr>
                        <td><input class="input-field" type="submit" value="Search" /></td>
                        <td><input class="input-field" type="reset" value="Cancel" /></td>
                    </tr>
            </table>

        </form>
            </center>
    </body>
</html>
