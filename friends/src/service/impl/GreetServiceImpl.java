package service.impl;

import bean.User;
import dao.impl.GreetDaoImpl;
import service.GreetService;

public class GreetServiceImpl implements GreetService{

	@Override
	public boolean intoUser(User user) {
		GreetDaoImpl gd=new GreetDaoImpl();
		
		return  gd.intoUser(user);
	}

	

}
