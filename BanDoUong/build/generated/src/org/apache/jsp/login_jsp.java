package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.UserDAO;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\r\n");
      out.write("\r\n");
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
      out.write("        <script src=\"https://apis.google.com/js/platform.js\" async defer></script>\r\n");
      out.write("        <meta name=\"google-signin-client_id\" content=\"559443797881-3h3h7b9hnls91oeoft4gei5vh9ng3odl.apps.googleusercontent.com\">\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Droid+Sans:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("        <link href=\"css/styleLogin.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            function onSignIn(googleUser) {\r\n");
      out.write("                gapi.auth2.getAuthInstance().disconnect();\r\n");
      out.write("                location.reload();\r\n");
      out.write("                var profile = googleUser.getBasicProfile();\r\n");
      out.write("                var email = profile.getEmail();\r\n");
      out.write("                window.location = \"UserController?mail=\" + email;\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            String fail = "";
            String fillEmail = "";
            String fillPass = "";
            if (request.getAttribute("fail") != null) {
                fail = request.getAttribute("fail").toString();
            }
            if(request.getAttribute("fillEmail") != null &&
                    request.getAttribute("fillPass") != null){
                fillEmail = request.getAttribute("fillEmail").toString();
                fillPass = request.getAttribute("fillPass").toString();
            }
        
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("        <div class=\"login\">\r\n");
      out.write("            <div class=\"login-top\">\r\n");
      out.write("                <h2>LOG IN</h2>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"login-bottom\">\r\n");
      out.write("                <h3>Log in with a social network:</h3>\r\n");
      out.write("                <center><a class=\"g-signin2\" data-onsuccess=\"onSignIn\" center></a></center>\r\n");
      out.write("                <h3>Log in With registered details:</h3>\r\n");
      out.write("                <form action=\"UserController\" method=\"POST\">\r\n");
      out.write("                    <div class=\"user\">\r\n");
      out.write("                        <input type=\"text\" placeHolder=\"Email\" name =\"txtEmail\" value=\"");
      out.print(fillEmail);
      out.write("\"  onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Email';}\">\r\n");
      out.write("                        <i></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"user-in\">\r\n");
      out.write("                        <input type=\"password\"  name=\"txtPass\" placeholder=\"Password\" value=\"");
      out.print(fillPass);
      out.write("\" required ><i></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(fail != null);
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    <div id=\"fail\" style=\"text-align: center; color: red; font-family: sans-serif;\">");
          out.print(fail);
          out.write("</div>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write("\r\n");
      out.write("                <div class=\"keepme\">\r\n");
      out.write("                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" checked><i> </i>Remember me</label>\r\n");
      out.write("                    <div class=\"keep-loginbutton\">\r\n");
      out.write("                        <input type=\"submit\" value=\"Log in\" />\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clear\"> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"forgot\">\r\n");
      out.write("                    <div class=\"forgot-register\">\r\n");
      out.write("                        <p>Don't have an account? <a href=\"register.jsp\">Register Now</a></p>\r\n");
      out.write("                    </div> \r\n");
      out.write("                </div>\r\n");
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
