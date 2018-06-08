package web.servlet.infoServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import service.infoService.info_regInfoService;
import service.infoService.impl.info_regInfoServiceImpl;

@WebServlet("/regInfoServlet")
public class info_regInfoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//处理乱码
		request.setCharacterEncoding("UTF-8");
		//1.接收参数
		String nickname = request.getParameter("nickname");
		Integer age = Integer.parseInt(request.getParameter("age"));
		String sex = request.getParameter("sex");
		Integer height = Integer.parseInt(request.getParameter("height"));
		String s_province = request.getParameter("s_province");
		String s_city = request.getParameter("s_city");
		String s_county = request.getParameter("s_county");
		String salary = request.getParameter("salary");
		String marital = request.getParameter("marital");
		String education = request.getParameter("education");
		String house = request.getParameter("house");
		String children = request.getParameter("children");
		//System.out.println(nickname+","+","+age+","+sex+","+height+","+s_province+","+s_city+","+s_county+","+salary+","+marital+","+education+","+house+","+children);
		
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
		user.setNickname(nickname);
		user.setAge(age);
		user.setSex(sex);
		user.setHeight(height);
		user.setS_province(s_province);
		user.setS_city(s_city);
		user.setS_county(s_county);
		user.setSalary(salary);
		user.setMarital(marital);
		user.setEducation(education);
		user.setHouse(house);
		user.setChildren(children);
		//4.调用service方法修改数据库
		info_regInfoService infoRegS = new info_regInfoServiceImpl();
		boolean reg = infoRegS.updateRegInfo(user);	//修改regInfo表数据
		if(reg){
			//修改成功,保存跳到下一页
			response.sendRedirect(request.getContextPath()+"/TOsingle");
		}else{
			//显示错误
			response.sendRedirect(request.getContextPath()+"/TOregInfo");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}