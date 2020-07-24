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
<%@taglib  prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if (request.getParameter("del") != null) {
                response.sendRedirect("admin.jsp");
            }

        %>
        <!--            <th>ID</th>
                    <th>Name</th>
                    <th>Birthday</th>
                    <th>Gender</th>
                    <th>Address</th>-->
        <sql:setDataSource var="conn" scope="session" 
                           driver="com.mysql.jdbc.Driver"
                           url="jdbc:mysql://localhost/bannuocuong"
                           user="root"
                           password=""/>
        <sql:query  var="items" dataSource="${conn}">
            SELECT * FROM `item`
        </sql:query>
        <sql:update var="delete" dataSource="${conn}" sql="DELETE FROM `item` WHERE `iId`='${param.del}'"/>
        <table border="1" align="center" width="100%">
            <tr>
                <c:forEach var="colName" items="${items.columnNames}">
                    <th ><c:out value="${colName}"/></th>
                    </c:forEach>
                <td>Update</td>
                <td>Delete</td>
            </tr>
            <c:forEach var="row" items="${items.rows}">
                <tr
                    <td><c:out value="${row.bId}"/></td>
                    <td><c:out value="${row.iName}"/></td>
                    <td><c:out value="${row.blockId}"/></td>
                    <td><c:out value="${row.size}"/></td>
                    <td><c:out value="${row.pId}"/></td>
                    <td><c:out value="${row.outputPrice}"/></td>
                    <td><c:out value="${row.originCode}"/></td>
                    <td><c:out value="${row.status}"/></td>
                    <td><c:out value="${row.quantity}"/></td>
                    <td><c:out value="${row.discoutnStatus}"/></td>
                    <td><c:out value="${row.vouId}"/></td>
                    <td><c:out value="${row.taste}"/></td>
                    <td><c:out value="${row.expiryDate}"/></td>
                    <td><c:out value="${row.iPic}"/></td>
                    <td><c:out value="${row.bId}"/></td>
                    <td><c:out value="${row.bId}"/></td>
                    <td><a href="admin.jsp?del=${row.iId}">Delete</a></td>
                    <td><a href="update.jsp?id=${row.iId}">Update</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>

        <%//                ItemDAO item = new ItemDAO();
//                ArrayList<Itemall>list = item.getNameOfItems();
//                out.print("<table>");
//                for (Itemall i : list) {
//                        out.print("<tr>");
//                        out.print("<td>"+i.getiId()+" </td>");
//                        out.print("<td>"+i.gettId()+" </td>");
//                        out.print("<td>"+i.getpId()+" </td>");
//                        out.print("<td>"+i.getiName()+" </td>");
//                        out.print("<td>"+i.getBlockId()+" </td>");
//                        out.print("<td>"+i.getSize()+" </td>");
//                        out.print("<td>"+i.getpId()+" </td>");
//                        out.print("<td>"+i.getOutputPrice()+" </td>");
//                        out.print("<td>"+i.getOriginCode()+" </td>");
//                        out.print("<td>"+i.getStatus()+" </td>");
//                        out.print("<td>"+i.getQuantity()+" </td>");
//                        out.print("<td>"+i.getrId()+" </td>");
//                        out.print("<td>"+i.getDiscoutnStatus()+" </td>");
//                        out.print("<td>"+i.getVouId()+" </td>");
//                        out.print("<td>"+i.getTaste()+" </td>");
//                        out.print("<td>"+i.getExpiryDate()+" </td>");
//                        out.print("<td>"+i.getiPic()+" </td>");
//                        out.print("</tr>");
//                        
//                    }
//                out.print("</table>");
//            %>