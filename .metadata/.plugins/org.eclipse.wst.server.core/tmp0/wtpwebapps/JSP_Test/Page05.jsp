<html>
<head>
<%@ page contentType="text/html;charset=GBK" %>
<title>������������ʹ��</title>
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
���ǵ�<% out.print(number); %>�����ʱ�վ�Ŀͻ���
</body>
</html>