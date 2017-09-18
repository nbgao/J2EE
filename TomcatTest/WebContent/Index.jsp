<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8 ">
<title>Welcome Page</title>
</head>
<body>
	<H2>Hello Tomcat!</H2>
	<!-- 我是HTML注释，在客户端可见 -->
	<%-- 我是JSP注释，在客户端不可见 --%>
	<%  //单行注释
		/*
		多行注释
		*/
	%>
	
	<%!
		String s = "JSP";
		int add(int x,int y){
			return x + y;
		}
	%>
</body>
</html>