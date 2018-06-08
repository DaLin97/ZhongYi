package web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Admin;
import service.AdminService;
import service.impl.AdminServiceImpl;
import utils.MD5Utils;

@WebServlet("/adminServlet")
public class adminServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		MD5Utils md = new MD5Utils();
//		String pass = md.md5("123456");
//		System.out.println(pass);
		
		
		
		//处理乱码
		request.setCharacterEncoding("UTF-8");
		
		String AdminUsername = request.getParameter("AdminUsername");
		String AdminPassword = request.getParameter("AdminPassword");
		MD5Utils md = new MD5Utils();
		AdminPassword = md.md5(AdminPassword);
		
		Admin admin = new Admin();
		admin.setAdminUsername(AdminUsername);
		admin.setAdminPassword(AdminPassword);
		
		AdminService ads = new AdminServiceImpl();
		boolean pass = ads.checkPass(admin);
		
		if(pass){//用户名密码正确
			HttpSession session = request.getSession();
			session.setAttribute("user", admin.getAdminUsername());
			response.sendRedirect(request.getContextPath() + "/AdminChange.jsp");
		}else{//错误
			request.setAttribute("ERROR", "用户名密码有错误");
			request.getRequestDispatcher("/Administration.jsp").forward(request, response);// 转发
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}