<%@page import="java.util.Date"%>
<%!

    public void jspInit() {

		System.out.println("init");
	}
%>
<%!
	public void jspDestroy() {
		System.out.println("destroy");    
	}
	
%>
<% int count = 0; %>
<% Date date = new Date(); %>


<html>
<body>
	<h2>Hello World!</h2>
	<h2>Count Value = <%=count%></h2>
	<h2>Current Date and Time = <%=date%></h2>
</body>
</html>
