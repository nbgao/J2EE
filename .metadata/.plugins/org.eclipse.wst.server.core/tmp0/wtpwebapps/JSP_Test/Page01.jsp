<html>
<head>
<title>JSP Date Example</title>
</head>
<%@ page language="java" %>
<%@ page contentType="text/html;charset=GB2312" %>

<body>
<%! int value = 0; %>
<%
for(int i=1;i<=100;i++){
	value += i;
}
%>
<p>从1加到100的结果为:<%= value %> </p>
<p>今天是:<%= new java.util.Date() %> </p>
</body>
</html>