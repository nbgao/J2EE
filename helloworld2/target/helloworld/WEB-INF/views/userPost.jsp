<%--
  Created by IntelliJ IDEA.
  User: Pengbing
  Date: 2017/4/23
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<label for="form2">表单传值，user对象传到后台，注意，<input>的name对应后台user的属性</label>
<form id="form2" action="/test3/postUser" method="post">
      Name: <input type="text" name="name"><br>
      Password: <input type="text" name="pw"><br>
      <input type="submit" value="点击提交">
</form>
</body>
<p>反馈信息:${result}</p>
</html>
