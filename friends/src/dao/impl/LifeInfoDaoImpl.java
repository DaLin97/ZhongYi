package dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import bean.User;
import dao.lifeInfoDao;
import utils.C3P0Utils;

public class lifeInfoDaoImpl implements lifeInfoDao{
	QueryRunner qu = new QueryRunner(C3P0Utils.getDataSource());
	//增
	public boolean addLifeInfo(User user) {
		int request = 0;
		String sql = "insert into lifeInfo (uuid,smoke,drink,car,cook,homework,money,consumption,description) values (?,?,?,?,?,?,?,?,?)";
		try {
			request = qu.update(sql,user.getUuid(),user.getSmoke(),user.getDrink(),user.getCar(),user.getCook(),user.getHomework(),user.getMoney(),user.getConsumption(),user.getDescription());
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
	public boolean delLifeInfo(User user) {
		int request = 0;
		String sql = "delete from lifeInfo where uuid = ?";
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
	public boolean updateLifeInfo(User user) {
		int request = 0;
		String sql = "update lifeInfo set smoke=?,drink=?,car=?,cook=?,homework=?,money=?,consumption=?,description=? where uuid = ?";
		try {
			request = qu.update(sql, user.getSmoke(),user.getDrink(),user.getCar(),user.getCook(),user.getHomework(),user.getMoney(),user.getConsumption(),user.getDescription(),user.getUuid());
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
	public User queryLifeInfo(User user) {
		User user2 = null;
		String sql = "select * from lifeInfo where uuid = ?";
		try {
			user2 = qu.query(sql, new BeanHandler<User>(User.class),user.getUuid());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user2;
	}
}
