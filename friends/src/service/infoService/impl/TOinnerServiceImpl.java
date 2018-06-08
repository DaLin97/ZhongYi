package service.infoService.impl;

import bean.User;
import dao.innerDao;
import dao.regInfoDao;
import dao.impl.innerDaoImpl;
import dao.impl.regInfoDaoImpl;
import service.infoService.TOinnerService;

public class TOinnerServiceImpl implements TOinnerService {

	@Override
	public User queryTOinner(User user) {
		regInfoDao reg = new regInfoDaoImpl();
		innerDao inner = new innerDaoImpl();
		user.setUuid(reg.queryRegInfoUUID(user).getUuid());
		return inner.queryInner(user);
	}

}
