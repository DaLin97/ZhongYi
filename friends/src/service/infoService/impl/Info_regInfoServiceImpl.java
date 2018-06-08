package service.infoService.impl;

import bean.User;
import dao.regInfoDao;
import dao.impl.regInfoDaoImpl;
import service.infoService.info_regInfoService;

public class info_regInfoServiceImpl implements info_regInfoService {

	//修改regInfo表数据
	public boolean updateRegInfo(User user) {
		regInfoDao reg = new regInfoDaoImpl();
		User user2 = reg.queryRegInfoUUID(user);
		user.setUuid(user2.getUuid());
		user.setPassword(user2.getPassword());
		reg.updateRegInfo(user);
		System.out.println(reg.updateRegInfo(user));
		user.setPassword(user2.getPassword());
		return true;
	}

}
