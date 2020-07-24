<%-- 
    Document   : home
    Created on : Jun 25, 2020, 6:26:59 PM
    Author     : Asus
--%>

<%@page import="Entities.Items"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.ItemDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <style>
            body{
                background: #fff;
                /*                background-image: url('background/snow1.png'), url('background/snow2.png'), url('background/snow3.png');	
                                animation: snow 20s linear infinite;*/
                background-image: url('background/a.png')
            }

            @keyframes snow {
                0% {background-position: 0px 0px, 0px 0px, 0px 0px;}
                100% {background-position: 500px 1000px, 400px 400px, 300px 300px;}
            }
            #container{
                margin-top: 55px;
            }
            #product{
                padding-top: 20px;
            }
        </style>
    </head>
    <body>
        <jsp:include page="header.jsp"/>
        <%
            String fail = "";
            try {
                fail= request.getSession().getAttribute("cartFail").toString();
                } catch (Exception e) {
                }
        %>
        <c:if test="<%=fail != null%>">
            <div class="alert alert-info alert-dismissible fade show">
                <button type="button" class="close" data-dismiss="alert">&times;</button>
                <strong>Info!</strong> This alert box could indicate a neutral informative change or action.
            </div>
        </c:if>
        <div class="container" id="container">
            <div id="carouselExampleIndicators" class="carousel slide"
                 data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0"
                        class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>

                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="background/1.jpg"
                             class="d-block w-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                            <h3>WELCOME TO OUR SHOP</h3>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img
                            src="background/2.jpg"
                            class="d-block w-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                            <h3>WELCOME TO OUR SHOP</h3>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img src="background/3.jpg" class="d-block w-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                            <h3>WELCOME TO OUR SHOP</h3>
                        </div>
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleIndicators"
                   role="button" data-slide="prev"> <span
                        class="carousel-control-prev-icon" aria-hidden="true"></span> <span
                        class="sr-only">Previous</span>
                </a> <a class="carousel-control-next" href="#carouselExampleIndicators"
                        role="button" data-slide="next"> <span
                        class="carousel-control-next-icon" aria-hidden="true"></span> <span
                        class="sr-only">Next</span>
                </a>
            </div>
        </div>
        <div class="container" id="product">
            <div align="right">
                <form action="SortController" method="POST">
                    <select  name ="choose" >
                        <option value = "default">Default</option>
                        <option value = "lowhigh">Price: Low -> High</option>
                        <option value = "highlow">Price: High -> Low</option>
                        <option value = "az">A -> Z</option>
                        <option value = "za">Z -> A</option>
                    </select>
                    <input type="submit" name="button" value="Sort"/>
                </form>
            </div>
            <div class="row row-cols-1 row-cols-md-3">
                <%
                    DAO.ItemDAO it = new DAO.ItemDAO();
                    ArrayList<Entities.Items> listName = new ArrayList<>();
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
                    for (Entities.Items name : listName) {
                        if (name != null) {
                            out.println("<div class=\"col-sm-4 mb-4\">"
                                    + " <a href='view2.jsp?idProductFromHome=" + name.getiId() + "'>"
                                    + "<div class='card'>"
                                    + "<img src=\"douong/" + name.getImg() + "\" class=\"card-img-top\" alt=\"...\">"
                                    + "<div class='card-body'>"
                                    + "</a>"
                                    + "<h4 class='card-title'>" + name.getName() + "</h4>"
                                    + "<h6 class='card-text'>Price: " + name.getPrice() + "</h6>"
                                    + "</div>"
                                    + "</div>"
                                    + "</div>");
                        }
                    }
                %>
            </div>
        </div>
        <footer>
            <div class="container-fluid padding ">
                <div class="text-center">
                    <div>
                        <h4>Contact us by: </h4>
                        <a href="https://www.facebook.com/profile.php?id=100033120579664"><i class="fa fa-facebook-square fa-2x"></i></a>
                        <a href="#"><i class="fa fa-instagram fa-2x"></i></a>
                    </div>
                </div>
            </div>
        </footer>
    </body>
</html>
