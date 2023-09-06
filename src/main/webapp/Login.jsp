<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form action="LoginServlet" method="post">

		<br> Email : <input type="Text" name="email" /><br> <br>
		Password : <input type="password" name="password" /><br> <br>
		<input type="submit" value="Login">
	</form>
	${error}
</body>
</html>