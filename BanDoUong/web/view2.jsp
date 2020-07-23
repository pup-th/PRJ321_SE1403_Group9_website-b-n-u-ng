<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>content</title>
        <link href="css/view2.css" rel="stylesheet" type="text/css" media="all"/>
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
                        max = ${param.quantity},
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
//]]></script>
            <jsp:include page="header.jsp"/>
    </head>
    <body>
        <%
            String img = request.getParameter("img");
            String size = request.getParameter("size");
            String price = request.getParameter("price");
            String quantity = request.getParameter("quantity");
            String rId = request.getParameter("rId");
            String discount = request.getParameter("discount");
            String status = request.getParameter("status");
            String taste = request.getParameter("taste");
            String expirydate = request.getParameter("expirydate");
            String name = request.getParameter("name");
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
                                    <h5>Quantity: <input aria-label="quantity" class="input-qty" max="10" min="1" name="" type="number" value="1"></h5>
                                    <div class="action"> <a href="#" target="_blank">     
                                            <button class="add-to-cart btn btn-default" type="button">ADD TO CART</button>  
                                    </div> 
                                </div> 
                            </div> 
                        </div> 
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>