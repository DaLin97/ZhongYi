package service.impl;

import java.util.List;

import bean.User;
import dao.regInfoDao;
import dao.impl.regInfoDaoImpl;
import service.ConditionService;

public class ConditionServiceImpl implements ConditionService {

	private regInfoDao rifd=new regInfoDaoImpl();
	public List<User> SearchUsers(User condituser) {
		return rifd.CondituserUser(condituser);
	}

}
