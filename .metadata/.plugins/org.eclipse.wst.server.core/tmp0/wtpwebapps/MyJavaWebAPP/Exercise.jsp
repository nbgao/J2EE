<%@ page language="java" contentType="text/html; charset=utf-8"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My JSP 'Exercise.jsp' starting page</title>
</head>

<body>
	<%!
		//返回九九乘法表对应的HTML代码,用过表达式来调用，在页面上显示
		String printMultiTable1(){
			String s = "";
			for(int i=1;i<=9;i++){
				for(int j=1;j<=i;j++){
					s += i + "*" + j + "=" + (i*j) + "&nbsp;&nbsp;";
				}
				s += "<br>";	//追加换行标签
			}
			return s;
		}
	
		void printMultiTable2(JspWriter out) throws Exception{
			for(int i=1;i<=9;i++){
				for(int j=1;j<=i;j++){
					out.println( i + "*" + j + "=" + (i*j) + "&nbsp" );
				}
				out.println("<br>");	//换行
			}	
		}
	%>
	<h1>九九乘法表</h1>
	<hr>	
	<%= printMultiTable1() %>
	<br>
	<% printMultiTable2(out); %>
	<br>
	
</body>
</html>