<%@ page contentType="text/html;charset=GB2312" %>
<html>
<head>
<title>Request</title>
</head>
<body>
<form method="POST" action="Post.jsp">
	<p align="center">�û���¼
	<p align="center">
		�û���:<input type="text" name="User" size="20" >&nbsp;&nbsp;&nbsp;&nbsp;
		����:<input type="password" name="pwd" size="20" ><br><br>
		���������:<input type="radio" name="radio" value="ie" checked>IE &nbsp;&nbsp;
				  <input type="radio" name="radio" value="chrome">Chrome<br>
		����ѡ��:<input type="checkbox" name="check1" value="ON" checked>����
				<input type="checkbox" name="check2" value="ON">��ϸ
				<input type="hidden" name="hidden" value="transPara">
	</p>
	<p align="center">
		<input type="submit" value="�ύ">
		<input type="reset" value="ȫ����д">
	</p>
</form>
</body>
</html>