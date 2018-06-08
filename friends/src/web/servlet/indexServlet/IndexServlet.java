package web.servlet.indexServlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import service.AlbumService;
import service.Imgservice;
import service.IndexListservice;
import service.IndexSearchService;
import service.IndexService;
import service.impl.AlbumServiceImpl;
import service.impl.IndexListserviceImpl;
import service.impl.IndexSearchServiceImpl;
import service.impl.IndexServiceImpl;

/**
 * 主界面的基本功能体
 * 
 * @author Dalin
 *
 */
@WebServlet("/indexServlet")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public IndexServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 模拟已经登陆成功
		User user = new User();
		User users = (User)request.getSession().getAttribute("user");
		String uuid2 = users.getUuid();
		user.setUuid(uuid2);
		System.out.println(user);
		
//		user.setAlbum("PhotoAlbum/morentouxiang.jpg");
//		//添加默认图片的方法
//		SetMorenTupianService sts=new SetMorenTupianServiceImpl();
//		sts.SetMorenTupian(user);
		// 设置传输进来的方法编码格式
		request.setCharacterEncoding("utf-8");
		// 实现Service 将值传入进行获取数据
		IndexService is = new IndexServiceImpl();
		User reuser = is.ReceiveUser(user);
		System.out.println("reuser:"+reuser);
		// 获取到登陆成功的uuid值
		String uuid = user.getUuid();
		request.setAttribute("uuid", uuid);
		// 获得照片路径
		AlbumService als = new AlbumServiceImpl();
		User realbum = als.ReceiveRalbum(uuid);// 获得图片地址

		
		List<User> indexList = IndexList(request, response);
		request.getSession().setAttribute("indexlist", indexList);
	
		// 搜索全部结果
		
		// 获得照片
		request.setAttribute("realbum", realbum);
		// 获得用户
		request.setAttribute("reuser", reuser);
		// 转发才能获取数据
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	/*
	 * 显示所有用户
	 */
	public static List<User> IndexList(HttpServletRequest request, HttpServletResponse response) {
		IndexListservice ils = new IndexListserviceImpl();
		List<User> indexlist = ils.getIndexsList();
		// String Myuuid=null;
		// for (User user : indexlist) {
		// Myuuid = user.getUuid();
		// }
		// request.getSession().setAttribute("Myuuid", Myuuid);
		return indexlist;

	}

	// 按指定的条件查询
	public static List<User> SearchUserList(HttpServletRequest request, HttpServletResponse response) {
		String s_province = request.getParameter("s_province");
		String s_city = request.getParameter("s_city");
		String s_county = request.getParameter("s_county");
		String ages = request.getParameter("age");
		int age = 0;
		if (ages.equals("年龄")) {
			age = 0;
		} else if (ages.equals("18-22")) {
			age = 20;
		} else if (ages.equals("23-27")) {
			age = 25;
		} else if (ages.equals("28-32")) {
			age = 30;
		} else if (ages.equals("33-37")) {
			age = 35;
		} else if (ages.equals("38-42")) {
			age = 40;
		} else if (ages.equals("43-47")) {
			age = 45;
		} else if (ages.equals("48-52")) {
			age = 50;
		}
		int height = 0;
		String heights = request.getParameter("height");
		if (heights.equals(heights)) {
			height = 175;
		}else if(heights.equals("150以下")) {
			height = 145;
		}else if(heights.equals("150-155")) {
			height = 150;
		}else if(heights.equals("155-160")) {
			height=155;
		}else if(heights.equals("165-170")) {
			height=165;
		}else if(heights.equals("170-175")){
			height=170;
		}else if(heights.equals("175-180")) {
			height=175;
		}else if(heights.equals("180-185")) {
			height=180;
		}else if(heights.equals("185-190")) {
			height=185;
		}else if(heights.equals("190-195")) {
			height=190;
		}else {
			height=200;
		}
		String salary = request.getParameter("salary");
		User user = new User();
		System.out.println(s_province + s_city + s_county + age + height + salary);
		// 判断初始值是否为指定的值
		if ((s_province.equals("省份")) || (s_city.equals("地级市")) || (s_county.equals("市、县级市"))
				|| (salary.equals("工资"))) {
			return  null;
		} else {
			user.setS_province(s_province);
			user.setS_city(s_city);
			user.setS_county(s_county);
			user.setAge(age);
			user.setHeight(height);
			user.setSalary(salary);
		}
		// 将获得前端传来的数据通过Service取得数据
		IndexSearchService iss = new IndexSearchServiceImpl();
		return iss.IndexSearchUser(user);
	}

}
