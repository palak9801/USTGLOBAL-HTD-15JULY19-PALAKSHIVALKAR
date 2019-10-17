<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="./register" method="POST">

		<table>

			<tr>
				<td>NAME:</td>
				<td><input type="text" name="name" required="required"></td>
			</tr>
			
			<tr>
				<td>D.O.B</td>
				<td><input type="date" name="dob"></td>
			</tr>
			
			<tr>
				<td>EMAIL:</td>
				<td><input type="email" name="email" required="required"></td>
			</tr>

			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" required="required"></td>
			</tr>

			<tr>
				<td><button type="submit">Submit</button></td>
			</tr>
		</table>







	</form>


</body>
</html>