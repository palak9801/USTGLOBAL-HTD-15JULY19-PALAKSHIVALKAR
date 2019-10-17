package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myFirstServlet")   //to configure the url
public class MyFirstServlet extends HttpServlet {    //to create a servlet
	
	/*
	 * public MyFirstServlet() { System.out.println("Instantiation"); }
	 * 
	 * @Override public void init() throws ServletException {
	 * System.out.println("Init"); }
	 * 
	 * @Override protected void service(HttpServletRequest req, HttpServletResponse
	 * resp) throws ServletException, IOException { System.out.println("Service");
	 * System.out.println("new"); }
	 */
	
	/*
	 * @Override public void destroy() { System.out.println("Destroy"); }
	 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	Date date = new Date();
	
	resp.setContentType("text/html");    //to tell the browser and as we are sending a html response we will pass "text/html"
	//resp.setHeader("refresh", "1");     //this is used to update the time automaticallyy   this is one way to create header
	PrintWriter out = resp.getWriter();//  getWriter() return the object of printWriter
	out.println("<html>");
	
	out.println("<head>");
	out.println("<meta http-equiv=\"refresh\" content=\"1\">"); //2nd way to create the header
	out.println("</head>");
	
	out.println("<body>");
	out.println("<h2>Current System Date & Time <br>");
	out.println(date);
	out.println("</h2>");
	out.println("</body>");
	out.println("<html>");
	
	}//end of doGet()

}//end of class
