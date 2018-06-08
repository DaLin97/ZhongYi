package service.infoService.impl;

import bean.User;
import dao.regInfoDao;
import dao.singleDao;
import dao.impl.regInfoDaoImpl;
import dao.impl.singleDaoImpl;
import service.infoService.TOsingleService;

public class TOsingleServiceImpl implements TOsingleService {

	@Override
	public User queryTOsingle(User user) {
		regInfoDao reg = new regInfoDaoImpl();
		singleDao sing = new singleDaoImpl();
		user.setUuid(reg.queryRegInfoUUID(user).getUuid());
		return sing.querySingle(user);
	}

}
