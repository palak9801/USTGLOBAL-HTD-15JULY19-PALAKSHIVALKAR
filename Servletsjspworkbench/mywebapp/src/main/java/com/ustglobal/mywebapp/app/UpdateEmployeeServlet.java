package com.ustglobal.mywebapp.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.mywebapp.dao.EmployeeDAOImpl;
import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/updateEmp")
public class UpdateEmployeeServlet extends HttpServlet {
	
	EmployeeInfoBean ebean = new EmployeeInfoBean();
	private EmployeeDAOImpl dao = new EmployeeDAOImpl();
  
	
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 HttpSession session = req.getSession(false);
			if (session != null) {


				String empIdVal = req.getParameter("empId");
				int empid= Integer.parseInt(empIdVal);
				String empNameVal = req.getParameter("empName");
				String empAgeVal = req.getParameter("age");
				int empAge = Integer.parseInt(empAgeVal);
				
				String empSalaryVal = req.getParameter("salary");
				double empSalary = Integer.parseInt(empSalaryVal);
				String empDesignationVal = req.getParameter("designation");
				
				boolean condition = dao.updateEmployee(empid, empNameVal, empAge, empSalary, empDesignationVal);
				
				

				PrintWriter out = resp.getWriter();
				
				out.println("<html>");
				out.println("<body>");
				
				if(condition) {
					out.println("<h2>Updated</h2>");
				}else {
					out.println("<h2>not updated</h2>");
				}
				
				out.println("<body>");
				out.println("<html>");
				}else {
					resp.sendRedirect("./loginForm.html");
				}
	}

}
