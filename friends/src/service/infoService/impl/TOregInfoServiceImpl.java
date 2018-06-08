package service.infoService.impl;

import bean.User;
import dao.regInfoDao;
import dao.singleDao;
import dao.impl.regInfoDaoImpl;
import dao.impl.singleDaoImpl;
import service.infoService.TOregInfoService;

public class TOregInfoServiceImpl implements TOregInfoService {

	@Override
	public User queryTOreg(User user) {
		regInfoDao reg = new regInfoDaoImpl();
		return reg.queryRegInfoUUID(user);
	}

}
