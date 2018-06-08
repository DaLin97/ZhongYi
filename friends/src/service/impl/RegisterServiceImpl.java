package service.impl;

import bean.User;
import dao.albumDao;
import dao.detailedInfoDao;
import dao.hobbyDao;
import dao.innerDao;
import dao.lifeInfoDao;
import dao.regInfoDao;
import dao.singleDao;
import dao.impl.albumDaoImpl;
import dao.impl.detailedInfoDaoImpl;
import dao.impl.hobbyDaoImpl;
import dao.impl.innerDaoImpl;
import dao.impl.lifeInfoDaoImpl;
import dao.impl.regInfoDaoImpl;
import dao.impl.singleDaoImpl;
import service.RegisterService;

public class RegisterServiceImpl implements RegisterService {

	@Override
	public boolean reg(User user) {
		regInfoDao reg = new regInfoDaoImpl();
		boolean a = reg.addRegInfo(user);
		singleDao sing = new singleDaoImpl();
		boolean b = sing.addSingle(user);
		lifeInfoDao life = new lifeInfoDaoImpl();
		boolean c = life.addLifeInfo(user);
		innerDao inner = new innerDaoImpl();
		boolean d = inner.addInner(user);
		hobbyDao hobby = new hobbyDaoImpl();
		boolean e = hobby.addHobby(user);
		detailedInfoDao detailed = new detailedInfoDaoImpl();
		boolean f = detailed.addDetailedInfo(user);
		albumDao album = new albumDaoImpl();
		boolean g = album.addAlbum(user);
		return a&&b&&c&&d&&e&&f&&g;
	}

}
