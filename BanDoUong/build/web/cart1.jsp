<%-- 
    Document   : cart
    Created on : Jul 22, 2020, 6:55:06 PM
    Author     : Asus
--%>

<%@page import="java.util.HashMap"%>
<%@page import="DAO.ItemDAO"%>
<%@page import="DAO.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>E Shop Cart Widget A Flat Responsive Widget Template :: W3layouts</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <link href="css/profile.css" rel="stylesheet" type="text/css" media="all"/>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="E Shop Cart Widget Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Android Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <link rel="stylesheet" href="css/cart.css" type="text/css" media="all" />
        <script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
        <script src="./src/bootstrap-input-spinner.js"></script>
        <script>
            $("input[type='number']").inputSpinner()
        </script>
        <script>
            $(document).ready(function (c) {
                $('.alert-close1').on('click', function (c) {
                    $('.close1').fadeOut('slow', function (c) {
                        $('.close1').remove();
                    });
                });
            });
        </script>
        <script>$(document).ready(function (c) {
                $('.alert-close2').on('click', function (c) {
                    $('.close2').fadeOut('slow', function (c) {
                        $('.close2').remove();
                    });
                });
            });
        </script>
        <script>$(document).ready(function (c) {
                $('.alert-close3').on('click', function (c) {
                    $('.close3').fadeOut('slow', function (c) {
                        $('.close3').remove();
                    });
                });
            });
        </script>
        <style>
            #con{
                margin-top: 70px;
            }
            .tableorder{
                height: 20%;
                width: 100%;
            }
        </style>
    </head>
    <body>
        <%
            DAO.ItemDAO itemdao = new ItemDAO();
            Entities.Itemall itemall = itemdao.getNameOfItem(1);
            String name = itemall.getiName();
            int price = itemall.getOutputPrice();
            int total = 0;

        %>
        <%@include file="header.jsp" %>
        <div class="container" id="con">
            <div class="main-bar">
                <div class="product">
                    <h3>Product</h3>
                </div>
                <div class="quantity">
                    <h3>Quantity</h3>
                </div>
                <div class="price">
                    <h3>Price</h3>
                </div>
                <div class="clear"></div>
            </div>
            <div>
                <%                    HashMap<Integer, Integer> map = (HashMap) request.getSession().getAttribute("hashMapItemCart");
                    if (request.getParameter("delIdHash") != null) {
                        map.remove(Integer.parseInt(request.getParameter("delIdHash")));
                    }
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
                                + "<a href='?delIdHash=" + item.getiId() + "'> <i class='fa fa-trash' style ='font-size:24px;color:red'></i></a>"
                                + "<div class='clear'></div>"
                                + "</div>"
                                + "</div>"
                                + "</div>");
                        total += (item.getOutputPrice() * hashquantity);
                    }
                %>
            </div>
            <div class="total">
                <div class="total1">Total Price</div>
                <div class="total2"><%= total%></div>
                <div class="clear"></div>
            </div>
            <div class="checkout">
                <div class="add">
                    <div class="checkout-btn">
                        <div class="menu">
                            <button onclick="document.getElementById('id02').style.display = 'block'" style="width:auto;">Buy</button>
                        </div>
                    </div>
                </div>
                <div class="clear"></div>
            </div>
        </div>
        <div id="id02" class="modal">
            <form class="modal-content animate" method="post">
                <div class="imgcontainer">
                    <!--<span onclick="document.getElementById('id02').style.display = 'none'" class="close" title="Close Modal">&times;</span>-->  
                </div>
                <div class="container1">
                    <table class="tableorder">
                        <%
                            out.println("<tr align='center'>");
                            out.println("<th>No.</th>");
                            out.println("<th>Item Name</th>");
                            out.println("<th>Quantity</th>");
                            out.println("<th>Price</th>");
                            out.println("<th>Total</th>");
                            out.println("</tr>");
                            int number = 1;
                            for (Integer i : map.keySet()) {
                                int hashid = i;
                                int hashquantity = map.get(i);
                                Entities.Itemall item = idao.getNameOfItem(hashid);
                                out.print("<tr align='center'>"
                                        + "<td>" + (number++) + "</td>"
                                        + "<td>" + item.getiName() + "</td>"
                                        + "<td>" + hashquantity + "</td>"
                                        + "<td>" + item.getOutputPrice() + "</td>"
                                        + "<td>" + hashquantity * item.getOutputPrice() + "</td>"
                                        + "</tr>"
                                );
                                total += (item.getOutputPrice() * hashquantity);
                            }
                        %>
                    </table>
                </div>
                <form action="" method="POST">
                    <button type="submit" name="btnBuyForBill">Buy</button>
                    <button type="button" onclick="document.getElementById('id02').style.display = 'none'" class="cancelbtn">Cancel</button>
                </form>
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
