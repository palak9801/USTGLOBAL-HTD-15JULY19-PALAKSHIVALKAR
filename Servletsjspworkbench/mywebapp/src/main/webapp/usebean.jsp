<%@page import="com.ustglobal.mywebapp.dto.EmployeeInfoBean"%>                     <!--  this both  line 1 and 2 are directive tag -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ include file="/index.jsp" %>
    
    <%@page errorPage="error.jsp" %>
    
    <jsp:useBean id="emp" 
    class="com.ustglobal.mywebapp.dto.EmployeeInfoBean" 
    scope="application"></jsp:useBean>
    
    <%
      int i = 10/0;
     %>
    
    
    
    
    <%--  this can also be used but above method is more preferable <% EmployeeInfoBean bean = |(EmployeeInfoBean)application.getAttribute("emp"); %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1><%=emp.getEmpName()%></h1>
<h1><%=emp.getAge()%></h1>

</body>
</html>










<!-- first--http://localhost:8081/mywebapp/contextAttr
second--http://localhost:8081/mywebapp/usebean.jsp -->