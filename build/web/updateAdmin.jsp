<%-- 
    Document   : updateAdmin
    Created on : Apr 27, 2021, 6:11:12 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Login.css" rel="stylesheet" type="text/css">
        <title>Admin Update</title>
        <link href="Login.css" rel="stylesheet" type="text/css">
        <script type="text/javascript" src="nav.js"></script>
        <link rel="stylesheet" type="text/css" href="nav.css">
        <link rel="stylesheet" type="text/css" href="page.css">
    </head>
    <body>
        <div class="topnav" id="myTopnav">
		<a href="HomePage.html">Home</a>
                <a href="AdminPage.html">Profile</a>
                <a href="EditProfileAdmin.jsp">Back to Edit Page</a>
                <a href="javascript:void(0);" class="icon" onclick="myFunction()">
                    <i class="fa fa-bars"></i>
                </a>
	</div>
        <center>
        <p class="topic">Admin Update</p>
         <form action="EditAdminServlet" method="POST">
            <table border="0" cellspacing="9">
                <tr>
                        <td>ID:</td>
                        <td><input class="input-field" type="text" name="id" value="" /></td>
                    </tr>
                    <tr>
                        <td>Name:</td>
                        <td><input class="input-field" type="text" name="name" value="" /></td>
                    </tr>
                    <tr>
                        <td>Email:</td>
                        <td><input class="input-field" type="email" name="email" value="" /></td>
                    </tr>
                    <tr>
                        <td>Telephone:</td>
                        <td><input class="input-field" type="text" name="tele" value="" /></td>
                    </tr>
                    <tr>
                        <td>NIC/Passport number:</td>
                        <td><input class="input-field" type="text" name="ukey" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input class="input-field" type="password" name="password" value="" /></td>
                    </tr>
                    <tr>
                        <td>Confirm Password:</td>
                        <td><input class="input-field" type="password" name="copassword" value="" /></td>
                    </tr>
                    <tr>
                        <td>Address:</td>
                        <td><input class="input-field" type="text" name="address" value="" /></td>
                    </tr>
                    <tr>
                        <td><input class="input-field" type="submit" value="UPDATE" /></td>
                        <td><input class="input-field" type="reset" value="CANCEL" /></td>
                    </tr>
            </table>

        </form>
    </center>
    </body>
</html>

