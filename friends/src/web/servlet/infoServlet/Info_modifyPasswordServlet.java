package web.servlet.infoServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import service.infoService.info_modifyPasswordService;
import service.infoService.impl.info_modifyPasswordServiceImpl;
import utils.MD5Utils;

@WebServlet("/modifyPasswordServlet")
public class info_modifyPasswordServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//处理乱码
		request.setCharacterEncoding("UTF-8");
				
		String oldPassword = request.getParameter("oldPassword");
		String newPassword = request.getParameter("newPassword");
		String newPasswordConfirm = request.getParameter("newPasswordConfirm");
		
		String username = null;
		User attribute = (User) request.getSession().getAttribute("user");
		System.out.println(attribute.getUsername());
		if(attribute.getUsername() != null){
			username = attribute.getUsername();
		}else{
			username = "001";
		}
		//3.封装成User
		User user = new User();
		user.setUsername(username);
		
		//4.调用service方法修改数据库
		info_modifyPasswordService pass = new info_modifyPasswordServiceImpl();
		User userpass = pass.queryPassword(user);
		
		MD5Utils md = new MD5Utils();
		//md.md5(userpass.getPassword())
		System.out.println(md.md5(oldPassword));
		//加密后密码
		if(userpass.getPassword().equals(md.md5(oldPassword))){//旧密码正确
			if(newPassword.equals(newPasswordConfirm)){//两次输入新密码相同
				user.setPassword(md.md5(newPassword));
				boolean changePassword = pass.changePass(user);
				if(changePassword){//修改成功
					request.setAttribute("passERROR", "修改成功");
					request.getRequestDispatcher("/TOmodifyPassword").forward(request, response);// 转发
				}else{//修改失败
					request.setAttribute("passERROR", "修改失败");
					request.getRequestDispatcher("/TOmodifyPassword").forward(request, response);// 转发
				}
			}else{//两次新密码输入不同
				request.setAttribute("passDifferentERROR", "两次新密码输入不同");
				request.getRequestDispatcher("/TOmodifyPassword").forward(request, response);// 转发
			}
			
		}else{//旧密码错误
			request.setAttribute("passOldERROR", "旧密码错误");
			request.getRequestDispatcher("/info_baseinfo_modifyPassword.jsp").forward(request, response);// 转发
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}