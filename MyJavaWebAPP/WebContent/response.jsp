<%@ page language="java" import="java.util.*,java.io.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	response.setContentType("text/html;charset=utf-8");	//设置相应的MIMI类型

	out.println("<h1>response内置对象</h1>");
	out.println("<hr>");
	
	
	PrintWriter outer = response.getWriter();	//获得输出流对象
	outer.println("我是response对象生成的输出流outer对象");
	
	//response.sendRedirect("register.jsp");	//请求重定向

	//请求重定向(客户端行为) 不保存原有request对象，URL地址会改变
	//response.sendRedirect("request.jsp");	
	
	
	//请求转发(服务器行为)  保存原有request对象，URL地址不会改变  
	request.getRequestDispatcher("request.jsp").forward(request,response);
%>