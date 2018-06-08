package service.impl;

import java.util.List;

import bean.User;
import dao.regInfoDao;
import dao.impl.regInfoDaoImpl;
import service.IndexListservice;

public class IndexListserviceImpl implements IndexListservice {
private regInfoDao rd=new regInfoDaoImpl();
	public List<User> getIndexsList() {
		return rd.getIndexListUser();
	}

}
