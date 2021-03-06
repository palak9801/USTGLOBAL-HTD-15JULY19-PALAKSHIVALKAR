package com.ustglobal.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
		employeeInfoBean.setEmpId(122);
		employeeInfoBean.setEmpName("palak");
		employeeInfoBean.setAge(22);
		employeeInfoBean.setSalary(100000);
		employeeInfoBean.setDesignation("FSD");

		req.setAttribute("employee", employeeInfoBean);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/reqAAttribute");
		dispatcher.forward(req, resp);

	}

}

