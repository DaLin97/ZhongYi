package dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import bean.User;
import dao.LoginDao;
import utils.C3P0Utils;

public class LoginDaoImpl implements LoginDao {

	@Override
	public User getUserByNameAndPwd(User user) {
		String sql = "select * from reginfo where username=? and password = ?";
		QueryRunner qu = new QueryRunner(C3P0Utils.getDataSource());
		User findUser = null;
		try {
			findUser = qu.query(sql, new BeanHandler<User>(User.class), user.getUsername(), user.getPassword());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return findUser;
	}

}
