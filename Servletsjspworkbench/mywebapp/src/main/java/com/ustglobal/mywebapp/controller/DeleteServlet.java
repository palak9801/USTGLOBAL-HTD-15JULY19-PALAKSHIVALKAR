package com.ustglobal.mywebapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.mywebapp.dao.EmployeeDAO;
import com.ustglobal.mywebapp.dao.EmployeeDAOImpl;


@WebServlet("/delete")
public class DeleteServlet  extends HttpServlet{
	  
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		
		EmployeeDAO dao = new EmployeeDAOImpl();
		dao.deleteEmployeee(Integer.parseInt(id));
		
		//after deleting the session should be invalidated and to redirect it to the login and forward login.jsp
		
		
		
		resp.sendRedirect("./login");
		
		
		
	}
	

}
