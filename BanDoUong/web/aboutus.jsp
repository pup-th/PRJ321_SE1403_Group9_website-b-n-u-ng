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
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="css/aboutUs.css" rel="stylesheet" type="text/css" media="all"/>
        <jsp:include page="header.jsp"/>
    </head>
    <body>
        <div class="about-section">
            <h1>About Us Page</h1>
            <p class="contentsp">If you have some problems with our website, you can follow us so we can assist for you in the best way.</p>
        </div>

        <h2 style="text-align:center">Our Team</h2>
        <div class="row">
            <div class="column" align="center">
                <div class="card">
                    <img src="background/phuc.jpg" class="rounded-circle" alt="Responsive image" width="535px" height="535px">
                    <div class="container">
                        <h2>Tran Hoang Phuc</h2>
                        <p class="title">Leader</p>
                        <p>PhucTHCE14xxxx@fpt.edu.vn</p>
                        <p><a href="https://www.facebook.com/profile.php?id=100033120579664" target="_blank"><button class="button">Contact</button></a></p>
                    </div>
                </div>
            </div>

            <div class="column" align="center">
                <div class="card">
                    <img src="background/tri.jpg" class="rounded-circle" alt="Responsive image" width="535px" height="535px">
                    <div class="container">
                        <h2>Le Minh Tri</h2>
                        <p class="title">Member</p>
                        <p>TriLMCE14xxxx@fpt.edu.vn</p>
                        <p><a href="https://www.facebook.com/lmtriiii" target="_blank"><button class="button">Contact</button></a></p>
                    </div>
                </div>
            </div>

            <div class="column" align="center">
                <div class="card">
                    <img src="background/qui.png" class="rounded-circle" alt="Responsive image" width="535px" height="535px">
                    <div class="container">
                        <h2>Tran Hoang Qui</h2>
                        <p class="title">Member</p>
                        <p>QuiTHCE140632@fpt.edu.vn</p>
                        <p><a href="https://www.facebook.com/profile.php?id=100036048650428" target="_blank"><button class="button">Contact</button></a></p>
                    </div>
                </div>
            </div>
        </div>
        <div class="mentor">
            <div align="center">
                <div class="card">
                    <img src="background/mentor.jpg" class="rounded-circle" alt="Responsive image" width="515px" height="535px">
                    <div class="container">
                        <h2>Luong Hoang Huong</h2>
                        <p class="title">Mentor</p>
                        <p>HuongLH@fpt.edu.vn</p>
                        <p><a href="https://www.facebook.com/profile.php?id=100024104737933" target="_blank"><button class="button">Contact</button></a></p>
                    </div>
                </div>
            </div>
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
            <table>
                <td class="contact">Contact us:</td>
                <td>
                    <i><a href="#" class="fa fa-facebook"></a></i>
                    <i><a href="#" class="fa fa-twitter"></a></i>
                    <i><a href="#" class="fa fa-google"></a></i>
                    <i><a href="#" class="fa fa-instagram"></a></i>
                </td>
            </table>
        </div>
        <div class="phoneicon"><i class="fa fa-phone-square" style="font-size:40px;color:red">Hotline:</i>
            <i class="phonenum">0123456789 - 0321654987 - 0147852369</i>
        </div>
    </body>
</html>
