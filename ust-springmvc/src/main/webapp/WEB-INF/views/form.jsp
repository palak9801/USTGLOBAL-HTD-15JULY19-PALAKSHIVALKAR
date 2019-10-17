<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="./form" method="POST">

<table>

  <!-- <tr>
    <td>ID:</td>  id is not required as it is auto generated
    <td><input type="number" name="id"></td>
  </tr> -->
  
  <tr>
  <td>D.O.B</td>
  <td><input type="date" name="dob"></td>
  </tr>
  
    <tr>
    <td>NAME:</td>
    <td><input type="text" name="name"></td>
  </tr>
    <tr>
    <td>EMAIL:</td>
    <td><input type="email" name="email"></td>
  </tr>
  
  <tr>
  <td>Password:</td>
    <td><input type="password" name="password"></td>
  </tr>
  
  <tr>
  <td><button type="submit">Submit</button></td>
  </tr>
</table>







</form>

</body>
</html>