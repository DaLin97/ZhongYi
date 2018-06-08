package service.infoService.impl;

import bean.User;
import dao.detailedInfoDao;
import dao.regInfoDao;
import dao.impl.detailedInfoDaoImpl;
import dao.impl.regInfoDaoImpl;
import service.infoService.TOdetailedInfoService;

public class TOdetailedInfoServiceImpl implements TOdetailedInfoService {

	@Override
	public User queryTOdetailedInfo(User user) {
		regInfoDao reg = new regInfoDaoImpl();
		detailedInfoDao sing = new detailedInfoDaoImpl();
		user.setUuid(reg.queryRegInfoUUID(user).getUuid());
		return sing.queryDetailedInfo(user);
	}

}
