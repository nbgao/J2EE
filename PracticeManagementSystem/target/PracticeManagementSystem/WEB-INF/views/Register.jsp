<%--
  Created by IntelliJ IDEA.
  User: Pengbing
  Date: 2017/5/6
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Page</title>
</head>
<body>
<form id="register" action="/test5/register" method="post">
    <label for="name">用户名：</label> <input type="text" required id="name" name="name"><br>
    <label for="password">密码：</label> <input type="password" required id="password" name="password"><br>
    性别：<input type="radio" required value="0" name="sex">男 <input type="radio" value="1" name="sex">女<br>
    <input type="submit" value="注册" >
    <input type="reset" value="重置">
</form>
</body>

<script>
    if('${result}' != ''){
        if('${result}' == 1){
            alert('注册成功，将跳转到登陆页面！')
            location.href = '/test5/login'
        }else if('${result}' == 0){
            alert('未知错误，注册失败！')
        }else if('${result}' == 2){
            alert('该帐号已有人注册！')
        }

    }

</script>

</html>
