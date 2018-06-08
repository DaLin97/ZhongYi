package dao;

import bean.User;

public interface lifeInfoDao {
	public boolean addLifeInfo(User user);//增
	public boolean delLifeInfo(User user);//删
	public boolean updateLifeInfo(User user);//改
	public User queryLifeInfo(User user);//查
}
