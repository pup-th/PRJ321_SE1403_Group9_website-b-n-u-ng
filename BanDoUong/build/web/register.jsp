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
            .form-signin input {
                margin-bottom: 10px;
                border-bottom-right-radius: 0;
                border-bottom-left-radius: 0;
            }
        }
        body{
            background-image: url('background/a.png');
        }

        @keyframes snow {
            0% {background-position: 0px 0px, 0px 0px, 0px 0px;}
            100% {background-position: 500px 1000px, 400px 400px, 300px 300px;}
        }
        #con{
            background-color: #fff;
            width: 25%;
        }
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
