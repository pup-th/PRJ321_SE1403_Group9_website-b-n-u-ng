package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            /*            body{\n");
      out.write("                            background: #696969;\n");
      out.write("                            background-image: url('background/backaboutus.jpg');\t\n");
      out.write("                        }*/\n");
      out.write("            .back1{\n");
      out.write("                margin-top: 100px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .center{\n");
      out.write("                display: block;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                height: 0%;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .para{\n");
      out.write("                padding-left: 5%;\n");
      out.write("                padding-top: 5%;\n");
      out.write("                font-family: inherit;\n");
      out.write("            }\n");
      out.write("            .dv{\n");
      out.write("                padding-top: 3%; \n");
      out.write("                margin-left:15%;\n");
      out.write("                font-size: medium;\n");
      out.write("                width: 70%;\n");
      out.write("                text-align: center; \n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .dv1{\n");
      out.write("                padding-top: 3%;\n");
      out.write("            }\n");
      out.write("            #help{\n");
      out.write("\n");
      out.write("                padding: 20px;\n");
      out.write("                font-size: 20px;\n");
      out.write("                margin: auto;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            #hot{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"back1\">\n");
      out.write("            <img src=\"background/backus.jpg\"  alt=\"Responsive image\"  width=\"1800\" height=\"550\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"para\">\n");
      out.write("            <h1>ABOUT US</h1>\n");
      out.write("            <div class=\"dv\">\n");
      out.write("                <p>There are many types of soft drinks from bottled water, carbonated soft drinks, coffee or tea prepared, fruit juices of all kinds ... \n");
      out.write("                    not to mention alcoholic drinks, with many different brands. compete in Vietnam market. On average, Vietnamese people consume beverage \n");
      out.write("                    more than 23 liters / person / year. Improved living standards have helped the beverage market develop rapidly in Vietnam and consumption \n");
      out.write("                    continues to increase because the gap is quite far away from many countries in the world.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-4\" id=\"help\">\n");
      out.write("                <a href=\"https://www.facebook.com/\" class=\"  fa fa-facebook fa-2x\"> </a>\n");
      out.write("                <a href=\"https://www.instagram.com/\" class=\"  fa fa-instagram fa-2x\"></a>\n");
      out.write("                <a href=\"https://mail.google.com/mail\" class=\" fa fa-google fa-2x\"></a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"hot\">Hotline: 0123456789 - 0987654321- 0147258369</div>\n");
      out.write("</body>\n");
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