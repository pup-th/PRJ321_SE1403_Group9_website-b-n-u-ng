<%-- 
    Document   : insert.jsp
    Created on : Jul 19, 2020, 8:03:15 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <h1>Insert Product</h1>
        <form action="AdminController" method="post">
            <table>
                <tr>
                    <td>Type ID</td>
                    <td><input type="text" name="txttId"/></td>
                </tr>
                <tr>
                    <td>Brand ID</td>
                    <td><input type="text" name="txtbId"/> </td>
                </tr>
                <tr>
                    <td>Item Name</td> 
                    <td><input type="text" name="txtiName"/></td>
                </tr>
                <tr>
                    <td>Block ID</td>
                    <td><input type="text" name="txtblockId"/></td>
                </tr>
                <tr>
                    <td>Size</td>
                    <td><input type="text" name="txtsize"/></td>
                </tr>
                <tr>
                    <td>Input Price</td>
                    <td><input type="text" name="txtpId"/></td>
                </tr>
                <tr>
                    <td>Output Price</td>
                    <td><input type="text" name="txtoutputPrice"/> </td>
                </tr>
                <tr>
                    <td>Orgin Code</td> 
                    <td><input type="text" name="txtorginCode"/></td>
                </tr>
                <tr>
                    <td>Status</td>
                    <td><input type="text" name="txtstatus"/></td>
                </tr>
                <tr>
                    <td>Quantity</td>
                    <td><input type="text" name="txtquantity"/></td>
                </tr>
                <tr>
                    <td>Rating ID</td> 
                    <td><input type="text" name="txtrId"/></td>
                </tr>
                <tr>
                    <td>Discount Status</td>
                    <td><input type="text" name="txtdiscoutnStatus"/></td>
                </tr>
                <tr>
                    <td>Voucher Id</td>
                    <td><input type="text" name="txtvouId"/></td>
                </tr>
                <tr>
                    <td>Taste</td> 
                    <td><input type="text" name="txttaste"/></td>
                </tr>
                <tr>
                    <td>Expiry Date</td>
                    <td><input type="text" name="txtexpiryDate"/></td>
                </tr>
                <tr>
                    <td>Picture Name</td>
                    <td><input type="text" name="txtiPic"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Insert" name="btnInsert"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
