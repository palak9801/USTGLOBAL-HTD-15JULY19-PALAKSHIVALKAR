package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServletConfigServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		ServletConfig config = getServletConfig();
		String nameVal = config.getInitParameter("name");
		
		ServletContext context = getServletContext();
		String myParamVal = context.getInitParameter("myParam");
		String myParamVal2 = context.getInitParameter("myParam2");
		
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>config param value is -"+nameVal+"</h3>");
		out.println("<h3>context param value is -"+myParamVal+"</h3>");
		out.println("<h3>context param 2 value is -"+myParamVal2+"</h3>");
		out.println("<h3>"+" "+nameVal+"  "+myParamVal+" "+myParamVal2+ "</h3>");
		out.println("<body>");
		out.println("</html");
		
	}
}
