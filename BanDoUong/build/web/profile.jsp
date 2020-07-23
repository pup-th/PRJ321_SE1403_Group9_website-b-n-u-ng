
<%@page import="DAO.PriceDAO"%>
<%@page import="DAO.ItemDAO"%>
<%@page import="Controllers.ChangeController"%>
<%@page import="java.nio.charset.StandardCharsets"%>
<%@page import="java.security.MessageDigest"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.ArrayList"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <link href="css/profile.css" rel="stylesheet" type="text/css" media="all"/>
    </head>
    <body>
        <jsp:include page="header.jsp"/>
        <%
            DAO.UserDAO dao = new DAO.UserDAO();
            String user = request.getSession().getAttribute("uMail").toString();
            Entities.Users u = dao.getInfoUser(user);
            String name = u.getuName();
            String mail = u.getuMail();
            String phone = u.getuPhone();
            String address = u.getuAddress();
        %>
        <div class="menu">
            <button onclick="document.getElementById('id01').style.display = 'block'" style="width:auto;">Change Password</button>
            <button onclick="document.getElementById('id02').style.display = 'block'" style="width:auto;">Purchase History</button>
        </div>
        <form class="modal-content animate" action="ChangeController" method="post">
            <h2 align="center">Change Profile</h2>
            <input type="hidden" name="omail" value="<%= mail%>"/>
            <div class="container">
                <label for="uname"><b>Full Name</b></label>
                <input type="text" placeholder="Enter Full Name" name="nname" required value="<%= name%>"/>

                <label for="psw"><b>Email</b></label>
                <input type="text" placeholder="Enter Email" name="nmail" required value="<%= mail%>"/>

                <label for="psw"><b>Phone</b></label>
                <input type="text" placeholder="Enter Phone" name="nphone" required value="<%= phone%>"/>

                <label for="psw"><b>Address</b></label>
                <input type="text" placeholder="Enter Address" name="naddress" required value="<%= address%>"/>

                <button type="submit" name="btnSave">Save</button>
            </div>
        </form>
        <!--</div>-->
        <script>
            // Get the modal
            var modal = document.getElementById('id01');
            // When the user clicks anywhere outside of the modal, close it
            window.onclick = function (event) {
                if (event.target == modal) {
                    modal.style.display = "none";
                }
            }
        </script>
        <%
            String oldpass = dao.getPassword(mail);
        %>
        <div id="id01" class="modal">
            <form class="modal-content animate" action="PasswordController" method="post">
                <input type="hidden" name="omail" value="<%= mail%>"/>
                <input type="hidden" name="checkopass" value="<%= oldpass%>"/>
                <div class="imgcontainer">
                    <span onclick="document.getElementById('id01').style.display = 'none'" class="close" title="Close Modal">&times;</span>
                </div>
                <input type="hidden" name="omail" value="<%= mail%>"/>
                <div class="container">
                    <label for="uname"><b>Old Password</b></label>
                    <input type="text" placeholder="Enter Old Password" name="opass" required>

                    <label for="psw"><b>New Password</b></label>
                    <input type="text" placeholder="Enter New Password" name="npass" required>

                    <label for="psw"><b>Confirm Password</b></label>
                    <input type="text" placeholder="Enter Confirm Password" name="cpass" required>
                    <button type="submit" name="btnChange">Change</button>
                </div>
                <div class="container" style="background-color:#f1f1f1">
                    <button type="button" onclick="document.getElementById('id01').style.display = 'none'" class="cancelbtn">Cancel</button>
                </div>
            </form>
        </div>
        <script>
            // Get the modal
            var modal = document.getElementById('id01');
            // When the user clicks anywhere outside of the modal, close it
            window.onclick = function (event) {
                if (event.target == modal) {
                    modal.style.display = "none";
                }
            }
        </script>
        <div id="id02" class="modal">
            <form class="modal-content animate" method="post">
                <div class="imgcontainer">
                    <span onclick="document.getElementById('id02').style.display = 'none'" class="close" title="Close Modal">&times;</span>
                </div>
                <div class="container">
                    <table class="tableorder">
                        <%
                            ArrayList<Entities.OrderDetail> listorder = dao.getHisPurchase(mail);
                            ItemDAO iDAO = new ItemDAO();
                            PriceDAO priceDAO = new PriceDAO();
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
                            int to = 0;
                            for (Entities.OrderDetail elem : listorder) {
                                
                                out.println("<tr align='center'>");
                                out.println("<td>" + count++ + "</td>");
                                out.println("<td>" + iDAO.getItemById(elem.getiId()).getiName() + "</td>");
                                out.println("<td>" + elem.getQuantity() + "</td>");
                                out.println("<td>" + priceDAO.getPriceByPId(iDAO.getItemById(elem.getiId()).getpId()) + "</td>");
                                out.println("<td>" + sdf.format(elem.getOrderDate()) + "</td>");
                                out.println("<td>" + priceDAO.getPriceByPId(iDAO.getItemById(elem.getiId()).getpId())*elem.getQuantity() + "</td>");
                                to += priceDAO.getPriceByPId(iDAO.getItemById(elem.getiId()).getpId())*elem.getQuantity();
                                out.println("<tr>");
                            }
                            out.println("<tr align='center'>");
                                out.println("<td></td>");
                                out.println("<td></td>");
                                out.println("<td></td>");
                                out.println("<td></td>");
                                out.println("<td>Total:</td>");
                                out.println("<td>"+to+"</td>");
                                out.println("<tr>");
                        %>
                    </table>
                </div>
                <div class="container" style="background-color:#f1f1f1">
                    <button type="button" onclick="document.getElementById('id02').style.display = 'none'" class="cancelbtn">Cancel</button>
                </div>
            </form>
        </div>
        <script>
            // Get the modal
            var modal = document.getElementById('id02');
            // When the user clicks anywhere outside of the modal, close it
            window.onclick = function (event) {
                if (event.target == modal) {
                    modal.style.display = "none";
                }
            }
        </script>
    </body>       
</html>
