package com.ustglobal.mywebapp.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/reqAAttribute")
public class ReqAttributeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) req.getAttribute("employee");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<head>");
		out.println("<body>");
		out.println("<h3>Employee Details are--<h3>");
		out.println("Name="+employeeInfoBean.getEmpName());
		out.println("<br/>Age--"+employeeInfoBean.getAge());
		out.println("<br/>Salary -- "+employeeInfoBean.getSalary());
		out.println("<br/>Designation -- "+employeeInfoBean.getDesignation());
		out.println("</body>");
		out.println("</html>");
		
		
		
		

	}
}
