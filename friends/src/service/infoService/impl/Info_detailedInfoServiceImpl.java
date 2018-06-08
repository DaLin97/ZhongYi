package service.infoService.impl;

import bean.User;
import dao.detailedInfoDao;
import dao.regInfoDao;
import dao.impl.detailedInfoDaoImpl;
import dao.impl.regInfoDaoImpl;
import service.infoService.info_detailedInfoService;

public class info_detailedInfoServiceImpl implements info_detailedInfoService {

	@Override
	public boolean updateDetailedInfo(User user) {
		regInfoDao reg = new regInfoDaoImpl();
		detailedInfoDao sing = new detailedInfoDaoImpl();
		user.setUuid(reg.queryRegInfoUUID(user).getUuid());
		return sing.updateDetailedInfo(user);
	}

}
