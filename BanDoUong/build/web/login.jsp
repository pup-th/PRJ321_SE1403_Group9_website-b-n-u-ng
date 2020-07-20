<%-- 
    Document   : login
    Created on : Jun 25, 2020, 6:26:06 PM
    Author     : Asus
--%>

<%@page import="DAO.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" 
              integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" 
              crossorigin="anonymous">
        <script src="https://apis.google.com/js/platform.js" async defer></script>
        <meta name="google-signin-client_id" content="559443797881-3h3h7b9hnls91oeoft4gei5vh9ng3odl.apps.googleusercontent.com">
        <link href='http://fonts.googleapis.com/css?family=Droid+Sans:400,700' rel='stylesheet' type='text/css'>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <link href="css/styleLogin.css" rel="stylesheet" type="text/css" media="all"/>
        <script type="text/javascript">
            function onSignIn(googleUser) {
                gapi.auth2.getAuthInstance().disconnect();
                location.reload();
                var profile = googleUser.getBasicProfile();
                var email = profile.getEmail();
                window.location = "UserController?mail=" + email;
            }
        </script>
    </head>

    <body>
        <%
            String fail = "";
            String fillEmail = "";
            String fillPass = "";
            if (request.getAttribute("fail") != null) {
                fail = request.getAttribute("fail").toString();
            }
            if(request.getAttribute("fillEmail") != null &&
                    request.getAttribute("fillPass") != null){
                fillEmail = request.getAttribute("fillEmail").toString();
                fillPass = request.getAttribute("fillPass").toString();
            }
        %>
        <jsp:include page="header.jsp"/>
        <div class="login">
            <div class="login-top">
                <h2>LOG IN</h2>
            </div>
            <div class="login-bottom">
                <h3>Log in with a social network:</h3>
                <center><a class="g-signin2" data-onsuccess="onSignIn" center></a></center>
                <h3>Log in With registered details:</h3>
                <form action="UserController" method="POST">
                    <div class="user">
                        <input type="text" placeHolder="Email" name ="txtEmail" value="<%=fillEmail%>"  onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}">
                        <i></i>
                    </div>
                    <div class="user-in">
                        <input type="password"  name="txtPass" placeholder="Password" value="<%=fillPass%>" required ><i></i>
                    </div>
                <c:if test="<%=fail != null%>">
                    <div id="fail" style="text-align: center; color: red; font-family: sans-serif;"><%=fail%></div>
                </c:if>
                <div class="keepme">
                    <label class="checkbox"><input type="checkbox" name="checkbox" checked><i> </i>Remember me</label>
                    <div class="keep-loginbutton">
                        <input type="submit" value="Log in" />
                        </form>
                    </div>
                    <div class="clear"> </div>
                </div>
                <div class="forgot">
                    <div class="forgot-register">
                        <p>Don't have an account? <a href="register.jsp">Register Now</a></p>
                    </div> 
                </div>
            </div>
        </div>
    </body>
</html>
