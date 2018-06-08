package bean;

import java.util.UUID;

public class User {
	private String uuid; 			// ID
	private String username; 	// 用户名，手机号
	private String password; 	// 密码
	private String nickname; 	// 昵称
	private Integer age; 		// 年龄
	private String email;		//邮箱
	private String sex; 		// 性别
	private String s_province; 	// 工作地区省
	private String s_city; 		// 工作地区市
	private String s_county; 	// 工作地区县
	private String salary; 		// 月薪
	private Integer height; 		// 身高
	private String house; 		// 住房条件
	private String children; 	// 有无孩子
	private String birthday; 	// 生日
	private String marital; 	// 婚姻状况
	private String education; 	// 学历
	private String realName; 	// 真实名字
	private String o_province; 	// 籍贯省
	private String o_city; 		// 籍贯市
	private String o_county; 	// 籍贯县
	private String weight; 		// 体重
	private String zodiac; 		// 生肖
	private String constellation; // 星座
	private String bloodtype; 	// 血型
	private String nation; 		// 民族
	private String faith; 		// 信仰
	private String activity; 	// 喜欢的活动
	private String sports; 		// 喜欢的体育运动
	private String music; 		// 喜欢的音乐
	private String film; 		// 喜欢的影视节目
	private String food; 		// 喜欢的食物
	private String local; 		// 喜欢的地方
	private String pet; 		// 喜欢的宠物
	private String innerinfo; 	// 内心独白
	private String smoke; 		// 是否吸烟
	private String drink; 		// 是否喝酒
	private String car; 		// 购车打算
	private String cook; 		// 厨艺
	private String homework; 	// 家务安排
	private String money; 		// 存款
	private String consumption; // 较大的消费
	private String description; // 自我描述性格
	private String album; 		// 相册
	//希望交到的朋友的条件
	private String other_sex;	//性别
	private Integer other_age;	//年龄
	private Integer other_age2;
	private String other_s_province;	//工作地区省
	private String other_s_city;	//工作地区市
	private String other_s_county;	//工作地区县
	private String other_marital;	//婚姻状况
	private String other_education;	//学历
	private String other_salary;	//月薪
	private String other_children;	//有无孩子
	private String  o_name;
	private String  messsge;
	private String  o_age;
	private  String o_photo;
	private  String  os_city;

	public String getO_name() {
		return o_name;
	}

	public void setO_name(String o_name) {
		this.o_name = o_name;
	}



	public String getMesssge() {
		return messsge;
	}

	public void setMesssge(String messsge) {
		this.messsge = messsge;
	}

	public String getO_age() {
		return o_age;
	}

	public void setO_age(String o_age) {
		this.o_age = o_age;
	}

	public String getO_photo() {
		return o_photo;
	}

	public void setO_photo(String o_photo) {
		this.o_photo = o_photo;
	}

	public String getOs_city() {
		return os_city;
	}

	public void setOs_city(String os_city) {
		this.os_city = os_city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}



	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getS_province() {
		return s_province;
	}

	public void setS_province(String s_province) {
		this.s_province = s_province;
	}

	public String getS_city() {
		return s_city;
	}

	public void setS_city(String s_city) {
		this.s_city = s_city;
	}

	public String getS_county() {
		return s_county;
	}
	

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public void setInnerinfo(String innerinfo) {
		this.innerinfo = innerinfo;
	}

	public void setS_county(String s_county) {
		this.s_county = s_county;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}


	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getChildren() {
		return children;
	}

	public void setChildren(String children) {
		this.children = children;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getMarital() {
		return marital;
	}

	public void setMarital(String marital) {
		this.marital = marital;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getO_province() {
		return o_province;
	}

	public void setO_province(String o_province) {
		this.o_province = o_province;
	}

	public String getO_city() {
		return o_city;
	}

	public void setO_city(String o_city) {
		this.o_city = o_city;
	}

	public String getO_county() {
		return o_county;
	}

	public void setO_county(String o_county) {
		this.o_county = o_county;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getZodiac() {
		return zodiac;
	}

	public void setZodiac(String zodiac) {
		this.zodiac = zodiac;
	}

	public String getConstellation() {
		return constellation;
	}

	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}

	public String getBloodtype() {
		return bloodtype;
	}

	public void setBloodtype(String bloodtype) {
		this.bloodtype = bloodtype;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getFaith() {
		return faith;
	}

	public void setFaith(String faith) {
		this.faith = faith;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getSports() {
		return sports;
	}

	public void setSports(String sports) {
		this.sports = sports;
	}

	public String getMusic() {
		return music;
	}

	public void setMusic(String music) {
		this.music = music;
	}

	public String getFilm() {
		return film;
	}

	public void setFilm(String film) {
		this.film = film;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getPet() {
		return pet;
	}

	public void setPet(String pet) {
		this.pet = pet;
	}

	

	public String getInnerinfo() {
		return innerinfo;
	}

	public void setInnerInfo(String innerinfo) {
		this.innerinfo = innerinfo;
	}

	public String getSmoke() {
		return smoke;
	}

	public void setSmoke(String smoke) {
		this.smoke = smoke;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public String getCook() {
		return cook;
	}

	public void setCook(String cook) {
		this.cook = cook;
	}

	public String getHomework() {
		return homework;
	}

	public void setHomework(String homework) {
		this.homework = homework;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getConsumption() {
		return consumption;
	}

	public void setConsumption(String consumption) {
		this.consumption = consumption;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOther_sex() {
		return other_sex;
	}

	public void setOther_sex(String other_sex) {
		this.other_sex = other_sex;
	}


	public Integer getOther_age() {
		return other_age;
	}

	public void setOther_age(Integer other_age) {
		this.other_age = other_age;
	}

	public Integer getOther_age2() {
		return other_age2;
	}

	public void setOther_age2(Integer other_age2) {
		this.other_age2 = other_age2;
	}

	public String getOther_s_province() {
		return other_s_province;
	}

	public void setOther_s_province(String other_s_province) {
		this.other_s_province = other_s_province;
	}

	public String getOther_s_city() {
		return other_s_city;
	}

	public void setOther_s_city(String other_s_city) {
		this.other_s_city = other_s_city;
	}

	public String getOther_s_county() {
		return other_s_county;
	}

	public void setOther_s_county(String other_s_county) {
		this.other_s_county = other_s_county;
	}

	public String getOther_marital() {
		return other_marital;
	}

	public void setOther_marital(String other_marital) {
		this.other_marital = other_marital;
	}

	public String getOther_education() {
		return other_education;
	}

	public void setOther_education(String other_education) {
		this.other_education = other_education;
	}

	public String getOther_salary() {
		return other_salary;
	}

	public void setOther_salary(String other_salary) {
		this.other_salary = other_salary;
	}

	public String getOther_children() {
		return other_children;
	}

	public void setOther_children(String other_children) {
		this.other_children = other_children;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	@Override
	public String toString() {
		return "User [uuid=" + uuid + ", username=" + username + ", password=" + password + ", nickname=" + nickname
				+ ", age=" + age + ", email=" + email + ", sex=" + sex + ", s_province=" + s_province + ", s_city="
				+ s_city + ", s_county=" + s_county + ", salary=" + salary + ", height=" + height + ", house=" + house
				+ ", children=" + children + ", birthday=" + birthday + ", marital=" + marital + ", education="
				+ education + ", realName=" + realName + ", o_province=" + o_province + ", o_city=" + o_city
				+ ", o_county=" + o_county + ", weight=" + weight + ", zodiac=" + zodiac + ", constellation="
				+ constellation + ", bloodtype=" + bloodtype + ", nation=" + nation + ", faith=" + faith + ", activity="
				+ activity + ", sports=" + sports + ", music=" + music + ", film=" + film + ", food=" + food
				+ ", local=" + local + ", pet=" + pet + ", innerinfo=" + innerinfo + ", smoke=" + smoke + ", drink="
				+ drink + ", car=" + car + ", cook=" + cook + ", homework=" + homework + ", money=" + money
				+ ", consumption=" + consumption + ", description=" + description + ", album=" + album + ", other_sex="
				+ other_sex + ", other_age=" + other_age + ", other_age2=" + other_age2 + ", other_s_province="
				+ other_s_province + ", other_s_city=" + other_s_city + ", other_s_county=" + other_s_county
				+ ", other_marital=" + other_marital + ", other_education=" + other_education + ", other_salary="
				+ other_salary + ", other_children=" + other_children + "]";
	}

	
}
