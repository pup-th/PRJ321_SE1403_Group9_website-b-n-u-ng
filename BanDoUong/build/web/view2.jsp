<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>content</title>
        <style>
            body {  
                font-family:Arial, Helvetica, sans-serif;   
                overflow-x: hidden;
            }

            img {   
                max-width: 100%;
            }

            .preview {  
                display: -webkit-box;   
                display: -webkit-flex;  
                display: -ms-flexbox;   
                display: flex;  
                -webkit-box-orient: vertical;   
                -webkit-box-direction: normal;  
                -webkit-flex-direction: column; 
                -ms-flex-direction: column; 
                flex-direction: column;
            } 

            @media screen and (max-width: 996px) { 
                .preview { 
                    margin-bottom: 20px;
                }
            }

            .preview-pic {  
                -webkit-box-flex: 1;    
                -webkit-flex-grow: 1;   
                -ms-flex-positive: 1;   
                flex-grow: 1;
            }

            .preview-thumbnail.nav-tabs {   
                border: none;   
                margin-top: 15px;
            }

            .preview-thumbnail.nav-tabs li {    
                width: 18%; 
                margin-right: 2.5%;
            }

            .preview-thumbnail.nav-tabs li img {    
                max-width: 100%;    
                display: block;
            }

            .preview-thumbnail.nav-tabs li a {  
                padding: 0; 
                margin: 0;  
                cursor:pointer;
            }

            .preview-thumbnail.nav-tabs li:last-of-type {   
                margin-right: 0;
            }

            .tab-content {  
                overflow: hidden;
            }

            .tab-content img {  
                width: 100%;    
                -webkit-animation-name: opacity;    
                animation-name: opacity; 
                -webkit-animation-duration: .3s; 
                animation-duration: .3s;
            }

            .card { 
                margin-top: 0px;    
                background: #eee;   
                padding: 3em;   
                line-height: 1.5em;
            } 

            @media screen and (min-width: 997px) { 
                .wrapper { 
                    display: -webkit-box; 
                    display: -webkit-flex; 
                    display: -ms-flexbox; 
                    display: flex;
                }
            }

            .details {  
                display: -webkit-box;
                display: -webkit-flex;  
                display: -ms-flexbox;   
                display: flex;  
                -webkit-box-orient: vertical;   
                -webkit-box-direction: normal;  
                -webkit-flex-direction: column; 
                -ms-flex-direction: column; 
                flex-direction: column;
            }

            .colors {   
                -webkit-box-flex: 1;    
                -webkit-flex-grow: 1;   
                -ms-flex-positive: 1;   
                flex-grow: 1;
            }

            .product-title, .price, .sizes, .colors {   
                text-transform: UPPERCASE;  
                font-weight: bold;
            }

            .checked, .price span { 
                color: #ff9f1a;
            }

            .product-title, .rating, .product-description, .price, .vote, .sizes {  
                margin-bottom: 15px;
            }

            .product-title {    
                margin-top: 0;
            }

            .size {
                margin-right: 10px;
            }

            .size:first-of-type {   
                margin-left: 40px;
            }

            .color {    
                display: inline-block;  
                vertical-align: middle; 
                margin-right: 10px; 
                height: 2em;    
                width: 2em; 
                border-radius: 2px;
            }

            .color:first-of-type {  
                margin-left: 20px;
            }

            .add-to-cart, .like {   
                background: #ff9f1a;    
                padding: 1.2em 1.5em;   
                border: none;   
                text-transform: UPPERCASE;  
                font-weight: bold;  
                color: #fff;    
                text-decoration:none; 
                -webkit-transition: background .3s ease; 
                transition: background .3s ease;
            }

            .add-to-cart:hover, .like:hover {   
                background: #b36800;    
                color: #fff;    
                text-decoration:none;
            }

            .not-available {    
                text-align: center; 
                line-height: 2em;
            }

            .not-available:before { 
                font-family: fontawesome;   
                content: "\f00d";   
                color: #fff;
            }

            .orange {   
                background: #ff9f1a;
            }

            .green {    
                background: #85ad00;
            }

            .blue { 
                background: #0076ad;
            }

            .tooltip-inner {    
                padding: 1.3em;
            }
            @-webkit-keyframes opacity { 
                0% { opacity: 0; -webkit-transform: scale(3); transform: scale(3);} 
                100% { opacity: 1; -webkit-transform: scale(1); transform: scale(1);}
            } 

            @keyframes opacity { 
                0% { opacity: 0; -webkit-transform: scale(3); transform: scale(3);} 
                100% { opacity: 1; -webkit-transform: scale(1); transform: scale(1);}
            }
            .bod{
                margin-top: 100px;
            }
            .pricei{
                color: #ff9f1a;
            }
            .tabel1{
                border: 1px solid black;
            }
        </style>
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