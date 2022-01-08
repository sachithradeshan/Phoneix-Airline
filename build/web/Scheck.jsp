

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
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
        <title>Staff Check</title>
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
        <p class="topic">Staff Profile</p>
        <form action="ScheckServlet" method="POST" style="padding: 30px;">
            <table border="0" cellspacing="9">
                    <tr>
                        <td>Staff ID:</td>
                        <td><input class="input-field" type="text" name="sid" value="" /></td>
                    </tr>
                    <tr>
                        <td>Staff email:</td>
                        <td><input class="input-field" type="email" name="semail" value="" /></td>
                    </tr>
                    <tr>
                        <td><input class="input-field" type="submit" value="Submit" /></td>
                        <td><input class="input-field" type="reset" value="Cancel" /></td>
                    </tr>
            </table>
        </form>
    </center>
    <%
        String sid=request.getParameter("sid");
        String semail=request.getParameter("semail");
        long lastTime=session.getLastAccessedTime();
        String raddress=request.getRemoteAddr();
        String driver="com.mysql.jdbc.Driver";
            String url="jdbc:mysql://localhost:3306/airplanedb";
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url,"root","");
            Statement st=con.createStatement();
            String select="SELECT * FROM staff WHERE sid="+sid+" AND semail='"+semail+"'";
            ResultSet rs=st.executeQuery(select);
            while(rs.next()){%>
            <center>
            <table border="1" cellspacing="5" cellpadding="9" style="background-color: lightblue">
                <tr>
                    <td>Staff ID:</td>
                    <td><%out.println(rs.getInt(1));%></td>
                </tr>
                <tr>
                    <td>Staff name:</td>
                    <td><%out.println(rs.getString(2));%></td>
                </tr>
                <tr>
                    <td>Staff NIC number:</td>
                    <td><%out.println(rs.getString(3));%></td>
                </tr>
                <tr>
                    <td>Staff email:</td>
                    <td><%out.println(rs.getString(4));%></td>
                </tr>
                <tr>
                    <td>Staff Contact Number:</td>
                    <td><%out.println(rs.getString(5));%></td>
                </tr>
                <tr>
                    <td>Staff Address:</td>
                    <td><%out.println(rs.getString(8));%></td>
                </tr>
                <tr>
                    <td>Staff Last Accessed Time:</td>
                    <td><%out.println(lastTime);%></td>
                </tr>
                <tr>
                    <td>Staff IP Address:</td>
                    <td><%out.println(raddress);%></td>
                </tr>
            </table>
            </center>
            <%}
        %>
    </body>
</html>
