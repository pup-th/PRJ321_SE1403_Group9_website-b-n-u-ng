<%-- 
    Document   : admin
    Created on : Jul 19, 2020, 5:34:06 PM
    Author     : DELL
--%>

<%@page import="Entities.Itemall"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.ItemDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" 
              integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" 
              crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    </head>
    <style>
        table {
            border: collapse;
            width: 100%;
        }

        th, td {
            padding: 2px;
            text-align: center;
            border: 1px solid #ddd;
        }
        th{
            background-color: #ff6600;
            color: white;
        }
    </style>
    <body>
        <%
            if (request.getParameter("del") != null) {
                response.sendRedirect("admin.jsp");
            }

        %>
        <table >
            <tr>
               <th>ID</th>
                <th>Type ID</th>
                <th>Brand ID</th>
                <th>Item Name</th>
                <th>Block ID</th>
                <th>Size</th>
                <th>Input Price</th>
                <th>Output Price</th>
                <th>Origin Code</th>
                <th>Status</th>
                <th>Quantity</th>
                <th>Rating ID</th>
                <th>Discount status</th>
                <th>Voucher ID</th>
                <th>Taste</th>
                <th>Expiry Date</th>
                <th>Picture Name</th>
                <th>Delete</th>
                <th>Update</th>
            </tr>
            <%
                ArrayList<Entities.Itemall> list = new ArrayList<>();
                if(request.getParameter("del") != null){
                    new ItemDAO().deleteItem(Integer.parseInt(request.getParameter("del")));
                }
                list = new ItemDAO().getAll();
            %>
            <c:forEach var="row" items="<%=list%>">
                <tr>
                    <td>${row.getiId()}</td>
                    <td>${row.gettId()}</td>
                    <td>${row.getbId()}</td>
                    <td>${row.getiName()}</td>
                    <td>${row.getBlockId()}</td>
                    <td>${row.getSize()}</td>
                    <td>${row.getpId()}</td>
                    <td>${row.getOutputPrice()}</td>
                    <td>${row.getOriginCode()}</td>
                    <td>${row.getStatus()}</td>
                    <td>${row.getQuantity()}</td>
                    <td>${row.getrId()}</td>
                    <td>${row.getDiscoutnStatus()}</td>
                    <td>${row.getVouId()}</td>
                    <td>${row.getTaste()}</td>
                    <td>${row.getExpiryDate()}</td>
                    <td>${row.getiPic()}</td>
                    <td><a href="admin.jsp?del=${row.iId}">Delete</a></td>
                    <td><a href="update.jsp?id=${row.iId}">Update</a></td>
                </tr>
            </c:forEach>
        </table>
            <a href="adminManagement.jsp" style="text-align: center">Admin Home</a>
    </body>
</html>
