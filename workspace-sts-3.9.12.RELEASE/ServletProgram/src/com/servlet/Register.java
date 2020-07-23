package com.servlet;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
// import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// @WebServlet("/Register")
public class Register extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String a=request.getParameter("uname");
		String b=request.getParameter("upass");
		String c=request.getParameter("umail");
		String d=request.getParameter("umobile");
		String e=request.getParameter("uCountry");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reg007","root","root");
			PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?,?,?)");
			ps.setString(1, a);
			ps.setString(2, b);
			ps.setString(3, c);
			ps.setString(4, d);
			ps.setString(5, e);
			int x=ps.executeUpdate();
			if(x>0)
				out.println("Successfully Registered to the Database");
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}

}