<%-- 
    Document   : update
    Created on : Jul 19, 2020, 8:47:42 PM
    Author     : DELL
--%>

<%@page import="java.sql.Date"%>
<%@page import="Entities.Itemall"%>
<%@page import="DAO.ItemDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Update</h1>
        <%
            int id = Integer.parseInt(request.getParameter("id"));
            ItemDAO dao = new ItemDAO();
            Itemall i = dao.getNameOfItem(id);
            int tId = i.gettId();
            int bId = i.getbId();
            int blockId = i.getBlockId();
            int pId = i.getpId();
            int outputPrice = i.getOutputPrice();
            int vouId = i.getVouId();
            int status = i.getStatus();
            int quantity = i.getQuantity();
            int rId = i.getrId();
            int discoutnStatus = i.getDiscoutnStatus();
            String iName = i.getiName();
            String size = i.getSize();
            String orginCode = i.getOriginCode();
            String taste = i.getTaste();
            String iPic = i.getiPic();
            String expiryDate = i.getExpiryDate().toString();
        %>
        <form action="AdminController" method="post">
            <table>
                <tr>
                    <td>tId</td>
                    <td><input type="text" name="txttId" value="<%= tId%>"/></td>
                </tr>
                <tr>
                    <td>bId</td>
                    <td><input type="text" name="txtbId" value="<%= bId%>"/> </td>
                </tr>
                <tr>
                    <td>iName</td> 
                    <td><input type="text" name="txtiName" value="<%= iName%>"/></td>
                </tr>
                <tr>
                    <td>blockId</td>
                    <td><input type="text" name="txtblockId" value="<%= blockId%>"/></td>
                </tr>
                <tr>
                    <td>Size</td>
                    <td><input type="text" name="txtsize" value="<%= size%>"/></td>
                </tr>
                <tr>
                    <td>pId</td>
                    <td><input type="text" name="txtpId" value="<%= pId%>"/></td>
                </tr>
                <tr>
                    <td>outputPrice</td>
                    <td><input type="text" name="txtoutputPrice" value="<%= outputPrice%>"/> </td>
                </tr>
                <tr>
                    <td>orginCode</td> 
                    <td><input type="text" name="txtorginCode" value="<%= orginCode%>"/></td>
                </tr>
                <tr>
                    <td>status</td>
                    <td><input type="text" name="txtstatus" value="<%= status%>"/></td>
                </tr>
                <tr>
                    <td>quantity</td>
                    <td><input type="text" name="txtquantity" value="<%= quantity%>"/></td>
                </tr>
                <tr>
                    <td>rId</td> 
                    <td><input type="text" name="txtrId" value="<%= rId%>"/></td>
                </tr>
                <tr>
                    <td>discoutnStatus</td>
                    <td><input type="text" name="txtdiscoutnStatus" value="<%= discoutnStatus%>"/></td>
                </tr>
                <tr>
                    <td>vouId</td>
                    <td><input type="text" name="txtvouId" value="<%= vouId%>"/></td>
                </tr>
                <tr>
                    <td>taste</td> 
                    <td><input type="text" name="txttaste" value="<%= taste%>"/></td>
                </tr>
                <tr>
                    <td>expiryDate</td>
                    <td><input type="text" name="txtexpiryDate" value="<%= expiryDate%>"/></td>
                </tr>
                <tr>
                    <td>iPic</td>
                    <td><input type="text" name="txtiPic" value="<%= iPic%>"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="OK" name="btnupdate"/></td>
                </tr>               

            </table>
        </form>
    </body>
</html>
