package service.infoService.impl;

import bean.User;
import dao.albumDao;
import dao.regInfoDao;
import dao.impl.albumDaoImpl;
import dao.impl.regInfoDaoImpl;
import service.infoService.info_albumService;

public class info_albumServiceImpl implements info_albumService {

	@Override
	public User queryAlbum(User user) {
		regInfoDao reg = new regInfoDaoImpl();
		user.setUuid(reg.queryRegInfoUUID(user).getUuid()); 
		albumDao alb = new albumDaoImpl();
		return alb.queryAlbum(user);
	}

	@Override
	public boolean updateAlbum(User user) {
		regInfoDao reg = new regInfoDaoImpl();
		user.setUuid(reg.queryRegInfoUUID(user).getUuid());
		albumDao alb = new albumDaoImpl();
		return alb.updateAlbum(user);
	}

}
