package service.impl;

import java.util.List;

import bean.User;
import dao.detailedInfoDao;
import dao.regInfoDao;
import dao.impl.detailedInfoDaoImpl;
import dao.impl.regInfoDaoImpl;
import service.Member_infoService;

public class Member_infoImpl implements Member_infoService {
    
	@Override
	public User QqueryUser(User user) {
		  //向dao里面索要数据
				regInfoDao rd = new regInfoDaoImpl();
				User user1 = rd.queryAll(user);
		return user1;
	}

	
	

}
