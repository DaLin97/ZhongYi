package dao;

import bean.User;

public interface innerDao {
	public boolean addInner(User user);//增
	public boolean delInner(User user);//删
	public boolean updateInner(User user);//改
	public User queryInner(User user);//查
}
