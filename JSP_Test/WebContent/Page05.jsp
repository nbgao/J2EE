<html>
<head>
<%@ page contentType="text/html;charset=GBK" %>
<title>函数的声明和使用</title>
</head>
<body>
<%!
	int number = 0;
	synchronized void countPeople(){
		number++;
	}
%>
<%
	countPeople();
%>
您是第<% out.print(number); %>个访问本站的客户。
</body>
</html>