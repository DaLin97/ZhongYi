package service.infoService.impl;

import bean.User;
import dao.lifeInfoDao;
import dao.regInfoDao;
import dao.impl.lifeInfoDaoImpl;
import dao.impl.regInfoDaoImpl;
import service.infoService.info_lifeInfoService;

public class info_lifeInfoServiceImpl implements info_lifeInfoService {

	@Override
	public boolean updateLifeInfo(User user) {
		regInfoDao reg = new regInfoDaoImpl();
		lifeInfoDao sing = new lifeInfoDaoImpl();
		user.setUuid(reg.queryRegInfoUUID(user).getUuid());
		return sing.updateLifeInfo(user);
	}

}
