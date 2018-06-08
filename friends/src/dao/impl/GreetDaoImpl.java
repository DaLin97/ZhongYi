package dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import bean.User;
import dao.GreetSDao;
import utils.C3P0Utils;

public class GreetDaoImpl implements GreetSDao {

	@Override
	public boolean intoUser(User user) {
		int update=0;
		String sql = "insert into message (uuid,o_photo,messsge,o_age,o_name,os_city) values (?,?,?,?,?,?)";
		QueryRunner qu = new QueryRunner(C3P0Utils.getDataSource());
		 try {
			 update = qu.update(sql,user.getUuid(),user.getO_photo(),user.getMesssge(),user.getO_age(),user.getO_name(),user.getOs_city());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 if(update>0){
				return true;
			}else{
				return false;
			}
	}
	
	
}
