package org.apache.jsp.interfaces;

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

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/css/login.css");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("            ");
      out.write(".bd-placeholder-img {\r\n");
      out.write("                font-size: 1.125rem;\r\n");
      out.write("                text-anchor: middle;\r\n");
      out.write("                -webkit-user-select: none;\r\n");
      out.write("                -moz-user-select: none;\r\n");
      out.write("                -ms-user-select: none;\r\n");
      out.write("                user-select: none;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            @media (min-width: 768px) {\r\n");
      out.write("                .bd-placeholder-img-lg {\r\n");
      out.write("                    font-size: 3.5rem;\r\n");
      out.write("                }\r\n");
      out.write("                html,\r\n");
      out.write("                body {\r\n");
      out.write("                    height: 100%;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                body {\r\n");
      out.write("                    display: -ms-flexbox;\r\n");
      out.write("                    display: flex;\r\n");
      out.write("                    -ms-flex-align: center;\r\n");
      out.write("                    align-items: center;\r\n");
      out.write("                    padding-top: 40px;\r\n");
      out.write("                    padding-bottom: 40px;\r\n");
      out.write("                    background-color: #f5f5f5;\r\n");
      out.write("                    background-image: url('background/a.png');\r\n");
      out.write("                }\r\n");
      out.write("                h1{\r\n");
      out.write("                    font-family: Helvetica, Arial, sans-serif;  \r\n");
      out.write("                    text-align: center; \r\n");
      out.write("                    font-size:50px; \r\n");
      out.write("                    margin-top: 10px; \r\n");
      out.write("                    color:#000;\r\n");
      out.write("                    /*text-shadow: 2px 2px 0px rgba(0,0,0,.7), 5px 7px 0px rgba(255, 255, 255, 0.1);*/ \r\n");
      out.write("                }\r\n");
      out.write("                .form-signin {\r\n");
      out.write("                    width: 100%;\r\n");
      out.write("                    max-width: 330px;\r\n");
      out.write("                    padding: 15px;\r\n");
      out.write("                    margin: auto;\r\n");
      out.write("                }\r\n");
      out.write("                .form-signin .checkbox {\r\n");
      out.write("                    font-weight: 400;\r\n");
      out.write("                }\r\n");
      out.write("                .form-signin .form-control {\r\n");
      out.write("                    position: relative;\r\n");
      out.write("                    box-sizing: border-box;\r\n");
      out.write("                    height: auto;\r\n");
      out.write("                    padding: 10px;\r\n");
      out.write("                    font-size: 16px;\r\n");
      out.write("                }\r\n");
      out.write("                .form-signin .form-control:focus {\r\n");
      out.write("                    z-index: 2;\r\n");
      out.write("                }\r\n");
      out.write("                .form-signin input {\r\n");
      out.write("                    margin-bottom: 10px;\r\n");
      out.write("                    border-bottom-right-radius: 0;\r\n");
      out.write("                    border-bottom-left-radius: 0;\r\n");
      out.write("                }\r\n");
      out.write("                #con{\r\n");
      out.write("                    background-color: #fff;\r\n");
      out.write("                    width: 25%;\r\n");
      out.write("                }\r\n");
      out.write("                #fail{\r\n");
      out.write("                    color: red;\r\n");
      out.write("                    text-align: center;\r\n");
      out.write("                }\r\n");
      out.write("            }");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
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
            String fail = "";
            if (request.getAttribute("fail") != null) {
                fail = request.getAttribute("fail").toString();
            }
        
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
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                <input class=\"btn btn-lg btn-primary btn-block\" type=\"submit\" value=\"Signin\"/>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${! empty fail}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <label id=\"fail\" class=\"center\">Wrong Username or Password</label>\n");
        out.write("                    \n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
