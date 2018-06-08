package web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import service.GreetService;
import service.impl.GreetServiceImpl;
@WebServlet("/GreetServlet")
public class GreetServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("otherName");
		String age = request.getParameter("otherAge");
		String  messsge=request.getParameter("messsge");
		String city = request.getParameter("othercity");
		             String photo = request.getParameter("photo");
		User user1 = (User) request.getSession().getAttribute("user");
		User user=new User();
		user.setOs_city(city);
		user.setO_age(age);
		user.setMesssge(messsge);
		user.setO_name(name);
		user.setO_photo(photo);
	    user.setUuid(user1.getUuid());
	    GreetService  Gs=    new  GreetServiceImpl();
	    boolean intoUser = Gs.intoUser(user);
	    if(intoUser){
	    	System.out.println("插入成功");
	    }else{
	    	System.out.println("插入失败");
	    }
	    request.getRequestDispatcher("/message.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}