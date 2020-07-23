package com.servlet;

import java.io.*;
import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// @WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name=request.getParameter("uname");
		String password=request.getParameter("upass");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>Servlet2</title></head>");
		out.println("<body><p>UserName is : "+name+"<p>Password is : "+password+"</body></html>");
	}

}
