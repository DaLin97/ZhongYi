package service.impl;

import bean.User;
import dao.LoginDao;
import dao.impl.LoginDaoImpl;
import service.LoginService;

public class LoginServiceImpl implements LoginService {

	@Override
	public User login(User user) {
		LoginDao ud = new LoginDaoImpl();
		// 直接对比账号密码/对比账号，查询到用户后再对比密码
		User loginUser = ud.getUserByNameAndPwd(user);
		return loginUser;
	}

}
