/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.ItemDAO;
import Entities.Itemall;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class AdminController extends HttpServlet {

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
            out.println("<title>Servlet AdminController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdminController at " + request.getContextPath() + "</h1>");
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
        if (request.getParameter("btnOK") != null) {
            int tId = Integer.parseInt(request.getParameter("txttId"));
            int bId = Integer.parseInt(request.getParameter("txtbId"));
            int blockId = Integer.parseInt(request.getParameter("txtblockId"));
            int pId = Integer.parseInt(request.getParameter("txtpId"));
            int outputPrice = Integer.parseInt(request.getParameter("txtoutputPrice"));
            int vouId = Integer.parseInt(request.getParameter("txtvouId"));
            int status = Integer.parseInt(request.getParameter("txtstatus"));
            int quantity = Integer.parseInt(request.getParameter("txtquantity"));
            int rId = Integer.parseInt(request.getParameter("txtrId"));
            int discoutnStatus = Integer.parseInt(request.getParameter("txtdiscoutnStatus"));
            String iName = request.getParameter("txtiName");
            String size = request.getParameter("txtsize");
            String orginCode = request.getParameter("txtorginCode");
            String taste = request.getParameter("txttaste");
            String iPic = request.getParameter("txtiPic");
            Date expiryDate = Date.valueOf(request.getParameter("txtexpiryDate"));
            Itemall itemall = new Itemall(rId, tId, bId, iName, blockId, size, pId, outputPrice, orginCode, 
                    status, quantity, rId, discoutnStatus, vouId, taste, expiryDate, iPic);
            ItemDAO idao = new ItemDAO();
            idao.insertStudent(itemall);
            response.sendRedirect("admin.jsp");
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
