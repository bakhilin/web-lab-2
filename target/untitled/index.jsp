<%--
  Created by IntelliJ IDEA.
  User: 79170
  Date: 12.10.2023
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! private static final String DEFAULT_NAME = "World"; %>
<%--<jsp:include page="/controller" />--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="wrapper">
    <header>
        <div class="inner-content-header">
        <span>
            Бахилин Никита Витальевич P3234 Вариант 3409
        </span>
        </div>
    </header>

    <div class="main-content">
        
        <div>
            <img src="img/svg-editor-image.svg" alt="">
        </div>
        
        <form action='controller' method="get">
            <input type="text" name="x" placeholder="enter x">
            <input type="text" name="y" placeholder="enter y">
            R:
            <label for="1">1</label>
            <input type="radio" value="1" name="radius" id="1">
            <label for="2">2</label>
            <input type="radio" value="2" name="radius" id="2">
            <label for="3">3</label>
            <input type="radio" value="3" name="radius" id="3">
            <label for="4">4</label>
            <input type="radio" value="4" name="radius" id="4">
            <label for="5">5</label>
            <input type="radio" value="5" name="radius" id="5">
            <input type="submit" value="отправить форму">
        </form>
    </div>
</div>
</body>
</html>
