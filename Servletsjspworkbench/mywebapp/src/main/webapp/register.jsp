<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="./register" method="post">

		<table>
			<tr>
				<td><input type="number" name="id" placeholder="id"></td>
			</tr>

			<tr>
				<td><input type="text" name="name" placeholder="name"></td>
			</tr>

			<tr>
				<td><input type="number" name="salary" placeholder="salary"></td>
			</tr>

			<tr>
				<td><input type="number" name="age" placeholder="age"></td>
			</tr>

			<tr>
				<td><input type="text" name="designation"
					placeholder="designation"></td>
			</tr>

			<tr>
				<td><input type="password" name="password"
					placeholder="password"></td>
			</tr>

			<tr>
				<td><input type="reset" value="reset"></td>
				<td><input type="submit" value="submit"></td>

			</tr>
		</table>

	</form>
</body>
</html>