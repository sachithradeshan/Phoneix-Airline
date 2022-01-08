
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.addTicket;


@WebServlet(name = "flightPay", urlPatterns = {"/flightPay"})
public class flightPay extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet flightPay</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet flightPay at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        String pname = request.getParameter("pname");
        String cclass = request.getParameter("cclass");
        String stype = request.getParameter("stype");
        String seatNo = request.getParameter("seatNo");
        String email = request.getParameter("email");
        int phonenum = Integer.parseInt(request.getParameter("pnum"));
        String method = request.getParameter("method");
        String cno = request.getParameter("cno");
        
        if(pname.equals("")||cclass.equals("")||stype.equals("")||seatNo.equals("")||email.equals("")||method.equals("")||cno.equals("")){

           response.sendRedirect("bookFlight.jsp");
        }
        else{
            addTicket at = new addTicket(); 
            at.addTicketInfo(pname,cclass,stype,seatNo,email,phonenum,method,cno);
          RequestDispatcher rd = request.getRequestDispatcher("confirm.jsp");
          rd.forward(request, response);
        }
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
