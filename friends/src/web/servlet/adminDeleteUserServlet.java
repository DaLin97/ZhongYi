package web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import service.adminDeleteUserService;
import service.impl.adminDeleteUserServiceImpl;

@WebServlet("/adminDeleteUserServlet")
public class adminDeleteUserServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//处理乱码
		request.setCharacterEncoding("UTF-8");
		
		String userID = request.getParameter("UserID");
		
		User user = new User();
		user.setUuid(userID);
		request.setAttribute("User", user);
		adminDeleteUserService ad = new adminDeleteUserServiceImpl();
		boolean delete = ad.adminDeleteUser(user);
		
		if(delete){//删除成功
			request.setAttribute("DELETE", "删除成功");
			request.getRequestDispatcher("/AdminDeleteUser.jsp").forward(request, response);
		}else{//删除失败
			request.setAttribute("DELETE", "删除失败,请确认ID是否输入正确或ID是否存在");
			request.getRequestDispatcher("/AdminDeleteUser.jsp").forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}