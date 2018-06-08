package dao;

import bean.User;

public interface singleDao {
	public boolean addSingle(User user);//增
	public boolean delSingle(User user);//删
	public boolean updateSingle(User user);//改
	public User querySingle(User user);//查
}
