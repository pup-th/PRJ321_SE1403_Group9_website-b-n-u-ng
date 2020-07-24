package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Insert Product</h1>\r\n");
      out.write("        <form action=\"AdminController\" method=\"post\">\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Brand</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <select  name =\"txtbId\" >\r\n");
      out.write("                            <option value = \"1\">Coca Cola</option>\r\n");
      out.write("                            <option value = \"2\">Pepsi</option>\r\n");
      out.write("                            <option value = \"3\">Sting</option>\r\n");
      out.write("                            <option value = \"4\">7Up</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Item Name</td> \r\n");
      out.write("                    <td><input type=\"text\" name=\"txtiName\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Block</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <select  name =\"txtblockId\" >\r\n");
      out.write("                            <option value = \"1\">120</option>\r\n");
      out.write("                            <option value = \"2\">100</option>\r\n");
      out.write("                            <option value = \"3\">70</option>\r\n");
      out.write("                            <option value = \"4\">50</option>\r\n");
      out.write("                            <option value = \"5\">35</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Size</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"txtsize\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Pay</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <select  name =\"txtpId\" >\r\n");
      out.write("                            <option value = \"1\">5000</option>\r\n");
      out.write("                            <option value = \"2\">6000</option>\r\n");
      out.write("                            <option value = \"3\">7000</option>\r\n");
      out.write("                            <option value = \"4\">8000</option>\r\n");
      out.write("                            <option value = \"5\">9000</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Output Price</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"txtoutputPrice\"/> </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Origin</td> \r\n");
      out.write("                    <td>\r\n");
      out.write("                        <select  name =\"txtorginCode\" >\r\n");
      out.write("                            <option value = \"1\">Chai</option>\r\n");
      out.write("                            <option value = \"2\">Lon</option>\r\n");
      out.write("                            <option value = \"3\">chai sanh</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Discount</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <select  name =\"txtstatus\" >\r\n");
      out.write("                            <option value = \"1\">Con hang</option>\r\n");
      out.write("                            <option value = \"0\">Het hang</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Quantity</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"txtquantity\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Discount Status</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <select  name =\"txtdiscoutnStatus\" >\r\n");
      out.write("                            <option value = \"1\">Co</option>\r\n");
      out.write("                            <option value = \"0\">Khong</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Voucher</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <select  name =\"txtvouId\" >\r\n");
      out.write("                            <option value = \"1\">Theo ngay(20%)</option>\r\n");
      out.write("                            <option value = \"2\">Theo san pham(10%)</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Taste</td> \r\n");
      out.write("                    <td><input type=\"text\" name=\"txttaste\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Expiry Date</td>\r\n");
      out.write("                    <td><input type=\"date\" name=\"txtexpiryDate\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Image Name</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"txtiPic\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type=\"submit\" value=\"OK\" name=\"btnOK\"/></td>\r\n");
      out.write("                </tr>    \r\n");
      out.write("            </table>\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
