package service.impl;

import bean.User;
import dao.messageDao;
import dao.impl.MessageDaoImpl;
import service.messageService;

public class MessageServiceImpl implements messageService {

	@Override
	public User QueryUser(User user) {
		   //从dao包中索要数据
		messageDao ms=new MessageDaoImpl();
		User user1 = ms.Querymessage(user);
		return user1;
	}

}
