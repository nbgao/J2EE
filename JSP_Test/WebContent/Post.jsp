<%@ page contentType="text/html;charset=GB2312" %>
<html>
<head>
<title>Test</title>
</head>
<body>
<%
	out.println("�û���:" + request.getParameter("User") + "<br>");
	out.println("����:" + request.getParameter("pwd") + "<br>");
	out.println("�����:" + request.getParameter("radio") + "<br>");
	out.println("����:" + request.getParameter("check1") + "<br>");
	out.println("��ϸ:" + request.getParameter("check2") + "<br>");
	out.println("����:" + request.getParameter("hidden") + "<br>");
	out.println("getContentLength()=" + request.getContentLength() + "<br>");
	out.println("getRequestURL()=" + request.getRequestURL() + "<br>");
	out.println("getServerPort()=" + request.getServerPort() + "<br>");
	out.println("getServerName()=" + request.getServerName() + "<br>");
	out.println("getProtocol()=" + request.getProtocol() + "<br>");
	out.println("getRemoteAddr()=" + request.getRemoteAddr() + "<br>");
	out.println("getHeaderNames()=" + request.getHeaderNames() + "<br>");
	out.println("getMethod()=" + request.getMethod() + "<br>");
	out.println("getServletPath()=" + request.getServletPath() + "<br>");
	out.println("isRequestedSessionIdValid()=" + request.isRequestedSessionIdValid() + "<br>");
%>
</body>
</html>