<%-- 
    Document   : header.jsp
    Created on : Jul 2, 2020, 8:32:10 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style>
            <%@include file="/css/header.css" %>
        </style>
    </head>
    <body>
        <%
            if (request.getAttribute("username") != null) {
                String email = request.getAttribute("emailName").toString();
                String s = email.substring(0, email.indexOf("@"));
            }
        %>
        <nav class="navbar navbar-expand-sm navbar-dark bg-black fixed-top" id="header">
            <div class="container">
                <a href="home.jsp" class="navbar-brand">GroupChin</a>
                <button class="navbar-toggler" data-toggle="collapse"
                        data-target="#navbarCollapse">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <ul class="navbar-nav ml-auto ">
                        <li class="nav-item"><a href="home.jsp" class="nav-link">HOME</a></li>
                        <li class="nav-item"><a href="#" class="nav-link">CART</a></li>
                        <li class="nav-item"><a href="aboutus.jsp" class="nav-link">ABOUT US</a></li>
                        <li class="nav-item">
                            <div class="dropdown navbar-nav ml-auto ">
                                <a class="nav-link" href="#" data-toggle="dropdown">ACCOUNT</a>
                                <div class="dropdown-menu">
                                    <a class="dropdown-item" href="login.jsp">Sign in</a>
                                    <a class="dropdown-item" href="#">Profile</a>
                                    <a class="dropdown-item" href="#">Sign out</a>
                                </div>
                            </div>                            
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </body>
</html>