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
      out.write("            }\n");
      out.write("            .center{\n");
      out.write("                display: block;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                height: 0%;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .para{\n");
      out.write("                padding-top: 5%;\n");
      out.write("                font-family: inherit;\n");
      out.write("                align-items: center;\n");
      out.write("                text-height: auto;\n");
      out.write("            }\n");
      out.write("            .dv{\n");
      out.write("                padding-top: 3%; \n");
      out.write("                font-size: medium;\n");
      out.write("                width: 70%;\n");
      out.write("            }\n");
      out.write("            .dv1{\n");
      out.write("                padding-top: 3%;\n");
      out.write("            }\n");
      out.write("            .help{\n");
      out.write("                padding: 20px;\n");
      out.write("                font-size: 30px;\n");
      out.write("                width: 50px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            img {\n");
      out.write("                border-radius:50%;\n");
      out.write("                -moz-border-radius:50%;\n");
      out.write("                -webkit-border-radius:50%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .mentor{\n");
      out.write("                padding-top: 50px;   \n");
      out.write("                padding-left: 42.5%;\n");
      out.write("            }\n");
      out.write("            .mem{\n");
      out.write("                display: flex;\n");
      out.write("                margin-top:100px;\n");
      out.write("                margin-right: auto;\n");
      out.write("                padding-left: 150px;\n");
      out.write("            }\n");
      out.write("            .pic2{\n");
      out.write("                padding-left: 275px;\n");
      out.write("            }\n");
      out.write("            .pic3{\n");
      out.write("                padding-left: 240px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"mem\">\n");
      out.write("            <!--<img src=\"background/backus.jpg\"  alt=\"Responsive image\"  width=\"1600\" height=\"550\">-->\n");
      out.write("            <div align='center'>\n");
      out.write("                <img src=\"background/phuc.jpg\"  alt=\"Responsive image\" width=\"300\" height=\"300\"/>\n");
      out.write("                <h5>Tran Hoang Phuc</h5>\n");
      out.write("                <h5>CE14xxxx</h5>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"pic2\"  align='center'>\n");
      out.write("                <img src=\"background/tri.jpg\"  alt=\"Responsive image\" width=\"300\" height=\"300\"/>\n");
      out.write("                <h5>Le Minh Tri</h5>\n");
      out.write("                <h5>CE14xxxx</h5>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"pic3\"  align='center'>\n");
      out.write("                <img src=\"background/qui.png\"  alt=\"Responsive image\" width=\"300\" height=\"300\"/>\n");
      out.write("                <h5 >Tran Hoang Qui</h5>\n");
      out.write("                <h5>CE14xxxx</h5>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mentor\">\n");
      out.write("            <img src=\"background/mentor.jpg\"  alt=\"Responsive image\" width=\"300\" height=\"300\"/><br>\n");
      out.write("            <h5 text-align='center'>Mentor: Luong Hoang Huong</h5>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"para\" align='center'>\n");
      out.write("            <h1 align='center'>ABOUT US</h1>\n");
      out.write("            <div class=\"dv\">\n");
      out.write("                <p>There are many types of soft drinks from bottled water, carbonated soft drinks, coffee or tea prepared, fruit juices of all kinds \n");
      out.write("                    not to mention alcoholic drinks, with many different brands. compete in Vietnam market. On average, Vietnamese people consume beverage \n");
      out.write("                    more than 23 liters / person / year. Improved living standards have helped the beverage market develop rapidly in Vietnam and consumption \n");
      out.write("                    continues to increase because the gap is quite far away from many countries in the world.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"help\">\n");
      out.write("            <a href=\"https://www.facebook.com/\" class=\"fa fa-facebook\"></a>\n");
      out.write("            <a href=\"http://mail.google.com/\" class=\"fa fa-google\"></a>\n");
      out.write("            <a href=\"https://twitter.com/explore\" class=\"fa fa-twitter\"></a>\n");
      out.write("            <a href=\"https://www.instagram.com/accounts/login/?hl=vi\" class=\"fa fa-instagram\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div align='center'>\n");
      out.write("            <p>Hotline: 0123456789 - 0321654987 - 0147852369</p>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
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
