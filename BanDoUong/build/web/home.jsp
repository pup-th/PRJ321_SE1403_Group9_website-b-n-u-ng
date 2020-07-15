<%-- 
    Document   : home
    Created on : Jun 25, 2020, 6:26:59 PM
    Author     : Asus
--%>

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
            body{
                background: #696969;
                background-image: url('background/snow1.png'), url('background/snow2.png'), url('background/snow3.png');	
                animation: snow 20s linear infinite;
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
                        <img src="background/destop.jpg"
                             class="d-block w-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                            <h5>Hinh 1</h5>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img
                            src="background/destop.jpg"
                            class="d-block w-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                            <h3>Hinh 2</h3>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img src="background/destop.jpg" class="d-block w-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                            <h5>Hinh 3</h5>
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
                    String[] name = {"c2.png", "sting.png", "khongdo.png", "c2.png", "sting.png", "khongdo.png"};
                    for (int i = 0; i < name.length; i++) {
                        out.println("<div class=\"col-sm-4 mb-4\">");
                        out.println("<div class=\"card h-100\">");
                        out.println("<img src=\"douong/" + name[i] + "\" class=\"card-img-top\" alt=\"...\">");
                        out.println("<div class=\"card-body\">");
                        out.println("<h5 class=\"card-title\">" + name[i].substring(0, name[i].indexOf(".png")) + "</h5>");
                        out.println("<p class=\"card-text\"></p>");
                        out.println("<footer>");
                        out.println("<button class=\"btn btn-lg btn-primary btn-block\">Buy</button>");
                        out.println("</footer>");
                        out.println("</div>");
                        out.println("</div>");
                        out.println("</div>");
                    }
                %>
            </div>
        </div>
        <footer>
            <div class="container-fluid padding ">
                <div class="text-center">
                    <div>
                        <h4>Contact us by: </h4>
                        <a href="#"><i class="fa fa-facebook-square fa-2x"></i></a>
                        <a href="#"><i class="fa fa-instagram fa-2x"></i></a>
                    </div>
                </div>
            </div>
        </footer>
    </body>
</html>
