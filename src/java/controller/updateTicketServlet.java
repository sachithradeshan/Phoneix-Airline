/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.gradeOne;

/**
 *
 * @author Thuthi
 */
@WebServlet(name = "updateTicketServlet", urlPatterns = {"/updateTicketServlet"})
public class updateTicketServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet updateTicketServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet updateTicketServlet at " + request.getContextPath() + "</h1>");
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
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        String ticketID = request.getParameter("ticketID");
        String pname = request.getParameter("pname");
        String cclass = request.getParameter("cclass");
        String stype = request.getParameter("stype");
        String seatNo = request.getParameter("seatNo");
        String email = request.getParameter("email");
        String pnum = request.getParameter("pnum");
        gradeOne st = new gradeOne();
        if(st.updateTicket(ticketID,pname,cclass,stype,seatNo,email,pnum))
        {
            out.println("Success!!!!");
            RequestDispatcher rd = request.getRequestDispatcher("grade1ticket.jsp");
            rd.include(request,response);
        }
        else
        {
            out.println("Update Failed!!!!");
            RequestDispatcher rd = request.getRequestDispatcher("grade1ticket.jsp");
            rd.include(request,response);
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
