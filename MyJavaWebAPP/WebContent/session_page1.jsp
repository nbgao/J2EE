<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*,java.text.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Session Page1</title>
</head>
<body>
	<h1>session内置对象</h1>
	<hr>
	<%
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss ");
		Date d = new Date(session.getCreationTime());
		session.setAttribute("username","Admin");
		session.setAttribute("password","123456" );
		session.setAttribute("age",20);
		
	%>
	Session创建时间: <%=sdf.format(d) %><br>
	Session的ID编号: <%=session.getId() %><br>
	从Session中获取用户名: <%=session.getAttribute("username") %><br>

	<a href="session_page2.jsp" target="blank">跳转到Sesson_page2.jsp</a>
</body>
</html>