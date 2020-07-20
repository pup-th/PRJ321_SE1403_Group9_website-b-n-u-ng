package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.UserDAO;
import com.sl.GlobalCons;
import com.sl.GooglePojo;

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
      out.write("        <meta name=\"google-signin-client_id\" content=\"559443797881-d6drq7akg8ki94d777tu66a43cj4v061.apps.googleusercontent.com\"/>\n");
      out.write("        <script src=\"https://apis.google.com/js/platform.js\" async defer></script>\n");
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
      out.write("                    /*text-shadow: 2px 2px 0px rgba(0,0,0,.7), 5px 7px 0px rgba(255, 255, 255, 0.1);*/ \n");
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
      out.write("            body{ \n");
      out.write("                background-image: url('background/a.png');\n");
      out.write("            }\n");
      out.write("            #con{\n");
      out.write("                background-color: #fff;\n");
      out.write("                width: 25%;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");

//            GooglePojo gp = (GooglePojo) request.getAttribute(GlobalCons.AUTH);
//            if (!new UserDAO().checkLoginByGoogle(gp.getEmail()).isEmpty()) {
//                String name = gp.getEmail().substring(0, gp.getEmail().indexOf("@"));
//            }
//            if (request.getAttribute("txtEmail") != null
//                    && request.getAttribute("txtEmail") != null) {
//                if (!new UserDAO().checkLogin(request.getAttribute("txtEmail").toString(), request.getAttribute("txtEmail").toString()).isEmpty()) {
//                    request.getRequestDispatcher("home.jsp").forward(request, response);
//                }
//            }

      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"container\" id=\"con\" >\n");
      out.write("            <form class=\"form-signin\" action=\"UserController\" method=\"POST\">          \n");
      out.write("                <h1 class=\"h3 mb-3 font-weight-normal\">Sign in</h1>\n");
      out.write("                <label for=\"inputEmail\" class=\"sr-only\">Email</label>\n");
      out.write("                <input type=\"email\" class=\"form-control\" placeholder=\"Email\" name=\"txtEmail\" required autofocus>\n");
      out.write("                <label for=\"inputPassword\" class=\"sr-only\">Password</label>\n");
      out.write("                <input type=\"password\" class=\"form-control\" name=\"txtPass\" placeholder=\"Password\" required>\n");
      out.write("                <input type=\"checkbox\" value=\"remember-me\" style=\"color: white\">  Remember me     \n");
      out.write("\n");
      out.write("                <a href=\"register.jsp\" class=\"text-dark\" style=\"text-align: right; color: white;\"> Register </a>\n");
      out.write("\n");
      out.write("                <input class=\"btn btn-lg btn-primary btn-block\" type=\"submit\" value=\"Signin\" name=\"btnSignin\"/>\n");
      out.write("                <!--                <div class=\"googleDemo\" style=\"text-align: center\" border=\"1\">\n");
      out.write("                                    <a\thref=\"https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8080/BanDoUong/login.jsp&response_type=code&client_id=559443797881-3h3h7b9hnls91oeoft4gei5vh9ng3odl.apps.googleusercontent.com&approval_prompt=force\"\n");
      out.write("                                       class=\"btn btn-lg btn-social btn-google\"> Sign in with Google\n");
      out.write("                                    </a>\n");
      out.write("                                </div>-->\n");
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
