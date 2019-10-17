package com.ustglobal.mywebapp.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/myAttributesValue")
public class MyAttributeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	ServletContext context = getServletContext();
	context.getAttribute("emp");
	EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) context.getAttribute("emp");
	
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
	
	
	
	/*
	 * first run http://localhost:8081/mywebapp/contextAttr and then
	 * http://localhost:8081/mywebapp/myAttributesValue
	 */	

	
	
}
