package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mycontext")
public class MyServletContextServlet extends HttpServlet{
  
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    
		ServletContext context = getServletContext();
		String myParamVal = context.getInitParameter("myParam");
		resp.setContentType("text/htmml");
		 
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>My Config Param value is"+ myParamVal+"</h3>");
		
		out.println("/body>");
		out.println("<html>");
	}
	
}
