package dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import bean.User;
import dao.messageDao;
import utils.C3P0Utils;

public class MessageDaoImpl  implements messageDao{
	QueryRunner qu = new QueryRunner(C3P0Utils.getDataSource());
	@Override
	public User Querymessage(User user) {
		User user2 = null;
		String sql = "select * from message where uuid = ?";
		try {
			System.out.println(user.getUuid());
			user2 = qu.query(sql, new BeanHandler<User>(User.class),user.getUuid());
		  System.out.println(user2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	   System.out.println(user2);
		return user2;
		
	}

}
