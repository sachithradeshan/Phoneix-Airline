package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class EditProfileStaff_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Connection connection=null;
    Statement  st=null;
    ResultSet rs=null;
    String driver="com.mysql.jdbc.Driver";
            String url="jdbc:mysql://localhost:3306/airplanedb";
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url,"root","");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script type=\"text/javascript\" src=\"nav.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"nav.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"page.css\">\n");
      out.write("        <title>Edit Staff</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-image: url('flights2.jpg');\n");
      out.write("                opacity: 0.9;\n");
      out.write("                background-size: cover;\n");
      out.write("                margin: 0px;\n");
      out.write("                padding: 0p;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                background-color: #ccccff;\n");
      out.write("                 background-color: #ccccff;\n");
      out.write("                margin: 0px;\n");
      out.write("                padding: 0px;\n");
      out.write("                border-color: white;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            .input-field {\n");
      out.write("                width: 130px;\n");
      out.write("                padding:6px 50px;\n");
      out.write("                border:1px solid gray;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                font-size: 14px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"topnav\" id=\"myTopnav\">\n");
      out.write("\t\t<a href=\"HomePage.html\">Home</a>\n");
      out.write("                <a href=\"StaffLogin.html\">Login</a>\n");
      out.write("                <a href=\"staff.html\">Your Profile</a>\n");
      out.write("                <a href=\"javascript:void(0);\" class=\"icon\" onclick=\"myFunction()\">\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\n");
      out.write("                </a>\n");
      out.write("\t</div>\n");
      out.write("    <center>\n");
      out.write("        <p style=\"margin-left:15px;\">Updating User Profile</p>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <table border=\"1px\" cellspacing=\"0\" cellpadding=\"5\" >\n");
      out.write("          <tr>\n");
      out.write("            <th>User ID </th>\n");
      out.write("            <th> Name</th>\n");
      out.write("            <th>NIC number</th>\n");
      out.write("            <th>Email</th>\n");
      out.write("            <th>Contact</th>\n");
      out.write("            <th>PassWord</th>\n");
      out.write("            <th>Address</th>\n");
      out.write("            </tr><tr> \n");
      out.write("     ");
   try
  {

st=con.createStatement();

String sql ="SELECT * FROM staff";
rs = st.executeQuery(sql);
while(rs.next()){

    
      out.write("\n");
      out.write("\n");
      out.write("       <td>");
      out.print(rs.getInt("sid"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs.getString("sname"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs.getString("skey"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("semail"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("stele"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("spass"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("saddress"));
      out.write("</td>\n");
      out.write("        \n");
      out.write("        <td>\n");
      out.write("            <form action=\"updateStaff.jsp\">\n");
      out.write("                <input type=\"hidden\" name=\"uid\" value=\"");
      out.print(rs.getInt("sid"));
      out.write("\">\n");
      out.write("                <input type=\"submit\" value=\"Update\" class=\"input-field\">\n");
      out.write("            </form>\n");
      out.write("        </td>      \n");
      out.write("</tr>  \n");
      out.write("\n");
 }
}catch(Exception e){
e.printStackTrace();
}

      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("        </div>\n");
      out.write("</center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
