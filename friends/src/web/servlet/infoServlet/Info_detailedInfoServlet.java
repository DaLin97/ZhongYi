package web.servlet.infoServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import service.infoService.info_detailedInfoService;
import service.infoService.impl.info_detailedInfoServiceImpl;

@WebServlet("/detailedInfoServlet")
public class info_detailedInfoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//处理乱码
		request.setCharacterEncoding("UTF-8");
		
		String realName = request.getParameter("realName");
		String o_province = request.getParameter("o_province");
		String o_city = request.getParameter("o_city");
		String o_county = request.getParameter("o_county");
		String weight = request.getParameter("weight");
		String zodiac = request.getParameter("zodiac");
		String constellation = request.getParameter("constellation");
		String bloodtype = request.getParameter("bloodtype");
		String nation = request.getParameter("nation");
		String faith = request.getParameter("faith");
		
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
		user.setRealName(realName);
		user.setO_province(o_province);
		user.setO_city(o_city);
		user.setO_county(o_county);
		user.setWeight(weight);
		user.setZodiac(zodiac);
		user.setConstellation(constellation);
		user.setBloodtype(bloodtype);
		user.setNation(nation);
		user.setFaith(faith);
		System.out.println(user.getUsername());
		// 4.调用service方法修改数据库
		info_detailedInfoService infoRegS = new info_detailedInfoServiceImpl();
		boolean reg = infoRegS.updateDetailedInfo(user); // 修改regInfo表数据
		if (reg) {
			// 修改成功,保存跳到下一页
			response.sendRedirect(request.getContextPath() + "/TOlifeInfo");
		} else {
			// 显示错误
			response.sendRedirect(request.getContextPath() + "/TOdetailedInfo");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}