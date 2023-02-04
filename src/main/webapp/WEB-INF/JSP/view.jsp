<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create</title>
</head>
<body bgcolor="skyblue">
	<h2>Register Here</h2>
	
${location}
	<form action="save" method="post">
		<pre>
			Id<input type="number" name="id"/><br>
			Name<input type="text" name="name"/><br>
			Code<input type="text" name="code"/><br>
			Type:<input type="radio" name="type" value="urban"/>Urban<input type="radio" name="type" value="rural"/>Rural
			<input type="submit" value="Save"/>
		</pre>
	</form>
</body>
</html>