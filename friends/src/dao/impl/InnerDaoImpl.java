package dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import bean.User;
import dao.innerDao;
import utils.C3P0Utils;

public class innerDaoImpl implements innerDao{
	QueryRunner qu = new QueryRunner(C3P0Utils.getDataSource());
	//增
	public boolean addInner(User user) {
		int request = 0;
		String sql = "insert into inne (uuid,InnerInfo) values (?,?)";
		try {
			request = qu.update(sql,user.getUuid(),user.getInnerinfo());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(request>0){
			return true;
		}else{
			return false;
		}
	}

	//删
	public boolean delInner(User user) {
		int request = 0;
		String sql = "delete from inne where uuid = ?";
		try {
			request = qu.update(sql,user.getUuid());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(request>0){
			return true;
		}else{
			return false;
		}
	}

	//改
	public boolean updateInner(User user) {
		int request = 0;
		String sql = "update inne set InnerInfo = ? where uuid = ?";
		try {
			request = qu.update(sql, user.getInnerinfo(),user.getUuid());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(request>0){
			return true;
		}else{
			return false;
		}
	}

	//查
	public User queryInner(User user) {
		User user2 = null;
		String sql = "select * from inne where uuid = ?";
		try {
			user2 = qu.query(sql, new BeanHandler<User>(User.class),user.getUuid());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user2;
	}

}
