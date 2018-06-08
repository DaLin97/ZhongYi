package dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import bean.User;
import dao.regInfoDao;
import utils.C3P0Utils;

public class regInfoDaoImpl implements regInfoDao {
	QueryRunner qu = new QueryRunner(C3P0Utils.getDataSource());

	// 增
	public boolean addRegInfo(User user) {
		int request = 0;
		String sql = "insert into regInfo (uuid,username,password,nickname,age,sex,s_province,s_city,s_county,salary,height,house,children,birthday,marital,education) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			request = qu.update(sql, user.getUuid(), user.getUsername(), user.getPassword(), user.getNickname(),
					user.getAge(), user.getSex(), user.getS_province(), user.getS_city(), user.getS_county(),
					user.getSalary(), user.getHeight(), user.getHouse(), user.getChildren(), user.getBirthday(),
					user.getMarital(), user.getEducation());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (request > 0) {
			return true;
		} else {
			return false;
		}
	}

	// 删
	public boolean delRegInfo(User user) {
		int request = 0;
		String sql = "delete from regInfo where uuid = ?";
		try {
			request = qu.update(sql, user.getUuid());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (request > 0) {
			return true;
		} else {
			return false;
		}
	}

	// 改
	public boolean updateRegInfo(User user) {
		int request = 0;
		String sql = "update regInfo set username=?,password=?,nickname=?,age=?,sex=?,s_province=?,s_city=?,s_county=?,salary=?,height=?,house=?,children=?,birthday=?,marital=?,education=? where uuid = ?";
		try {
			request = qu.update(sql, user.getUsername(), user.getPassword(), user.getNickname(), user.getAge(),
					user.getSex(), user.getS_province(), user.getS_city(), user.getS_county(), user.getSalary(),
					user.getHeight(), user.getHouse(), user.getChildren(), user.getBirthday(), user.getMarital(),
					user.getEducation(), user.getUuid());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (request > 0) {
			return true;
		} else {
			return false;
		}
	}

	// 查
	public User queryRegInfo(User user) {
		User user2 = null;
		String sql = "select * from regInfo where uuid = ?";
		try {
			user2 = qu.query(sql, new BeanHandler<User>(User.class), user.getUuid());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user2;
	}

	// 根据username查uuid
	public User queryRegInfoUUID(User user) {
		User user2 = null;
		String sql = "select * from regInfo where username = ?";
		try {
			user2 = qu.query(sql, new BeanHandler<User>(User.class), user.getUsername());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user2;
	}

	// 查询用户所有信息
	public User queryAll(User user) {
		User user2 = null;
		String sql = "SELECT distinct a.* ,b.*,c.* , d.* ,e.*,f.* from reginfo a, detailedinfo b, hobby c, lifeinfo d ,single e ,album f where   a.uuid=b.uuid and a.uuid =c.uuid and a.uuid=d.uuid and a.uuid=e.uuid  and a.uuid=f.uuid and a.uuid=?;";
		try {
			user2 = qu.query(sql, new BeanHandler<User>(User.class), user.getUuid());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return user2;

	}

	// 查询所有用户的信息
	public List<User> getIndexListUser() {
		List<User> listuser = null;
		String sql = "select DISTINCT a.*,i.*,r.* FROM album a,inne i,reginfo r WHERE r.uuid=a.uuid and r.uuid=i.uuid";
		try {
			listuser = qu.query(sql, new BeanListHandler<User>(User.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listuser;
	}

	// 主页查询用户
	public List<User> SearchServiceList(User user) {
		List<User> SeachList = null;
		String sql = " SELECT DISTINCT  b.*, a.album,c.innerinfo " + "from album a,reginfo b,inne c "
				+ "WHERE a.uuid=b.uuid and b.uuid=c.uuid ";
		// 创建一个List数组
		List<String> list = new ArrayList<String>();
		if (!"".equals(user.getS_province())) {
			sql += "and b.s_province=?";
			list.add(user.getS_province());
		} else if (!"".equals(user.getS_city())) {
			sql += "and b.s_city=?";
			list.add(user.getS_city());
		} else if (!"".equals(user.getS_county())) {
			sql += "and b.s_county=?";
			list.add(user.getS_county());
		} else if (!"".equals(user.getHeight())) {
			sql += "and b.height= '" + user.getHeight() + "' ";
		} else if (!"".equals(user.getAge())) {
			sql += "and b.height= '" + user.getAge() + "'";
		} else if (!"".equals(user.getSalary())) {
			list.add(user.getSalary());
		}
		try {
			SeachList = qu.query(sql, new BeanListHandler<User>(User.class), list.toArray());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return SeachList;

	}

	// 根据两个条件进行查询
	public List<User> SearchUserNameOrNiName(String searchIdNiName) {
		List<User> Searchlist = null;
		String sql = "SELECT distinct  a.nickname,a.age,a.s_province,a.s_county,a.height,b.album,c.innerinfo FROM reginfo a,album b,inne c WHERE a.uuid=b.uuid and a.uuid=c.uuid and (username='"
				+ searchIdNiName + "'or nickname='" + searchIdNiName + "')";
		try {
			Searchlist=qu.query(sql, new BeanListHandler<User>(User.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Searchlist;
	}

	//根据传输过来的列表进行查询
	public List<User> CondituserUser(User condituser) {
		List<User> ListCondUser=null;
		String sql=" SELECT distinct a.*,s.other_marital,m.*,e.*"
				+ "FROM reginfo a,single s,album m,inne e"
				+ " WHERE a.uuid=s.uuid and a.uuid=m.uuid and a.uuid=e.uuid ";
		if(!"".equals(condituser.getSex())){
			sql+="and sex like '%"+condituser.getSex()+"%' ";
		}else if(!"".equals(condituser.getS_city())) {
			sql+="and s_city like '%"+condituser.getS_city()+"%' ";
		}else if(!"".equals(condituser.getOther_marital())) {
			sql+="and s.other_marital like '%"+condituser.getOther_marital()+"%' ";
		}else if(!"".equals(condituser.getSalary())) {
			sql+="and salary like '%"+condituser.getSalary()+"%' ";
		}
		try {
			ListCondUser=qu.query(sql, new BeanListHandler<User>(User.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ListCondUser;
	}
}
