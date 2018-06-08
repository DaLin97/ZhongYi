package service.infoService.impl;

import bean.User;
import dao.regInfoDao;
import dao.singleDao;
import dao.impl.regInfoDaoImpl;
import dao.impl.singleDaoImpl;
import service.infoService.info_singleService;

public class info_singleServiceImpl implements info_singleService {

	@Override
	public boolean updateSingle(User user) {
		regInfoDao reg = new regInfoDaoImpl();
		singleDao sing = new singleDaoImpl();
		user.setUuid(reg.queryRegInfoUUID(user).getUuid());
		return sing.updateSingle(user);
	}


}
