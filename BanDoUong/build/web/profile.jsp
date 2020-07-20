<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.ArrayList"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <style>
            body {font-family: Arial, Helvetica, sans-serif;}

            /* Full-width input fields */
            input[type=text], input[type=password] {
                width: 100%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                box-sizing: border-box;
            }

            /* Set a style for all buttons */
            button {
                background-color: #4CAF50;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 100%;
            }

            button:hover {
                opacity: 0.8;
            }

            /* Extra styles for the cancel button */
            .cancelbtn {
                width: auto;
                padding: 10px 18px;
                background-color: #f44336;
            }

            /* Center the image and position the close button */
            .imgcontainer {
                text-align: center;
                margin: 24px 0 12px 0;
                position: relative;
            }

            img.avatar {
                width: 40%;
                border-radius: 50%;
            }

            .container {
                padding: 16px;
            }

            span.psw {
                float: right;
                padding-top: 16px;
            }

            /* The Modal (background) */
            .modal {
                display: none; /* Hidden by default */
                position: fixed; /* Stay in place */
                z-index: 1; /* Sit on top */
                left: 0;
                top: 0;
                width: 100%; /* Full width */
                height: 100%; /* Full height */
                overflow: auto; /* Enable scroll if needed */
                background-color: rgb(0,0,0); /* Fallback color */
                background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
                padding-top: 60px;
            }

            /* Modal Content/Box */
            .modal-content {
                background-color: #fefefe;
                margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
                border: 1px solid #888;
                width: 80%; /* Could be more or less, depending on screen size */
            }

            /* The Close Button (x) */
            .close {
                position: absolute;
                right: 25px;
                top: 0;
                color: #000;
                font-size: 35px;
                font-weight: bold;
            }

            .close:hover,
            .close:focus {
                color: red;
                cursor: pointer;
            }

            /* Add Zoom Animation */
            .animate {
                -webkit-animation: animatezoom 0.6s;
                animation: animatezoom 0.6s
            }

            @-webkit-keyframes animatezoom {
                from {-webkit-transform: scale(0)} 
                to {-webkit-transform: scale(1)}
            }

            @keyframes animatezoom {
                from {transform: scale(0)} 
                to {transform: scale(1)}
            }

            /* Change styles for span and cancel button on extra small screens */
            @media screen and (max-width: 300px) {
                span.psw {
                    display: block;
                    float: none;
                }
                .cancelbtn {
                    width: 100%;
                }
            }
            .menu{
                margin-top: 100px;
                margin-bottom: -80px;
                margin-left: 170px; 
            }
            .tableorder{
                height: 20%;
                width: 100%;
            }
            th, td {
                border-bottom: 1px solid #ddd;
            }
            h2{
                padding-top: 30px;
            }
        </style>
    </head>
    <body>
        <jsp:include page="header.jsp"/>
        <%
            DAO.UserDAO dao = new DAO.UserDAO();
            Entities.Users u = dao.getInfoUser("user1@gmail.com");
            String name = u.getuName();
            String mail = u.getuMail();
            String phone = u.getuPhone();
            String address = u.getuAddress();
        %>
        <div class="menu">
            <button onclick="document.getElementById('id01').style.display = 'block'" style="width:auto;">Change Password</button>
            <button onclick="document.getElementById('id02').style.display = 'block'" style="width:auto;">Purchase History</button>
        </div>
        <form class="modal-content animate" action="ChangeController" method="post">
            <h2 align="center">Change Profile</h2>
            <input type="hidden" name="omail" value="<%= mail%>"/>
            <div class="container">
                <label for="uname"><b>Full Name</b></label>
                <input type="text" placeholder="Enter Full Name" name="nname" required value="<%= name%>"/>

                <label for="psw"><b>Email</b></label>
                <input type="text" placeholder="Enter Email" name="nmail" required value="<%= mail%>"/>

                <label for="psw"><b>Phone</b></label>
                <input type="text" placeholder="Enter Phone" name="nphone" required value="<%= phone%>"/>

                <label for="psw"><b>Address</b></label>
                <input type="text" placeholder="Enter Address" name="naddress" required value="<%= address%>"/>

                <button type="submit" name="btnSave">Save</button>
            </div>
        </form>
        <!--</div>-->
        <script>
            // Get the modal
            var modal = document.getElementById('id01');
            // When the user clicks anywhere outside of the modal, close it
            window.onclick = function (event) {
                if (event.target == modal) {
                    modal.style.display = "none";
                }
            }
        </script>
        <div id="id01" class="modal">
            <form class="modal-content animate" action="ChangeController" method="post">
                <input type="hidden" name="omail" value="<%= mail%>"/>
                <div class="imgcontainer">
                    <span onclick="document.getElementById('id01').style.display = 'none'" class="close" title="Close Modal">&times;</span>
                </div>
                <input type="hidden" name="omail" value="<%= mail%>"/>
                <div class="container">
                    <label for="uname"><b>Old Password</b></label>
                    <input type="text" placeholder="Enter Old Password" name="opass" required>

                    <label for="psw"><b>New Password</b></label>
                    <input type="text" placeholder="Enter New Password" name="npass" required>

                    <label for="psw"><b>Confirm Password</b></label>
                    <input type="text" placeholder="Enter Confirm Password" name="cpass" required>
                    <button type="submit" name="btnChange">Change</button>
                </div>
                <div class="container" style="background-color:#f1f1f1">
                    <button type="button" onclick="document.getElementById('id01').style.display = 'none'" class="cancelbtn">Cancel</button>
                </div>
            </form>
        </div>
        <script>
            // Get the modal
            var modal = document.getElementById('id01');
            // When the user clicks anywhere outside of the modal, close it
            window.onclick = function (event) {
                if (event.target == modal) {
                    modal.style.display = "none";
                }
            }
        </script>
        <div id="id02" class="modal">
            <form class="modal-content animate" method="post">
                <div class="imgcontainer">
                    <span onclick="document.getElementById('id02').style.display = 'none'" class="close" title="Close Modal">&times;</span>
                </div>
                <div class="container">
                    <table class="tableorder">
                        <%
                            ArrayList<Entities.Orders> listorder = dao.getHisPurchase(mail);
                            int count = 1;
                            SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyy");
                            out.println("<tr align='center'>");
                            out.println("<th>No.</th>");
                            out.println("<th>Item Name</th>");
                            out.println("<th>Quantity</th>");
                            out.println("<th>Price</th>");
                            out.println("<th>Order Date</th>");
                            out.println("<th>Total</th>");
                            out.println("</tr>");
                            for (Entities.Orders elem : listorder) {
                                out.println("<tr align='center'>");
                                out.println("<td>" + count++ + "</td>");
                                out.println("<td>" + elem.getName() + "</td>");
                                out.println("<td>" + elem.getQuantity() + "</td>");
                                out.println("<td>" + elem.getIprice() + "</td>");
                                out.println("<td>" + sdf.format(elem.getDate()) + "</td>");
                                out.println("<td>" + elem.getTotal() + "</td>");
                                out.println("<tr>");
                            }

                        %>
                    </table>
                </div>
                <div class="container" style="background-color:#f1f1f1">
                    <button type="button" onclick="document.getElementById('id02').style.display = 'none'" class="cancelbtn">Cancel</button>
                </div>
            </form>
        </div>
        <script>
            // Get the modal
            var modal = document.getElementById('id02');
            // When the user clicks anywhere outside of the modal, close it
            window.onclick = function (event) {
                if (event.target == modal) {
                    modal.style.display = "none";
                }
            }
        </script>
    </body>       
</html>
