<html>
<head>
<title>使用request对象获取用户提交的所有参数名字和值</title>
</head>
<%@ page contentType="text/html; charset=GBK" %>
<%@ page import="java.util.*" %>
<body>
<%
	String current_param = "";
	request.setCharacterEncoding("GBK");
	Enumeration params = request.getParameterNames();
	while(params.hasMoreElements()){
		current_param = (String)params.nextElement();
		out.print("Name:" + current_param + "<br>");
		out.println("Values:" + request.getParameter(current_param) + "<br>");
	}
%>


</body>
</html>