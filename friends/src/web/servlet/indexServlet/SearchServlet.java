package web.servlet.indexServlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import service.ConditionService;
import service.IndexSearchService;
import service.SearchService;
import service.impl.ConditionServiceImpl;
import service.impl.IndexSearchServiceImpl;
import service.impl.SearchServiceImpl;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/searchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Utf-8");
		String search = request.getParameter("Search");
		switch (search) {
		//精确查询
		case "accurate":
			List<User> listlook = AccurateSearch(request,response);
			request.setAttribute("listlook", listlook);
			System.out.println(listlook);
			request.getRequestDispatcher("/search.jsp").forward(request, response);
			break;
		case"KKK":
			if(!request.getParameter("s_province").equals(null)|| (request.getParameter("s_city").equals(null))
					|| (request.getParameter("s_county").equals(null)) || (request.getParameter("age").equals(null))
					|| (request.getParameter("height").equals(null)) || (request.getParameter("salary").equals(null))) {
				if (!(request.getParameter("s_province").equals("省份")) || (request.getParameter("s_city").equals("地级市"))
						|| (request.getParameter("s_county").equals("市、县级市")) || (request.getParameter("age").equals("年龄"))
						|| (request.getParameter("height").equals("身高")) || (request.getParameter("salary").equals("工资"))) {
					// 搜索结果查询出结果
					List<User> searList = SearchUserList(request, response);
					System.out.println(searList);
					request.setAttribute("searList", searList);
				}
			}else {
				response.sendRedirect("/login.jsp");
			}
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			break;
			case "condition":
				 List<User> condList = ConditionSercice(request,response);
				 System.out.println("condList"+condList);
				 request.setAttribute("condList", condList);
				 request.getRequestDispatcher("/search.jsp").forward(request, response);
				break;
		default:
			break;
		}
//		request.getRequestDispatcher("/search.jsp").forward(request, response);
		response.sendRedirect(request.getSession().getServletContext().getContextPath()+"/search.jsp");
	}

	
	//条件搜索
	private List<User> ConditionSercice(HttpServletRequest request, HttpServletResponse response) {
		String sex = request.getParameter("sex");
		String ages = request.getParameter("age");
		String Mycitys = request.getParameter("Mycitys");
		String wedding = request.getParameter("wedding");
		String hights = request.getParameter("hight");
		String money = request.getParameter("money");
		User condituser=new User();
		condituser.setSex(sex);
		Integer age=0;
	    if(ages.equals("18-22")) {
	    	age=18;
	    }else if(ages.equals("23-27")) {
	    	age=23;
	    }else if(ages.equals("28-32")) {
	    	age=28;
	    }else if(ages.equals("33-37")) {
	    	age=33;
	    }else if(ages.equals("38-42")) {
	    	age=38;
	    }else if(ages.equals("43-47")) {
	    	age=43;
	    }else if(ages.equals("48-52")) {
	    	age=48;
	    }
	    condituser.setAge(age);
	    condituser.setS_county(Mycitys);
	    condituser.setOther_marital(wedding);
	    Integer hight=0;
	    
	    if(hights.equals("175-180")) {
	    	hight=175;
	    }else if(hights.equals("150以下")) {
	    	hight=150;
	    }else if(hights.equals("150-155")) {
	    	hight=155;
	    }else if(hights.equals("155-160")) {
	    	hight=160;
	    }else if(hights.equals("165-170")) {
	    	hight=165;
	    }else if(hights.equals("170-175")) {
	    	hight=170;
	    }else if(hights.equals("180-185")) {
	    	hight=180;
	    }else if(hights.equals("185-190")) {
	    	hight=185;
	    }else if(hights.equals("190-195")) {
	    	hight=190;
	    }else if(hights.equals("195以上")) {
	    	hight=195;
	    }
	    condituser.setHeight(hight);
	    condituser.setOther_salary(money);
	    ConditionService see=new ConditionServiceImpl();
	    List<User> CondList = see.SearchUsers(condituser);
	     return CondList;
	}

	//精确条件查询条件查询
	private List<User>  AccurateSearch(HttpServletRequest request, HttpServletResponse response) {
		String SearchIdNiName = request.getParameter("SearchIdNiName");
		SearchService ss=new SearchServiceImpl();
		return ss.LookupNinameId(SearchIdNiName);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
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
