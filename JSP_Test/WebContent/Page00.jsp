<html>
<head>
<title>理解服务器端执行</title>
</head>
<%@ page language="java" contentType="text/html;charset=GBK" %>
<%@ page import="java.util.*" %>
<body>
<%
	Date dnow = new Date();
	int dhours = dnow.getHours();
	int dminutes = dnow.getMinutes();
	int dseconds = dnow.getSeconds();
	out.print("服务器时间:" + dhours + ":" + dminutes + ":" + dseconds);
%>
</body>

<SCRIPT LANGUAGE="JavaScript">
	var dnow = new Date();
	dhours = dnow.getHours();
	dminutes = dnow.getMinutes();
	dseconds = dnow.getSeconds();
	document.write("<br>浏览器时间:" + dhours + ":" + dminutes + ":" + dseconds);
</SCRIPT>

</html>
