package web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;

import bean.User;
import service.LoginService;
import service.RegisterService;
import service.impl.LoginServiceImpl;
import service.impl.RegisterServiceImpl;
import utils.C3P0Utils;
import utils.MD5Utils;
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//1.接受注册信息参数
		String username =  request.getParameter("username");
		String password1 =  request.getParameter("password");
		String email =  request.getParameter("email");
		String realname =  request.getParameter("realName");
		String sex =  request.getParameter("sex");
		String birthday =  request.getParameter("birthday");
		String marital =  request.getParameter("marital");
		String education =  request.getParameter("education");
		String salary =  request.getParameter("salary");
		String checkcode = request.getParameter("checkcode");
		MD5Utils md = new MD5Utils();//加密
		String password = md.md5(password1);
		//2.封装成对象
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		user.setRealName(realname);
		user.setSex(sex);
		user.setBirthday(birthday);
		user.setMarital(marital);
		user.setEducation(education);
		user.setSalary(salary);
		String uuid = UUID.randomUUID().toString();
		user.setUuid(uuid);
		//2.判断验证码
		String checkcode_session = (String)request.getSession().getAttribute("checkcode_session");
		if(checkcode_session.equals(checkcode)){
			//3.调用service的注册方法
			RegisterService rs = new RegisterServiceImpl();
			boolean register = rs.reg(user);
			if(register){//注册成功
				request.getSession().setAttribute("user", register);
				// 注册成功，跳转到登录界面
				response.sendRedirect(request.getContextPath()+"/login.jsp");
				System.out.println("注册成功");
			}else{//注册失败，跳转到注册界面
				System.out.println("注册失败");
				response.sendRedirect(request.getContextPath()+"/register.jsp");
			}

			}else{//验证码错误
				request.setAttribute("checkcodeERROR","验证码错误！");
				request.getRequestDispatcher("/register.jsp").forward(request, response);
			}
		}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}