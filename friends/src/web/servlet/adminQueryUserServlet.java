package web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import service.adminQueryUserService;
import service.impl.adminQueryUserServiceImpl;

@WebServlet("/adminQueryUserServlet")
public class adminQueryUserServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//处理乱码
		request.setCharacterEncoding("UTF-8");
		
		String username = request.getParameter("username");
		
		User user = new User();
		user.setUsername(username);
		System.out.println(user.getUuid());
		adminQueryUserService adQuery = new adminQueryUserServiceImpl();
		user = adQuery.adminQueryUse(user);
		request.setAttribute("User", user);
		System.out.println(user.getUuid());
		request.getRequestDispatcher("/AdminChangeUser.jsp").forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}