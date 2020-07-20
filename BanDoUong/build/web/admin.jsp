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
        <table>
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
            <c:forEach var="row" items="${items.rows}"  begin="1" end="17" step="1">
                <tr>
                    <c:forEach var="colums" items="${row}">
                        <td><c:out value="${colums.value}"/></td>
                        
                    </c:forEach>
                    <td><a href="admin.jsp?del=${row.iId}">Delete</a></td>
                    <td><a href="update.jsp?id=${row.iId}">Update</a></td>
                </tr>
            </c:forEach>
        </table> 
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
    </body>
</html>
