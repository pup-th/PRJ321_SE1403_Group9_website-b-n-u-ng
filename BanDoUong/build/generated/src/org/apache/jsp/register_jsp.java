package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/css/header.css");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("        <meta name=\"google-signin-client_id\" content=\"559443797881-d6drq7akg8ki94d777tu66a43cj4v061.apps.googleusercontent.com\"/>\n");
      out.write("        <script src=\"https://apis.google.com/js/platform.js\" async defer></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/register.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <style>\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            .navbar .nav-link{\r\n");
      out.write("                font-size: 15px;\r\n");
      out.write("                padding: 0 20px !important;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .navbar-toogler{\r\n");
      out.write("                outline: none;\r\n");
      out.write("            } \r\n");
      out.write("            #header{\r\n");
      out.write("                font-family: Helvetica, Arial, sans-serif;\r\n");
      out.write("                background-color: #696969;\r\n");
      out.write("            }");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

            String email = null;
            String s = "";
            if (request.getSession().getAttribute("uMail") != null) {
                email = request.getSession().getAttribute("uMail").toString();
                s = email.substring(0, email.indexOf("@"));
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
      out.write("                            ");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_0.setParent(null);
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_0.setPageContext(_jspx_page_context);
          _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_0.setTest(email == null);
          int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
          if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                    <div class=\"dropdown navbar-nav ml-auto \">\n");
              out.write("                                        <a class=\"nav-link\" href=\"#\" data-toggle=\"dropdown\">ACCOUNT</a>\n");
              out.write("                                        <div class=\"dropdown-menu\">\n");
              out.write("                                            <a class=\"dropdown-item\" href=\"login.jsp\">Sign in</a>\n");
              out.write("                                            <a class=\"dropdown-item\" href=\"register.jsp\">Register</a>\n");
              out.write("                                        </div>\n");
              out.write("                                    </div> \n");
              out.write("                                ");
              int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
          out.write("\n");
          out.write("                                ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_1.setPageContext(_jspx_page_context);
          _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_1.setTest(email != null);
          int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
          if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                    <div class=\"dropdown navbar-nav ml-auto \">\n");
              out.write("                                        <a class=\"nav-link\" href=\"#\" data-toggle=\"dropdown\">");
              out.print(s);
              out.write("</a>\n");
              out.write("                                        <div class=\"dropdown-menu\">\n");
              out.write("                                            <a class=\"dropdown-item\" href=\"#\">Cart</a>\n");
              out.write("                                            <a class=\"dropdown-item\" href=\"profile.jsp?em=");
              out.print(email);
              out.write("\">Profile</a>\n");
              out.write("                                            <a class=\"dropdown-item\" href=\"home.jsp?out=1\" >Sign out\n");
              out.write("                                                <script>\n");
              out.write("                                                    function myFunction() {\n");
              out.write("                                                        gapi.auth2.getAuthInstance().disconnect();\n");
              out.write("                                                        location.reload();\n");
              out.write("                                                    }\n");
              out.write("                                                </script></a>\n");
              out.write("                                        </div>\n");
              out.write("                                    </div> \n");
              out.write("                                ");
              int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
          out.write("  \n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
        return;
      }
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("        <div class=\"login\">\n");
      out.write("            <div class=\"login-top\">\n");
      out.write("                <h2>Register</h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"login-bottom\">\n");
      out.write("                <h3>Fill out all information: </h3>\n");
      out.write("                <form action=\"UserController\" method=\"POST\">\n");
      out.write("                    <div class=\"user\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Email\" name=\"txtEmail\" required autofocus><i></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"user-in\">\n");
      out.write("                        <input type=\"password\" placeholder=\"Password\" name=\"txtPass\" required ><i></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"user\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Your name\" name=\"txtName\" required><i></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"user\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Phone number\" name=\"txtPhone\" required><i></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"user\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Address\" name=\"txtAddress\" required><i></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"forgot\">\n");
      out.write("                        <div class=\"forgot-register\">\n");
      out.write("                            <p>Already have an account?<a href=\"login.jsp\">Login Now</a></p>\n");
      out.write("                        </div> \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"keepme\">\n");
      out.write("                        <div class=\"keep-loginbutton\">\n");
      out.write("                            <input type=\"button\" value=\"Register\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clear\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
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