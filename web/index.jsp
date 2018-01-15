<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/27 0027
  Time: 13:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>FGFGF
<a href="hello">Hello Word </a><br>
<a href="user/pathvariabler">The pathvariabler </a><br>
<a href="user/requestheader">The requestheader </a><br>
<a href="user/cookieValue">The cookieValue </a><br>

<!-- 测试 POJO 对象传参，支持级联属性 -->
<form action="${pageContext.request.contextPath }/user/JOPO" method="post">
    username: <input type="text" name="username"/><br>
    password: <input type="password" name="password"/><br>
    email: <input type="text" name="email"/><br>
    age: <input type="text" name="age"/><br>

    <!-- 级联属性 -->
    city: <input type="text" name="address.city"/><br>
    province: <input type="text" name="address.province"/>
    <input type="submit" value="Submit"/>
</form>

</body>
</html>
