package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import model.DbCon;

public final class filter_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/bookingFlight.html");
  }

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

    Connection connection = null;
    Statement  statement = null;
    ResultSet resultSet = null;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bookFlightCSS.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      ");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        \n");
      out.write("        <meta name='viewport' content='width=device-width, initial-scale=1'>\n");
      out.write("<!-- Add icon library -->\n");
      out.write("<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>\n");
      out.write("<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"bookFlightCSS.css\">\n");
      out.write("<style>\n");
      out.write("    body{\n");
      out.write("    background-image: url('flights2.jpg');\n");
      out.write("    opacity: 0.9;\n");
      out.write("    background-size: cover;\n");
      out.write("    margin: 0px;\n");
      out.write("    padding: 0px;\n");
      out.write("    font-size: 20px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <center>\n");
      out.write("    <body>\n");
      out.write("         <form action=\"filterFlights\" method=\"POST\">\n");
      out.write("             <div class=\"container\">\n");
      out.write("               <table>\n");
      out.write("                   <tr>\n");
      out.write("                       <td>\n");
      out.write("                           <div class=\"input-icons\"><i class=\"fas fa-plane-departure icon\" style=\"font-size:15px;\"></i>\n");
      out.write("                               <input  class=\"input-field\" type=\"text\" name=\"departingForm\" placeholder=\"Departing from?\">\n");
      out.write("                           </div></td>\n");
      out.write("                          \n");
      out.write("                          <td><i class=\"fa fa-exchange\" style=\"font-size:15px;\"></i></td>\n");
      out.write("                       <td>\n");
      out.write("                          <div class=\"input-icons\"><i class=\"fas fa-plane-arrival icon\" style=\"font-size:15px;\"></i>\n");
      out.write("                               <input  class=\"input-field\" type=\"text\" name=\"destination\" placeholder=\"Going to?\">\n");
      out.write("                          </div></td>\n");
      out.write("                          \n");
      out.write("                       <td>\n");
      out.write("                        <div class=\"input-icons\"><i class=\"fa fa-calendar icon\" style=\"font-size:15px;\"></i>\n");
      out.write("                               <input class=\"input-field\" type=\"date\" name=\"departingDate\" > \n");
      out.write("                        </div></td>\n");
      out.write("                       \n");
      out.write("                   \n");
      out.write("                       <td><div class=\"input-icons\"><i class=\"fa fa-user icon\" style=\"font-size:15px;\"></i><select name=\"passenger\" class=\"input-field\">\n");
      out.write("                               <option>Adult</option>\n");
      out.write("                               <option>Student</option>\n");
      out.write("                               <option>Youth</option>\n");
      out.write("                           </select></div>\n");
      out.write("                       </td>\n");
      out.write("                      \n");
      out.write("                       <td><div class=\"input-icons\"><i class=\"material-icons icon\" style=\"font-size:15px;\">&#xe637;</i><select name=\"cabinClass\" class=\"input-field\">\n");
      out.write("                               <option>Cabin Class</option>\n");
      out.write("                               <option>Economy</option>\n");
      out.write("                               <option>Business</option>\n");
      out.write("                               <option>First</option>\n");
      out.write("                               </select>\n");
      out.write("                           </div></td>\n");
      out.write("                       <td><input type=\"submit\" value=\"Change Search\" ></td>\n");
      out.write("                   </tr>\n");
      out.write("                  \n");
      out.write("                   </table>\n");
      out.write("                 </div>\n");
      out.write("           </form>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    \n");
      out.write("      <p style=\" font-family: Verdana, sans-serif; font-size: 16px;margin-left:15px;\">Choose your departure flight</p>\n");
      out.write("      <p  style=\" font-family: Verdana, sans-serif; font-size: 16px;margin-left:15px;\">From :");
      out.print(request.getParameter("departingForm"));
      out.write(" To: ");
      out.print(request.getParameter("destination"));
      out.write("</p>\n");
      out.write("      <table id=\"flights\">\n");
      out.write("          <tr>\n");
      out.write("            <th>Flight ID </th>\n");
      out.write("            <th>Departing Date</th>\n");
      out.write("            <th>Departure Time</th>\n");
      out.write("            <th>Arrival Time</th>\n");
      out.write("            <th>Price($)</th>\n");
      out.write("            </tr><tr> \n");
      out.write("      ");

  try
  {
DbCon db = new DbCon();
statement  = db.Connection().createStatement();
 String departingFrom = request.getParameter("departingForm");
 String destination =request.getParameter("destination");
 String departingDate = request.getParameter("departingDate");
 String sql ="SELECT flightID , departing_date , departureTime, arrivalTime,price FROM flightdetails  WHERE departing_from ='"+departingFrom+"' AND departing_to='"+destination+"' AND departing_date='"+departingDate+"'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){

    
      out.write("\n");
      out.write("<tr>\n");
      out.write("       <td>");
      out.print(resultSet.getString("flightID"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(resultSet.getString("departing_date"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(resultSet.getString("departureTime"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(resultSet.getString("arrivalTime"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(resultSet.getString("price"));
      out.write("</td>\n");
      out.write("        \n");
      out.write("        <td>\n");
      out.write("            <form action=\"bookFlight.jsp\">\n");
      out.write("                <input type=\"hidden\" name=\"flightID\" value=\"");
      out.print(resultSet.getString("flightID"));
      out.write("\">\n");
      out.write("              \n");
      out.write("                <input type=\"submit\" value=\"SELECT\">\n");
      out.write("            </form>\n");
      out.write("        </td>\n");
      out.write("        \n");
      out.write("</tr>     \n");
      out.write(" \n");
      out.write("\n");
 }

}
catch(Exception e)
{
e.printStackTrace();
}


      out.write("\n");
      out.write("        </table>\n");
      out.write("       \n");
      out.write("        </body>\n");
      out.write("</html>");
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
