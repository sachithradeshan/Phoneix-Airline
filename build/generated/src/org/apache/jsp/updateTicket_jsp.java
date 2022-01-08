package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateTicket_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Update Ticket</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bookFlight.css\"> <script type=\"text/javascript\" src=\"nav.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"nav.css\">\n");
      out.write("         <style>\n");
      out.write("            body{\n");
      out.write("                background-image: url('flights2.jpg');\n");
      out.write("                opacity: 0.9;\n");
      out.write("                background-size: cover;\n");
      out.write("                margin: 0px;\n");
      out.write("                padding: 0p;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <center>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"topnav\" id=\"myTopnav\">\n");
      out.write("\t\t<a href=\"HomePage.html\">Home</a>\n");
      out.write("                <a href=\"index.html\">Flight</a>\n");
      out.write("                <a href=\"staff.html\">Profile</a>\n");
      out.write("                <a href=\"grade1ticket.jsp\">Back</a>\n");
      out.write("                <a href=\"javascript:void(0);\" class=\"icon\" onclick=\"myFunction()\">\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\n");
      out.write("                </a>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("        <h3>Updating ticket ID :");
out.println(request.getParameter("ticketID"));
      out.write("</h3>\n");
      out.write("        <form action=\"updateTicketServlet\" method=\"POST\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("            <table  cellspacing=\"3\" cellpadding=\"3\">\n");
      out.write("                <tr>\n");
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
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>Email </td>\n");
      out.write("                <td><input type=\"email\" name=\"email\" class=\"input-field\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Phone number </td>\n");
      out.write("                <td><input type=\"text\" name=\"pnum\" class=\"input-field\"></td>\n");
      out.write("            </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" value=\"Update Ticket\"> <input type=\"hidden\" name=\"ticketID\" value=\"");
      out.print(request.getParameter("ticketID"));
      out.write("\"></td>\n");
      out.write("                    <td><input type=\"reset\" value=\"Cancel\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
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
