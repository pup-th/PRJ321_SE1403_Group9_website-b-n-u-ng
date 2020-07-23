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
    </head>
    <body>
        <h1>Insert Product</h1>
        <form action="AdminController" method="POST">
            <table>
                <tr>
                    <td>tId</td>
                    <td><input type="text" name="txttId"/></td>
                </tr>
                <tr>
                    <td>bId</td>
                    <td><input type="text" name="txtbId"/> </td>
                </tr>
                <tr>
                    <td>iName</td> 
                    <td><input type="text" name="txtiName"/></td>
                </tr>
                <tr>
                    <td>blockId</td>
                    <td><input type="text" name="txtblockId"/></td>
                </tr>
                <tr>
                    <td>Size</td>
                    <td><input type="text" name="txtsize"/></td>
                </tr>
                <tr>
                    <td>pId</td>
                    <td><input type="text" name="txtpId"/></td>
                </tr>
                <tr>
                    <td>outputPrice</td>
                    <td><input type="text" name="txtoutputPrice"/> </td>
                </tr>
                <tr>
                    <td>orginCode</td> 
                    <td><input type="text" name="txtorginCode"/></td>
                </tr>
                <tr>
                    <td>status</td>
                    <td><input type="text" name="txtstatus"/></td>
                </tr>
                <tr>
                    <td>quantity</td>
                    <td><input type="text" name="txtquantity"/></td>
                </tr>
                <tr>
                    <td>rId</td> 
                    <td><input type="text" name="txtrId"/></td>
                </tr>
                <tr>
                    <td>discoutnStatus</td>
                    <td><input type="text" name="txtdiscoutnStatus"/></td>
                </tr>
                <tr>
                    <td>vouId</td>
                    <td><input type="text" name="txtvouId"/></td>
                </tr>
                <tr>
                    <td>taste</td> 
                    <td><input type="text" name="txttaste"/></td>
                </tr>
                <tr>
                    <td>expiryDate</td>
                    <td><input type="text" name="txtexpiryDate"/></td>
                </tr>
                <tr>
                    <td>iPic</td>
                    <td><input type="text" name="txtiPic"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="OK" name="btnOK"/></td>
                </tr>               
                
            </table>
        </form>
    </body>
</html>
