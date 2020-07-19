<%-- 
    Document   : profile
    Created on : Jul 19, 2020, 8:57:10 PM
    Author     : Asus
--%>

<%@page import="DAO.UserDAO"%>
<%@page import="Entities.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Consultancy Profile Widget Flat Responsive Widget Template :: w3layouts</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link href="css/styleProfile.css" rel="stylesheet" type="text/css" media="all" />
    </head>
    <body>
        <%--<%@include file="header.jsp" %>--%>
        <%      
            Users u = null;
            String em = "";
            if(request.getParameter("em") != null){
                em = request.getParameter("em");
                UserDAO uDAO = new UserDAO();
                u = uDAO.getUserByEmail(em);
            }
        %>
        <div class="main">
            <h1>Profile</h1>
            <div id="wrapper" class="w3ls_wrapper w3layouts_wrapper">
                <div id="steps" style="margin:0 auto;" class="agileits w3_steps">
                    <form id="formElem" name="formElem" action="#" method="post" class="w3_form w3l_form_fancy">
                        <fieldset class="step agileinfo w3ls_fancy_step">
                            <legend>About</legend>
                            <div class="abt-agile">
                                <div class="abt-agile-left">
                                    <img src="background/git.png" alt=""/>
                                </div>
                                <div class="abt-agile-right">
                                    <h3><%=u.getuName()%></h3>
                                    <h5></h5>
                                    <ul class="address">
                                        <li>
                                            <ul class="address-text">
                                                <li><b>PHONE </b></li>
                                                <li>: <%=u.getuPhone()%></li>
                                            </ul>
                                        </li>
                                        <li>
                                            <ul class="address-text">
                                                <li><b>ADDRESS </b></li>
                                                <li>: <%=u.getuAddress()%></li>
                                            </ul>
                                        </li>
                                        <li>
                                            <ul class="address-text">
                                                <li><b>E-MAIL </b></li>
                                                <li>: <%=u.getuMail()%></li>
                                            </ul>
                                        </li>
                                        <li>
                                            <ul class="address-text">
                                                <li><b> </b></li>
                                                <li><button class="keep-loginbutton"><a href="home.jsp">Back to home</a></button></li>
                                            </ul>
                                        </li>
                                    </ul>
                                </div>
                                <div class="clear"></div>
                            </div>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
