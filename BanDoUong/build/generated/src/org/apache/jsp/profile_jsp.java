package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controllers.ChangeController;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

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
      response.setContentType("text/html");
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"css/profile.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        ");

            DAO.UserDAO dao = new DAO.UserDAO();
            String user = request.getSession().getAttribute("uMail").toString();
            Entities.Users u = dao.getInfoUser(user);
            String name = u.getuName();
            String mail = u.getuMail();
            String phone = u.getuPhone();
            String address = u.getuAddress();
        
      out.write("\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <button onclick=\"document.getElementById('id01').style.display = 'block'\" style=\"width:auto;\">Change Password</button>\n");
      out.write("            <button onclick=\"document.getElementById('id02').style.display = 'block'\" style=\"width:auto;\">Purchase History</button>\n");
      out.write("        </div>\n");
      out.write("        <form class=\"modal-content animate\" action=\"ChangeController\" method=\"post\">\n");
      out.write("            <h2 align=\"center\">Change Profile</h2>\n");
      out.write("            <input type=\"hidden\" name=\"omail\" value=\"");
      out.print( mail);
      out.write("\"/>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <label for=\"uname\"><b>Full Name</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Full Name\" name=\"nname\" required value=\"");
      out.print( name);
      out.write("\"/>\n");
      out.write("\n");
      out.write("                <label for=\"psw\"><b>Email</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Email\" name=\"nmail\" required value=\"");
      out.print( mail);
      out.write("\"/>\n");
      out.write("\n");
      out.write("                <label for=\"psw\"><b>Phone</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Phone\" name=\"nphone\" required value=\"");
      out.print( phone);
      out.write("\"/>\n");
      out.write("\n");
      out.write("                <label for=\"psw\"><b>Address</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Address\" name=\"naddress\" required value=\"");
      out.print( address);
      out.write("\"/>\n");
      out.write("\n");
      out.write("                <button type=\"submit\" name=\"btnSave\">Save</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <!--</div>-->\n");
      out.write("        <script>\n");
      out.write("            // Get the modal\n");
      out.write("            var modal = document.getElementById('id01');\n");
      out.write("            // When the user clicks anywhere outside of the modal, close it\n");
      out.write("            window.onclick = function (event) {\n");
      out.write("                if (event.target == modal) {\n");
      out.write("                    modal.style.display = \"none\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        ");

            String oldpass = dao.getPassword(mail);
        
      out.write("\n");
      out.write("        <div id=\"id01\" class=\"modal\">\n");
      out.write("            <form class=\"modal-content animate\" action=\"PasswordController\" method=\"post\">\n");
      out.write("                <input type=\"hidden\" name=\"omail\" value=\"");
      out.print( mail);
      out.write("\"/>\n");
      out.write("                <input type=\"hidden\" name=\"checkopass\" value=\"");
      out.print( oldpass);
      out.write("\"/>\n");
      out.write("                <div class=\"imgcontainer\">\n");
      out.write("                    <span onclick=\"document.getElementById('id01').style.display = 'none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("                </div>\n");
      out.write("                <input type=\"hidden\" name=\"omail\" value=\"");
      out.print( mail);
      out.write("\"/>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <label for=\"uname\"><b>Old Password</b></label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter Old Password\" name=\"opass\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"psw\"><b>New Password</b></label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter New Password\" name=\"npass\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"psw\"><b>Confirm Password</b></label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter Confirm Password\" name=\"cpass\" required>\n");
      out.write("                    <button type=\"submit\" name=\"btnChange\">Change</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container\" style=\"background-color:#f1f1f1\">\n");
      out.write("                    <button type=\"button\" onclick=\"document.getElementById('id01').style.display = 'none'\" class=\"cancelbtn\">Cancel</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            // Get the modal\n");
      out.write("            var modal = document.getElementById('id01');\n");
      out.write("            // When the user clicks anywhere outside of the modal, close it\n");
      out.write("            window.onclick = function (event) {\n");
      out.write("                if (event.target == modal) {\n");
      out.write("                    modal.style.display = \"none\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <div id=\"id02\" class=\"modal\">\n");
      out.write("            <form class=\"modal-content animate\" method=\"post\">\n");
      out.write("                <div class=\"imgcontainer\">\n");
      out.write("                    <span onclick=\"document.getElementById('id02').style.display = 'none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <table class=\"tableorder\">\n");
      out.write("                        ");

                            ArrayList<Entities.Orders> listorder = dao.getHisPurchase(mail);
                            int count = 1;
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
                            out.println("<tr align='center'>");
                            out.println("<th>No.</th>");
                            out.println("<th>Item Name</th>");
                            out.println("<th>Quantity</th>");
                            out.println("<th>Price</th>");
                            out.println("<th>Order Date</th>");
                            out.println("<th>Total</th>");
                            out.println("</tr>");
                            for (Entities.Orders elem : listorder) {
                                out.println("<tr align='center'>");
                                out.println("<td>" + count++ + "</td>");
                                out.println("<td>" + elem.getName() + "</td>");
                                out.println("<td>" + elem.getQuantity() + "</td>");
                                out.println("<td>" + elem.getIprice() + "</td>");
                                out.println("<td>" + sdf.format(elem.getDate()) + "</td>");
                                out.println("<td>" + elem.getTotal() + "</td>");
                                out.println("<tr>");
                            }

                        
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container\" style=\"background-color:#f1f1f1\">\n");
      out.write("                    <button type=\"button\" onclick=\"document.getElementById('id02').style.display = 'none'\" class=\"cancelbtn\">Cancel</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            // Get the modal\n");
      out.write("            var modal = document.getElementById('id02');\n");
      out.write("            // When the user clicks anywhere outside of the modal, close it\n");
      out.write("            window.onclick = function (event) {\n");
      out.write("                if (event.target == modal) {\n");
      out.write("                    modal.style.display = \"none\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>       \n");
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
