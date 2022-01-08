package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class Scheck_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"Login.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"nav.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"nav.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"page.css\">\n");
      out.write("        <title>Staff Check</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"topnav\" id=\"myTopnav\">\n");
      out.write("\t\t<a href=\"HomePage.html\">Home</a>\n");
      out.write("                <a href=\"AdminPage.html\">Your Profile</a>\n");
      out.write("                <a href=\"javascript:void(0);\" class=\"icon\" onclick=\"myFunction()\">\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\n");
      out.write("                </a>\n");
      out.write("\t</div>\n");
      out.write("    <center>\n");
      out.write("        <p class=\"topic\">Staff Profile</p>\n");
      out.write("        <form action=\"ScheckServlet\" method=\"POST\" style=\"padding: 30px;\">\n");
      out.write("            <table border=\"0\" cellspacing=\"9\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Staff ID:</td>\n");
      out.write("                        <td><input class=\"input-field\" type=\"text\" name=\"sid\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Staff email:</td>\n");
      out.write("                        <td><input class=\"input-field\" type=\"email\" name=\"semail\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input class=\"input-field\" type=\"submit\" value=\"Submit\" /></td>\n");
      out.write("                        <td><input class=\"input-field\" type=\"reset\" value=\"Cancel\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("    ");

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
            while(rs.next()){
      out.write("\n");
      out.write("            <center>\n");
      out.write("            <table border=\"1\" cellspacing=\"5\" cellpadding=\"9\" style=\"background-color: lightblue\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Staff ID:</td>\n");
      out.write("                    <td>");
out.println(rs.getInt(1));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Staff name:</td>\n");
      out.write("                    <td>");
out.println(rs.getString(2));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Staff NIC number:</td>\n");
      out.write("                    <td>");
out.println(rs.getString(3));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Staff email:</td>\n");
      out.write("                    <td>");
out.println(rs.getString(4));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Staff Contact Number:</td>\n");
      out.write("                    <td>");
out.println(rs.getString(5));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Staff Address:</td>\n");
      out.write("                    <td>");
out.println(rs.getString(8));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Staff Last Accessed Time:</td>\n");
      out.write("                    <td>");
out.println(lastTime);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Staff IP Address:</td>\n");
      out.write("                    <td>");
out.println(raddress);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            </center>\n");
      out.write("            ");
}
        
      out.write("\n");
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
