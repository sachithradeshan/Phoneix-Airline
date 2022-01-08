/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistrationPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(name = "UserRegServlet", urlPatterns = {"/UserRegServlet"})
public class UserRegServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UserRegServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UserRegServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        PrintWriter out=response.getWriter();
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String tele=request.getParameter("tele");
        String ukey=request.getParameter("ukey");
        String pass=request.getParameter("password");
        String copass=request.getParameter("copassword");
        String address=request.getParameter("address");
        if(name.equals("")||email.equals("")||tele.equals("")||ukey.equals("")||pass.equals("")||copass.equals("")||address.equals("")){
            out.println("<html><script type=\"text/javascript\">");
                    out.println("alert('A field is empty...All the fields must be filled');");
                    out.println("location='UserRegistration.html'");
                    out.println("</script><html>");
        }
        else{
            if(copass.equals(pass)){
                UserReg ur=new UserReg();
                ur.userAddInfo(ukey,name,email,tele,pass,copass,address);
                response.sendRedirect("HomePage.html");
            }else{
                out.println("<script type=\"text/javascript\">");
                    out.println("alert('Passwords do not match');");
                    out.println("location='UserRegistration.html'");
                    out.println("</script>");
            }
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
