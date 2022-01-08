<%-- 
    Document   : EditProfileUser
    Created on : Apr 27, 2021, 3:26:29 AM
    Author     : HP
--%>


<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Connection connection=null;
    Statement  st=null;
    ResultSet rs=null;
    String driver="com.mysql.jdbc.Driver";
            String url="jdbc:mysql://localhost:3306/airplanedb";
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url,"root","");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="nav.js"></script>
        <link rel="stylesheet" type="text/css" href="nav.css">
        <link rel="stylesheet" type="text/css" href="page.css">
        <title>Edit User</title>
        <style>
            body{
                background-image: url('flights2.jpg');
                opacity: 0.9;
                background-size: cover;
                margin: 0px;
                padding: 0p;
                font-size: 20px;
            }
            table{
                background-color: #ccccff;
                 background-color: #ccccff;
                margin: 0px;
                padding: 0px;
                border-color: white;
               
            }
            .input-field {
                width: 130px;
                padding:6px 50px;
                border:1px solid gray;
                border-radius: 5px;
                font-size: 14px;
            }
        </style>
    </head>
    <body>
        <div class="topnav" id="myTopnav">
		<a href="HomePage.html">Home</a>
                <a href="index.html">Flight</a>
                <a href="UserLogin.jsp">Login</a>
                <a href="UserPage.jsp">Your Profile</a>
                <a href="javascript:void(0);" class="icon" onclick="myFunction()">
                    <i class="fa fa-bars"></i>
                </a>
	</div>
    <center>
        <p style="margin-left:15px;">Updating User Profile</p>
        <div class="container">
            <table border="1px" cellspacing="0" cellpadding="5" >
          <tr>
            <th>User ID </th>
            <th> Name</th>
            <th>NIC number</th>
            <th>Email</th>
            <th>Contact</th>
            <th>PassWord</th>
            <th>Address</th>
            </tr><tr> 
     <%   try
  {

st=con.createStatement();

String sql ="SELECT * FROM user";
rs = st.executeQuery(sql);
while(rs.next()){

    %>

       <td><%=rs.getInt("uid")%></td>
       <td><%=rs.getString("uname")%></td>
       <td><%=rs.getString("ukey")%></td>
        <td><%=rs.getString("uemail")%></td>
        <td><%=rs.getString("utele")%></td>
        <td><%=rs.getString("upass")%></td>
        <td><%=rs.getString("uaddress")%></td>
        
        <td>
            <form action="updateUser.jsp">
                <input type="hidden" name="uid" value="<%=rs.getInt("uid")%>">
                <input type="submit" value="Update" class="input-field">
            </form>
        </td>      
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
</center>
    </body>
</html>