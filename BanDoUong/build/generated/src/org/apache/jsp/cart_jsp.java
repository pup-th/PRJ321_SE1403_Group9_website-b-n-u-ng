package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>E Shop Cart Widget A Flat Responsive Widget Template :: W3layouts</title>\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"E Shop Cart Widget Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Android Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/cart.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function (c) {\n");
      out.write("                $('.alert-close1').on('click', function (c) {\n");
      out.write("                    $('.close1').fadeOut('slow', function (c) {\n");
      out.write("                        $('.close1').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>$(document).ready(function (c) {\n");
      out.write("                $('.alert-close2').on('click', function (c) {\n");
      out.write("                    $('.close2').fadeOut('slow', function (c) {\n");
      out.write("                        $('.close2').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>$(document).ready(function (c) {\n");
      out.write("                $('.alert-close3').on('click', function (c) {\n");
      out.write("                    $('.close3').fadeOut('slow', function (c) {\n");
      out.write("                        $('.close3').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("\n");
      out.write("        <h1>E SHOP CART WIDGET</h1>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"main-bar\">\n");
      out.write("                <div class=\"product\">\n");
      out.write("                    <h3>Product</h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"quantity\">\n");
      out.write("                    <h3>Quantity</h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"price\">\n");
      out.write("                    <h3>Price</h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"items\">\n");
      out.write("                <div class=\"item1\">\n");
      out.write("                    <div class=\"close1\">\n");
      out.write("                        <div class=\"alert-close1\"> </div>\n");
      out.write("                        <div class=\"image1\">\n");
      out.write("                            <img src=\"images/item1.png\" alt=\"item1\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"title1\">\n");
      out.write("                            <p>Gucci Gg1078/S 4Uavk Grey Wayfarer</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"quantity1\">\n");
      out.write("                            <form action=\"action_page.php\">\n");
      out.write("                                <input type=\"number\" name=\"quantity\" min=\"1\" max=\"10\" value=\"1\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"price1\">\n");
      out.write("                            <p>$ 210</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clear\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item2\">\n");
      out.write("                    <div class=\"close2\">\n");
      out.write("                        <div class=\"alert-close2\"> </div>\n");
      out.write("                        <div class=\"image2\">\n");
      out.write("                            <img src=\"images/item2.png\" alt=\"item2\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"title2\">\n");
      out.write("                            <p>Gucci Men's YA131202 Coupe Dual</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"quantity2\">\n");
      out.write("                            <form action=\"action_page.php\">\n");
      out.write("                                <input type=\"number\" name=\"quantity\" min=\"1\" max=\"10\" value=\"1\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"price2\">\n");
      out.write("                            <p>$ 545</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clear\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item3\">\n");
      out.write("                    <div class=\"close3\">\n");
      out.write("                        <div class=\"alert-close3\"> </div>\n");
      out.write("                        <div class=\"image3\">\n");
      out.write("                            <img src=\"images/item3.png\" alt=\"item3\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"title3\">\n");
      out.write("                            <p>Gucci Cufflinks with Interlocking G Motif</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"quantity3\">\n");
      out.write("                            <form action=\"action_page.php\">\n");
      out.write("                                <input type=\"number\" name=\"quantity\" min=\"1\" max=\"10\" value=\"1\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"price3\">\n");
      out.write("                            <p>$ 169</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clear\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"total\">\n");
      out.write("                <div class=\"total1\">Total Price</div>\n");
      out.write("                <div class=\"total2\">$ 924</div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"checkout\">\n");
      out.write("                <div class=\"add\">\n");
      out.write("                    <a href=\"#\">Add to Cart</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"checkout-btn\">\n");
      out.write("                    <a href=\"#\">Checkout</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
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
