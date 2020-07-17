<%-- 
    Document   : home
    Created on : Jun 25, 2020, 6:26:59 PM
    Author     : Asus
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DAO.ItemDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <style>
            <%@include file="/css/home.css" %>
        </style>
    </head>
    <body>
        <jsp:include page="header.jsp"/>
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
            <div class="row row-cols-1 row-cols-md-3">
                <div class="col-sm-4 mb-4">
                    <div class="card h-100">
                        <img src="douong/c2.png" class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title">C2</h5>
                            <p class="card-text"></p>
                            <footer>
                                <button class="btn btn-lg btn-primary btn-block">Buy</button>
                            </footer>
                        </div>
                    </div>
                </div>
                <%
                    ArrayList<String> listName = new ItemDAO().getNameOfItems();
                    for (String name : listName) {
                        if (!name.isEmpty()) {
                            out.println("<div class=\"col-sm-4 mb-4\">"
                                    + "<div class=\"card h-100\">"
                                    + "<img src=\"douong/" + name + "\" class=\"card-img-top\" alt=\"...\">"
                                    + "<div class=\"card-body\">"
                                    + "<h5 class=\"card-title\">" + name.substring(0, name.indexOf(".png")) + "</h5>"
                                    + "<p class=\"card-text\"></p>"
                                    + "<footer>"
                                    + "<button class=\"btn btn-lg btn-primary btn-block\">Buy</button>"
                                    + "</footer>"
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
