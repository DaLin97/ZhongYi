package service.infoService.impl;

import bean.User;
import dao.lifeInfoDao;
import dao.regInfoDao;
import dao.impl.lifeInfoDaoImpl;
import dao.impl.regInfoDaoImpl;
import service.infoService.TOlifeInfoService;

public class TOlifeInfoServiceImpl implements TOlifeInfoService {

	@Override
	public User queryTOlifeInfo(User user) {
		regInfoDao reg = new regInfoDaoImpl();
		lifeInfoDao life = new lifeInfoDaoImpl();
		user.setUuid(reg.queryRegInfoUUID(user).getUuid());
		return life.queryLifeInfo(user);
	}

}
