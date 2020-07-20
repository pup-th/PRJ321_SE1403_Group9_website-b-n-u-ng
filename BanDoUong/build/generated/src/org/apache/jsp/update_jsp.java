package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Date;
import Entities.Itemall;
import DAO.ItemDAO;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Update</h1>\n");
      out.write("        ");

            int id = Integer.parseInt(request.getParameter("id"));
            ItemDAO dao = new ItemDAO();
            Itemall i = dao.getNameOfItem(id);
            int tId = i.gettId();
            int bId = i.getbId();
            int blockId = i.getBlockId();
            int pId = i.getpId();
            int outputPrice = i.getOutputPrice();
            int vouId = i.getVouId();
            int status = i.getStatus();
            int quantity = i.getQuantity();
            int rId = i.getrId();
            int discoutnStatus = i.getDiscoutnStatus();
            String iName = i.getiName();
            String size = i.getSize();
            String orginCode = i.getOriginCode();
            String taste = i.getTaste();
            String iPic = i.getiPic();
            String expiryDate = i.getExpiryDate().toString();
        
      out.write("\n");
      out.write("        <form action=\"AdminController\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>tId</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txttId\" value=\"");
      out.print( tId);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>bId</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtbId\" value=\"");
      out.print( bId);
      out.write("\"/> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>iName</td> \n");
      out.write("                    <td><input type=\"text\" name=\"txtiName\" value=\"");
      out.print( iName);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>blockId</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtblockId\" value=\"");
      out.print( blockId);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Size</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtsize\" value=\"");
      out.print( size);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>pId</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtpId\" value=\"");
      out.print( pId);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>outputPrice</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtoutputPrice\" value=\"");
      out.print( outputPrice);
      out.write("\"/> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>orginCode</td> \n");
      out.write("                    <td><input type=\"text\" name=\"txtorginCode\" value=\"");
      out.print( orginCode);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>status</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtstatus\" value=\"");
      out.print( status);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>quantity</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtquantity\" value=\"");
      out.print( quantity);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>rId</td> \n");
      out.write("                    <td><input type=\"text\" name=\"txtrId\" value=\"");
      out.print( rId);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>discoutnStatus</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtdiscoutnStatus\" value=\"");
      out.print( discoutnStatus);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>vouId</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtvouId\" value=\"");
      out.print( vouId);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>taste</td> \n");
      out.write("                    <td><input type=\"text\" name=\"txttaste\" value=\"");
      out.print( taste);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>expiryDate</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtexpiryDate\" value=\"");
      out.print( expiryDate);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>iPic</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtiPic\" value=\"");
      out.print( iPic);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" value=\"OK\" name=\"btnupdate\"/></td>\n");
      out.write("                </tr>               \n");
      out.write("\n");
      out.write("            </table>\n");
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
