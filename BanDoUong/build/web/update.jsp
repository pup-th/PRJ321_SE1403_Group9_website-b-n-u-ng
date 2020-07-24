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
            int bId = i.getbId();
            int blockId = i.getBlockId();
            int pId = i.getpId();
            int outputPrice = i.getOutputPrice();
            int vouId = i.getVouId();
            int status = i.getStatus();
            int quantity = i.getQuantity();
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
                    <td>Brand</td>
                    <td>
                        <select  name ="txtbId">
                            <option value = "1">Coca Cola</option>
                            <option value = "2">Pepsi</option>
                            <option value = "3">Sting</option>
                            <option value = "4">7Up</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Item Name</td> 
                    <td><input type="text" name="txtiName" value="<%= iName%>"/></td>
                </tr>
                <tr>
                    <td>Block</td>
                    <td>
                        <select  name ="txtblockId" >
                            <option value = "1">120</option>
                            <option value = "2">100</option>
                            <option value = "3">70</option>
                            <option value = "4">50</option>
                            <option value = "5">35</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Size</td>
                    <td><input type="text" name="txtsize" value="<%= size%>"/></td>
                </tr>
                <tr>
                    <td>Pay</td>
                    <td>
                        <select  name ="txtpId" >
                            <option value = "1">5000</option>
                            <option value = "2">6000</option>
                            <option value = "3">7000</option>
                            <option value = "4">8000</option>
                            <option value = "5">9000</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Output Price</td>
                    <td><input type="text" name="txtoutputPrice" value="<%= outputPrice%>"/> </td>
                </tr>
                <tr>
                    <td>Origin</td> 
                    <td>
                        <select  name ="txtorginCode" >
                            <option value = "1">Chai</option>
                            <option value = "2">Lon</option>
                            <option value = "3">chai sanh</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Discount</td>
                    <td>
                        <select  name ="txtstatus" >
                            <option value = "1">Con hang</option>
                            <option value = "0">Het hang</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Quantity</td>
                    <td><input type="text" name="txtquantity" value="<%= quantity%>"/></td>
                </tr>
                <tr>
                    <td>Discount Status</td>
                    <td>
                        <select  name ="txtdiscoutnStatus" >
                            <option value = "1">Co</option>
                            <option value = "0">Khong</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Voucher</td>
                    <td>
                        <select  name ="txtvouId" >
                            <option value = "1">Theo ngay(20%)</option>
                            <option value = "2">Theo san pham(10%)</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Taste</td> 
                    <td><input type="text" name="txttaste"  value="<%= taste %>"/></td>
                </tr>
                <tr>
                    <td>Expiry Date</td>
                    <td><input type="date" name="txtexpiryDate"  value="<%= expiryDate%>"/></td>
                </tr>
                <tr>
                    <td>Image Name</td>
                    <td><input type="text" name="txtiPic" value="<%= iPic%>"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Update" name="btnUpdate"/></td>
                </tr>
                <input type="hidden" name="txtiId" value="<%=id %>"/>
            </table>
        </form>
    </body>
</html>
