package service.infoService;

import bean.User;

public interface info_modifyPasswordService {

	User queryPassword(User user);

	boolean changePass(User user);

}
