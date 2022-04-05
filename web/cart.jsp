<%-- 
    Document   : cart
    Created on : Mar 8, 2022, 9:33:10 AM
    Author     : HuuTrinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Vegefoods - Free Bootstrap 4 Template by Colorlib</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Amatic+SC:400,700&display=swap" rel="stylesheet">

        <link rel="stylesheet" href="css/open-iconic-bootstrap.min.css">
        <link rel="stylesheet" href="css/animate.css">

        <link rel="stylesheet" href="css/owl.carousel.min.css">
        <link rel="stylesheet" href="css/owl.theme.default.min.css">
        <link rel="stylesheet" href="css/magnific-popup.css">

        <link rel="stylesheet" href="css/aos.css">

        <link rel="stylesheet" href="css/ionicons.min.css">

        <link rel="stylesheet" href="css/bootstrap-datepicker.css">
        <link rel="stylesheet" href="css/jquery.timepicker.css">


        <link rel="stylesheet" href="css/flaticon.css">
        <link rel="stylesheet" href="css/icomoon.css">
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>

        <%@include file="./components/navbar.jsp" %>
        <div class="hero-wrap hero-bread" style="background-image: url('images/bg_1.jpg');">
            <div class="container">
                <div class="row no-gutters slider-text align-items-center justify-content-center">
                    <div class="col-md-9 ftco-animate text-center">
                        <p class="breadcrumbs"><span class="mr-2"><a href="index.html">Home</a></span> <span>Cart</span></p>
                        <h1 class="mb-0 bread">My Cart</h1>
                    </div>
                </div>
            </div>
        </div>
        <form method="Post" action="#">   
            <section class="ftco-section ftco-cart">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12 ftco-animate">
                            <div class="cart-list">
                                <table class="table">
                                    <thead class="thead-primary">
                                        <tr class="text-center">
                                            <th>&nbsp;</th>
                                            <th>&nbsp;</th>
                                            <th>Product name</th>
                                            <th>Price</th>
                                            <th>Quantity</th>
                                            <th>Total</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%! double total = 0;
                                            int i = 0;
                                        %>
                                        <c:forEach items="${listCart}" var="product"> 
                                            <tr class="text-center">

                                                <td class="product-remove"><a href="delete-cart?pid=${product.pid}"><span class="ion-ios-close"></span></a></td>

                                                <td class="image-prod"><div class="img" style="background-image:url(${product.image});"></div></td>

                                                <td class="product-name">
                                                    <h3>${product.pname}</h3>
                                                    <p>${product.description}</p>
                                                </td>
                                                
                                                <td class="price">$${product.promotion!=0?product.price*product.promotion/100:product.price}</td>

                                                <td class="quantity">
                                                    <div class="input-group mb-3">
                                                        <input onchange="updateQuantity(this)" type="text" name="quantity" class="quantity form-control input-number" value="${product.quantity}" min="1" max="100">
                                                        <input type="hidden" name="total" value="${(product.promotion!=0?product.price*product.promotion/100:product.price)*product.quantity}"/> 
                                                    </div>
                                                </td>

                                                <td class="total">
                                                    $${(product.promotion!=0?product.price*product.promotion/100:product.price)*product.quantity}
                                                </td>

                                            </tr><!-- END TR-->
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div class="row justify-content-between">
                        <div class="col-lg-4 mt-5 cart-wrap ftco-animate">
                            <div class="cart-total mb-3">
                                <h3>Coupon Code</h3>
                                <p>Enter your coupon code if you have one</p>
                                <form action="#" class="info">
                                    <div class="form-group">
                                        <label for="">Coupon code</label>
                                        <input type="text" class="form-control text-left px-3" placeholder="">
                                    </div>
                                </form>
                            </div>
                            <p><a href="checkout.html" class="btn btn-primary py-3 px-4">Apply Coupon</a></p>
                        </div>

                        <div class="col-lg-4 mt-5 cart-wrap ftco-animate">
                            <div class="cart-total mb-3">
                                <h3>Cart Totals</h3>
                                <p class="d-flex">
                                    <span>Subtotal</span>
                                    <span id="subtotal">$20.60</span>
                                </p>
                                <p class="d-flex">
                                    <span>Delivery</span>
                                    
                                    <span id="delivery">$0</span>
                                </p>
                                <hr>
                                <p class="d-flex total-price">
                                    <span>Total</span>
                                    <span id="ftotal">$17.60</span>
                                </p>
                            </div>
                            <p><a href="checkout.html" class="btn btn-primary py-3 px-4">Proceed to Checkout</a></p>
                        </div>
                    </div>
                </div>
            </section>
        </form>
        <section class="ftco-section ftco-no-pt ftco-no-pb py-5 bg-light">
            <div class="container py-4">
                <div class="row d-flex justify-content-center py-5">
                    <div class="col-md-6">
                        <h2 style="font-size: 22px;" class="mb-0">Subcribe to our Newsletter</h2>
                        <span>Get e-mail updates about our latest shops and special offers</span>
                    </div>
                    <div class="col-md-6 d-flex align-items-center">
                        <form action="#" class="subscribe-form">
                            <div class="form-group d-flex">
                                <input type="text" class="form-control" placeholder="Enter email address">
                                <input type="submit" value="Subscribe" class="submit px-3">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </section>
        <%@include file="./components/footer.jsp" %>
    </body>
</html>
