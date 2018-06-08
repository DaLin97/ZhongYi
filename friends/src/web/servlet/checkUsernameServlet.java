package web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserService;
import service.impl.UserServiceImpl;
@WebServlet("/checkUsernameServlet")
public class checkUsernameServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 0.处理乱码 - Filter
		// 1.获得请求参数 - 用户名
		String username = request.getParameter("username");
		// 2.调用service判断是否有此用户
		UserService us = new UserServiceImpl();
		boolean isExists = us.isExistsUser(username);
		// 3.将结果返回客户端
		// {"isExist":isExists}
		response.getWriter().write("{\"isExist\":"+isExists+"}");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}