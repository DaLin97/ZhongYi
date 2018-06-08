package service;

import java.util.List;

import bean.User;

public interface IndexService {

	User ReceiveUser(User user);
	List<User> getIndexsList();
}
