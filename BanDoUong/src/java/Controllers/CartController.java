/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.ItemDAO;
import Entities.Itemall;
import Entities.OrderDetail;
import Entities.Orders;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
public class CartController extends HttpServlet {

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
            int id = Integer.parseInt(request.getParameter("cartId"));
            int quantity = Integer.parseInt(request.getParameter("cartQuantity"));
            request.setAttribute("hashid", id);
            request.setAttribute("hashquanity", quantity);
            request.setAttribute("idpro", id);
            RequestDispatcher dis = request.getRequestDispatcher("cart1.jsp");
            dis.forward(request, response);
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
            HashMap<Integer, Integer> map = new HashMap<>();
        if (request.getSession().getAttribute("uMail") != null) {
            int id = Integer.parseInt(request.getParameter("cartId"));
            int quan = Integer.parseInt(request.getParameter("cartQuantity"));
//        HashMap<Integer, Integer> map = new HashMap<>();
//        if (map.containsKey(id)) {
//            map.put(id, map.get(id) + quan);
//        } else {
//            map.put(id, quan);
//        }
            if (request.getSession().getAttribute("hashMapItemCart") != null) {
                map = (HashMap<Integer, Integer>) request.getSession().getAttribute("hashMapItemCart");
                if (map.containsKey(id)) {
                    map.put(id, map.get(id) + quan);
                } else {
                    map.put(id, quan);
                }
            } else {
                
                map.put(id, quan);
                request.getSession().setAttribute("hashMapItemCart", map);
            }
//        request.getSession().setAttribute("hashid", request.getParameter("cartId"));
//        request.getSession().setAttribute("hashquantity", request.getParameter("cartQuantity"));
//        request.getSession().setAttribute("idpro", id);
            request.getRequestDispatcher("home.jsp").forward(request, response);
        } else {
            PrintWriter out = response.getWriter();
            out.println("<script type=\"text/javascript\">");
            out.println("alert('You must login before buy something!');");
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
