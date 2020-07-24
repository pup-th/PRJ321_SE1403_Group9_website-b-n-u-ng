/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.ItemDAO;
import Entities.OrderDetail;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
public class BuyController extends HttpServlet {

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
            out.println("<title>Servlet BuyController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BuyController at " + request.getContextPath() + "</h1>");
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
        if (request.getParameter("btnBuyForBill") != null) {
            HashMap<Integer, Integer> map = (HashMap<Integer, Integer>) request.getSession().getAttribute("hashMapItemCart");
            PrintWriter out = response.getWriter();
            String mail = request.getSession().getAttribute("uMail").toString();
            for (Integer i : map.keySet()) {
                DAO.ItemDAO itemdao = new ItemDAO();
                itemdao.inserTotOrder(mail);
                int oId = itemdao.getoId();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Entities.OrderDetail orderdetail = new OrderDetail(oId, 1, mail, i, map.get(i), "", Date.valueOf(java.time.LocalDate.now()));
                itemdao.inserTotOrderDetail(i, orderdetail);
//                 out.println(++oId);
//                 out.println(i);
//                 out.println(map.get(i));
//                 out.println(Date.valueOf(java.time.LocalDate.now()));
//                 out.println(mail);
            }
            request.getSession().removeAttribute("hashMapItemCart");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Order success!');");
            out.println("location='home.jsp';");
            out.println("</script>");
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
