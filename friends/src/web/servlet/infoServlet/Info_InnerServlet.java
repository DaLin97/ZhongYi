package web.servlet.infoServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import service.infoService.info_InnerService;
import service.infoService.impl.info_InnerServiceImpl;

@WebServlet("/InnerServlet")
public class info_InnerServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//处理乱码
		
		request.setCharacterEncoding("UTF-8");		
		String innerinfo = request.getParameter("innerinfo");
		
		
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
		user.setInnerInfo(innerinfo);
		System.out.println(user.getInnerinfo());
		//4.调用service方法修改数据库
		info_InnerService infoRegS = new info_InnerServiceImpl();
		boolean reg = infoRegS.updateInner(user);	//修改regInfo表数据
		if(reg){
			//修改成功,保存跳到下一页
			
			response.sendRedirect(request.getContextPath()+"/TOdetailedInfo");
		}else{
			//显示错误
			response.sendRedirect(request.getContextPath()+"/TOinner");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}