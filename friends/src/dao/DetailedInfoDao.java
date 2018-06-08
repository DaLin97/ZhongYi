package dao;

import bean.User;

public interface detailedInfoDao {
	public boolean addDetailedInfo(User user);//增
	public boolean delDetailedInfo(User user);//删
	public boolean updateDetailedInfo(User user);//改
	public User queryDetailedInfo(User user);//查
}
