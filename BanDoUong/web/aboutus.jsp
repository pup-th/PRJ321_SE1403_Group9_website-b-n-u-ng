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
                padding-left: 5%;
                padding-top: 5%;
                font-family: inherit;
            }
            .dv{
                padding-top: 3%; 
                margin-left:15%;
                font-size: medium;
                width: 70%;
                text-align: center; 
            }
            h1{
                text-align: center;
            }
            .dv1{
                padding-top: 3%;
            }
            .help{
                padding: 20px;
                font-size: 30px;
                width: 50px;
                text-align: center;
                text-decoration: none;
            }
            body{
                background-color: #fff;
            }
        </style>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <div class="back1">
            <img src="background/backus.jpg"  alt="Responsive image"  width="1600" height="550">
        </div>
        <div class="para">
            <h1>ABOUT US</h1>
            <div class="dv">
                <p>There are many types of soft drinks from bottled water, carbonated soft drinks, coffee or tea prepared, fruit juices of all kinds ... 
                    not to mention alcoholic drinks, with many different brands. compete in Vietnam market. On average, Vietnamese people consume beverage 
                    more than 23 liters / person / year. Improved living standards have helped the beverage market develop rapidly in Vietnam and consumption 
                    continues to increase because the gap is quite far away from many countries in the world.
                </p>
            </div>

        </div>
        <div class="help">
            <a href="https://www.facebook.com/" class="fa fa-facebook"></a>
        </div>
        <jsp:include page="header.jsp"/>
    </body>
</html>
