package dao;

import bean.User;

public interface hobbyDao {
	public boolean addHobby(User user);//增
	public boolean delHobby(User user);//删
	public boolean updateHobby(User user);//改
	public User queryHobby(User user);//查
}
