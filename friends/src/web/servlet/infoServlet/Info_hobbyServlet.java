package web.servlet.infoServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import service.infoService.info_hobbyService;
import service.infoService.impl.info_hobbyServiceImpl;

@WebServlet("/hobbyServlet")
public class info_hobbyServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//处理乱码
		request.setCharacterEncoding("UTF-8");
		
		String activity = ADDactivity(request,response);
		String sports = ADDsports(request,response);
		String music = ADDmusic(request,response);
		String film = ADDfilm(request,response);
		String food = ADDfood(request,response);
		String local = ADDlocal(request,response);
		String pet = ADDpet(request,response);
		
		
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
		user.setActivity(activity);
		user.setSports(sports);
		user.setMusic(music);
		user.setFilm(film);
		user.setFood(food);
		user.setLocal(local);
		user.setPet(pet);
		
		// 4.调用service方法修改数据库
		info_hobbyService infoRegS = new info_hobbyServiceImpl();
		boolean reg = infoRegS.updateHobby(user); // 修改regInfo表数据
		if (reg) {
			// 修改成功,保存跳到下一页
			response.sendRedirect(request.getContextPath() + "/TOregInfo");
		} else {
			// 显示错误
			response.sendRedirect(request.getContextPath() + "/TOhobby");
		}
	}

	private String ADDactivity(HttpServletRequest request, HttpServletResponse response) {
		String activity = "";
		if(request.getParameter("activity1") != null){
			activity += " " + request.getParameter("activity1");
		}
		if(request.getParameter("activity2") != null){
			activity += " " + request.getParameter("activity2");
		}
		if(request.getParameter("activity3") != null){
			activity += " " + request.getParameter("activity3");
		}
		if(request.getParameter("activity4") != null){
			activity += " " + request.getParameter("activity4");
		}
		if(request.getParameter("activity5") != null){
			activity += " " + request.getParameter("activity5");
		}
		if(request.getParameter("activity6") != null){
			activity += " " + request.getParameter("activity6");
		}
		if(request.getParameter("activity7") != null){
			activity += " " + request.getParameter("activity7");
		}
		if(request.getParameter("activity8") != null){
			activity += " " + request.getParameter("activity8");
		}
		if(request.getParameter("activity9") != null){
			activity += " " + request.getParameter("activity9");
		}
		if(request.getParameter("activity10") != null){
			activity += " " + request.getParameter("activity10");
		}
		if(request.getParameter("activity11") != null){
			activity += " " + request.getParameter("activity11");
		}
		if(request.getParameter("activity12") != null){
			activity += " " + request.getParameter("activity12");
		}
		if(request.getParameter("activity13") != null){
			activity += " " + request.getParameter("activity13");
		}
		if(request.getParameter("activity14") != null){
			activity += " " + request.getParameter("activity14");
		}
		if(request.getParameter("activity15") != null){
			activity += " " + request.getParameter("activity15");
		}
		if(request.getParameter("activity16") != null){
			activity += " " + request.getParameter("activity16");
		}
		if(request.getParameter("activity17") != null){
			activity += " " + request.getParameter("activity17");
		}
		if(request.getParameter("activity18") != null){
			activity += " " + request.getParameter("activity18");
		}
		if(request.getParameter("activity19") != null){
			activity += " " + request.getParameter("activity19");
		}
		if(request.getParameter("activity20") != null){
			activity += " " + request.getParameter("activity20");
		}
		if(request.getParameter("activity21") != null){
			activity += " " + request.getParameter("activity21");
		}
		if(request.getParameter("activity22") != null){
			activity += " " + request.getParameter("activity22");
		}
		return activity;
	}

	private String ADDsports(HttpServletRequest request, HttpServletResponse response) {
		String sports = "";
		if(request.getParameter("sports1") != null){
			sports += " " + request.getParameter("sports1");
		}
		if(request.getParameter("sports2") != null){
			sports += " " + request.getParameter("sports2");
		}
		if(request.getParameter("sports3") != null){
			sports += " " + request.getParameter("sports3");
		}
		if(request.getParameter("sports4") != null){
			sports += " " + request.getParameter("sports4");
		}
		if(request.getParameter("sports5") != null){
			sports += " " + request.getParameter("sports5");
		}
		if(request.getParameter("sports6") != null){
			sports += " " + request.getParameter("sports6");
		}
		if(request.getParameter("sports7") != null){
			sports += " " + request.getParameter("sports7");
		}
		if(request.getParameter("sports8") != null){
			sports += " " + request.getParameter("sports8");
		}
		if(request.getParameter("sports9") != null){
			sports += " " + request.getParameter("sports9");
		}
		if(request.getParameter("sports10") != null){
			sports += " " + request.getParameter("sports10");
		}
		if(request.getParameter("sports11") != null){
			sports += " " + request.getParameter("sports11");
		}
		if(request.getParameter("sports12") != null){
			sports += " " + request.getParameter("sports12");
		}
		if(request.getParameter("sports13") != null){
			sports += " " + request.getParameter("sports13");
		}
		if(request.getParameter("sports14") != null){
			sports += " " + request.getParameter("sports14");
		}
		return sports;
	}
	
	private String ADDmusic(HttpServletRequest request, HttpServletResponse response) {
		String music = "";
		if(request.getParameter("music1") != null){
			music += " " + request.getParameter("music1");
		}
		if(request.getParameter("music2") != null){
			music += " " + request.getParameter("music2");
		}
		if(request.getParameter("music3") != null){
			music += " " + request.getParameter("music3");
		}
		if(request.getParameter("music4") != null){
			music += " " + request.getParameter("music4");
		}
		if(request.getParameter("music5") != null){
			music += " " + request.getParameter("music5");
		}
		if(request.getParameter("music6") != null){
			music += " " + request.getParameter("music6");
		}
		if(request.getParameter("music7") != null){
			music += " " + request.getParameter("music7");
		}
		if(request.getParameter("music8") != null){
			music += " " + request.getParameter("music8");
		}
		if(request.getParameter("music9") != null){
			music += " " + request.getParameter("music9");
		}
		if(request.getParameter("music10") != null){
			music += " " + request.getParameter("music10");
		}
		if(request.getParameter("music11") != null){
			music += " " + request.getParameter("music11");
		}
		if(request.getParameter("music12") != null){
			music += " " + request.getParameter("music12");
		}
		if(request.getParameter("music13") != null){
			music += " " + request.getParameter("music13");
		}
		if(request.getParameter("music14") != null){
			music += " " + request.getParameter("music14");
		}
		if(request.getParameter("music15") != null){
			music += " " + request.getParameter("music15");
		}
		return music;
	}

	private String ADDfilm(HttpServletRequest request, HttpServletResponse response) {
		String film = "";
		if(request.getParameter("film1") != null){
			film += " " + request.getParameter("film1");
		}
		if(request.getParameter("film2") != null){
			film += " " + request.getParameter("film2");
		}
		if(request.getParameter("film3") != null){
			film += " " + request.getParameter("film3");
		}
		if(request.getParameter("film4") != null){
			film += " " + request.getParameter("film4");
		}
		if(request.getParameter("film5") != null){
			film += " " + request.getParameter("film5");
		}
		if(request.getParameter("film6") != null){
			film += " " + request.getParameter("film6");
		}
		if(request.getParameter("film7") != null){
			film += " " + request.getParameter("film7");
		}
		if(request.getParameter("film8") != null){
			film += " " + request.getParameter("film8");
		}
		if(request.getParameter("film9") != null){
			film += " " + request.getParameter("film9");
		}
		if(request.getParameter("film10") != null){
			film += " " + request.getParameter("film10");
		}
		if(request.getParameter("film11") != null){
			film += " " + request.getParameter("film11");
		}
		if(request.getParameter("film12") != null){
			film += " " + request.getParameter("film12");
		}
		if(request.getParameter("film13") != null){
			film += " " + request.getParameter("film13");
		}
		if(request.getParameter("film14") != null){
			film += " " + request.getParameter("film14");
		}
		return film;
	}

	private String ADDfood(HttpServletRequest request, HttpServletResponse response) {
		String food = "";
		if(request.getParameter("food1") != null){
			food += " " + request.getParameter("food1");
		}
		if(request.getParameter("food2") != null){
			food += " " + request.getParameter("food2");
		}
		if(request.getParameter("food3") != null){
			food += " " + request.getParameter("food3");
		}
		if(request.getParameter("food4") != null){
			food += " " + request.getParameter("food4");
		}
		if(request.getParameter("food5") != null){
			food += " " + request.getParameter("food5");
		}
		if(request.getParameter("food6") != null){
			food += " " + request.getParameter("food6");
		}
		if(request.getParameter("food7") != null){
			food += " " + request.getParameter("food7");
		}
		if(request.getParameter("food8") != null){
			food += " " + request.getParameter("food8");
		}
		if(request.getParameter("food9") != null){
			food += " " + request.getParameter("food9");
		}
		if(request.getParameter("food10") != null){
			food += " " + request.getParameter("food10");
		}
		if(request.getParameter("food11") != null){
			food += " " + request.getParameter("food11");
		}
		if(request.getParameter("food12") != null){
			food += " " + request.getParameter("food12");
		}
		if(request.getParameter("food13") != null){
			food += " " + request.getParameter("food13");
		}
		return food;
	}

	private String ADDlocal(HttpServletRequest request, HttpServletResponse response) {
		String local = "";
		if(request.getParameter("local1") != null){
			local += " " + request.getParameter("local1");
		}
		if(request.getParameter("local2") != null){
			local += " " + request.getParameter("local2");
		}
		if(request.getParameter("local3") != null){
			local += " " + request.getParameter("local3");
		}
		if(request.getParameter("local4") != null){
			local += " " + request.getParameter("local4");
		}
		if(request.getParameter("local5") != null){
			local += " " + request.getParameter("local5");
		}
		if(request.getParameter("local6") != null){
			local += " " + request.getParameter("local6");
		}
		if(request.getParameter("local7") != null){
			local += " " + request.getParameter("local7");
		}
		if(request.getParameter("local8") != null){
			local += " " + request.getParameter("local8");
		}
		if(request.getParameter("local9") != null){
			local += " " + request.getParameter("local9");
		}
		if(request.getParameter("local10") != null){
			local += " " + request.getParameter("local10");
		}
		if(request.getParameter("local11") != null){
			local += " " + request.getParameter("local11");
		}
		if(request.getParameter("local12") != null){
			local += " " + request.getParameter("local12");
		}
		if(request.getParameter("local13") != null){
			local += " " + request.getParameter("local13");
		}
		if(request.getParameter("local14") != null){
			local += " " + request.getParameter("local14");
		}
		if(request.getParameter("local15") != null){
			local += " " + request.getParameter("local15");
		}
		if(request.getParameter("local16") != null){
			local += " " + request.getParameter("local16");
		}
		if(request.getParameter("local17") != null){
			local += " " + request.getParameter("local17");
		}
		if(request.getParameter("local18") != null){
			local += " " + request.getParameter("local18");
		}
		if(request.getParameter("local19") != null){
			local += " " + request.getParameter("local19");
		}
		if(request.getParameter("local20") != null){
			local += " " + request.getParameter("local20");
		}
		if(request.getParameter("local21") != null){
			local += " " + request.getParameter("local21");
		}
		if(request.getParameter("local22") != null){
			local += " " + request.getParameter("local22");
		}
		if(request.getParameter("local23") != null){
			local += " " + request.getParameter("local23");
		}
		return local;
	}

	private String ADDpet(HttpServletRequest request, HttpServletResponse response) {
		String pet = "";
		if(request.getParameter("pet1") != null){
			pet += " " + request.getParameter("pet1");
		}
		if(request.getParameter("pet2") != null){
			pet += " " + request.getParameter("pet2");
		}
		if(request.getParameter("pet3") != null){
			pet += " " + request.getParameter("pet3");
		}
		if(request.getParameter("pet4") != null){
			pet += " " + request.getParameter("pet4");
		}
		if(request.getParameter("pet5") != null){
			pet += " " + request.getParameter("pet5");
		}
		if(request.getParameter("pet6") != null){
			pet += " " + request.getParameter("pet6");
		}
		if(request.getParameter("pet7") != null){
			pet += " " + request.getParameter("pet7");
		}
		if(request.getParameter("pet8") != null){
			pet += " " + request.getParameter("pet8");
		}
		if(request.getParameter("pet9") != null){
			pet += " " + request.getParameter("pet9");
		}
		if(request.getParameter("pet10") != null){
			pet += " " + request.getParameter("pet10");
		}
		return pet;
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}