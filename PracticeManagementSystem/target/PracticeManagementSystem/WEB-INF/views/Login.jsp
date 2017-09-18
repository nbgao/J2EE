<%--
  Created by IntelliJ IDEA.
  User: Pengbing
  Date: 2017/5/7
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<form id="login" action="/test5/login" method="post">
    <label for="name">用户名:</label><input type="text" required id="name" name="name"><br>
    <label for="password">密码: </label><input type="password" id="password" name="password"><br>
    <input type="submit" value="登录">
    <input type="button" value="注册" onclick="location.href='test5/register'">

</form>
</body>

<script>
    if('${result}' != ''){
        if('${result} == 0')
            alert('该账户不存在！')
        else {if('${result}' == 1)
            alert('密码错误！')
        else if('${result}' == 2){
            alert('登录成功！')}
            location.href = '/test5/teacherInfo'
        }

    }
</script>

</html>


