package dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import bean.User;
import dao.singleDao;
import utils.C3P0Utils;

public class singleDaoImpl implements singleDao{
	QueryRunner qu = new QueryRunner(C3P0Utils.getDataSource());
	//增
	public boolean addSingle(User user) {
		int request = 0;
		String sql = "insert into single (uuid,other_sex,other_age,other_age2,other_s_province,other_s_city,other_s_county,other_marital,other_education,other_salary,other_children) values (?,?,?,?,?,?,?,?,?,?,?)";
		try {
			request = qu.update(sql,user.getUuid(),user.getOther_sex(),user.getOther_age(),user.getOther_age2(),user.getOther_s_province(),user.getOther_s_city(),user.getOther_s_county(),user.getOther_marital(),user.getOther_education(),user.getOther_salary(),user.getOther_children());
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
	public boolean delSingle(User user) {
		int request = 0;
		String sql = "delete from single where uuid = ?";
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
	public boolean updateSingle(User user) {
		int request = 0;
		String sql = "update single set other_sex=?,other_age=?,other_age2=?,other_s_province=?,other_s_city=?,other_s_county=?,other_marital=?,other_education=?,other_salary=?,other_children=? where uuid = ?";
		try {
			request = qu.update(sql,user.getOther_sex(),user.getOther_age(),user.getOther_age2(),user.getOther_s_province(),user.getOther_s_city(),user.getOther_s_county(),user.getOther_marital(),user.getOther_education(),user.getOther_salary(),user.getOther_children(),user.getUuid());
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
	public User querySingle(User user) {
		User user2 = null;
		String sql = "select * from single where uuid = ?";
		try {
			user2 = qu.query(sql, new BeanHandler<User>(User.class),user.getUuid());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user2;
	}
}
