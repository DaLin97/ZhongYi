package service.impl;

import bean.User;
import dao.albumDao;
import dao.impl.albumDaoImpl;
import service.AlbumService;

/**
 * 这是获取照片的实现类
 * 
 * @author Dalin
 *
 */
public class AlbumServiceImpl implements AlbumService {
	private albumDao ad = new albumDaoImpl();

	@Override
	public User ReceiveRalbum(String uuid) {
    
		return ad.queryAlbumUUID(uuid);
	}

}
