<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Log in with your account</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />
    <link rel="stylesheet" href="../../resources/css/stylelogin.css">
</head>

<body>
<div class="container">
    <div class="row">
        <div class="col-md-offset-3 col-md-6">
            <form class="form-horizontal" method="post" action="/login">
                <span class="heading">Sign in</span>
                <div class="form-group">
                    <a href="/registration" type="button">Don`t have an account</a>
                </div>
                <div class="form-group">
                    <input class="form-control" name="username" type="text" placeholder="Username"
                           autofocus="true"/>
                    <i class="fa fa-user"></i>
                </div>

                <div class="form-group">
                    <input  class="form-control" name="password" type="password" placeholder="Password"/>
                    <i class="fa fa-lock"></i>
                </div>
                <div class="form-group">
                    <button  class="btn btn-default" type="submit">Log In</button>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>