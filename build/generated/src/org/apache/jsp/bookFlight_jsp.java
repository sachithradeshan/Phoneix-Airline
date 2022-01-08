package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import model.DbCon;

public final class bookFlight_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Book Flight</title>\n");
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
      out.write("                <a href=\"UserLogin.jsp\">Login</a>\n");
      out.write("                <a href=\"javascript:void(0);\" class=\"icon\" onclick=\"myFunction()\">\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\n");
      out.write("                </a>\n");
      out.write("\t</div>\n");
      out.write("    <center>\n");
      out.write("    <h1 style=\"margin-left:15px;\">Book your flight online</h1>\n");
      out.write("    <p style=\"margin-left:15px;\"> You can book your flight tickets with Phoenix Airlines online from anywhere and from any device easily. We offer below payment options for your convenience.</p>\n");
      out.write("         <div class=\"container\">\n");
      out.write("            \n");
      out.write("         <table id=\"flight\">\n");
      out.write("          <tr>\n");
      out.write("            <th>Flight ID </th>\n");
      out.write("            <th>Departing From</th>\n");
      out.write("            <th>Destination</th>\n");
      out.write("            <th>Departing Date</th>\n");
      out.write("            <th>Departure Time</th>\n");
      out.write("            <th>Arrival Time</th>\n");
      out.write("            <th>Price($)</th>\n");
      out.write("            </tr><tr> \n");
      out.write("              ");

  try
  {
DbCon db = new DbCon();
st  = db.Connection().createStatement();
String flightid= request.getParameter("flightID");

String sql ="SELECT * FROM flightdetails WHERE flightID='"+flightid+"'";
rs = st.executeQuery(sql);
while(rs.next()){

    
      out.write("\n");
      out.write("<tr>\n");
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
      out.write("        \n");
      out.write("</tr>  \n");
      out.write("\n");
      out.write("         \n");
      out.write(" <b> <p style=\"margin-left:15px;\">Your trip to ");
      out.print(rs.getString("departing_to"));
      out.write("</p></b>\n");
      out.write("</table><br><br>\n");
      out.write("         </div>\n");
 }

}
catch(Exception e)
{
e.printStackTrace();
}


      out.write("\n");
      out.write("       \n");
      out.write("<p style=\"margin-left:15px;\">Log in to book faster</p>\n");
      out.write("         <form action=\"flightPay\" method=\"POST\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("        <table  cellspacing=\"3\" cellpadding=\"3\">\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\"><b>Passenger details</b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Passenger name</td>\n");
      out.write("                <td><input type=\"text\" class=\"input-field\" name=\"pname\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Select your Cabin Class</td>\n");
      out.write("                <td><select class=\"select-field\" name=\"cclass\">\n");
      out.write("                    <option>First Class</option>\n");
      out.write("                    <option>Economy Class</option>\n");
      out.write("                    <option>Business Class</option>\n");
      out.write("                </select></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Choose your seat</td>\n");
      out.write("                <td><select class=\"select-field\" name=\"stype\">\n");
      out.write("                    <option>Window</option>\n");
      out.write("                    <option>Center</option>\n");
      out.write("                    <option>Aisle</option>\n");
      out.write("                </select></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Select your seat number</td>\n");
      out.write("                <td><input type=\"text\" name=\"seatNo\" class=\"input-field\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr><td colspan=\"2\"></td></tr>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\"><b>Contact details </b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Email </td>\n");
      out.write("                <td><input type=\"email\" name=\"email\" class=\"input-field\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Phone number </td>\n");
      out.write("                <td><input type=\"text\" name=\"pnum\" class=\"input-field\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr><td colspan=\"2\"></td></tr>\n");
      out.write("            <tr>\n");
      out.write("                        <td colspan=\"2\"><b>Payment details</b></td>\n");
      out.write("            </tr>\n");
      out.write("                       <tr>\n");
      out.write("                         <td>Payment Method </td>\n");
      out.write("                        <td><input type=\"radio\" name=\"method\" value=\"Credit/Debit card\" />Credit/Debit card</br><br>\n");
      out.write("                            <input type=\"radio\" name=\"method\" value=\"Cash deposit or online payment\" />Cash deposit or online payment</br><br>\n");
      out.write("                            <input type=\"radio\" name=\"method\" value=\"Digital Wallet payment \" />Digital Wallet payment </br><br>\n");
      out.write("                        </td>\n");
      out.write("                        </tr>  \n");
      out.write("                    <tr>\n");
      out.write("                        <td> Card number   </td>\n");
      out.write("                        <td><input type=\"text\" class=\"input-field\" name=\"cno\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td>Card Verification Value</td>\n");
      out.write("                        <td><input type=\"password\" class=\"input-field\" name=\"cvv\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"reset\" value=\"CANCEL\" /></td>\n");
      out.write("                        <td><input type=\"submit\" value=\"CONFIRM\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("    </body> \n");
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
