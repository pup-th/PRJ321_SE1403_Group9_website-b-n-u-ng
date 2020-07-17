<%-- 
    Document   : register
    Created on : Jul 15, 2020, 8:59:13 PM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" 
              integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" 
              crossorigin="anonymous">
        <meta name="google-signin-client_id" content="559443797881-d6drq7akg8ki94d777tu66a43cj4v061.apps.googleusercontent.com"/>
        <script src="https://apis.google.com/js/platform.js" async defer></script>
    </head>
    <style>
        <%@include file="/css/register.css" %>
    </style>
    <body>
        <div class="container" id="con">
            <form class="form-signin">          
                <h1 class="h3 mb-3 font-weight-normal">Register</h1>
                <label for="inputEmail" class="sr-only">Email</label>
                <input type="email" id="inputEmail" class="form-control" placeholder="Email" required autofocus>

                <label for="inputPassword" class="sr-only">Password</label>
                <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>

                <label for="inputName" class="sr-only">Real name</label>
                <input type="text" id="inputName" class="form-control" placeholder="Real Name" required>

                <label for="inputPhone" class="sr-only">Phone number</label>
                <input type="text" id="inputPhone" class="form-control" placeholder="Phone number" required>

                <label for="inputAddress" class="sr-only">Address</label>
                <input type="text" id="inputAddress" class="form-control" placeholder="Address" required>

                <button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>
            </form>
        </div>

    </body>
</html>
