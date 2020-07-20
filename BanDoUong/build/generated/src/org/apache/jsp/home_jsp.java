package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import DAO.ItemDAO;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/css/home.css");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            ");
      out.write("body{\r\n");
      out.write("                background: #fff;\r\n");
      out.write("                /*                background-image: url('background/snow1.png'), url('background/snow2.png'), url('background/snow3.png');\t\r\n");
      out.write("                                animation: snow 20s linear infinite;*/\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            @keyframes snow {\r\n");
      out.write("                0% {background-position: 0px 0px, 0px 0px, 0px 0px;}\r\n");
      out.write("                100% {background-position: 500px 1000px, 400px 400px, 300px 300px;}\r\n");
      out.write("            }\r\n");
      out.write("            #container{\r\n");
      out.write("                margin-top: 55px;\r\n");
      out.write("            }\r\n");
      out.write("            #product{\r\n");
      out.write("                padding-top: 20px;\r\n");
      out.write("            }");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            if(request.getParameter("out") != null){
                request.getSession().removeAttribute("uMail");
            }
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"container\" id=\"container\">\n");
      out.write("            <div id=\"carouselExampleIndicators\" class=\"carousel slide\"\n");
      out.write("                 data-ride=\"carousel\">\n");
      out.write("                <ol class=\"carousel-indicators\">\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\"\n");
      out.write("                        class=\"active\"></li>\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\n");
      out.write("                </ol>\n");
      out.write("\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"carousel-item active\">\n");
      out.write("                        <img src=\"background/1.jpg\"\n");
      out.write("                             class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                            <h3>WELCOME TO OUR SHOP</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img\n");
      out.write("                            src=\"background/2.jpg\"\n");
      out.write("                            class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                            <h3>WELCOME TO OUR SHOP</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img src=\"background/3.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                            <h3>WELCOME TO OUR SHOP</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\"\n");
      out.write("                   role=\"button\" data-slide=\"prev\"> <span\n");
      out.write("                        class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span> <span\n");
      out.write("                        class=\"sr-only\">Previous</span>\n");
      out.write("                </a> <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\"\n");
      out.write("                        role=\"button\" data-slide=\"next\"> <span\n");
      out.write("                        class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span> <span\n");
      out.write("                        class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\" id=\"product\">\n");
      out.write("            <div class=\"row row-cols-1 row-cols-md-3\">\n");
      out.write("                <div class=\"col-sm-4 mb-4\">\n");
      out.write("                    <div class=\"card h-100\">\n");
      out.write("                        <img src=\"douong/c2.png\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h5 class=\"card-title\">C2</h5>\n");
      out.write("                            <p class=\"card-text\"></p>\n");
      out.write("                            <footer>\n");
      out.write("                                <button class=\"btn btn-lg btn-primary btn-block\">Buy</button>\n");
      out.write("                            </footer>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");

                    ArrayList<String> listName = new ItemDAO().getNameOfItems();
                    for (String name : listName) {
                        if (!name.isEmpty()) {
                            out.println("<div class=\"col-sm-4 mb-4\">"
                                    + "<div class=\"card h-100\">"
                                    + "<img src=\"douong/" + name + "\" class=\"card-img-top\" alt=\"...\">"
                                    + "<div class=\"card-body\">"
                                    + "<h5 class=\"card-title\">" + name.substring(0, name.indexOf(".png")) + "</h5>"
                                    + "<p class=\"card-text\"></p>"
                                    + "<footer>"
                                    + "<button class=\"btn btn-lg btn-primary btn-block\">Buy</button>"
                                    + "</footer>"
                                    + "</div>"
                                    + "</div>"
                                    + "</div>");
                        }
                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"container-fluid padding \">\n");
      out.write("                <div class=\"text-center\">\n");
      out.write("                    <div>\n");
      out.write("                        <h4>Contact us by: </h4>\n");
      out.write("                        <a href=\"https://www.facebook.com/profile.php?id=100033120579664\"><i class=\"fa fa-facebook-square fa-2x\"></i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-instagram fa-2x\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
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
