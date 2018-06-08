package service.impl;

import java.util.List;

import bean.User;
import dao.regInfoDao;
import dao.impl.regInfoDaoImpl;
import service.IndexSearchService;

public class IndexSearchServiceImpl implements IndexSearchService {
private regInfoDao rid=new regInfoDaoImpl();
	@Override
	public List<User> IndexSearchUser(User user) {
		return rid.SearchServiceList(user);
	}

}
