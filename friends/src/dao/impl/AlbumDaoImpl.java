package dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import bean.User;
import dao.albumDao;
import utils.C3P0Utils;


public class albumDaoImpl implements albumDao{
	QueryRunner qu = new QueryRunner(C3P0Utils.getDataSource());
	//增
	public boolean addAlbum(User user) {
		int request = 0;
		String sql = "insert into album (uuid,album) values (?,?)";
		try {
			request = qu.update(sql,user.getUuid(),user.getAlbum());
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
	public boolean delAlbum(User user) {
		int request = 0;
		String sql = "delete from album where uuid = ?";
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
	public boolean updateAlbum(User user) {
		int request = 0;
		String sql = "update album set album = ? where uuid = ?";
		try {
			request = qu.update(sql, user.getAlbum(),user.getUuid());
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
	public User queryAlbum(User user) {
		User user2 = null;
		String sql = "select * from album where uuid = ?";
		try {
			user2 = qu.query(sql, new BeanHandler<User>(User.class),user.getUuid());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user2;
	}
	//通过UUID查询图片路径
	public User queryAlbumUUID(String UUID) {
		User user2 = null;
		String sql = "select * from album where uuid = ?";
		try {
			user2 = qu.query(sql, new BeanHandler<User>(User.class),UUID);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user2;
	}
	
	
}
