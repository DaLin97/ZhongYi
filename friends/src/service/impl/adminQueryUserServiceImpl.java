package service.impl;

import bean.User;
import dao.regInfoDao;
import dao.impl.regInfoDaoImpl;
import service.adminQueryUserService;

public class adminQueryUserServiceImpl implements adminQueryUserService {

	@Override
	public User adminQueryUse(User user) {
		regInfoDao reg = new regInfoDaoImpl();
		user = reg.queryRegInfoUUID(user);
		return user;
	}

}
