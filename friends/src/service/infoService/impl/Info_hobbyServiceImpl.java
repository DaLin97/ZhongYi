package service.infoService.impl;

import bean.User;
import dao.hobbyDao;
import dao.regInfoDao;
import dao.impl.hobbyDaoImpl;
import dao.impl.regInfoDaoImpl;
import service.infoService.info_hobbyService;

public class info_hobbyServiceImpl implements info_hobbyService {

	@Override
	public boolean updateHobby(User user) {
		regInfoDao reg = new regInfoDaoImpl();
		hobbyDao sing = new hobbyDaoImpl();
		user.setUuid(reg.queryRegInfoUUID(user).getUuid());
		return sing.updateHobby(user);
	}

}
