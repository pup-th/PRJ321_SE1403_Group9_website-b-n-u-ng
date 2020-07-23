package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Entities.Itemall;
import java.sql.Date;
import Entities.Items;
import DAO.ItemDAO;

public final class view2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_end_begin.release();
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
      out.write("        <title>content</title>\n");
      out.write("        <link href=\"css/productdetail.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("        <link href=\"https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css\" rel=\"stylesheet\"> \n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\"> <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script>//<![CDATA[\n");
      out.write("            $('input.input-qty').each(function () {\n");
      out.write("                var $this = $(this),\n");
      out.write("                        qty = $this.parent().find('.is-form'),\n");
      out.write("                        min = Number($this.attr('min')),\n");
      out.write("                        max = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("    ,\n");
      out.write("                        if (min == 0) {\n");
      out.write("                    var d = 0\n");
      out.write("                } else\n");
      out.write("                    d = min\n");
      out.write("                $(qty).on('click', function () {\n");
      out.write("                    if ($(this).hasClass('minus')) {\n");
      out.write("                        if (d > min)\n");
      out.write("                            d += -1\n");
      out.write("                    } else if ($(this).hasClass('plus')) {\n");
      out.write("                        var x = Number($this.val()) + 1\n");
      out.write("                        if (x <= max)\n");
      out.write("                            d += 1\n");
      out.write("                    }\n");
      out.write("                    $this.attr('value', d).val(d)\n");
      out.write("                })\n");
      out.write("            })\n");
      out.write("//]]></script>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            DAO.ItemDAO itemdao = new ItemDAO();
            int id = 1;
//            if(request.getAttribute("idpro")!=null){
//                id=Integer.parseInt(request.getAttribute("idpro").toString());
//            }
//            else{
//                id= Integer.parseInt(request.getParameter("idpro"));
//            }
            Itemall iall = itemdao.getNameOfItem(id);
            String img = iall.getiPic();
            String size = iall.getSize();
            int price = iall.getOutputPrice();
            int quantity = iall.getQuantity();
            int rId = iall.getrId();
            int discount = iall.getDiscoutnStatus();
            int status = iall.getStatus();
            String taste = iall.getTaste();
            Date expirydate = iall.getExpiryDate();
            String name = iall.getiName();
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"bod\">\n");
      out.write("                <div class=\"card\"> \n");
      out.write("                    <div class=\"container-fliud\"> \n");
      out.write("                        <div class=\"wrapper row\"> \n");
      out.write("                            <div class=\"preview col-md-6\"> \n");
      out.write("                                <div class=\"preview-pic tab-content\"> \n");
      out.write("                                    <div class=\"tab-pane active\" id=\"pic-1\"><img src=\"douong/");
      out.print( img);
      out.write("\" alt=\"\">\n");
      out.write("                                    </div> \n");
      out.write("                                </div> \n");
      out.write("                            </div> \n");
      out.write("                            <div class=\"details col-md-6\"> \n");
      out.write("                                <h3 class=\"product-title\">");
      out.print( name);
      out.write("</h3> \n");
      out.write("                                <div class=\"rating\"> \n");
      out.write("                                    <div class=\"stars\"> \n");
      out.write("                                        5.0 \n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("</br>\n");
      out.write("                                        </br>\n");
      out.write("                                    </div>   \n");
      out.write("                                    <div>\n");
      out.write("                                        <h2 class=\"pricei\">Price: ");
      out.print( price);
      out.write(" đ</h2>\n");
      out.write("                                    </div>\n");
      out.write("                                    <h5 class=\"sizes\">Size: <span  data-toggle=\"tooltip\" title=\"small\">");
      out.print( size);
      out.write("</span> \n");
      out.write("                                    </h5>\n");
      out.write("                                    <h5>Taste: ");
      out.print( taste);
      out.write("</h5>\n");
      out.write("                                    <h5>Expiry Date: ");
      out.print( expirydate);
      out.write("</h5>\n");
      out.write("                                    <form action=\"CartController\" method=\"post\">\n");
      out.write("                                        <div class=\"action\">\n");
      out.write("                                            <!--<button class=\"add-to-cart btn btn-default\" type=\"button\" name=\"addcart\">ADD TO CART</button>-->\n");
      out.write("                                            <h5>Quantity: <input max=\"");
      out.print(quantity);
      out.write("\" min=\"1\" name=\"cartQuantity\" type=\"number\" value=\"1\"></h5>\n");
      out.write("                                            <input type=\"hidden\" value=\"");
      out.print(id);
      out.write("\" name=\"cartId\"/>\n");
      out.write("                                            <input type=\"submit\" value=\"Add To Cart\" name=\"btnAddcart\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div> \n");
      out.write("                            </div> \n");
      out.write("                        </div> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setBegin(1);
    _jspx_th_c_forEach_0.setEnd(5);
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <span class=\"fa fa-star checked\"></span>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_end_begin.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
