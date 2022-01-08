<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Login.css" rel="stylesheet" type="text/css">
        <script type="text/javascript" src="nav.js"></script>
        <link rel="stylesheet" type="text/css" href="nav.css">
        <link rel="stylesheet" type="text/css" href="page.css">
    </head>
    <body>
        <div class="topnav" id="myTopnav">
		<a href="HomePage.html">Home</a>
                <a href="index.html">Flight</a>
                <a href="UserRegistration.html">Registration</a>
                <a href="javascript:void(0);" class="icon" onclick="myFunction()">
                    <i class="fa fa-bars"></i>
                </a>
	</div>
         <center>
             <p class="topic">User Login</p>
             <form action="UserLoginServlet" method="POST">
                 <table cellpadding="9">
                         <tr>
                             <td >User ID:</td>
                             <td><input class="input-field" type="text" name="userid" value="" /></td>
                         </tr>
                         <tr>
                             <td>Password:</td>
                             <td><input class="input-field" type="password" name="userpass" value="" /></td>
                         </tr>
                         <tr align="center">
                             <td><input class="input-field" type="submit" value="Login" /></td>
                             <td><input class="input-field" type="reset" value="Cancel" /></td>
                         </tr>
                 </table>
             </form>
             </center>
    </body>
</html>
