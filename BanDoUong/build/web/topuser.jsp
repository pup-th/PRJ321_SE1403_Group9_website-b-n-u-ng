<%-- 
    Document   : topuser
    Created on : Jul 23, 2020, 8:01:24 AM
    Author     : ASUS
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DAO.AdminDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table {
                border-collapse: collapse;
                width: 100%;
            }

            th, td {
                padding: 8px;
                text-align: left;
                border-bottom: 1px solid #ddd;
            }
            th {
                background-color: #ff6600;
                color: white;
            }
        </style>
    </head>
    <body>
        <%
            DAO.AdminDAO adminDao = new AdminDAO();
            ArrayList<Entities.OrderDetail> list = adminDao.reportListTopUser();
        %>
        <table>
            <tr>
                <th>Number Orders</th>
                <th>Use Email</th>
                <th>Quantities</th>
            </tr>
            <c:forEach var="listuser" items="<%=list%>">
                <tr>
                    <td>${listuser.getoId()}</td>
                    <td>${listuser.getuMail()}</td>
                    <td>${listuser.getQuantity()}</td>
                </tr>
            </c:forEach>
        </table>
        <div class="span1">
    	<a href="adminManagement.jsp">
    		<i>Home</i>
    		<div class="clear"></div>
    	</a>
    </div>
    </body>
</html>
