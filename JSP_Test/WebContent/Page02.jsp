<html>
<head>
<title>JSP中的Exception捕捉</title>
</head>

<%@ page language="java" errorPage="Page03.jsp"
contentType="text/html;charset=GBK"%>
<%@ page import="java.io.*" %>

<% 
	int dividend = 0;
	int divisor = 0;
	int result = 0;
	try {
		result = dividend/divisor;
	}	catch(ArithmeticException zz) {
		throw new ArithmeticException( "除数不能为零！" );
	}
%> 
