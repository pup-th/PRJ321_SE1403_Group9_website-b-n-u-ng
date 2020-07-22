package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Entities.Items;
import java.util.ArrayList;
import DAO.ItemDAO;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <!--        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("                <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\r\n");
      out.write("                <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("                <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("                <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("                <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("                <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">-->\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("            body{\r\n");
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
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            if (request.getParameter("out") != null) {
                request.getSession().removeAttribute("uMail");
            }
        
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("        <div class=\"container\" id=\"container\">\r\n");
      out.write("            <div id=\"carouselExampleIndicators\" class=\"carousel slide\"\r\n");
      out.write("                 data-ride=\"carousel\">\r\n");
      out.write("                <ol class=\"carousel-indicators\">\r\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\"\r\n");
      out.write("                        class=\"active\"></li>\r\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\r\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\r\n");
      out.write("                </ol>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"carousel-inner\">\r\n");
      out.write("                    <div class=\"carousel-item active\">\r\n");
      out.write("                        <img src=\"background/1.jpg\"\r\n");
      out.write("                             class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("                            <h3>WELCOME TO OUR SHOP</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"carousel-item\">\r\n");
      out.write("                        <img\r\n");
      out.write("                            src=\"background/2.jpg\"\r\n");
      out.write("                            class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("                            <h3>WELCOME TO OUR SHOP</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"carousel-item\">\r\n");
      out.write("                        <img src=\"background/3.jpg\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("                            <h3>WELCOME TO OUR SHOP</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\"\r\n");
      out.write("                   role=\"button\" data-slide=\"prev\"> <span\r\n");
      out.write("                        class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span> <span\r\n");
      out.write("                        class=\"sr-only\">Previous</span>\r\n");
      out.write("                </a> <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\"\r\n");
      out.write("                        role=\"button\" data-slide=\"next\"> <span\r\n");
      out.write("                        class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span> <span\r\n");
      out.write("                        class=\"sr-only\">Next</span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container\" id=\"product\">\r\n");
      out.write("            <div align=\"right\">\r\n");
      out.write("                <form action=\"SortController\" method=\"POST\">\r\n");
      out.write("                    <select  name =\"choose\" >\r\n");
      out.write("                        <option value = \"default\">Default</option>\r\n");
      out.write("                        <option value = \"lowhigh\">Price: Low -> High</option>\r\n");
      out.write("                        <option value = \"highlow\">Price: High -> Low</option>\r\n");
      out.write("                        <option value = \"az\">A -> Z</option>\r\n");
      out.write("                        <option value = \"za\">Z -> A</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <input type=\"submit\" name=\"button\" value=\"Sort\"/>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row row-cols-1 row-cols-md-3\">\r\n");
      out.write("                ");

                    DAO.ItemDAO it = new DAO.ItemDAO();
                    ArrayList<Entities.Itemall> listName = new ArrayList<>();
                    String choose = "";

                    if (request.getParameter("button") == null) {
                        listName = it.getNameOfItems();
                    } else {
                        choose = request.getAttribute("choose").toString();
                        if (choose.equals("default")) {
                            listName = it.getNameOfItems();
                        } else if (choose.equals("lowhigh")) {
                            listName = it.sortItemByPricelowhigh();
                        } else if (choose.equals("highlow")) {
                            listName = it.sortItemByPricehighlow();
                        } else if (choose.equals("az")) {
                            listName = it.sortItemByNameaz();
                        } else if (choose.equals("za")) {
                            listName = it.sortItemByNameza();
                        }
                    }
                    for (Entities.Itemall name : listName) {
                        if (name != null) {
                            out.println("<div class=\"col-sm-4 mb-4\">"
                                    + " <a href='view2.jsp?img=" + name.getiPic() + "&name=" + name.getiName() + "&size=" + name.getSize() + "&price=" + name.getpId() + "&status="
                                    + "" + name.getStatus() + "&quantity=" + name.getQuantity() + "&discount=" + name.getDiscoutnStatus() + "&taste=" + name.getTaste() + ""
                                    + "&expirydate=" + name.getExpiryDate() + "&rId=" + name.getrId() + "' target='_blank'>"
                                    + "<div class='card'>"
                                    + "<img src=\"douong/" + name.getiPic() + "\" class=\"card-img-top\" alt=\"...\">"
                                    + "<div class='card-body'>"
                                    + "</a>"
                                    + "<h4 class='card-title'>" + name.getiName() + "</h4>"
                                    + "<p class='card-text'>Price: " + name.getpId() + "</p>"
                                    + "<a href='view.jsp?buy=" + name.getiId() + "' class=\"btn btn-lg btn-primary btn-block\" target='_blank'>Add to cart</a>"
                                    + "</div>"
                                    + "</div>"
                                    + "</div>");
                        }
                    }
                
      out.write("\r\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems(listName);
      _jspx_th_c_forEach_0.setVar("name");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <div class='card'>\r\n");
            out.write("                        <img src=\"douong/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name.getiPic()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" class=\"card-img-top\" alt=\"...\">\r\n");
            out.write("                                <div class='card-body'>\r\n");
            out.write("                            </a>\r\n");
            out.write("                            <h4 class='card-title'> ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name.getiName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write(" </h4>\r\n");
            out.write("                            <p class='card-text'>Price:  ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ name.getpId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write(" </p>\r\n");
            out.write("                            <a href='view.jsp?buy=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name.getiId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("' class=\"btn btn-lg btn-primary btn-block    \" target='_blank'>Add to cart</a>\r\n");
            out.write("                            </div>\"\r\n");
            out.write("                        </div>\r\n");
            out.write("                    ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <footer>\r\n");
      out.write("            <div class=\"container-fluid padding \">\r\n");
      out.write("                <div class=\"text-center\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <h4>Contact us by: </h4>\r\n");
      out.write("                        <a href=\"https://www.facebook.com/profile.php?id=100033120579664\"><i class=\"fa fa-facebook-square fa-2x\"></i></a>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-instagram fa-2x\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
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
