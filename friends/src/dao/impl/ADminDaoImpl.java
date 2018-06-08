package dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import bean.Admin;
import bean.User;
import dao.AdminDao;
import utils.C3P0Utils;

public class ADminDaoImpl implements AdminDao {

	@Override
	public Admin queryADmin(String adminUsername) {
		Admin ad2 = new Admin();
		ad2.setAdminUsername(adminUsername);
		QueryRunner qu = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select * from Admin where AdminUsername = ?";
		try {
			ad2 = qu.query(sql, new BeanHandler<Admin>(Admin.class), ad2.getAdminUsername());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ad2;
	}


}
