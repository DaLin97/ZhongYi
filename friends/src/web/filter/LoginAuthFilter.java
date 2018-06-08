package web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginAuthFilter implements Filter{


	public void init(FilterConfig filterConfig) throws ServletException {
		
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//除了登录以外都过滤    登录的请求资源路径里面包含login
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String uri = req.getRequestURI();
		//如果是登录请求，直接放行
		if(!(uri.startsWith("/friends/index")||uri.startsWith("/friends/Admin")||uri.startsWith("/friends/info_baseinfo")||uri.startsWith("/friends/Member")||uri.startsWith("/friends/message") || uri.startsWith("/friends/search"))){
			chain.doFilter(request, response);
		}else{
			HttpSession session = req.getSession();
			Object obj = session.getAttribute("user");
			if(uri.startsWith("/friends/Administration")){
				chain.doFilter(request, response);
			}else{
				if(obj == null){
					res.sendRedirect(req.getContextPath()+"/login.jsp");
				}else{
					chain.doFilter(request, response);
				}
			}
		}
		
	}


	public void destroy() {
		
	}

}
