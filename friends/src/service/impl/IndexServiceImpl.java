package service.impl;

import java.util.List;

import bean.User;
import dao.regInfoDao;
import dao.impl.regInfoDaoImpl;
import service.IndexService;

public class IndexServiceImpl implements IndexService {
	private regInfoDao rid = new regInfoDaoImpl();

	public User ReceiveUser(User user) {
		return rid.queryRegInfo(user);
	}

	@Override
	public List<User> getIndexsList() {
		// TODO Auto-generated method stub
		return null;
	}

}
