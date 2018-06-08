package web.servlet.infoServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import service.infoService.info_singleService;
import service.infoService.impl.info_singleServiceImpl;

@WebServlet("/singleServlet")
public class info_singleServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//处理乱码
		request.setCharacterEncoding("UTF-8");
				
		String other_sex = request.getParameter("other_sex");
		Integer other_age = 0;
		Integer other_age2 = 0;
		if(request.getParameter("other_age") == null){
			other_age = 0;
		}else{
			other_age = Integer.parseInt(request.getParameter("other_age"));
		}
		if(request.getParameter("other_age2") == null){
			other_age2 = 0;
		}else{
			other_age2 = Integer.parseInt(request.getParameter("other_age2"));
		}
		String other_s_province = request.getParameter("other_s_province");
		String other_s_city = request.getParameter("other_s_city");
		String other_s_county = request.getParameter("other_s_county");
		String other_marital = request.getParameter("other_marital");
		String other_education = request.getParameter("other_education");
		String other_salary = request.getParameter("other_salary");
		String other_children = request.getParameter("other_children");
				
		String username = null;
		User attribute = (User) request.getSession().getAttribute("user");
		System.out.println(attribute.getUsername());
		if(attribute.getUsername() != null){
			username = attribute.getUsername();
		}else{
			username = "001";
		}
		//User封装
		User user = new User();
		user.setUsername(username);
		user.setOther_sex(other_sex);
		user.setOther_age(other_age);
		user.setOther_age2(other_age2);
		user.setOther_s_province(other_s_province);
		user.setOther_s_city(other_s_city);
		user.setOther_s_county(other_s_county);
		user.setOther_marital(other_marital);
		user.setOther_education(other_education);
		user.setOther_salary(other_salary);
		user.setOther_children(other_children);
		//4.调用service方法修改数据库
		info_singleService infoSingS = new info_singleServiceImpl();
		boolean sing = infoSingS.updateSingle(user);
		if(sing){
			//修改成功,保存跳到下一页
			response.sendRedirect(request.getContextPath()+"/TOinner");
		}else{
			//显示错误
			response.sendRedirect(request.getContextPath()+"/TOsingle");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}