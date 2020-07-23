<%@page import="Entities.Itemall"%>
<%@page import="java.sql.Date"%>
<%@page import="Entities.Items"%>
<%@page import="DAO.ItemDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>content</title>
        <link href="css/productdetail.css" rel="stylesheet" type="text/css" media="all"/>
        <link href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" rel="stylesheet"> 
        <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"> <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <script>//<![CDATA[
            $('input.input-qty').each(function () {
                var $this = $(this),
                        qty = $this.parent().find('.is-form'),
                        min = Number($this.attr('min')),
                        max = ${param.quantity}
    ,
                        if (min == 0) {
                    var d = 0
                } else
                    d = min
                $(qty).on('click', function () {
                    if ($(this).hasClass('minus')) {
                        if (d > min)
                            d += -1
                    } else if ($(this).hasClass('plus')) {
                        var x = Number($this.val()) + 1
                        if (x <= max)
                            d += 1
                    }
                    $this.attr('value', d).val(d)
                })
            })
    </script>
            <jsp:include page="header.jsp"/>
    </head>
    <body>
        <%
            DAO.ItemDAO itemdao = new ItemDAO();
            int id = Integer.parseInt(request.getParameter("idProductFromHome"));
//            if(request.getSession().getAttribute("idpro")!=null){
//                id=Integer.parseInt(request.getSession().getAttribute("idpro").toString());
//            }
//            else{id= ;0;
                
//            }
            Itemall iall = itemdao.getNameOfItem(id);
            String img = iall.getiPic();
            String size = iall.getSize();
            int price = iall.getOutputPrice();
            int quantity = iall.getQuantity();
            int rId = iall.getrId();
            int discount = iall.getDiscoutnStatus();
            int status = iall.getStatus();
            String taste = iall.getTaste();
            Date expirydate = iall.getExpiryDate();
            String name = iall.getiName();
        %>

        <div class="container">
            <div class="bod">
                <div class="card"> 
                    <div class="container-fliud"> 
                        <div class="wrapper row"> 
                            <div class="preview col-md-6"> 
                                <div class="preview-pic tab-content"> 
                                    <div class="tab-pane active" id="pic-1"><img src="douong/<%= img%>" alt="">
                                    </div> 
                                </div> 
                            </div> 
                            <div class="details col-md-6"> 
                                <h3 class="product-title"><%= name%></h3> 
                                <div class="rating"> 
                                    <div class="stars"> 
                                        5.0 
                                        <c:forEach begin="1" end="5">
                                            <span class="fa fa-star checked"></span>
                                        </c:forEach></br>
                                        </br>
                                    </div>   
                                    <div>
                                        <h2 class="pricei">Price: <%= price%> đ</h2>
                                    </div>
                                    <h5 class="sizes">Size: <span  data-toggle="tooltip" title="small"><%= size%></span> 
                                    </h5>
                                    <h5>Taste: <%= taste%></h5>
                                    <h5>Expiry Date: <%= expirydate%></h5>
                                    <form action="CartController" method="post">
                                        <div class="action">
                                            <!--<button class="add-to-cart btn btn-default" type="button" name="addcart">ADD TO CART</button>-->
                                            <h5>Quantity: <input max="<%=quantity%>" min="1" name="cartQuantity" type="number" value="1"></h5>
                                            <input type="hidden" value="<%=id%>" name="cartId"/>
                                            <input type="submit" value="Add To Cart" name="btnAddcart"/>
                                        </div>
                                    </form>
                                </div> 
                            </div> 
                        </div> 
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>