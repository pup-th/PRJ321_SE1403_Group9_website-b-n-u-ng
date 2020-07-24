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
      out.write("        <style>\r\n");
      out.write("            table {\r\n");
      out.write("                border-collapse: collapse;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            th, td {\r\n");
      out.write("                padding: 8px;\r\n");
      out.write("                text-align: left;\r\n");
      out.write("                border-bottom: 1px solid #ddd;\r\n");
      out.write("            }\r\n");
      out.write("            th {\r\n");
      out.write("                background-color: #ff6600;\r\n");
      out.write("                color: white;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Insert Product</h1>\r\n");
      out.write("        <form action=\"AdminController\" method=\"post\">\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>tId</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"txttId\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>bId</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"txtbId\"/> </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>iName</td> \r\n");
      out.write("                    <td><input type=\"text\" name=\"txtiName\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>blockId</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"txtblockId\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Size</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"txtsize\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>pId</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"txtpId\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>outputPrice</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"txtoutputPrice\"/> </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>orginCode</td> \r\n");
      out.write("                    <td><input type=\"text\" name=\"txtorginCode\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>status</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"txtstatus\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>quantity</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"txtquantity\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>rId</td> \r\n");
      out.write("                    <td><input type=\"text\" name=\"txtrId\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>discoutnStatus</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"txtdiscoutnStatus\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>vouId</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"txtvouId\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>taste</td> \r\n");
      out.write("                    <td><input type=\"text\" name=\"txttaste\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>expiryDate</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"txtexpiryDate\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>iPic</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"txtiPic\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type=\"submit\" value=\"OK\" name=\"btnOK\"/></td>\r\n");
      out.write("                </tr>               \r\n");
      out.write("                \r\n");
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
