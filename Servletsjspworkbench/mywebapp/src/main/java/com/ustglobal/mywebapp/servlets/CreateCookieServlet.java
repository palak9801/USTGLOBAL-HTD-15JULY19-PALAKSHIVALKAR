package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createCookie")
public class CreateCookieServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Cookie cookie = new Cookie("name", "Judo");
		Cookie cookie1 = new Cookie("name1", "Judo1");
		
		resp.addCookie(cookie);
		resp.addCookie(cookie1);
		
PrintWriter out = resp.getWriter();
resp.setContentType("text/html");
out.println("<h1>Cookie Created Successfully");
		
	}


}
