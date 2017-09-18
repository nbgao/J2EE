<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Pengbing
  Date: 2017/4/26
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<style>
    .table-b td{
        border: 1px solid black
    }
</style>

<body>
<table class="table-b">
    <tr>
        <td>序号</td>
        <td>ID</td>
        <td>姓名</td>
        <td>性别</td>
        <td>生成时间</td>
    </tr>
    <c:choose>
        <c:when test="${empty list}">没有数据</c:when>
        <c:otherwise>
            <c:forEach items="${list}" var="one" varStatus="num">
                <tr>
                    <td>${num.count}</td>
                    <td>${one.id}}</td>
                    <td>${one.name}</td>
                    <td>
                        ${one.sex eq 0 ?'男':'女'}
                    </td>
                </tr>
            </c:forEach>
        </c:otherwise>
    </c:choose>
</table>
</body>

</html>
