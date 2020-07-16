<%-- 
    Document   : login
    Created on : Jun 25, 2020, 6:26:06 PM
    Author     : Asus
--%>

<%@page import="DAO.UserDAO"%>
<%@page import="com.sl.GlobalCons"%>
<%@page import="com.sl.GooglePojo"%>
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
        <style>
            .bd-placeholder-img {
                font-size: 1.125rem;
                text-anchor: middle;
                -webkit-user-select: none;
                -moz-user-select: none;
                -ms-user-select: none;
                user-select: none;
            }

            @media (min-width: 768px) {
                .bd-placeholder-img-lg {
                    font-size: 3.5rem;
                }
                html,
                body {
                    height: 100%;
                }

                body {
                    display: -ms-flexbox;
                    display: flex;
                    -ms-flex-align: center;
                    align-items: center;
                    padding-top: 40px;
                    padding-bottom: 40px;
                    background-color: #f5f5f5;
                }
                h1{
                    font-family: Helvetica, Arial, sans-serif;  
                    text-align: center; 
                    font-size:50px; 
                    margin-top: 10px; 
                    color:#000;
                    /*text-shadow: 2px 2px 0px rgba(0,0,0,.7), 5px 7px 0px rgba(255, 255, 255, 0.1);*/ 
                }
                .form-signin {
                    width: 100%;
                    max-width: 330px;
                    padding: 15px;
                    margin: auto;
                }
                .form-signin .checkbox {
                    font-weight: 400;
                }
                .form-signin .form-control {
                    position: relative;
                    box-sizing: border-box;
                    height: auto;
                    padding: 10px;
                    font-size: 16px;
                }
                .form-signin .form-control:focus {
                    z-index: 2;
                }
                .form-signin input[type="text"] {
                    margin-bottom: -1px;
                    border-bottom-right-radius: 0;
                    border-bottom-left-radius: 0;
                }
                .form-signin input[type="password"] {
                    margin-bottom: 10px;
                    border-top-left-radius: 0;
                    border-top-right-radius: 0;
                }
            }
            body{ 
                background-image: url('background/a.png');
            }
            #con{
                background-color: #fff;
                width: 25%;
            }
        </style>
    </head>
    
    <body>
        <%
//            GooglePojo gp = (GooglePojo) request.getAttribute(GlobalCons.AUTH);
//            if (!new UserDAO().checkLoginByGoogle(gp.getEmail()).isEmpty()) {
//                String name = gp.getEmail().substring(0, gp.getEmail().indexOf("@"));
//            }
//            if (request.getAttribute("txtEmail") != null
//                    && request.getAttribute("txtEmail") != null) {
//                if (!new UserDAO().checkLogin(request.getAttribute("txtEmail").toString(), request.getAttribute("txtEmail").toString()).isEmpty()) {
//                    request.getRequestDispatcher("home.jsp").forward(request, response);
//                }
//            }
%>
        <jsp:include page="header.jsp"/>
        <div class="container" id="con" >
            <form class="form-signin" action="UserController" method="POST">          
                <h1 class="h3 mb-3 font-weight-normal">Sign in</h1>
                <label for="inputEmail" class="sr-only">Email</label>
                <input type="email" class="form-control" placeholder="Email" name="txtEmail" required autofocus>
                <label for="inputPassword" class="sr-only">Password</label>
                <input type="password" class="form-control" name="txtPass" placeholder="Password" required>
                <input type="checkbox" value="remember-me" style="color: white">  Remember me     

                <a href="register.jsp" class="text-dark" style="text-align: right; color: white;"> Register </a>

                <input class="btn btn-lg btn-primary btn-block" type="submit" value="Signin"/>
                <!--                <div class="googleDemo" style="text-align: center" border="1">
                                    <a	href="https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8080/BanDoUong/login.jsp&response_type=code&client_id=559443797881-3h3h7b9hnls91oeoft4gei5vh9ng3odl.apps.googleusercontent.com&approval_prompt=force"
                                       class="btn btn-lg btn-social btn-google"> Sign in with Google
                                    </a>
                                </div>-->
            </form>
        </div>
    </body>
</html>
