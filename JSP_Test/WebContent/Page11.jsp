<html>
<head>
<title>��ȡ������</title>
</head>
<%@ page contentType="text/html; charset=GBK" %>
<%
	request.setCharacterEncoding("GBK");
	String strUserName = "";
	String strUserPWD = "";
	strUserName = request.getParameter("UserID");
	strUserPWD = request.getParameter("UserPWD");
%>
����:<%=strUserName %><br>
����:<%=strUserPWD %>
</body>
</html>