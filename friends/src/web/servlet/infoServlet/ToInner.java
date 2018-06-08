package web.servlet.infoServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import service.infoService.TOinnerService;
import service.infoService.impl.TOinnerServiceImpl;

@WebServlet("/TOinner")
public class TOinner extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 处理乱码
		request.setCharacterEncoding("UTF-8");

		String username = null;
		User attribute = (User) request.getSession().getAttribute("user");
		System.out.println(attribute.getUsername());
		if(attribute.getUsername() != null){
			username = attribute.getUsername();
		}else{
			username = "001";
		}
		// 3.封装成User
		User user = new User();
		user.setUsername(username);

		TOinnerService TOreg = new TOinnerServiceImpl();
		User newUser = TOreg.queryTOinner(user);
		request.setAttribute("User", newUser);
		System.out.println(newUser.getInnerinfo());
		request.getRequestDispatcher("/info_baseinfo_Inner.jsp").forward(request, response);// 转发
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}