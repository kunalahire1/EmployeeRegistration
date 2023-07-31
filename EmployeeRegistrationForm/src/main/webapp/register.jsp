<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="register.css">

</head>
<body>
<form action="register"method = "POST">>
		<div class="design">
			<center>
			<div class="style">
			<h3>Employee Registration Form</h3>
			<label>Enter First Name</label>
				<input type="text" name="fName"> 
				<label>Enter Last Name</label>
				<input type="text"name="lName"> 
				<label>Enter email</label>
				<input type="email" name="email"> 
				<label>Enter Password</label>
				<input type="password" name="password">
				<input type="submit"value="Submit">
				</div>
			</center>
		</div>
	</form>
</body>
</html>