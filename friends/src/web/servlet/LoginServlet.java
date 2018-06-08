package web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import service.LoginService;
import service.impl.LoginServiceImpl;
import utils.MD5Utils;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//1.获得参数
		String username = request.getParameter("username");
		String password2 = request.getParameter("password");
		String checkcode = request.getParameter("checkcode");
		MD5Utils mdlogin = new MD5Utils();//加密
		String password = mdlogin.md5(password2);
		//2.判断验证码
		String checkcode_session = (String)request.getSession().getAttribute("checkcode_session");
		if(checkcode_session.equals(checkcode)){
					
			//3.将参数封装成对象
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			//4.调用service的登录方法
			LoginService us = new LoginServiceImpl();
			User loginUser = us.login(user);
			if(loginUser!=null){//登录成功
				request.getSession().setAttribute("user", loginUser);
				//5.跳转到主页
				request.getRequestDispatcher("/indexServlet").forward(request, response);
				System.out.println("登录成功");
			}else{//如果登录失败，提示账号密码错误
				System.out.println("用户名密码错误");
				request.setAttribute("passERROR","用户名或密码错误！");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
		}else{//提示验证码错误
			System.out.println("验证码错误");
			request.setAttribute("checkERROR","验证码错误！");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}

		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
