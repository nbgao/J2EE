<html>
<head>
<title>显示为Word文档</title>
</head>
<%@ page contentType="text/html; charset=GBK" %>
<body>
<p>response对象<br>setContentType方法
<p>将当前页买保存为word文档
<%
	response.setContentType("application/msword;charset=GB2312");
%>
</body>
</html>