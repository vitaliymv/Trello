<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Регистрация</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />
    <link rel="stylesheet" href="../../resources/css/stylelogin.css">
</head>

<body>

<div class="container">
    <div class="row">
        <div class="col-md-offset-3 col-md-6">
            <form class="form-horizontal" method="post">

                <span class="heading">Sign up</span>
                <div class="form-group">
                    <a href="/login" type="button">Already have account</a>
                </div>
                <div class="form-group">
                    <input type="text" id="username" class="form-control" name="username" placeholder="Username" required>
                    <i class="fa fa-user"></i>
                </div>
                <br>
                <div class="form-group">
                    <input type="password" id="password" class="form-control" name="pass" placeholder="Password" required>
                    <i class="fa fa-lock"></i>
                </div>
                <br>
                <div class="form-group">
                    <input type="password" id="confirmPassword" class="form-control" name="cpass" placeholder="Confirm password" required>
                    <i class="fa fa-lock"></i>
                </div>

                <div class="form-group">
                    <button type="submit" class="btn btn-default" onclick="registration()">Success</button>
                </div>


            </form>

        </div>

    </div>

</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="../../resources/js/main.js"></script>
</body>
</html>