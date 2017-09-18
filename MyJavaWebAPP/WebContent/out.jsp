<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>out内置对象</title>
</head>
<body>
	<h1>out内置对象</h1>
	<% out.println("println方法"); %>
	缓冲器大小:<%=out.getBufferSize() %>Byte<br>
	缓冲期剩余大小:<%=out.getRemaining() %>Byte<br>
	是否自动清空缓冲区:<%=out.isAutoFlush() %><br>
</body>
</html>