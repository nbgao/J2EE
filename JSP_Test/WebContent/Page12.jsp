<html>
<head>
<title>ʹ��request�����ȡ�û��ύ�����в������ֺ�ֵ</title>
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