<html>
<head>
<title>ErrorPage</title>
</head>
<%@ page language="java" isErrorPage="true" contentType="text/html;charset=GBK" %>
<%@ page import="java.io.*" %>
<body>
<p>
当前页面是: Page03 <br>
</p>
<%
	out.print(exception.toString());
%>
</body>
</html>