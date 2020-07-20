package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class view2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>content</title>\n");
      out.write("        <style>\n");
      out.write("            body {  \n");
      out.write("                font-family:Arial, Helvetica, sans-serif;   \n");
      out.write("                overflow-x: hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            img {   \n");
      out.write("                max-width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .preview {  \n");
      out.write("                display: -webkit-box;   \n");
      out.write("                display: -webkit-flex;  \n");
      out.write("                display: -ms-flexbox;   \n");
      out.write("                display: flex;  \n");
      out.write("                -webkit-box-orient: vertical;   \n");
      out.write("                -webkit-box-direction: normal;  \n");
      out.write("                -webkit-flex-direction: column; \n");
      out.write("                -ms-flex-direction: column; \n");
      out.write("                flex-direction: column;\n");
      out.write("            } \n");
      out.write("\n");
      out.write("            @media screen and (max-width: 996px) { \n");
      out.write("                .preview { \n");
      out.write("                    margin-bottom: 20px;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .preview-pic {  \n");
      out.write("                -webkit-box-flex: 1;    \n");
      out.write("                -webkit-flex-grow: 1;   \n");
      out.write("                -ms-flex-positive: 1;   \n");
      out.write("                flex-grow: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .preview-thumbnail.nav-tabs {   \n");
      out.write("                border: none;   \n");
      out.write("                margin-top: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .preview-thumbnail.nav-tabs li {    \n");
      out.write("                width: 18%; \n");
      out.write("                margin-right: 2.5%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .preview-thumbnail.nav-tabs li img {    \n");
      out.write("                max-width: 100%;    \n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .preview-thumbnail.nav-tabs li a {  \n");
      out.write("                padding: 0; \n");
      out.write("                margin: 0;  \n");
      out.write("                cursor:pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .preview-thumbnail.nav-tabs li:last-of-type {   \n");
      out.write("                margin-right: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .tab-content {  \n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .tab-content img {  \n");
      out.write("                width: 100%;    \n");
      out.write("                -webkit-animation-name: opacity;    \n");
      out.write("                animation-name: opacity; \n");
      out.write("                -webkit-animation-duration: .3s; \n");
      out.write("                animation-duration: .3s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card { \n");
      out.write("                margin-top: 0px;    \n");
      out.write("                background: #eee;   \n");
      out.write("                padding: 3em;   \n");
      out.write("                line-height: 1.5em;\n");
      out.write("            } \n");
      out.write("\n");
      out.write("            @media screen and (min-width: 997px) { \n");
      out.write("                .wrapper { \n");
      out.write("                    display: -webkit-box; \n");
      out.write("                    display: -webkit-flex; \n");
      out.write("                    display: -ms-flexbox; \n");
      out.write("                    display: flex;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .details {  \n");
      out.write("                display: -webkit-box;\n");
      out.write("                display: -webkit-flex;  \n");
      out.write("                display: -ms-flexbox;   \n");
      out.write("                display: flex;  \n");
      out.write("                -webkit-box-orient: vertical;   \n");
      out.write("                -webkit-box-direction: normal;  \n");
      out.write("                -webkit-flex-direction: column; \n");
      out.write("                -ms-flex-direction: column; \n");
      out.write("                flex-direction: column;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .colors {   \n");
      out.write("                -webkit-box-flex: 1;    \n");
      out.write("                -webkit-flex-grow: 1;   \n");
      out.write("                -ms-flex-positive: 1;   \n");
      out.write("                flex-grow: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .product-title, .price, .sizes, .colors {   \n");
      out.write("                text-transform: UPPERCASE;  \n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .checked, .price span { \n");
      out.write("                color: #ff9f1a;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .product-title, .rating, .product-description, .price, .vote, .sizes {  \n");
      out.write("                margin-bottom: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .product-title {    \n");
      out.write("                margin-top: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .size {\n");
      out.write("                margin-right: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .size:first-of-type {   \n");
      out.write("                margin-left: 40px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .color {    \n");
      out.write("                display: inline-block;  \n");
      out.write("                vertical-align: middle; \n");
      out.write("                margin-right: 10px; \n");
      out.write("                height: 2em;    \n");
      out.write("                width: 2em; \n");
      out.write("                border-radius: 2px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .color:first-of-type {  \n");
      out.write("                margin-left: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .add-to-cart, .like {   \n");
      out.write("                background: #ff9f1a;    \n");
      out.write("                padding: 1.2em 1.5em;   \n");
      out.write("                border: none;   \n");
      out.write("                text-transform: UPPERCASE;  \n");
      out.write("                font-weight: bold;  \n");
      out.write("                color: #fff;    \n");
      out.write("                text-decoration:none; \n");
      out.write("                -webkit-transition: background .3s ease; \n");
      out.write("                transition: background .3s ease;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .add-to-cart:hover, .like:hover {   \n");
      out.write("                background: #b36800;    \n");
      out.write("                color: #fff;    \n");
      out.write("                text-decoration:none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .not-available {    \n");
      out.write("                text-align: center; \n");
      out.write("                line-height: 2em;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .not-available:before { \n");
      out.write("                font-family: fontawesome;   \n");
      out.write("                content: \"\\f00d\";   \n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .orange {   \n");
      out.write("                background: #ff9f1a;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .green {    \n");
      out.write("                background: #85ad00;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .blue { \n");
      out.write("                background: #0076ad;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .tooltip-inner {    \n");
      out.write("                padding: 1.3em;\n");
      out.write("            } \n");
      out.write("\n");
      out.write("            @-webkit-keyframes opacity { \n");
      out.write("                0% { opacity: 0; -webkit-transform: scale(3); transform: scale(3);} \n");
      out.write("                100% { opacity: 1; -webkit-transform: scale(1); transform: scale(1);}\n");
      out.write("            } \n");
      out.write("\n");
      out.write("            @keyframes opacity { \n");
      out.write("                0% { opacity: 0; -webkit-transform: scale(3); transform: scale(3);} \n");
      out.write("                100% { opacity: 1; -webkit-transform: scale(1); transform: scale(1);}\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link href=\"https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css\" rel=\"stylesheet\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\"> <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String img = request.getParameter("img");
            String size = request.getParameter("size");
            String price = request.getParameter("price");
            String quantity = request.getParameter("quantity");
            String rId = request.getParameter("rId");
            String discount = request.getParameter("discount");
            String status = request.getParameter("status");
            String taste = request.getParameter("taste");
            String expirydate = request.getParameter("expirydate");
            String name = request.getParameter("name");
        
      out.write("\n");
      out.write("        <div class=\"container\"> \n");
      out.write("            <div class=\"card\"> \n");
      out.write("                <div class=\"container-fliud\"> \n");
      out.write("                    <div class=\"wrapper row\"> \n");
      out.write("                        <div class=\"preview col-md-6\"> \n");
      out.write("                            <div class=\"preview-pic tab-content\"> \n");
      out.write("                                <div class=\"tab-pane active\" id=\"pic-1\"><img src=\"douong/");
      out.print( img );
      out.write("\" alt=\"\">\n");
      out.write("                                </div> \n");
      out.write("                            </div> \n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"details col-md-6\"> \n");
      out.write("                            <h3 class=\"product-title\">Thời trang cho bé trai nhiều màu sắc ngộ nghĩnh</h3> \n");
      out.write("                            <div class=\"rating\"> \n");
      out.write("                                <div class=\"stars\"> <span class=\"fa fa-star checked\"></span> <span class=\"fa fa-star checked\"></span> <span class=\"fa fa-star checked\"></span> <span class=\"fa fa-star\"></span> <span class=\"fa fa-star\"></span> \n");
      out.write("                                </div> <span class=\"review-no\">123 đánh giá</span> \n");
      out.write("                            </div> \n");
      out.write("                            <p class=\"product-description\">Với trang phục này mẹ có thể cùng bé diện đi chơi, đi học đều rất phù hợp. Khi bé mặc vào, chắc chắn mẹ sẽ có cảm nhận hoàn toàn khác biệt vì màu sắc phong phú không chỉ khiến bộ trang phục trở nên bắt mắt mà còn tôn thêm vẻ nhí nhảnh, nghịch ngợm và năng động của các bé trai.            Khi diện những bộ thời trang cho bé trai ngộ nghĩnh này, mẹ đừng quên kèm theo cho bé một số phụ kiện phù hợp như mũ lưỡi trai cá tính, nón kết sành điệu, kính mát “cực ngầu” hay giày bata năng động nhé!            Chúc con yêu của bạn có thêm những bộ đồ thời trang cho bé trai theo phong cách đa màu sắc cực xinh xắn và đáng yêu!</p> \n");
      out.write("                            <h4 class=\"price\">Price: </h4> \n");
      out.write("                            <p class=\"vote\"><strong>91%</strong> of người mua hài lòng với sản phẩm này <strong>(87 bình chọn)</strong>\n");
      out.write("                            </p> \n");
      out.write("                            <h5 class=\"sizes\">Kích cỡ: <span class=\"size\" data-toggle=\"tooltip\" title=\"small\">s</span> <span class=\"size\" data-toggle=\"tooltip\" title=\"medium\">m</span> <span class=\"size\" data-toggle=\"tooltip\" title=\"large\">l</span> <span class=\"size\" data-toggle=\"tooltip\" title=\"xtra large\">xl</span> \n");
      out.write("                            </h5> \n");
      out.write("                            <h5 class=\"colors\">Màu: <span class=\"color orange not-available\" data-toggle=\"tooltip\" title=\"Not In store\"></span> <span class=\"color green\"></span> <span class=\"color blue\"></span> \n");
      out.write("                            </h5> \n");
      out.write("                            <div class=\"action\"> <a href=\"http://hocwebgiare.com/\" target=\"_blank\">            <button class=\"add-to-cart btn btn-default\" type=\"button\">MUA NGAY</button>            </a> <a href=\"http://hocwebgiare.com/\" target=\"_blank\">            <button class=\"like btn btn-default\" type=\"button\"><span class=\"fa fa-heart\"></span></button>            </a> \n");
      out.write("                            </div> \n");
      out.write("                        </div> \n");
      out.write("                    </div> \n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("        </div> \n");
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
}