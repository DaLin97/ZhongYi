package service.impl;

import bean.Admin;
import dao.AdminDao;
import dao.impl.ADminDaoImpl;
import service.AdminService;

public class AdminServiceImpl implements AdminService {

	@Override
	public boolean checkPass(Admin admin) {
		AdminDao ad = new ADminDaoImpl();
		Admin ad2 = ad.queryADmin(admin.getAdminUsername());
		if(ad2.getAdminUsername().equals(admin.getAdminUsername()) && ad2.getAdminPassword().equals(admin.getAdminPassword())){
			return true;
		}else{
			return false;
		}
	}

}
