package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getEmp")
public class GetEmployeeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empIdval = req.getParameter("empId");
		int empId = Integer.parseInt(empIdval);
		
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	out.println("<html>");
	out.println("<body>");
    
	if(empId == 101) {
		out.println("<h2>Employee Details for Emp Id --"+ empId+" </h2>");
		out.println("Id = 101 <br>");
		out.println("Name = Palak <br>");
		out.println("Age = 21 <br>");
		out.println("Phone = 789456123");
		out.println("Salary = 30000");
	}else {
		out.println("<h2 style=\"color: red \">Record Not Found for empId " +empId+ "</h2>");
		
	}
	out.println("</body>");
	out.println("</html>");
	
	
	}
	
	

}
