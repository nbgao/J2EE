<html>
<head>
<title>读取表单数据</title>
</head>
<%@ page contentType="text/html; charset=GBK" %>
<%
	request.setCharacterEncoding("GBK");
	String strUserName = "";
	String strUserPWD = "";
	strUserName = request.getParameter("UserID");
	strUserPWD = request.getParameter("UserPWD");
%>
姓名:<%=strUserName %><br>
密码:<%=strUserPWD %>
</body>
</html>