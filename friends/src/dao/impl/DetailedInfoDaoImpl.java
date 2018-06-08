package dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import bean.User;
import dao.detailedInfoDao;
import utils.C3P0Utils;

public class detailedInfoDaoImpl implements detailedInfoDao{
	QueryRunner qu = new QueryRunner(C3P0Utils.getDataSource());
	//增
	public boolean addDetailedInfo(User user) {
		int request = 0;
		String sql = "insert into detailedInfo (uuid,realName,o_province,o_city,o_county,weight,zodiac,constellation,bloodtype,nation,faith) values (?,?,?,?,?,?,?,?,?,?,?)";
		try {
			request = qu.update(sql,user.getUuid(),user.getRealName(),user.getO_province(),user.getO_city(),user.getO_county(),user.getWeight(),user.getZodiac(),user.getConstellation(),user.getBloodtype(),user.getNation(),user.getFaith());
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
	public boolean delDetailedInfo(User user) {
		int request = 0;
		String sql = "delete from detailedInfo where uuid = ?";
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
	public boolean updateDetailedInfo(User user) {
		int request = 0;
		String sql = "update detailedInfo set realName=?,o_province=?,o_city=?,o_county=?,weight=?,zodiac=?,constellation=?,bloodtype=?,nation=?,faith=? where uuid = ?";
		try {
			request = qu.update(sql, user.getRealName(),user.getO_province(),user.getO_city(),user.getO_county(),user.getWeight(),user.getZodiac(),user.getConstellation(),user.getBloodtype(),user.getNation(),user.getFaith(),user.getUuid());
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
	public User queryDetailedInfo(User user) {
		User user2 = null;
		String sql = "select * from detailedInfo where uuid = ?";
		try {
			user2 = qu.query(sql, new BeanHandler<User>(User.class),user.getUuid());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user2;
	}
}
