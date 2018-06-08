package service.impl;

import java.util.List;

import bean.User;
import dao.regInfoDao;
import dao.impl.regInfoDaoImpl;
import service.SearchService;

public class SearchServiceImpl implements SearchService {
 private regInfoDao rid=new regInfoDaoImpl();
	public List<User> LookupNinameId(String searchIdNiName) {
		return rid.SearchUserNameOrNiName(searchIdNiName);
	}

}
