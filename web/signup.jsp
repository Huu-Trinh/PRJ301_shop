<%-- 
    Document   : sign-in
    Created on : Mar 8, 2022, 10:29:09 AM
    Author     : HuuTrinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">

        <link rel="stylesheet" href="fonts/icomoon/style.css">

        <link rel="stylesheet" href="css/owl.carousel.min.css">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap.min.css">

        <!-- Style -->
        <link rel="stylesheet" href="css/style.css">

        <title>TVShop</title>
    </head>
    <body>
        <div class="content">
            <form action="signup" method="post">
                <div class="container" style="padding: 50px">

                    <div class="row justify-content-center">
                        <div class="col-md-12">
                            <div class="mb-4">
                                <h3>Sign In to <strong>TVShop</strong></h3>
                                <p class="mb-4">Welcome to our fresh vegetable shop.</p>
                                <span class="bg-danger text-white">${requestScope.mess}</span>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6 order-md-2">
                            <div class="row">
                                <div class="form-group first col-md-6">
                                    <label for="cname">Customer name</label>
                                    <input name="cname" type="text" class="form-control" id="cname" required>
                                </div>
                                <div class="form-group  col-md-6">
                                    <label for="phone">phone</label>
                                    <input name="phone" type="text" class="form-control" id="phone" required>
                                </div>

                            </div>
                            <div class="form-group last">
                                <label for="email">Email</label>
                                <input name="email" type="email" class="form-control" id="email" required>
                            </div>
                        </div>
                        <div class="col-md-6 contents">

                            <div class="form-group first">
                                <label for="username">Username</label>
                                <input name="username" type="text" class="form-control" id="username" required>

                            </div>
                            <div class="form-group mb-4">
                                <label for="password">Password</label>
                                <input name="password" type="password" class="form-control" id="password" required>

                            </div>
                            <div class="form-group mb-4">
                                <label for="cpassword">Confirm password</label>
                                <input name="cpassword" type="password" class="form-control" id="cpassword" required>

                            </div>
                            <div class="form-group last mb-4">
                                <label for="address">Address</label>
                                <input name="address" type="text" class="form-control" id="address" required>

                            </div>

                            <div class="d-flex mb-5 align-items-center">
                                <label class="control control--checkbox mb-0"><a href="signin">Sign In</a></label>
                                <span class="ml-auto"><a href="#" class="forgot-pass">Forgot Password</a></span> 
                            </div>

                            <input type="submit" value="Sign Up" class="btn btn-block btn-primary">


                        </div>

                    </div>

                </div>
        </div>
    </form>
</div>


<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/main.js"></script>
</body>
</html>
