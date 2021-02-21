<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Регистрация</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css" />
</head>

<body>
<form method="post" action="/createCard">
    <input type="text" name="name">
    <input type="submit">
</form>
<div id="list"></div>
<script>
    window.onload = () => {
        view();
    };
    function view() {

        const list = document.getElementById("list");
        let requestURL = 'http://localhost:8080/user/cards';
        let request = new XMLHttpRequest();
        request.open('GET', requestURL);
        request.responseType = 'json';
        request.send();
        request.onload = function() {
            let cards = request.response;
            for (let i = 0; i < cards.length; i++) {
                const p_desc = document.createElement("p");
                p_desc.append(cards[i]);
                list.append(p_desc)
            }
        }
    }
</script>
<%--<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>--%>
<%--<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>--%>
<%--<script src="../../resources/js/main.js"></script>--%>
</body>
</html>