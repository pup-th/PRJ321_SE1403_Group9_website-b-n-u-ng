<%-- 
    Document   : login
    Created on : Jun 25, 2020, 6:26:06 PM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="home.jsp">
            Username: <input type="text" name="txtUsername"/><br/>
            Password : <input type="text" name="txtPassword"/><br/>
            <input type="submit" name="btnLogin" value="Login"/>
        </form>
    </body>
</html>
