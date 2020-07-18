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
        <link rel="stylesheet" href="css/styleLogin.css" type="text/css" media="all" />
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div class="login">
            <div class="login-top">
                <h2>Register</h2>
            </div>
            <div class="login-bottom">
                <h3>Fill out all information: </h3>
                <form action="UserController" method="POST">
                    <div class="user">
                        <input type="text" placeholder="Email" name="txtEmail" required autofocus><i></i>
                    </div>
                    <div class="user-in">
                        <input type="password" placeholder="Password" name="txtPass" required ><i></i>
                    </div>
                    <div class="user">
                        <input type="text" placeholder="Your name" name="txtName" required><i></i>
                    </div>
                    <div class="user">
                        <input type="text" placeholder="Phone number" name="txtPhone" required><i></i>
                    </div>
                    <div class="user">
                        <input type="text" placeholder="Address" name="txtAddress" required><i></i>
                    </div>
                    <div class="forgot">
                        <div class="forgot-register">
                            <p>Already have an account?<a href="login.jsp">Login Now</a></p>
                        </div> 
                    </div>
                    <div class="keepme">
                        <div class="keep-loginbutton">
                            <input type="submit" value="Register" />
                        </div>
                        <div class="clear"> </div>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
