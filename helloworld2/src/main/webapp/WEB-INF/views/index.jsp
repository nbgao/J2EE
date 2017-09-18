<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>主页</title>
</head>
<body>
<h2>Hello World!</h2>
<a href="/test/href1">测试页面1 </a><br>
<a href="/test/href2">测试页面2 </a><br>
<label for="data">输入数据</label>
<input type="text" id="data" name="data" onchange="changeUrl(thid)"><br>
<a id="test3" href="/test/href3/data=">测试页面3</a><br>
<br><br><br>
<label for="form1">表单传值: get方法</label>
<form id="form1" action="/test/href4" method="get" >
    Begin:<input type="text" name="t1"><br>
    End:<input type="text" name="t2" ><br>
    <input type="submit" value="点击提交">
</form>
<br><br>
<label for="form2">表单传值: post方法</label>
<form id="form2" action="/test/href4" method="post">
    Begin:<input type="text" name="t1"><br>
    End:<input type="text" name="t2"><br>
    <input type="submit" value="点击提交">
</form>

</body>
<script>
    function changeUrl(obj){
        document.getElementById("test3").href="/test/href3/data=" + obj.value;
    }
</script>
</html>
