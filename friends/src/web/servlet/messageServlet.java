package web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import service.Member_infoService;
import service.messageService;
import service.impl.Member_infoImpl;
import service.impl.MessageServiceImpl;
@WebServlet("/messageServlet")
public class messageServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.向service索要数据
		messageService ps = new MessageServiceImpl();
		// service接口返回一个User
		User user = new User();
		User user1 = (User) request.getSession().getAttribute("user");
		
		
		user.setUuid(user1.getUuid());
		User User = ps.QueryUser(user);
		// 将集合保存到域对象中
		System.out.println(User);
		request.setAttribute("User", User);
		// 3.转发到相应的jsp页面
		request.getRequestDispatcher("/message.jsp").forward(request, response);

		
		
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}