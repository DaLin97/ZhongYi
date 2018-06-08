package service.infoService;

import bean.User;

public interface info_albumService {

	User queryAlbum(User user);

	boolean updateAlbum(User user);

}
