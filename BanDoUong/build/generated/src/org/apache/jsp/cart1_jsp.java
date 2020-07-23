package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;
import DAO.ItemDAO;
import DAO.UserDAO;

public final class cart1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>E Shop Cart Widget A Flat Responsive Widget Template :: W3layouts</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <link href=\"css/profile.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <meta name=\"keywords\" content=\"E Shop Cart Widget Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Android Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design\" />\r\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/cart.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("        <script src=\"./src/bootstrap-input-spinner.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(\"input[type='number']\").inputSpinner()\r\n");
      out.write("        </script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function (c) {\r\n");
      out.write("                $('.alert-close1').on('click', function (c) {\r\n");
      out.write("                    $('.close1').fadeOut('slow', function (c) {\r\n");
      out.write("                        $('.close1').remove();\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <script>$(document).ready(function (c) {\r\n");
      out.write("                $('.alert-close2').on('click', function (c) {\r\n");
      out.write("                    $('.close2').fadeOut('slow', function (c) {\r\n");
      out.write("                        $('.close2').remove();\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <script>$(document).ready(function (c) {\r\n");
      out.write("                $('.alert-close3').on('click', function (c) {\r\n");
      out.write("                    $('.close3').fadeOut('slow', function (c) {\r\n");
      out.write("                        $('.close3').remove();\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <style>\r\n");
      out.write("            #con{\r\n");
      out.write("                margin-top: 70px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            DAO.ItemDAO itemdao = new ItemDAO();
            Entities.Itemall itemall = itemdao.getNameOfItem(1);
            String name = itemall.getiName();
            int price = itemall.getOutputPrice();
            int total = 0;
        
      out.write("\r\n");
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
      out.write("\n");
      out.write("\n");
      out.write("            .navbar .nav-link{\n");
      out.write("                font-size: 15px;\n");
      out.write("                padding: 0 20px !important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar-toogler{\n");
      out.write("                outline: none;\n");
      out.write("            } \n");
      out.write("            #header{\n");
      out.write("                font-family: Helvetica, Arial, sans-serif;\n");
      out.write("                background-color: #696969;\n");
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
      out.write("                        <li class=\"nav-item\"><a href=\"cart1.jsp\" class=\"nav-link\">CART</a></li>\r\n");
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
      out.write("        <div class=\"container\" id=\"con\">\r\n");
      out.write("            <div class=\"main-bar\">\r\n");
      out.write("                <div class=\"product\">\r\n");
      out.write("                    <h3>Product</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"quantity\">\r\n");
      out.write("                    <h3>Quantity</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"price\">\r\n");
      out.write("                    <h3>Price</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"clear\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                ");
                //               int id = Integer.parseInt(request.getSession().getAttribute("hashid").toString());
                    //               int quantity = Integer.parseInt(request.getSession().getAttribute("hashquantity").toString());
                    HashMap<Integer, Integer> map = (HashMap) request.getSession().getAttribute("hashMapItemCart");
                    //                if (map.containsKey(id)) {
                    //                    map.put(id, map.get(id) + quantity);
                    //                } else {
                    //                    map.put(id, quantity);
                    //                }
                    DAO.ItemDAO idao = new ItemDAO();
                    for (Integer i : map.keySet()) {
                        int hashid = i;
                        int hashquantity = map.get(i);
                        Entities.Itemall item = idao.getNameOfItem(hashid);
                        out.print("<div class='items'>"
                                + "<div class='item1'>"
                                + "<div class='close1'>"
                                + "<div class='image1'>"
                                + "<img src='douong/" + item.getiPic() + "' alt='item1'></div>"
                                + "<div class='title1'>"
                                + "<p>" + item.getiName() + "</p>"
                                + "</div>"
                                + "<div class='quantity1'>" + hashquantity + "</div>"
                                + "<div class='price1'><p>" + item.getOutputPrice() + "</p></div>"
                                + "<div class='clear'></div>"
                                + "</div></div></div>"
                        );
                        total += (item.getOutputPrice() * hashquantity);
                    }
                
      out.write("\r\n");
      out.write("            </div> \r\n");
      out.write("            <div class=\"total\">\r\n");
      out.write("                <div class=\"total1\">Total Price</div>\r\n");
      out.write("                <div class=\"total2\">");
      out.print( total);
      out.write("</div>\r\n");
      out.write("                <div class=\"clear\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"checkout\">\r\n");
      out.write("                <div class=\"add\">\r\n");
      out.write("                    <div class=\"checkout-btn\">\r\n");
      out.write("                        <div class=\"menu\">\r\n");
      out.write("                            <button onclick=\"document.getElementById('id02').style.display = 'block'\" style=\"width:auto;\">Buy</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"clear\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"id02\" class=\"modal\">\r\n");
      out.write("            <form class=\"modal-content animate\" method=\"post\">\r\n");
      out.write("                <div class=\"imgcontainer\">\r\n");
      out.write("                    <span onclick=\"document.getElementById('id02').style.display = 'none'\" class=\"close\" title=\"Close Modal\">&times;</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <table class=\"tableorder\">\r\n");
      out.write("                        ");

                            out.println("<tr align='center'>");
                            out.println("<th>No.</th>");
                            out.println("<th>Item Name</th>");
                            out.println("<th>Quantity</th>");
                            out.println("<th>Price</th>");
                            out.println("<th>Order Date</th>");
                            out.println("<th>Total</th>");
                            out.println("</tr>");
                        
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                    <button type=\"submit\" name=\"btnOrder\">Order</button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"container\" style=\"background-color:#f1f1f1\">\r\n");
      out.write("                    <button type=\"button\" onclick=\"document.getElementById('id02').style.display = 'none'\" class=\"cancelbtn\">Cancel</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script>\r\n");
      out.write("            // Get the modal\r\n");
      out.write("            var modal = document.getElementById('id02');\r\n");
      out.write("            // When the user clicks anywhere outside of the modal, close it\r\n");
      out.write("            window.onclick = function (event) {\r\n");
      out.write("                if (event.target == modal) {\r\n");
      out.write("                    modal.style.display = \"none\";\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
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
