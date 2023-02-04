<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body bgcolor="skyblue">
	<h2>Register Here </h2>
	<form action="SaveLocation" method="post">
		<pre>
			FirstName<input type="text" name="firstName"/><br>
			LastName<input type="text" name="lastName"/><br>
			Email ID<input type="text" name="email"/><br>
			Password<input type="text" name="password"/><br>
			<input type="submit" value="Save"/>
		</pre>
	</form>
</body>
</html>