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
            /*            body{
                            background: #696969;
                            background-image: url('background/backaboutus.jpg');	
                        }*/
            .back1{
                margin-top: 100px;
            }
            .center{
                display: block;
                margin-left: auto;
                margin-right: auto;
                height: 0%;
                width: 100%;
            }
            .para{
                padding-top: 5%;
                font-family: inherit;
                align-items: center;
                text-height: auto;
            }
            .dv{
                padding-top: 3%; 
                font-size: medium;
                width: 70%;
            }
            .dv1{
                padding-top: 3%;
            }
            .help{
                padding: 20px;
                font-size: 30px;
                width: 50%;
                height: 50%;
                display: flex;
                margin: auto;
                margin-left: 45%;
            }
            img {
                border-radius:50%;
                -moz-border-radius:50%;
                -webkit-border-radius:50%;

            }
            .mentor{
                padding-top: 50px;   
                padding-left: 42.5%;
            }
            .mem{
                display: flex;
                margin-top:100px;
                margin-right: auto;
                padding-left: 150px;
            }
            .pic2{
                padding-left: 275px;
            }
            .pic3{
                padding-left: 240px;
            }
        </style>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <div class="mem">
            <!--<img src="background/backus.jpg"  alt="Responsive image"  width="1600" height="550">-->
            <div align='center'>
                <img src="background/phuc.jpg"  alt="Responsive image" width="300" height="300"/>
                <h5>Tran Hoang Phuc</h5>
                <h5>CE14xxxx</h5>
            </div>
            <div class="pic2"  align='center'>
                <img src="background/tri.jpg"  alt="Responsive image" width="300" height="300"/>
                <h5>Le Minh Tri</h5>
                <h5>CE14xxxx</h5>
            </div>
            <div class="pic3"  align='center'>
                <img src="background/qui.png"  alt="Responsive image" width="300" height="300"/>
                <h5 >Tran Hoang Qui</h5>
                <h5>CE14xxxx</h5>
            </div>
        </div>
        <div class="mentor">
            <img src="background/mentor.jpg"  alt="Responsive image" width="300" height="300"/><br>
            <h5 text-align='center'>Mentor: Luong Hoang Huong</h5>
        </div>
        <div class="para" align='center'>
            <h1 align='center'>ABOUT US</h1>
            <div class="dv">
                <p>There are many types of soft drinks from bottled water, carbonated soft drinks, coffee or tea prepared, fruit juices of all kinds 
                    not to mention alcoholic drinks, with many different brands. compete in Vietnam market. On average, Vietnamese people consume beverage 
                    more than 23 liters / person / year. Improved living standards have helped the beverage market develop rapidly in Vietnam and consumption 
                    continues to increase because the gap is quite far away from many countries in the world.
                </p>
            </div>

        </div>
        <div class="help">
            <a href="https://www.facebook.com/" class="fa fa-facebook" target="_blank"></a>
            <a href="http://mail.google.com/" class="fa fa-google" target="_blank"></a>
            <a href="https://twitter.com/explore" class="fa fa-twitter" target="_blank"></a>
            <a href="https://www.instagram.com/accounts/login/?hl=vi" class="fa fa-instagram" target="_blank"></a>
        </div>
        <div align='center'>
            <p>Hotline: 0123456789 - 0321654987 - 0147852369</p>
        </div>
        <jsp:include page="header.jsp"/>
    </body>
</html>
