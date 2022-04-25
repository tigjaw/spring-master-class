<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Yahoo!!! From JSP</title>
	</head>
	<body>
		<!-- http://localhost:8080/?get1=in28minutes&get2=dummy -->
		Get-Request Info: http://localhost:8080/?get1=${get1}&get2=${get2}
		<br>
		get1: ${get1}
		<br>
		get2: ${get2}
		<br>
		<form action="login.do" method="post">
			<p><font color="red">${error}</font></p>
			Username: <input type="text" name="name"/>
			<br>
			Password : <input type="password" name="password"/>
			<input type="submit" value="Login"/>
		</form>
	</body>
</html>