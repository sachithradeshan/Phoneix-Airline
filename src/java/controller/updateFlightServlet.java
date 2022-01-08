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
@WebServlet(name = "updateFlightServlet", urlPatterns = {"/updateFlightServlet"})
public class updateFlightServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet updateFlightServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet updateFlightServlet at " + request.getContextPath() + "</h1>");
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
        PrintWriter out = response.getWriter();
        String flightID = request.getParameter("flightID");
        String departingFrom = request.getParameter("departingFrom");
        String departingTo = request.getParameter("departingTo");
        String departingDate = request.getParameter("departingDate");
        String departureTime = request.getParameter("departureTime");
        String arrivalTime = request.getParameter("arrivalTime");
        String price = request.getParameter("price");
        
        gradeOne st = new gradeOne();
        if(st.updateFlight(flightID,departingFrom,departingTo,departingDate,departureTime,arrivalTime,price))
        {
            out.println("Success!!!!");
            RequestDispatcher rd = request.getRequestDispatcher("grade1staff.jsp");
            rd.include(request,response);
        }
        else
        {
            out.println("Update Failed!!!!");
            RequestDispatcher rd = request.getRequestDispatcher("grade1staff.jsp");
            rd.include(request,response);
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
