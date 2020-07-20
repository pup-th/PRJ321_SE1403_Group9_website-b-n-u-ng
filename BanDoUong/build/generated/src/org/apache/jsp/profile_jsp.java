package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.UserDAO;
import Entities.Users;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Consultancy Profile Widget Flat Responsive Widget Template :: w3layouts</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <link href=\"css/styleProfile.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Users u = null;
            String email = "";
            if(request.getParameter("email") != null){
                email = request.getParameter("email");
                UserDAO uDAO = new UserDAO();
                u = uDAO.getUserByEmail(email);
            }
        
      out.write("\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <h1>Profile</h1>\n");
      out.write("            <div id=\"wrapper\" class=\"w3ls_wrapper w3layouts_wrapper\">\n");
      out.write("                <div id=\"steps\" style=\"margin:0 auto;\" class=\"agileits w3_steps\">\n");
      out.write("                    <form id=\"formElem\" name=\"formElem\" action=\"#\" method=\"post\" class=\"w3_form w3l_form_fancy\">\n");
      out.write("                        <fieldset class=\"step agileinfo w3ls_fancy_step\">\n");
      out.write("                            <legend>About</legend>\n");
      out.write("                            <div class=\"abt-agile\">\n");
      out.write("                                <div class=\"abt-agile-left\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"abt-agile-right\">\n");
      out.write("                                    <h3>");
      out.print(u.getuName());
      out.write("</h3>\n");
      out.write("                                    <h5></h5>\n");
      out.write("                                    <ul class=\"address\">\n");
      out.write("                                        <li>\n");
      out.write("                                            <ul class=\"address-text\">\n");
      out.write("                                                <li><b>PHONE </b></li>\n");
      out.write("                                                <li>: ");
      out.print(u.getuPhone());
      out.write("</li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <ul class=\"address-text\">\n");
      out.write("                                                <li><b>ADDRESS </b></li>\n");
      out.write("                                                <li>: ");
      out.print(u.getuAddress());
      out.write("</li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <ul class=\"address-text\">\n");
      out.write("                                                <li><b>E-MAIL </b></li>\n");
      out.write("                                                <li>: ");
      out.print(u.getuMail());
      out.write("</li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"clear\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </fieldset>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
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
