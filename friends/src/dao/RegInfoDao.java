package dao;

import java.util.List;

import bean.User;

public interface regInfoDao {
	public boolean addRegInfo(User user);//增
	public boolean delRegInfo(User user);//删
	public boolean updateRegInfo(User user);//改
	public User queryRegInfo(User user);//查
	public User queryRegInfoUUID(User user);//查询uuId
	public List<User> getIndexListUser();//查询所有用户信息的方法
	public User queryAll(User user);
	public List<User> SearchServiceList(User user);
	public List<User> SearchUserNameOrNiName(String searchIdNiName);//通过值进行查询
	public List<User> CondituserUser(User condituser);

}
