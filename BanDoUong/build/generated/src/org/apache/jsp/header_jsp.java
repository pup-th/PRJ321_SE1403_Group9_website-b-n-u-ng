package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            .navbar .nav-link{\r\n");
      out.write("                font-size: 15px;\r\n");
      out.write("                padding: 0 20px !important;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .navbar-toogler{\r\n");
      out.write("                outline: none;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .bg-black{\r\n");
      out.write("                background: #100100100;\r\n");
      out.write("            }   \r\n");
      out.write("            body{\r\n");
      out.write("                font-family: Helvetica, Arial, sans-serif;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav class=\"navbar navbar-expand-sm navbar-dark bg-black fixed-top\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <a href=\"#\" class=\"navbar-brand\">GroupChin</a>\r\n");
      out.write("                <button class=\"navbar-toggler\" data-toggle=\"collapse\"\r\n");
      out.write("                        data-target=\"#navbarCollapse\">\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\r\n");
      out.write("                    <ul class=\"navbar-nav ml-auto \">\r\n");
      out.write("                        <li class=\"nav-item\"><a href=\"home.jsp\" class=\"nav-link\">HOME</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">CART</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">ABOUT US</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a href=\"login.jsp\" class=\"nav-link\">LOGIN</a></li>\r\n");
      out.write("                    </ul> \r\n");
      out.write("<!--                    <div class=\"dropdown dropleft\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary dropdown-toggle\" data-toggle=\"dropdown\" style=\"background: white;color: black\">\r\n");
      out.write("                            Search\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <div class=\"dropdown-menu\">\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Link 1</a>\r\n");
      out.write("                            <a class=\"dropdown-item\">\r\n");
      out.write("                                <form class=\"form-inline\">\r\n");
      out.write("                                    <input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Search\">\r\n");
      out.write("                                    <button class=\"btn btn-success\" type=\"submit\">Search</button>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>-->\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("<!--                <div class=\"dropdown float-right\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                        Drop button\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <div class=\"dropdown-menu\">\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Link 1</a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Link 2</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>-->\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>");
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
