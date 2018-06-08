package dao;

import bean.User;

public interface LoginDao {

	User getUserByNameAndPwd(User user);

}
