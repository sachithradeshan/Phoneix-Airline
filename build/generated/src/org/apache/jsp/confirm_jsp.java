package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.DbCon;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class confirm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

    Connection connection=null;
    Statement  st=null;
    ResultSet rs=null;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Confirm</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bookFlight.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"nav.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"nav.css\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("    background-image: url('flights2.jpg');\n");
      out.write("    opacity: 0.9;\n");
      out.write("    background-size: cover;\n");
      out.write("    margin: 0px;\n");
      out.write("    padding: 0px;\n");
      out.write("    font-size: 20px;\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"topnav\" id=\"myTopnav\">\n");
      out.write("\t\t<a href=\"HomePage.html\">Home</a>\n");
      out.write("                <a href=\"index.html\">Flight</a>\n");
      out.write("                <a href=\"UserPage.jsp\">Your Profile</a>\n");
      out.write("                <a href=\"javascript:void(0);\" class=\"icon\" onclick=\"myFunction()\">\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\n");
      out.write("                </a>\n");
      out.write("\t</div>\n");
      out.write("        <h1 style=\"margin-left:15px;\">Your reservation went successfully!!</h1>\n");
      out.write("        <b><p style=\"margin-left:15px;color: dodgerblue\">Ticket details</p></b>\n");
      out.write("        <div class=\"container\">\n");
      out.write("         <table id=\"flight\">\n");
      out.write("          <tr>\n");
      out.write("            <th>Ticket ID </th>\n");
      out.write("            <th>Passenger Name</th>\n");
      out.write("            <th>Cabin Class</th>\n");
      out.write("            <th>Seat Type</th>\n");
      out.write("            <th>Seat Number</th>\n");
      out.write("            <th>Email</th>\n");
      out.write("            <th>Phone number</th>\n");
      out.write("            </tr><tr> \n");
      out.write("     ");
   try
  {
DbCon db = new DbCon();
st  = db.Connection().createStatement();
int phonenum = Integer.parseInt(request.getParameter("pnum"));
String email = request.getParameter("email");
String sql ="SELECT * FROM ticketdetails WHERE phone="+phonenum+" AND email='"+email+"'";
rs = st.executeQuery(sql);
while(rs.next()){

    
      out.write("\n");
      out.write("<tr>\n");
      out.write("       <td>");
      out.print(rs.getString("ticketID"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs.getString("passengerName"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs.getString("cabinClass"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("seatType"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("seatNum"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("phone"));
      out.write("</td>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("</tr>  \n");
      out.write("\n");
      out.write("</table>\n");
      out.write("         </div>\n");
 }

}
catch(Exception e)
{
e.printStackTrace();
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
