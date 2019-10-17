  <%@page import="com.ust.ustspringmvc.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
   Employee employee = (Employee)session.getAttribute("emp");       
%>

<body>
<div >

<span ><a href="./home">Home</a></span>
<span style="float:right"><a href="./logout">Logout</a></span>


</div>

	<form action="./update" method="POST">

		<table>
		
		    <tr>
				<td>ID:</td>                <!--   //to get the previous value -->
				<td><input type="text" name="id"  value="<%=employee.getId()%>" readonly="readonly"></td>
			</tr>

			<tr>
				<td>NAME:</td>
				<td><input type="text" name="name"  value="<%=employee.getName()%> "></td>
			</tr>
			
			<tr>
				<td>D.O.B</td>
				<td><input type="date" name="dob"></td>
			</tr>

			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"  value="<%=employee.getPassword()%>" ></td>
			</tr>

			<tr>
				<td><button type="submit">Submit</button></td>
			</tr>
		</table>







	</form>

</body>
</html>