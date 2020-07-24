package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminManagement_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("Author: W3layouts\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>The Flat-Buttons Website Template | Home :: w3layouts</title>\n");
      out.write("        <link href=\"css/mana.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- start-buttons -->\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <!--   <form class=\"search\" action=\"#\" method=\"post\" name=\"contact_form\">\n");
      out.write("                            <input type=\"text\" name=\"Search\" value=\"Search\" onblur=\"if (this.value=='') this.value = 'Search'\" onfocus=\"if (this.value=='Search') this.value = ''\">\n");
      out.write("                            <input type=\"submit\" value=\"GO\" id=\"submit\" name=\"submit\">\n");
      out.write("                            <div class=\"clear\"></div>\n");
      out.write("                </form>\t-->\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a href=\"insert.jsp\">\n");
      out.write("                        <i>Insert</i>\n");
      out.write("                        <div class=\"clear\"></div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a href=\"adminManagement.jsp\">\n");
      out.write("                        <i>Home</i>\n");
      out.write("                        <div class=\"clear\"></div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"clear\"></div>\t\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a href=\"topuser.jsp\">\n");
      out.write("                        <i>Top User</i><img src=\"images/contact.png\" alt=\"\"/>\n");
      out.write("                        <div class=\"clear\"></div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a href=\"topdrink.jsp\">\n");
      out.write("                        <i>Top Drink</i><img src=\"images/art.png\" alt=\"\"/>\n");
      out.write("                        <div class=\"clear\"></div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <a href=\"admin.jsp\">\n");
      out.write("                        <i>List Item</i><img src=\"images/art.png\" alt=\"\"/>\n");
      out.write("                        <div class=\"clear\"></div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\t\n");
      out.write("\n");
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
