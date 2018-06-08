package dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import bean.User;
import dao.UserDao;
import utils.C3P0Utils;

public class UserDaoImpl implements UserDao {

	@Override
	public User findUserByName(String username) {
		String sql = "select * from user where username=?";
		QueryRunner qu = new QueryRunner(C3P0Utils.getDataSource());
		User user = null;
			try {
				user = qu.query(sql, new BeanHandler<User>(User.class), username);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return user;
	}

}
