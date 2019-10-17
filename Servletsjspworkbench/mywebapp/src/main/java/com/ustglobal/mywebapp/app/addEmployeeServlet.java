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

import com.ustglobal.mywebapp.dao.EmployeeDAO;
import com.ustglobal.mywebapp.dao.EmployeeDAOImpl;
import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/addEmp")
public class addEmployeeServlet extends HttpServlet {

	EmployeeInfoBean ebean = new EmployeeInfoBean();
	private EmployeeDAOImpl dao = new EmployeeDAOImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		if (session != null) {


		Scanner sc = new Scanner(System.in);

		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);
		String empNameVal = req.getParameter("empName");
		String ageVal = req.getParameter("age");
		int age = Integer.parseInt(ageVal);
		String salaryVal = req.getParameter("salary");
		Double salary = Double.parseDouble(salaryVal);
		String designationVal = req.getParameter("designation");

		ebean.setEmpId(empId);
		ebean.setEmpName(empNameVal);
		ebean.setAge(age);
		ebean.setSalary(salary);
		ebean.setDesignation(designationVal);

		EmployeeInfoBean employeeInfoBean = dao.addEmployee(ebean);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		} else {
			resp.sendRedirect("./loginForm.html");

		}



	}
}
