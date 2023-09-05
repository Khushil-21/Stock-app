<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>SignUp Page</title>
	</head>
	<style>
		body {
			display: flex;
			align-items: center;
			justify-content: center;
			height: 100vh;
			overflow: hidden;
		}

		h1 {
			text-align: center;
		}

		form div {
			width: 20vw;
			display: flex;
			align-items: center;
			justify-content: space-between;

		}

		.submit {
			display: flex;
			align-items: center;
			justify-content: center;
		}

		.main {
			background-color: royalblue;
			width: 40vw;	
			height: 50vh;
			display: flex;
			flex-direction:column;
			align-items: center;
			justify-content: center;
			border-radius: 10px;
		}

		form {
			display: flex;
			align-items: center;
			justify-content: space-evenly;
			flex-direction: column;
			height: 40vh;
		}
	</style>

	<body>
		<div class="main">
			<h1>Sign - Up</h1>
			<form action="SaveUserServlet" method="post">
				<div>
					FirsnName :- <input type="text" name="firstname" placeholder="Enter Your Name">
				</div>
				<div>
					Email:- <input type="email" name="email" placeholder="Enter Your Email" />
				</div>
				<div>
					Password :- <input type="password" name="password" placeholder="Enter Your Password">
				</div>
				<div class="submit"><input type="submit" value="Register"></div>

			</form>
		</div>
	</body>

	</html>