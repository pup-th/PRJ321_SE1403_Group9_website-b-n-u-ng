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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <link href=\"css/aboutUs.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"about-section\">\r\n");
      out.write("            <h1>About Us Page</h1>\r\n");
      out.write("            <p class=\"contentsp\">If you have some problems with our website, you can follow us so we can assist for you in the best way.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <h2 style=\"text-align:center\">Our Team</h2>\r\n");
      out.write("        <div class=\"row\" >\r\n");
      out.write("            <div class=\"col-md-4\" align=\"center\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <img src=\"background/phuc.jpg\" class=\"rounded-circle\" alt=\"Responsive image\"width=\"100%\" height=\"100%\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <h2>Tran Hoang Phuc</h2>\r\n");
      out.write("                        <p class=\"title\">Leader</p>\r\n");
      out.write("                        <p>PhucTHCE14xxxx@fpt.edu.vn</p>\r\n");
      out.write("                        <p><a href=\"https://www.facebook.com/profile.php?id=100033120579664\" target=\"_blank\"><button class=\"button\">Contact</button></a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-4\" align=\"center\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <img src=\"background/tri.jpg\" class=\"rounded-circle\" alt=\"Responsive image\" width=\"100%\" height=\"100%\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <h2>Le Minh Tri</h2>\r\n");
      out.write("                        <p class=\"title\">Member</p>\r\n");
      out.write("                        <p>TriLMCE14xxxx@fpt.edu.vn</p>\r\n");
      out.write("                        <p><a href=\"https://www.facebook.com/lmtriiii\" target=\"_blank\"><button class=\"button\">Contact</button></a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-4\" align=\"center\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <img src=\"background/qui.png\" class=\"rounded-circle\" alt=\"Responsive image\"width=\"100%\" height=\"100%\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <h2>Tran Hoang Qui</h2>\r\n");
      out.write("                        <p class=\"title\">Member</p>\r\n");
      out.write("                        <p>QuiTHCE140632@fpt.edu.vn</p>\r\n");
      out.write("                        <p><a href=\"https://www.facebook.com/profile.php?id=100036048650428\" target=\"_blank\"><button class=\"button\">Contact</button></a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"mentor\">\r\n");
      out.write("            <div align=\"center\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <img src=\"background/mentor.jpg\" class=\"rounded-circle\" alt=\"Responsive image\" width=\"100%\" height=\"100%\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <h2>Luong Hoang Huong</h2>\r\n");
      out.write("                        <p class=\"title\">Mentor</p>\r\n");
      out.write("                        <p>HuongLH@fpt.edu.vn</p>\r\n");
      out.write("                        <p><a href=\"https://www.facebook.com/profile.php?id=100024104737933\" target=\"_blank\"><button class=\"button\">Contact</button></a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"para\" align='center'>\r\n");
      out.write("            <h1 align='center'>ABOUT US</h1>\r\n");
      out.write("            <div class=\"dv\">\r\n");
      out.write("                <p>There are many types of soft drinks from bottled water, carbonated soft drinks, coffee or tea prepared, fruit juices of all kinds \r\n");
      out.write("                    not to mention alcoholic drinks, with many different brands. compete in Vietnam market. On average, Vietnamese people consume beverage \r\n");
      out.write("                    more than 23 liters / person / year. Improved living standards have helped the beverage market develop rapidly in Vietnam and consumption \r\n");
      out.write("                    continues to increase because the gap is quite far away from many countries in the world.\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"help\">\r\n");
      out.write("            <table>\r\n");
      out.write("                <td class=\"contact\">Contact us:</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <i><a href=\"#\" class=\"fa fa-facebook\"></a></i>\r\n");
      out.write("                    <i><a href=\"#\" class=\"fa fa-twitter\"></a></i>\r\n");
      out.write("                    <i><a href=\"#\" class=\"fa fa-google\"></a></i>\r\n");
      out.write("                    <i><a href=\"#\" class=\"fa fa-instagram\"></a></i>\r\n");
      out.write("                </td>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"phoneicon\"><i class=\"fa fa-phone-square\" style=\"font-size:40px;color:red\">Hotline:</i>\r\n");
      out.write("            <i class=\"phonenum\">0123456789 - 0321654987 - 0147852369</i>\r\n");
      out.write("        </div>\r\n");
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
