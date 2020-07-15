package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" \n");
      out.write("              integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" \n");
      out.write("              crossorigin=\"anonymous\">\n");
      out.write("        <style>\n");
      out.write("            .bd-placeholder-img {\n");
      out.write("                font-size: 1.125rem;\n");
      out.write("                text-anchor: middle;\n");
      out.write("                -webkit-user-select: none;\n");
      out.write("                -moz-user-select: none;\n");
      out.write("                -ms-user-select: none;\n");
      out.write("                user-select: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media (min-width: 768px) {\n");
      out.write("                .bd-placeholder-img-lg {\n");
      out.write("                    font-size: 3.5rem;\n");
      out.write("                }\n");
      out.write("                html,\n");
      out.write("                body {\n");
      out.write("                    height: 100%;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                body {\n");
      out.write("                    display: -ms-flexbox;\n");
      out.write("                    display: flex;\n");
      out.write("                    -ms-flex-align: center;\n");
      out.write("                    align-items: center;\n");
      out.write("                    padding-top: 40px;\n");
      out.write("                    padding-bottom: 40px;\n");
      out.write("                    background-color: #f5f5f5;\n");
      out.write("                }\n");
      out.write("                h1{\n");
      out.write("                    font-family: Helvetica, Arial, sans-serif;  \n");
      out.write("                    text-align: center; \n");
      out.write("                    font-size:50px; \n");
      out.write("                    margin-top: 10px; \n");
      out.write("                    color:#000;\n");
      out.write("                    text-shadow: 2px 2px 0px rgba(0,0,0,.7), 5px 7px 0px rgba(255, 255, 255, 0.1); \n");
      out.write("                }\n");
      out.write("                .form-signin {\n");
      out.write("                    width: 100%;\n");
      out.write("                    max-width: 330px;\n");
      out.write("                    padding: 15px;\n");
      out.write("                    margin: auto;\n");
      out.write("                }\n");
      out.write("                .form-signin .checkbox {\n");
      out.write("                    font-weight: 400;\n");
      out.write("                }\n");
      out.write("                .form-signin .form-control {\n");
      out.write("                    position: relative;\n");
      out.write("                    box-sizing: border-box;\n");
      out.write("                    height: auto;\n");
      out.write("                    padding: 10px;\n");
      out.write("                    font-size: 16px;\n");
      out.write("                }\n");
      out.write("                .form-signin .form-control:focus {\n");
      out.write("                    z-index: 2;\n");
      out.write("                }\n");
      out.write("                .form-signin input[type=\"text\"] {\n");
      out.write("                    margin-bottom: -1px;\n");
      out.write("                    border-bottom-right-radius: 0;\n");
      out.write("                    border-bottom-left-radius: 0;\n");
      out.write("                }\n");
      out.write("                .form-signin input[type=\"password\"] {\n");
      out.write("                    margin-bottom: 10px;\n");
      out.write("                    border-top-left-radius: 0;\n");
      out.write("                    border-top-right-radius: 0;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background: #696969;\n");
      out.write("                background-image: url('background/snow1.png'), url('background/snow2.png'), url('background/snow3.png');\t\n");
      out.write("                animation: snow 20s linear infinite;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @keyframes snow {\n");
      out.write("                0% {background-position: 0px 0px, 0px 0px, 0px 0px;}\n");
      out.write("                100% {background-position: 500px 1000px, 400px 400px, 300px 300px;}\n");
      out.write("            }\n");
      out.write("            #con{\n");
      out.write("                background-color: #fff;\n");
      out.write("                width: 25%;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"container\" id=\"con\">\n");
      out.write("            <form class=\"form-signin\">          \n");
      out.write("                <h1 class=\"h3 mb-3 font-weight-normal\">Sign in</h1>\n");
      out.write("                <label for=\"inputUsername\" class=\"sr-only\">Username</label>\n");
      out.write("                <input type=\"text\" id=\"inputUsername\" class=\"form-control\" placeholder=\"Username\" required autofocus>\n");
      out.write("                <label for=\"inputPassword\" class=\"sr-only\">Password</label>\n");
      out.write("                <input type=\"password\" id=\"inputPassword\" class=\"form-control\" placeholder=\"Password\" required>\n");
      out.write("                <div class=\"checkbox mb-3\">\n");
      out.write("                    <label>\n");
      out.write("                        <input type=\"checkbox\" value=\"remember-me\" style=\"color: white\"> Remember me         \n");
      out.write("                    </label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"control-text \">\n");
      out.write("                    <a href=\"#\" class=\"text-dark\" style=\"text-align: right; color: white;\"> Register </a>\n");
      out.write("                </div>\n");
      out.write("                <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Sign in</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
