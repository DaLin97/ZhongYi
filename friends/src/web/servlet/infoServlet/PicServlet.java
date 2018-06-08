package web.servlet.infoServlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;
import service.infoService.info_albumService;
import service.infoService.impl.info_albumServiceImpl;

@WebServlet("/picServlet")
public class picServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);  
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		// 处理乱码
		request.setCharacterEncoding("UTF-8");

		String username = null;
		//测试用session
//		User us = new User();
//		us.setUsername("13588028191");
//		HttpSession session = request.getSession();
//		session.setAttribute("user",us);

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

		info_albumService alb = new info_albumServiceImpl();
		user.setAlbum(alb.queryAlbum(user).getAlbum());
		
		String address = null;
		//读取本地图片输入流
		if(user.getAlbum() != null){
			address = "D:/PhotoAlbumUP/" + user.getAlbum();
		}else{
			address = getServletContext().getRealPath("/PhotoAlbum");
			address = address.replaceAll("/", "\\");
			address = address +"/deImg.jpeg"; 
		}
		
        FileInputStream inputStream = new FileInputStream(address);  
        int i = inputStream.available();  
        //byte数组用于存放图片字节数据  
        byte[] buff = new byte[i];  
        inputStream.read(buff);  
        //记得关闭输入流  
        inputStream.close();  
        //设置发送到客户端的响应内容类型  
        response.setContentType("image/*");  
        OutputStream out = response.getOutputStream();  
        out.write(buff);  
        //关闭响应输出流  
        out.close();  
	}
}