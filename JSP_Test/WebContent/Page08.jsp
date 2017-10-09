<html>
<head>
<title>改变动态响应头</title>
</head>
<%@ page contentType="text/html; charset=GBK" %>
<%@ page import="java.util.*" %>
<body>
<p>现在的时间是:<br>
<%
	out.println("" + new Date());
	response.setHeader("Refrsh", "5");
%>
</body>
</html>