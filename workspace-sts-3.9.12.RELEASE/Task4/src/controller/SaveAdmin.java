package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminDao;
import model.Admin;

@WebServlet("/SaveAdmin")
public class SaveAdmin extends HttpServlet
{
	public SaveAdmin()
	{
		super();
	}
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,IOException{
		
	}
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String nameAndSurname = request.getParameter("nameAndSurname");
		String name = request.getParameter("userName");
		String password = request.getParameter("password");
		String repassword = request.getParameter("repassword");
		
		if (password.equals(repassword) && !AdminDao.validateAdminExist()) {
			Admin a = new Admin();
			a.setNameAndSurname(nameAndSurname);
			a.setUserName(name);
			a.setPassword(password);
			
			int status = AdminDao.save(a);
			if(status > 0) {
				//从客户端获得请求
				out.print("<p style='color: lightblue;text-align: center;'>Registration for Admin saved successfully!Please login!</p>");
				request.getRequestDispatcher("login.html").include(request, response);
			}else {
				out.println("<p style='color: red;text-align: center;'>Sorry, unable to save record!</p>");
				request.getRequestDispatcher("index.jsp").include(request, response);
			}	
		} else {
			out.print("<p style='color: red;text-align: center;'>Sorry, your password and repassword is not same or Admin already exist! Please repeat registration or exit application!</p>");
			request.getRequestDispatcher("index.jsp").include(request, response);
			request.getRequestDispatcher("addAdmin.html").include(request, response);
		}
		out.close();
	}

}
