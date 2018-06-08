package web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;
import service.Member_infoService;

import service.impl.Member_infoImpl;

@WebServlet("/Member_info")
public class Member_info extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.向service索要数据
		Member_infoService ps = new Member_infoImpl();
		// service接口返回一个User
		User User = new User();
		String uuid = request.getParameter("UUID");
		System.out.println(uuid);
		User.setUuid(uuid);
		User = ps.QqueryUser(User);
		// 将集合保存到域对象中
//		System.out.println(User);
		request.setAttribute("User", User);
		// // 3.转发到相应的jsp页面
		request.getRequestDispatcher("/Member_info.jsp").forward(request, response);
		// response.sendRedirect("/Member_info.jsp");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
