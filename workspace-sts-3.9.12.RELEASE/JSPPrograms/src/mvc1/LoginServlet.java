package mvc1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String userId=request.getParameter("userId");
		String password=request.getParameter("password");
		mvc2.LoginService ls=new mvc2.LoginService();
		boolean result=ls.authenticate(userId, password);
		if(result)
		{
			response.sendRedirect("success.jsp");
			return;
		}
		else
		{
			response.sendRedirect("error.jsp");
			return;
		}
	}

}
