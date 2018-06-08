package service.infoService.impl;

import bean.User;
import dao.innerDao;
import dao.regInfoDao;
import dao.impl.innerDaoImpl;
import dao.impl.regInfoDaoImpl;
import service.infoService.info_InnerService;

public class info_InnerServiceImpl implements info_InnerService {

	@Override
	public boolean updateInner(User user) {
		regInfoDao reg = new regInfoDaoImpl();
		innerDao sing = new innerDaoImpl();
		user.setUuid(reg.queryRegInfoUUID(user).getUuid());
		return sing.updateInner(user);
	}

}
