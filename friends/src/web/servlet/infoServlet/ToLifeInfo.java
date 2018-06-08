package web.servlet.infoServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Consumption;
import bean.User;
import service.infoService.TOlifeInfoService;
import service.infoService.impl.TOlifeInfoServiceImpl;

@WebServlet("/TOlifeInfo")
public class TOlifeInfo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 处理乱码
		request.setCharacterEncoding("UTF-8");

		String username = null;
		User attribute = (User) request.getSession().getAttribute("user");
		System.out.println(attribute.getUsername());
		if(attribute.getUsername() != null){
			username = attribute.getUsername();
		}else{
			username = "001";
		}
		// 3.封装成User
		User user = new User();
		user.setUsername(username);
		System.out.println("tolife");
		TOlifeInfoService TOreg = new TOlifeInfoServiceImpl();
		User newUser = TOreg.queryTOlifeInfo(user);
		request.setAttribute("User", newUser);
		System.out.println(newUser.getUuid());
		
		Consumption con = new Consumption();
		if(newUser.getConsumption() != null){
			String consumption = null;
			consumption = newUser.getConsumption();
			con = SetCon(con,consumption);
		}else{
			con=null;
		}
		System.out.println("consumption");
		request.setAttribute("Consumption", con);
		
		request.getRequestDispatcher("/info_baseinfo_lifeInfo.jsp").forward(request, response);// 转发
	}

	private Consumption SetCon(Consumption con, String consumption) {
		String[] cons = consumption.split(" ");
		for(int i=0;i<cons.length;i++){
			if(cons[i].equals("美食")){
				con.setConsumption1("美食");
			}
			if(cons[i].equals("服饰")){
				con.setConsumption2("服饰");
			}
			if(cons[i].equals("化妆")){
				con.setConsumption3("化妆");
			}
			if(cons[i].equals("健身")){
				con.setConsumption4("健身");
			}
			if(cons[i].equals("娱乐")){
				con.setConsumption5("娱乐");
			}
			if(cons[i].equals("旅行")){
				con.setConsumption6("旅行");
			}
			if(cons[i].equals("社交")){
				con.setConsumption7("社交");
			}
			if(cons[i].equals("文化")){
				con.setConsumption8("文化");
			}
			if(cons[i].equals("自我提升")){
				con.setConsumption9("自我提升");
			}
			if(cons[i].equals("其他")){
				con.setConsumption10("其他");
			}
		}
		return con;
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}