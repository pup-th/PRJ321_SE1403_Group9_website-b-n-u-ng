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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" \r\n");
      out.write("              integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" \r\n");
      out.write("              crossorigin=\"anonymous\">\r\n");
      out.write("        <meta name=\"google-signin-client_id\" content=\"559443797881-d6drq7akg8ki94d777tu66a43cj4v061.apps.googleusercontent.com\"/>\r\n");
      out.write("        <script src=\"https://apis.google.com/js/platform.js\" async defer></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/register.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <style>\r\n");
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
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            String email = null;
            String s = "";
            if (request.getSession().getAttribute("uMail") != null) {
                email = request.getSession().getAttribute("uMail").toString();
                s = email.substring(0, email.indexOf("@"));
            }
            
        
      out.write("\r\n");
      out.write("        <nav class=\"navbar navbar-expand-sm navbar-dark bg-black fixed-top\" id=\"header\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <a href=\"home.jsp\" class=\"navbar-brand\">GroupChin</a>\r\n");
      out.write("                <button class=\"navbar-toggler\" data-toggle=\"collapse\"\r\n");
      out.write("                        data-target=\"#navbarCollapse\">\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\r\n");
      out.write("                    <ul class=\"navbar-nav ml-auto \">\r\n");
      out.write("                        <li class=\"nav-item\"><a href=\"home.jsp\" class=\"nav-link\">HOME</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">CART</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a href=\"aboutus.jsp\" class=\"nav-link\">ABOUT US</a></li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            ");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_0.setParent(null);
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_0.setPageContext(_jspx_page_context);
          _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_0.setTest(email == null);
          int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
          if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                                    <div class=\"dropdown navbar-nav ml-auto \">\r\n");
              out.write("                                        <a class=\"nav-link\" href=\"#\" data-toggle=\"dropdown\">ACCOUNT</a>\r\n");
              out.write("                                        <div class=\"dropdown-menu\">\r\n");
              out.write("                                            <a class=\"dropdown-item\" href=\"login.jsp\">Sign in</a>\r\n");
              out.write("                                            <a class=\"dropdown-item\" href=\"register.jsp\">Register</a>\r\n");
              out.write("                                        </div>\r\n");
              out.write("                                    </div> \r\n");
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
          out.write("\r\n");
          out.write("                                ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_1.setPageContext(_jspx_page_context);
          _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_1.setTest(email != null);
          int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
          if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                                    <div class=\"dropdown navbar-nav ml-auto \">\r\n");
              out.write("                                        <a class=\"nav-link\" href=\"#\" data-toggle=\"dropdown\">");
              out.print(s);
              out.write("</a>\r\n");
              out.write("                                        <div class=\"dropdown-menu\">\r\n");
              out.write("                                            <a class=\"dropdown-item\" href=\"#\">Cart</a>\r\n");
              out.write("                                            <a class=\"dropdown-item\" href=\"profile.jsp\">Profile</a>\r\n");
              out.write("                                            <a class=\"dropdown-item\" href=\"home.jsp?out=1\" >Sign out\r\n");
              out.write("                                                <script>\r\n");
              out.write("                                                    function myFunction() {\r\n");
              out.write("                                                        gapi.auth2.getAuthInstance().disconnect();\r\n");
              out.write("                                                        location.reload();\r\n");
              out.write("                                                    }\r\n");
              out.write("                                                </script></a>\r\n");
              out.write("                                        </div>\r\n");
              out.write("                                    </div> \r\n");
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
          out.write("  \r\n");
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
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("        <div class=\"login\">\r\n");
      out.write("            <div class=\"login-top\">\r\n");
      out.write("                <h2>Register</h2>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"login-bottom\">\r\n");
      out.write("                <h3>Fill out all information: </h3>\r\n");
      out.write("                <form action=\"UserController\" method=\"POST\">\r\n");
      out.write("                    <div class=\"user\">\r\n");
      out.write("                        <input type=\"text\" pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$\"\r\n");
      out.write("                               title=\"A form with an email field that that must be in the following order: characters@characters.domain\" \r\n");
      out.write("                               placeHolder=\"Email\" name =\"txtEmail\" onfocus=\"this.value = '';\"\r\n");
      out.write("                               onblur=\"if (this.value == '') {this.value = 'Email';}\"><i></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"user-in\">\r\n");
      out.write("                        <input type=\"password\" pattern=\"\\w{8,16}\" title=\"From 8-16 characters\" placeholder=\"Password\" name=\"txtPass\" required ><i></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"user\">\r\n");
      out.write("                        <input type=\"text\"  title=\"It's can be empty\" placeholder=\"Your name\" name=\"txtName\" required><i></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"user\">\r\n");
      out.write("                        <input type=\"text\" pattern=\"\\d{10}\" title=\"Phone number must be 10 digits\" placeholder=\"Phone number\" name=\"txtPhone\" required><i></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"user\">\r\n");
      out.write("                        <input type=\"text\" title=\"It's can be empty\" placeholder=\"Address\" name=\"txtAddress\" required><i></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"forgot\">\r\n");
      out.write("                        <div class=\"forgot-register\">\r\n");
      out.write("                            <p>Already have an account?<a href=\"login.jsp\">Login Now</a></p>\r\n");
      out.write("                        </div> \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"keepme\">\r\n");
      out.write("                        <div class=\"keep-loginbutton\">\r\n");
      out.write("                            <input type=\"submit\" value=\"Register\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"clear\"> </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
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
