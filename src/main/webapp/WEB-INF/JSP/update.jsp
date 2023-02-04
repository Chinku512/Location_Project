<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body bgcolor="skyblue">
		<h2>Update Here</h2>
	<form action="updatelocation" method="post">
		<pre>
			Id<input type="number" name="id" value="${location.id }"/><br>
			Name<input type="text" name="name" value="${location.name }"/><br>
			Code<input type="text" name="code" value="${location.code }"/><br>
			Type:<input type="radio" name="type" value="urban"/>Urban<input type="radio" name="type" value="rural"/>Rural
			<input type="submit" value="Update"/>
		</pre>
	${msg}
</form>
</body>
</html>