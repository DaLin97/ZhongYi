package web.servlet.infoServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import service.infoService.info_lifeInfoService;
import service.infoService.impl.info_lifeInfoServiceImpl;

@WebServlet("/lifeInfoServlet")
public class info_lifeInfoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//处理乱码
		request.setCharacterEncoding("UTF-8");
		
		String smoke = request.getParameter("smoke");
		String drink = request.getParameter("drink");
		String car = request.getParameter("car");
		String cook = request.getParameter("cook");
		String homework = request.getParameter("homework");
		String money = request.getParameter("money");
		String description = request.getParameter("description");
		String consumption = ADDconsumption(request,response);
		System.out.println(consumption);
		
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
		user.setSmoke(smoke);
		user.setDrink(drink);
		user.setCar(car);
		user.setCook(cook);
		user.setHomework(homework);
		user.setMoney(money);
		user.setConsumption(consumption);
		user.setDescription(description);
		
		//4.调用service方法修改数据库
		info_lifeInfoService infoRegS = new info_lifeInfoServiceImpl();
		boolean reg = infoRegS.updateLifeInfo(user);	//修改regInfo表数据
		if(reg){
			//修改成功,保存跳到下一页
			response.sendRedirect(request.getContextPath()+"/TOhobby");
		}else{
			//显示错误
			response.sendRedirect(request.getContextPath()+"/TOlifeInfo");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	public String ADDconsumption(HttpServletRequest request, HttpServletResponse response){
		String consumption = "";
		if(request.getParameter("consumption1") != null){
			consumption = consumption + " " + request.getParameter("consumption1");
		}
		if(request.getParameter("consumption2") != null){
			consumption = consumption + " " + request.getParameter("consumption2");
		}
		if(request.getParameter("consumption3") != null){
			consumption = consumption + " " + request.getParameter("consumption3");
		}
		if(request.getParameter("consumption4") != null){
			consumption = consumption + " " + request.getParameter("consumption4");
		}
		if(request.getParameter("consumption5") != null){
			consumption = consumption + " " + request.getParameter("consumption5");
		}
		if(request.getParameter("consumption6") != null){
			consumption = consumption + " " + request.getParameter("consumption6");
		}
		if(request.getParameter("consumption7") != null){
			consumption = consumption + " " + request.getParameter("consumption7");
		}
		if(request.getParameter("consumption8") != null){
			consumption = consumption + " " + request.getParameter("consumption8");
		}
		if(request.getParameter("consumption9") != null){
			consumption = consumption + " " + request.getParameter("consumption9");
		}
		if(request.getParameter("consumption10") != null){
			consumption = consumption + " " + request.getParameter("consumption10");
		}
		return consumption;
	}
}