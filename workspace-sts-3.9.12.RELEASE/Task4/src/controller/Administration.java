package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AdminDao;
import model.Admin;
@WebServlet("/Administration")
public class Administration extends HttpServlet
{
	public Administration()
	{
		super();
	}
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,IOException
	{	
	}
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String n = request.getParameter("name");
		String p = request.getParameter("password");
		Admin admin = AdminDao.getAdminByNameAndPassword(n,p);
		HttpSession session = request.getSession();
		//如果是管理员权限
		if((n.equals("admin") && p.equals("admin"))
				|| AdminDao.validateAdmin(n,p)) {
			session.setAttribute("name", n);
			session.setAttribute("admin", admin);
			response.sendRedirect("viewAdmin.jsp?page=1");//
		}
		else if(!AdminDao.validateAdmin(n,p)) {
			out.print("<p style='color: red;text-align: center;'>Sorry admin NOT exist, please register Administration user!</p>");
			request.getRequestDispatcher("addAdmin.jsp").include(request, response);
		}
		else {
			out.print("<p style='color: red;text-align: center;'>Sorry, username or password error! Please repeat entry!</p>");
			request.getRequestDispatcher("adminLogin.jsp").include(request, response);
		}
		out.close();
		
		
	}

}
