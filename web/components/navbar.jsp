<%-- 
    Document   : navbar
    Created on : Mar 7, 2022, 9:19:30 PM
    Author     : HuuTrinh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <div class="py-1 bg-primary">
        <div class="container">
            <div class="row no-gutters d-flex align-items-start align-items-center px-md-0">
                <div class="col-lg-12 d-block">
                    <div class="row d-flex">
                        <c:if test="${sessionScope.user==null}">
                            <div class="col-md pr-4 d-flex topper align-items-center">
                                <div class="icon mr-2 d-flex justify-content-center align-items-center"><span class="icon-phone2"></span></div>
                                <span class="text">0374972813</span>
                            </div>
                            <div class="col-md pr-4 d-flex topper align-items-center">
                                <div class="icon mr-2 d-flex justify-content-center align-items-center"><span class="icon-paper-plane"></span></div>
                                <span class="text">Vetegatable@gmail.com</span>
                            </div>
                        </c:if>  
                        <c:if test="${sessionScope.user!=null}">
                            <div class="col-md pr-4 d-flex topper align-items-center">
                                <div class="icon mr-2 d-flex justify-content-center align-items-center"><span class="icon-phone2"></span></div>
                                <span class="text">${sessionScope.user.phone}</span>
                            </div>
                            <div class="col-md pr-4 d-flex topper align-items-center">
                                <div class="icon mr-2 d-flex justify-content-center align-items-center"><span class="icon-paper-plane"></span></div>
                                <span class="text">${sessionScope.user.email}</span>
                            </div>
                        </c:if>  
                        <div class="col-md-5 pr-4 d-flex topper align-items-center text-lg-right">
                            <span class="text">3-5 Business days delivery &amp; Free Returns</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
        <div class="container">
            <a class="navbar-brand" href="home">Vegefoods</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="oi oi-menu"></span> Menu
            </button>

            <div class="collapse navbar-collapse" id="ftco-nav">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item active"><a href="home" class="nav-link">Home</a></li>
<!--                    Cach dung dropdown nhanh gon
                        <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="dropdown04" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Shop</a>
                        <div class="dropdown-menu" aria-labelledby="dropdown04">
                            <a class="dropdown-item" href="shop">Shop</a>
                            <a class="dropdown-item" href="wishlist">Wishlist</a>
                            <a class="dropdown-item" href="productDetail">Single Product</a>
                            <a class="dropdown-item" href="cart">Cart</a>
                            <a class="dropdown-item" href="checkout">Checkout</a>
                        </div>
                    </li>-->
                    <li class="nav-item"><a href="shop" class="nav-link">Shop</a></li>
                    <li class="nav-item"><a href="about" class="nav-link">About</a></li>
                    <li class="nav-item"><a href="contact" class="nav-link">Contact</a></li>
                    <li class="nav-item cta cta-colored"><a href="cart" class="nav-link"><span class="icon-shopping_cart"></span>[0]</a></li>
                    <c:if test="${sessionScope.user==null}">
                        <li class="nav-item"><a href="signin" class="nav-link"><span class="icon-sign-in"></span></a></li>
                    </c:if>
                    <c:if test="${sessionScope.user!=null}">
                        <li class="nav-item"><a href="signout" class="nav-link"><span class="icon-sign-out"></span></a></li>
                    </c:if>
                </ul>
            </div>
        </div>
    </nav>
</html>
