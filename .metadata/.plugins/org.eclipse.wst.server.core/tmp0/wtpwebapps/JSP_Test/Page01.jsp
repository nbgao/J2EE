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
<p>��1�ӵ�100�Ľ��Ϊ:<%= value %> </p>
<p>������:<%= new java.util.Date() %> </p>
</body>
</html>