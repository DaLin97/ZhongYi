package service.infoService.impl;

import bean.User;
import dao.regInfoDao;
import dao.impl.regInfoDaoImpl;
import service.infoService.info_modifyPasswordService;

public class info_modifyPasswordServiceImpl implements info_modifyPasswordService {

	@Override
	public User queryPassword(User user) {
		regInfoDao reg = new regInfoDaoImpl();
		return reg.queryRegInfoUUID(user);
	}

	@Override
	public boolean changePass(User user) {
		regInfoDao reg = new regInfoDaoImpl();
		User user2 = reg.queryRegInfoUUID(user);
		user2.setPassword(user.getPassword());
		return reg.updateRegInfo(user2);
	}

}
