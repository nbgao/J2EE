<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Pengbing
  Date: 2017/5/7
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Teacher Infomation Page</title>
</head>
<body>
<c:if test="${! empty teacherInfo}">
    欢迎您，${teacherInfo.name}
</c:if>
<c:if test="${empty teacherInfo}">
    对不起，请先<a href="/test5/login">登陆</a>
</c:if>
</body>
</html>
