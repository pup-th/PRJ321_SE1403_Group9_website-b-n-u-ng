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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
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
        </style>
    </head>
    <body>
        <jsp:include page="header.jsp"/>
        <div class="container">
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
                                <h5>First slide label</h5>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <img
                                src="background/destop.jpg"
                                class="d-block w-100" alt="...">
                            <div class="carousel-caption d-none d-md-block">
                                <h3>First slide label</h3>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <img src="background/destop.jpg" class="d-block w-100" alt="...">
                            <div class="carousel-caption d-none d-md-block">
                                <h5>First slide label</h5>
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
    </body>
</html>
