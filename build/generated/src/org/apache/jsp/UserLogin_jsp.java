package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"Login.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"nav.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"nav.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"page.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"topnav\" id=\"myTopnav\">\n");
      out.write("\t\t<a href=\"HomePage.html\">Home</a>\n");
      out.write("                <a href=\"index.html\">Flight</a>\n");
      out.write("                <a href=\"UserRegistration.html\">Registration</a>\n");
      out.write("                <a href=\"javascript:void(0);\" class=\"icon\" onclick=\"myFunction()\">\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\n");
      out.write("                </a>\n");
      out.write("\t</div>\n");
      out.write("         <center>\n");
      out.write("             <p class=\"topic\">User Login</p>\n");
      out.write("             <form action=\"UserLoginServlet\" method=\"POST\">\n");
      out.write("                 <table cellpadding=\"9\">\n");
      out.write("                         <tr>\n");
      out.write("                             <td >User ID:</td>\n");
      out.write("                             <td><input class=\"input-field\" type=\"text\" name=\"userid\" value=\"\" /></td>\n");
      out.write("                         </tr>\n");
      out.write("                         <tr>\n");
      out.write("                             <td>Password:</td>\n");
      out.write("                             <td><input class=\"input-field\" type=\"password\" name=\"userpass\" value=\"\" /></td>\n");
      out.write("                         </tr>\n");
      out.write("                         <tr align=\"center\">\n");
      out.write("                             <td><input class=\"input-field\" type=\"submit\" value=\"Login\" /></td>\n");
      out.write("                             <td><input class=\"input-field\" type=\"reset\" value=\"Cancel\" /></td>\n");
      out.write("                         </tr>\n");
      out.write("                 </table>\n");
      out.write("             </form>\n");
      out.write("             </center>\n");
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
