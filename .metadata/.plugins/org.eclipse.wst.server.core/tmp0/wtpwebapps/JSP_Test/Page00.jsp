<html>
<head>
<title>����������ִ��</title>
</head>
<%@ page language="java" contentType="text/html;charset=GBK" %>
<%@ page import="java.util.*" %>
<body>
<%
	Date dnow = new Date();
	int dhours = dnow.getHours();
	int dminutes = dnow.getMinutes();
	int dseconds = dnow.getSeconds();
	out.print("������ʱ��:" + dhours + ":" + dminutes + ":" + dseconds);
%>
</body>

<SCRIPT LANGUAGE="JavaScript">
	var dnow = new Date();
	dhours = dnow.getHours();
	dminutes = dnow.getMinutes();
	dseconds = dnow.getSeconds();
	document.write("<br>�����ʱ��:" + dhours + ":" + dminutes + ":" + dseconds);
</SCRIPT>

</html>
