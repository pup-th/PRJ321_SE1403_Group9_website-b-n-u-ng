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
    </head>
    <body>
        <%
            if(request.getParameter("btnLogin") != null){
                if(request.getParameter("txtUsername").isEmpty() ||
                        request.getParameter("txtPassword").isEmpty()){
                    
                    response.sendRedirect("login.jsp");
                    out.print("<h1>Wrong username or password</h1>");
                }
            }
        %>
    </body>
</html>
