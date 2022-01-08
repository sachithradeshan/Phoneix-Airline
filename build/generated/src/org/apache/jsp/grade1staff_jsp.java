package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.DbCon;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class grade1staff_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    Connection connection=null;
    Statement  st=null;
    ResultSet rs=null;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Grade 1</title>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"bookFlight.css\">\n");
      out.write("         <script type=\"text/javascript\" src=\"nav.js\"></script>\n");
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
      out.write("                <a href=\"staff.html\">Profile</a>\n");
      out.write("                <a href=\"TicketView.jsp\">Ticket View</a>\n");
      out.write("                <a href=\"EditProfileStaff.jsp\">Edit Profile</a>\n");
      out.write("                <a href=\"javascript:void(0);\" class=\"icon\" onclick=\"myFunction()\">\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\n");
      out.write("                </a>\n");
      out.write("\t</div>\n");
      out.write("        <h1 style=\"margin-left:15px;\">Updating & deleting the flight details</h1>\n");
      out.write("        <div class=\"container\">\n");
      out.write("         <table id=\" flight\" >\n");
      out.write("          <tr>\n");
      out.write("            <th>Flight ID </th>\n");
      out.write("            <th>Departing from</th>\n");
      out.write("            <th>Departing to</th>\n");
      out.write("            <th>Departing date</th>\n");
      out.write("            <th>Departure time</th>\n");
      out.write("            <th>Arrival time</th>\n");
      out.write("            <th>Price</th>\n");
      out.write("            </tr><tr> \n");
      out.write("     ");
   try
  {
DbCon db = new DbCon();
st  = db.Connection().createStatement();

String sql ="SELECT * FROM flightdetails";
rs = st.executeQuery(sql);
while(rs.next()){

    
      out.write("\n");
      out.write("\n");
      out.write("       <td>");
      out.print(rs.getString("flightID"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs.getString("departing_from"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs.getString("departing_to"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("departing_date"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("departureTime"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("arrivalTime"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("price"));
      out.write("</td>\n");
      out.write("        \n");
      out.write("        <td>\n");
      out.write("            <form action=\"updateFlight.jsp\">\n");
      out.write("                <input type=\"hidden\" name=\"flightID\" value=\"");
      out.print(rs.getString("flightID"));
      out.write("\">\n");
      out.write("                <input type=\"submit\" value=\"Update\" >\n");
      out.write("            </form>\n");
      out.write("        </td>\n");
      out.write("        <td>\n");
      out.write("            <form action=\"deleteFlightServlet\" method=\"POST\">\n");
      out.write("                <input type=\"hidden\" name=\"flightID\" value=\"");
      out.print(rs.getString("flightID"));
      out.write("\">\n");
      out.write("                <input type=\"submit\" value=\"Delete\" >\n");
      out.write("            </form>\n");
      out.write("        </td>\n");
      out.write("            \n");
      out.write("</tr>  \n");
      out.write("\n");
 }

}
catch(Exception e)
{
e.printStackTrace();
}


      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("         </div>\n");
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
