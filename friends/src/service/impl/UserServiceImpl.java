package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import bean.User;
import service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public boolean isExistsUser(String username) {
		UserDao ud = new UserDaoImpl();
		User user = ud.findUserByName(username);
		
		return user != null;
	}

}
