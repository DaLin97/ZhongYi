package dao;

import bean.User;

public interface UserDao {

	User findUserByName(String username);

}
