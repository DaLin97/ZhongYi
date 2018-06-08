package dao;

import bean.User;

public interface albumDao {
	public boolean addAlbum(User user);//增
	public boolean delAlbum(User user);//删
	public boolean updateAlbum(User user);//改
	public User queryAlbum(User user);//查
	public User queryAlbumUUID(String uuid);//根据Id查询图片路径
}
