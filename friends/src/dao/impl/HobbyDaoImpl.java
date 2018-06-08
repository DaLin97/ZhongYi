package dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import bean.User;
import dao.hobbyDao;
import utils.C3P0Utils;

public class hobbyDaoImpl implements hobbyDao{
	QueryRunner qu = new QueryRunner(C3P0Utils.getDataSource());
	//增
	public boolean addHobby(User user) {
		int request = 0;
		String sql = "insert into hobby (uuid,activity,sports,music,film,food,local,pet) values (?,?,?,?,?,?,?,?)";
		try {
			request = qu.update(sql,user.getUuid(),user.getActivity(),user.getSports(),user.getMusic(),user.getFilm(),user.getFood(),user.getLocal(),user.getPet());
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
	public boolean delHobby(User user) {
		int request = 0;
		String sql = "delete from hobby where uuid = ?";
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
	public boolean updateHobby(User user) {
		int request = 0;
		String sql = "update hobby set activity=?,sports=?,music=?,film=?,food=?,local=?,pet=? where uuid = ?";
		try {
			request = qu.update(sql,user.getActivity(),user.getSports(),user.getMusic(),user.getFilm(),user.getFood(),user.getLocal(),user.getPet(),user.getUuid());
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
	public User queryHobby(User user) {
		User user2 = null;
		String sql = "select * from hobby where uuid = ?";
		try {
			user2 = qu.query(sql, new BeanHandler<User>(User.class),user.getUuid());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user2;
	}
}
