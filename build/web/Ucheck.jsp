<%-- 
    Document   : Ucheck
    Created on : Apr 26, 2021, 3:34:52 PM
    Author     : HP
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Login.css" rel="stylesheet" type="text/css">
        <script type="text/javascript" src="nav.js"></script>
        <link rel="stylesheet" type="text/css" href="nav.css">
        <link rel="stylesheet" type="text/css" href="page.css">
        <title>User Check  </title>
    </head>
    <body>
         <div class="topnav" id="myTopnav">
		<a href="HomePage.html">Home</a>
                <a href="AdminPage.html">Your Profile</a>
                <a href="javascript:void(0);" class="icon" onclick="myFunction()">
                    <i class="fa fa-bars"></i>
                </a>
	</div>
    <center>
        <p class="topic">User Profile</p>

        <form action="UcheckServlet" method="POST" style="padding: 30px;">
            <table border="0" cellspacing="9">
                    <tr>
                        <td>User ID:</td>
                        <td><input class="input-field" type="text" name="uid" value="" /></td>
                    </tr>
                    <tr>
                        <td>User email:</td>
                        <td><input class="input-field" type="email" name="uemail" value="" /></td>
                    </tr>
                    <tr>
                        <td><input class="input-field" type="submit" value="Submit" /></td>
                        <td><input class="input-field" type="reset" value="Cancel" /></td>
                    </tr>
            </table>
        </form>
    </center>
    <%
        
        String uid=request.getParameter("uid");
        String uemail=request.getParameter("uemail");
        long lastTime=session.getLastAccessedTime();
        String raddress=request.getRemoteAddr();
        String driver="com.mysql.jdbc.Driver";
            String url="jdbc:mysql://localhost:3306/airplanedb";
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url,"root","");
            Statement st=con.createStatement();
            String select="SELECT * FROM user WHERE uid="+uid+" AND uemail='"+uemail+"'";
            ResultSet rs=st.executeQuery(select);
            while(rs.next()){%>
            <center>
            <table border="1" cellspacing="5" cellpadding="9" style="background-color: lightblue">
                <tr>
                    <td>User ID:</td>
                    <td><%out.println(rs.getInt(1));%></td>
                </tr>
                <tr>
                    <td>User name:</td>
                    <td><%out.println(rs.getString(2));%></td>
                </tr>
                <tr>
                    <td>User NIC number:</td>
                    <td><%out.println(rs.getString(3));%></td>
                </tr>
                <tr>
                    <td>User email:</td>
                    <td><%out.println(rs.getString(4));%></td>
                </tr>
                <tr>
                    <td>User Contact Number:</td>
                    <td><%out.println(rs.getString(5));%></td>
                </tr>
                <tr>
                    <td>User Address:</td>
                    <td><%out.println(rs.getString(8));%></td>
                </tr>
                <tr>
                    <td>User Last Accessed Time:</td>
                    <td><%out.println(lastTime);%></td>
                </tr>
                <tr>
                    <td>User IP Address:</td>
                    <td><%out.println(raddress);%></td>
                </tr>
            </table>
            </center>
            <%}
        %>
    </body>
</html>