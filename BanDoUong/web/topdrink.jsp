<%-- 
    Document   : topdrink
    Created on : Jul 24, 2020, 5:43:36 PM
    Author     : ASUS
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DAO.AdminDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            ArrayList<Entities.Items> list = adminDao.reportListTopDrink();
        %>
        <table>
            <tr>
                <th>No.</th>
                <th>Name</th>
                <th>Sell Quantities</th>
            </tr>
            <%
                int count=0;
            %>
            <c:forEach var="listuser" items="<%=list%>">
                <tr>
                    <td><%=++count%></td>
                    <td>${listuser.getName()}</td>
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
