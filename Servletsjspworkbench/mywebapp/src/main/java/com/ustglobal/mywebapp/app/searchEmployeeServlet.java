
package com.ustglobal.mywebapp.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.mywebapp.dao.EmployeeDAO;
import com.ustglobal.mywebapp.dao.EmployeeDAOImpl;
import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/searchEmp")
public class searchEmployeeServlet extends HttpServlet {

	private EmployeeDAO dao = new EmployeeDAOImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		if (session != null) {

			// get the form data
			String empIdVal = req.getParameter("empId");
			int empId = Integer.parseInt(empIdVal);

			EmployeeInfoBean employeeInfoBean = dao.searchEmployee(empId);

			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if (employeeInfoBean != null) {
				out.println("<h3>Employee Data for Employee Id " + empId + "</h3>");
				out.println("Employee Id --" + employeeInfoBean.getEmpId());
				out.println("<br/>Employee Name --" + employeeInfoBean.getEmpName());
				out.println("<br/>Employee Age --" + employeeInfoBean.getAge());
				out.println("<br/>Employee Salary --" + employeeInfoBean.getSalary());
				out.println("<br/>Employee Designation --" + employeeInfoBean.getDesignation());
			} else {
				out.println("<h2>Employee Record for id " + empId + " Not Found!!!</h2>");
			}
			out.println("</body>");
			out.println("</html>");

		} else {
			resp.sendRedirect("./loginForm.html");

		}

	}// end of doGet

}// end of main
