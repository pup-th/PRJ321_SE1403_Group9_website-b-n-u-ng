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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(">\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("\n");
      out.write("            .navbar .nav-link{\n");
      out.write("                font-size: 15px;\n");
      out.write("                padding: 0 20px !important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar-toogler{\n");
      out.write("                outline: none;\n");
      out.write("            } \n");
      out.write("            #header{\n");
      out.write("                font-family: Helvetica, Arial, sans-serif;\n");
      out.write("                background-color: #696969;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            if (request.getAttribute("emailName") != null) {
                String email = request.getAttribute("emailName").toString();
                String s = email.substring(0, email.indexOf("@"));
            }
        
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-sm navbar-dark bg-black fixed-top\" id=\"header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a href=\"home.jsp\" class=\"navbar-brand\">GroupChin</a>\n");
      out.write("                <button class=\"navbar-toggler\" data-toggle=\"collapse\"\n");
      out.write("                        data-target=\"#navbarCollapse\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto \">\n");
      out.write("                        <li class=\"nav-item\"><a href=\"home.jsp\" class=\"nav-link\">HOME</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">CART</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a href=\"aboutus.jsp\" class=\"nav-link\">ABOUT US</a></li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <div class=\"dropdown navbar-nav ml-auto \">\n");
      out.write("                                <a class=\"nav-link\" href=\"#\" data-toggle=\"dropdown\">ACCOUNT</a>\n");
      out.write("                                <div class=\"dropdown-menu\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"login.jsp\">Sign in</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"profile.jsp\">Profile</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Sign out</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>                            \n");
      out.write("                        </li>\n");
      out.write("                    </ul> \n");
      out.write("                    <!--                    <div class=\"dropdown dropleft\">\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-primary dropdown-toggle\" data-toggle=\"dropdown\" style=\"background: white;color: black\">\n");
      out.write("                                                Search\n");
      out.write("                                            </button>\n");
      out.write("                                            <div class=\"dropdown-menu\">\n");
      out.write("                                                <a class=\"dropdown-item\" href=\"#\">Link 1</a>\n");
      out.write("                                                <a class=\"dropdown-item\">\n");
      out.write("                                                    <form class=\"form-inline\">\n");
      out.write("                                                        <input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Search\">\n");
      out.write("                                                        <button class=\"btn btn-success\" type=\"submit\">Search</button>\n");
      out.write("                                                    </form>\n");
      out.write("                                                </a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>-->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!--                <div class=\"dropdown float-right\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-primary dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                        Drop button\n");
      out.write("                                    </button>\n");
      out.write("                                    <div class=\"dropdown-menu\">\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Link 1</a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Link 2</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>-->\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
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
