package service.impl;

import bean.User;
import dao.regInfoDao;
import dao.impl.regInfoDaoImpl;
import service.adminDeleteUserService;

public class adminDeleteUserServiceImpl implements adminDeleteUserService {

	@Override
	public boolean adminDeleteUser(User user) {
		regInfoDao reg = new regInfoDaoImpl();
		return reg.delRegInfo(user);
	}

}
