<%-- 
    Document   : header.jsp
    Created on : Jul 2, 2020, 8:32:10 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style>


            .navbar .nav-link{
                font-size: 15px;
                padding: 0 20px !important;
            }

            .navbar-toogler{
                outline: none;
            }

            .bg-black{
                background: #100100100;
            }   
            body{
                font-family: Helvetica, Arial, sans-serif;
            }
        </style>
    </head>
    <body>
        <nav class="navbar navbar-expand-sm navbar-dark bg-black fixed-top">
            <div class="container">
                <a href="#" class="navbar-brand">GroupChin</a>
                <button class="navbar-toggler" data-toggle="collapse"
                        data-target="#navbarCollapse">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <ul class="navbar-nav ml-auto ">
                        <li class="nav-item"><a href="home.jsp" class="nav-link">HOME</a></li>
                        <li class="nav-item"><a href="#" class="nav-link">CART</a></li>
                        <li class="nav-item"><a href="#" class="nav-link">ABOUT US</a></li>
                        <li class="nav-item"><a href="login.jsp" class="nav-link">LOGIN</a></li>
                    </ul> 
<!--                    <div class="dropdown dropleft">
                        <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" style="background: white;color: black">
                            Search
                        </button>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="#">Link 1</a>
                            <a class="dropdown-item">
                                <form class="form-inline">
                                    <input class="form-control mr-sm-2" type="text" placeholder="Search">
                                    <button class="btn btn-success" type="submit">Search</button>
                                </form>
                            </a>
                        </div>
                    </div>-->

                </div>
<!--                <div class="dropdown float-right">
                    <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
                        Drop button
                    </button>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="#">Link 1</a>
                        <a class="dropdown-item" href="#">Link 2</a>
                    </div>
                </div>-->
            </div>
        </nav>


</html>