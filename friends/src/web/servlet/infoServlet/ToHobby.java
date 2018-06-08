package web.servlet.infoServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Hobby;
import bean.User;
import service.infoService.TOhobbyService;
import service.infoService.impl.TOhobbyServiceImpl;

@WebServlet("/TOhobby")
public class TOhobby extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 处理乱码
		request.setCharacterEncoding("UTF-8");

		String username = null;
		User attribute = (User) request.getSession().getAttribute("user");
		System.out.println(attribute.getUsername());
		if(attribute.getUsername() != null){
			username = attribute.getUsername();
		}else{
			username = "001";
		}
		// 3.封装成User
		User user = new User();
		user.setUsername(username);

		TOhobbyService TOreg = new TOhobbyServiceImpl();
		User newUser = TOreg.queryTOhobby(user);
		request.setAttribute("User", newUser);
		
		Hobby hob = new Hobby();
		if(newUser.getActivity() != null || newUser.getSports() != null || newUser.getMusic() != null || newUser.getFilm() != null || newUser.getFood() != null ||newUser.getLocal() != null || newUser.getPet()!=null){
			String activity = newUser.getActivity();
			String sports = newUser.getSports();
			String music = newUser.getMusic();
			String film = newUser.getFilm();
			String food = newUser.getFood();
			String local = newUser.getLocal();
			String pet = newUser.getPet();
			hob = SetCon(hob,activity,sports,music,film,food,local,pet);
		}else{
			
		}
		request.setAttribute("Hobby", hob);
		
		request.getRequestDispatcher("/info_baseinfo_hobby.jsp").forward(request, response);// 转发
	}

	private Hobby SetCon(Hobby hob, String activity, String sports, String music, String film, String food,String local, String pet) {
		//hob中添加activity
		String[] acts = activity.split(" ");
		for(int i=0;i<acts.length;i++){
			if(acts[i].equals("电脑/网络")){
				hob.setActivity1("电脑/网络");
			}
			if(acts[i].equals("电子游戏")){
				hob.setActivity2("电子游戏");
			}
			if(acts[i].equals("与朋友喝酒")){
				hob.setActivity3("与朋友喝酒");
			}
			if(acts[i].equals("品茗")){
				hob.setActivity4("品茗");
			}
			if(acts[i].equals("看电影/电视")){
				hob.setActivity5("看电影/电视");
			}
			if(acts[i].equals("听音乐")){
				hob.setActivity6("听音乐");
			}
			if(acts[i].equals("乐器演奏")){
				hob.setActivity7("乐器演奏");
			}
			if(acts[i].equals("烹饪")){
				hob.setActivity8("烹饪");
			}
			if(acts[i].equals("摄影")){
				hob.setActivity9("摄影");
			}
			if(acts[i].equals("下棋/打牌")){
				hob.setActivity10("下棋/打牌");
			}
			
			
			if(acts[i].equals("观光旅游")){
				hob.setActivity11("观光旅游");
			}
			if(acts[i].equals("逛街购物")){
				hob.setActivity12("逛街购物");
			}
			if(acts[i].equals("阅读")){
				hob.setActivity13("阅读");
			}
			if(acts[i].equals("写作")){
				hob.setActivity14("写作");
			}
			if(acts[i].equals("舞会/卡拉OK")){
				hob.setActivity15("舞会/卡拉OK");
			}
			if(acts[i].equals("各种收集活动")){
				hob.setActivity16("各种收集活动");
			}
			if(acts[i].equals("理财/投资")){
				hob.setActivity17("理财/投资");
			}
			if(acts[i].equals("文艺表演")){
				hob.setActivity18("文艺表演");
			}
			if(acts[i].equals("聊天")){
				hob.setActivity19("聊天");
			}
			if(acts[i].equals("家务/手工艺")){
				hob.setActivity20("家务/手工艺");
			}
			
			if(acts[i].equals("书法/绘画")){
				hob.setActivity21("书法/绘画");
			}
			if(acts[i].equals("其他")){
				hob.setActivity22("其他");
			}
			
			
			
		}
		
		//sports
		String[] spos = sports.split(" ");
		for(int i=0;i<spos.length;i++){
			if(spos[i].equals("足球")){
				hob.setSports1("足球");
			}
			if(spos[i].equals("排球")){
				hob.setSports2("排球");
			}
			if(spos[i].equals("篮球")){
				hob.setSports3("篮球");
			}
			if(spos[i].equals("骑单车")){
				hob.setSports4("骑单车");
			}
			if(spos[i].equals("乒乓球")){
				hob.setSports5("乒乓球");
			}
			if(spos[i].equals("保龄球")){
				hob.setSports6("保龄球");
			}
			if(spos[i].equals("健身/跑步")){
				hob.setSports7("健身/跑步");
			}
			if(spos[i].equals("钓鱼")){
				hob.setSports8("钓鱼");
			}
			if(spos[i].equals("游泳/冲浪")){
				hob.setSports9("游泳/冲浪");
			}
			if(spos[i].equals("网球")){
				hob.setSports10("网球");
			}
			
			if(spos[i].equals("羽毛球")){
				hob.setSports11("羽毛球");
			}
			if(spos[i].equals("高尔夫")){
				hob.setSports12("高尔夫");
			}
			if(spos[i].equals("滑冰/滑雪")){
				hob.setSports13("滑冰/滑雪");
			}
			if(spos[i].equals("其他")){
				hob.setSports14("其他");
			}
			
		}
		
		//music
		String[] mus = music.split(" ");
		for(int i=0;i<mus.length;i++){
			if(mus[i].equals("中文流行音乐")){
				hob.setMusic1("中文流行音乐");
			}
			if(mus[i].equals("轻音乐")){
				hob.setMusic2("轻音乐");
			}
			if(mus[i].equals("民族音乐")){
				hob.setMusic3("民族音乐");
			}
			if(mus[i].equals("老歌")){
				hob.setMusic4("老歌");
			}
			if(mus[i].equals("舞曲")){
				hob.setMusic5("舞曲");
			}
			if(mus[i].equals("歌剧")){
				hob.setMusic6("歌剧");
			}
			if(mus[i].equals("西部乡村")){
				hob.setMusic7("西部乡村");
			}
			if(mus[i].equals("英文流行音乐")){
				hob.setMusic8("英文流行音乐");
			}
			if(mus[i].equals("交响乐")){
				hob.setMusic9("交响乐");
			}
			if(mus[i].equals("地方戏曲")){
				hob.setMusic10("地方戏曲");
			}
			
			if(mus[i].equals("摇滚")){
				hob.setMusic11("摇滚");
			}
			if(mus[i].equals("另类")){
				hob.setMusic12("另类");
			}
			if(mus[i].equals("灵歌")){
				hob.setMusic13("灵歌");
			}
			if(mus[i].equals("爵士/蓝调")){
				hob.setMusic14("爵士/蓝调");
			}
			if(mus[i].equals("其他")){
				hob.setMusic15("其他");
			}
		}
		
		// film
		String[] fils = film.split(" ");
		for (int i = 0; i < fils.length; i++) {
			if (fils[i].equals("故事片")) {
				hob.setFilm1("故事片");
			}
			if (fils[i].equals("文艺爱情")) {
				hob.setFilm2("文艺爱情");
			}
			if (fils[i].equals("科幻")) {
				hob.setFilm3("科幻");
			}
			if (fils[i].equals("动作武侠")) {
				hob.setFilm4("动作武侠");
			}
			if (fils[i].equals("侦探推理")) {
				hob.setFilm5("侦探推理");
			}
			if (fils[i].equals("西部电影")) {
				hob.setFilm6("西部电影");
			}
			if (fils[i].equals("恐怖电影")) {
				hob.setFilm7("恐怖电影");
			}
			if (fils[i].equals("得奖电影")) {
				hob.setFilm8("得奖电影");
			}
			if (fils[i].equals("艺术电影")) {
				hob.setFilm9("艺术电影");
			}
			if (fils[i].equals("音乐歌舞")) {
				hob.setFilm10("音乐歌舞");
			}
			
			if (fils[i].equals("肥皂剧")) {
				hob.setFilm11("肥皂剧");
			}
			if (fils[i].equals("喜剧")) {
				hob.setFilm12("喜剧");
			}
			if (fils[i].equals("其他")) {
				hob.setFilm13("其他");
			}
			if (fils[i].equals("什么都看")) {
				hob.setFilm14("什么都看");
			}
		}
		
		// food
		String[] foods = food.split(" ");
		for (int i = 0; i < foods.length; i++) {
			if (foods[i].equals("川菜")) {
				hob.setFood1("川菜");
			}
			if (foods[i].equals("江浙菜")) {
				hob.setFood2("江浙菜");
			}
			if (foods[i].equals("湘菜")) {
				hob.setFood3("湘菜");
			}
			if (foods[i].equals("火锅")) {
				hob.setFood4("火锅");
			}
			if (foods[i].equals("烧烤")) {
				hob.setFood5("烧烤");
			}
			if (foods[i].equals("家常菜")) {
				hob.setFood6("家常菜");
			}
			if (foods[i].equals("路边摊")) {
				hob.setFood7("路边摊");
			}
			if (foods[i].equals("健康食品")) {
				hob.setFood8("健康食品");
			}
			if (foods[i].equals("零食")) {
				hob.setFood9("零食");
			}
			if (foods[i].equals("粤菜")) {
				hob.setFood10("粤菜");
			}
			
			if (foods[i].equals("减肥餐")) {
				hob.setFood11("减肥餐");
			}
			if (foods[i].equals("量大管饱")) {
				hob.setFood12("量大管饱");
			}
			if (foods[i].equals("其他")) {
				hob.setFood13("其他");
			}
		}
		
		// local
		String[] locals = local.split(" ");
		for (int i = 0; i < locals.length; i++) {
			if (locals[i].equals("都市")) {
				hob.setLocal1("都市");
			}
			if (locals[i].equals("村庄")) {
				hob.setLocal2("村庄");
			}
			if (locals[i].equals("小镇")) {
				hob.setLocal3("小镇");
			}
			if (locals[i].equals("山区")) {
				hob.setLocal4("山区");
			}
			if (locals[i].equals("办公室/学校")) {
				hob.setLocal5("办公室/学校");
			}
			if (locals[i].equals("游乐场")) {
				hob.setLocal6("游乐场");
			}
			if (locals[i].equals("购物中心")) {
				hob.setLocal7("购物中心");
			}
			if (locals[i].equals("家里")) {
				hob.setLocal8("家里");
			}
			if (locals[i].equals("海滨")) {
				hob.setLocal9("海滨");
			}
			if (locals[i].equals("岛屿")) {
				hob.setLocal10("岛屿");
			}
			
			if (locals[i].equals("沙漠")) {
				hob.setLocal11("沙漠");
			}
			if (locals[i].equals("雪野")) {
				hob.setLocal12("雪野");
			}
			if (locals[i].equals("图书馆/书店")) {
				hob.setLocal13("图书馆/书店");
			}
			if (locals[i].equals("展览馆")) {
				hob.setLocal14("展览馆");
			}
			if (locals[i].equals("宗教圣地")) {
				hob.setLocal15("宗教圣地");
			}
			if (locals[i].equals("古迹")) {
				hob.setLocal16("古迹");
			}
			if (locals[i].equals("森林")) {
				hob.setLocal17("森林");
			}
			if (locals[i].equals("公园")) {
				hob.setLocal18("公园");
			}
			if (locals[i].equals("咖啡厅/酒吧")) {
				hob.setLocal19("咖啡厅/酒吧");
			}
			if (locals[i].equals("动物园")) {
				hob.setLocal20("动物园");
			}
			
			if (locals[i].equals("夜市赶集")) {
				hob.setLocal21("夜市赶集");
			}
			if (locals[i].equals("各种俱乐部")) {
				hob.setLocal22("各种俱乐部");
			}
			if (locals[i].equals("其他")) {
				hob.setLocal23("其他");
			}
		}		
		
		// pet
		String[] pets = pet.split(" ");
		for (int i = 0; i < pets.length; i++) {
			if (pets[i].equals("狗")) {
				hob.setPet1("狗");
			}
			if (pets[i].equals("猫")) {
				hob.setPet2("猫");
			}
			if (pets[i].equals("鱼")) {
				hob.setPet3("鱼");
			}
			if (pets[i].equals("兔")) {
				hob.setPet4("兔");
			}
			if (pets[i].equals("鸟")) {
				hob.setPet5("鸟");
			}
			if (pets[i].equals("乌龟")) {
				hob.setPet6("乌龟");
			}
			if (pets[i].equals("蜥蜴")) {
				hob.setPet7("蜥蜴");
			}
			if (pets[i].equals("鼠")) {
				hob.setPet8("鼠");
			}
			if (pets[i].equals("蛇")) {
				hob.setPet9("蛇");
			}
			if (pets[i].equals("另类宠物")) {
				hob.setPet10("另类宠物");
			}
		}		
		
		
		return hob;
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}