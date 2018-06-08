package service.infoService.impl;

import bean.User;
import dao.hobbyDao;
import dao.regInfoDao;
import dao.impl.hobbyDaoImpl;
import dao.impl.regInfoDaoImpl;
import service.infoService.TOhobbyService;

public class TOhobbyServiceImpl implements TOhobbyService {

	@Override
	public User queryTOhobby(User user) {
		regInfoDao reg = new regInfoDaoImpl();
		hobbyDao sing = new hobbyDaoImpl();
		user.setUuid(reg.queryRegInfoUUID(user).getUuid());
		return sing.queryHobby(user);
	}

}
