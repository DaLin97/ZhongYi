<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap-reboot.min.css" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/Member_info.css" />
<link rel="stylesheet" href="css/footerCSS.css" />
<link rel="stylesheet" href="css/headerCSS.css" />
<style type="text/css">
/*鼠标悬停下拉事件*/
div>.dropdown-menu {
	margin: 0;
}

div:hover>.dropdown-menu {
	display: block;
}

div .dropdown-menu {
	font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande',
		'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
	font-size: 10px;
}
</style>

</head>

<body>
	<div class="" style="background-color: #f2f2f2; width:100%">
		<jsp:include page="/header.jsp"></jsp:include>

		<!--以上是导航  头部-->
		<div class="row"
			style="background-color: white; margin-top: 40px; width: 90%; height: 522px; margin-left: 75px;">
			<div class="col-4">
				<img src="${User.album} "
					style="margin-top: 40px; margin-left: 50px;width: 80%; height: 350px; " />
			</div>
			<div class="col-8">
				<p style="margin-top: 45px;">
					<a style="font-size: 2em;" href="#">${User.realName}</a> <a href="#"><img
						src="img/yky/phone.png" title="已验证手机号" style="margin-bottom: 5px;" /></a>
					<a href="#"><img src="img/yky/xinxi.png" title="未通过身份认证"
						style="margin-bottom: 5px;" /></a> <a href="#"><img
						src="img/yky/zhima.png" title="芝麻信用未认证"
						style="margin-bottom: 5px;" /></a>
				</p>
				<p style="color: #9F9F9F;">
					ID:1488455135&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;诚信值:2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<button type="button"
						style="background-color: #A9A0C9; width: 130; height: 28; border-radius: 4px; color: whitesmoke;">查看最后登录时间</button>

				</p>
				<hr style="margin-top: 50px;" />
				
				<div class="row" id="_xinxisize" style="margin-top: 30px;">
					<div class="col-4">
						<span>年龄:</span>${User.age}
					</div>
				
					<div class="col-4">
						<span>身高:</span>${User.height}
					</div>
					<div class="col-4">
						<span>月收入：</span>${User.salary}
					</div>
					<div class="col-4">
						<span>婚况：</span>${User.marital}
					</div>
					<div class="col-4">
						<span>学历：</span>${User.education}
					</div>
					<div class="col-4">
						<span>工作地：</span>${User.s_province}
					</div>
					<div class="col-4">
						<span>职业：</span> --
					</div>
					<div class="col-4">
						<span>星座：</span>${User.constellation}
					</div>
					<div class="col-4">
						<span>籍贯：</span>${User.o_province}${User.o_city}${User.o_county}
					</div>

				</div>
				<script type="text/javascript">
						function changecode(e,q,a,c) {
							
							 var str = prompt("跟Ta打个招呼吧", "比如我叫啥");
							if(str) {
								
								alert("打招呼成功：" + str)
								$.post("${pageContext.request.contextPath}/GreetServlet",{"otherName":e,"otherAge":q,"othercity":a,"messsge":str,"photo":c});
								  
							} 
							
						}
					</script>
				<hr style="margin-top: 30px;" />
				<div class="row" style="margin-top: 30px;">
					<div class="col-3">
						<button type="button" class="btn btn-danger" style="width: 100%;">发邮件</button>
					</div>
					<div class="col-2">
						<button type="button" class="btn btn-secondary"
							style="width: 100%"; onclick="changecode('${User.realName}','${User.age}','${User.s_province}','${User.album}' )">打招呼</button>
					</div>
					<div class="col-2">
						<button type="button" class="btn btn-secondary"
							style="width: 100%; ">问问题</button>
					</div>
					<div class="col-2">
						<button type="button" class="btn btn-secondary"
							style="width: 100%;">委托红娘</button>
					</div>
					<div class="col-3"></div>
				</div>
				<div>
					<ul class="list-inline" style="margin-top: 35px; font-size: 0.6em;">
						<li class="list-inline-item"><a href="#"><img
								src="img/yky/rentou.png" />关注</a></li>
						<li class="list-inline-item"><a href="#"><img
								src="img/yky/liwu.png" />送礼物</a></li>
						<li class="list-inline-item"><a href="#"><img
								src="img/yky/liaotian.png" />在线聊天</a></li>
						<li class="list-inline-item"><a href="#"><img
								src="img/yky/qingdi.png" />情敌动态</a></li>
						<li class="list-inline-item"><a href="#"><img
								src="img/yky/jubao.png" />举报/拉黑</a></li>

					</ul>

				</div>
			</div>

		</div>
		
		<!--
             以上  信息显示
            -->
		<div class="row"
			style="width: 90%; margin-top: 20px; margin-left: 75px;">
			<div class="col-8" style="background-color: white;">
				<hr />
				<div class="row">
					<div class="col-3">
						<img src="img/yky/ziliao.png" style="margin-left: 30px;" />
					</div>
					<div class="col-5">
						<p>性别:${User.sex}</p>
						<p>身高:${User.height}</p>
						<p>体重:${User.weight}</p>
						<p>体型：--</p>
						<p>民族:${User.nation}</p>
						<p>信仰:${User.faith}</p>

					</div>
					<div class="col-4">
						<p>生肖:${User.zodiac}</p>
						<p>星座:${User.constellation}</p>
						<p>血型:${User.bloodtype}</p>
						<p>职业：--</p>
						<p>公司:--</p>
						<p></p>
					</div>

				</div>

				<hr />
				<div class="row">
					<div class="col-3">
						<img src="img/yky/life.png" style="margin-right: 30px;" />
					</div>
					<div class="col-5">
						<p>住房条件:${User.house}</p>
						<p>是否购车:${User.car}</p>
						<p>是否吸烟:${User.smoke}</p>
						<p>是否喝酒：${User.drink}</p>
						<p>厨艺:${User.cook}</p>
						<p>家务:${User.homework}</p>

					</div>
					<div class="col-4">
						<p>想何时结婚:--</p>
						<p>婚后与父母住吗:--</p>
						<p>与对方父母同住:--</p>
						<p>较大的消费：${User.consumption}</p>
						<p>喜欢怎样的约会:--</p>
						<p></p>
				</div>

				</div>
				<hr />
				<div class="row">
					<div class="col-3">
						<img src="img/yky/hobby.png" style="margin-right: 30px;" />
					</div>
					<div class="col-5">
						<p>喜欢的活动:${User.activity}</p>
						<p>喜欢的体育运动:${User.sports}</p>
						<p>喜欢的音乐:${User.music}</p>
						<p>喜欢的影视节目：${User.film}</p>
						<p></p>
						<p></p>

					</div>
					<div class="col-4">
						<p>喜欢的食物:${User.food}</p>
						<p>喜欢的地方:${User.local}</p>
						<p>喜欢的宠物:${User.pet}</p>

					</div>

				</div>
				<hr />
				<div class="row">
					<div class="col-3">
						<img src="img/yky/zeou.png" style="margin-right: 30px;" />
					</div>
					<div class="col-5">
						<p>性别:${User.other_sex}</p>
						<p>年龄:${User.other_age}</p>
						<p>身高:</p>
						<p>学历：${User.other_education}</p>
						<p>月收入:${User.other_salary}</p>
						<p>婚况:${User.other_marital}</p>
						<p>工作地区:${User.other_s_city}</p>

					</div>
					<div class="col-4">
						<p>体型:不限</p>
						<p>职业:不限</p>
						<p>是否抽烟:</p>
						<p>是否喝酒:</p>
						<p>有没有孩子:不限</p>
						<p>是否想要孩子:不限</p>
						<p>是否有照片:不限</p>
					</div>

				</div>
				<hr />
				<p style="text-align: center;">
					<a href="#" style="font-size: 0.6em;">TA资料完整度只有40%，邀请完善资料</a>
				</p>
			</div>
			<!--
	作者：YKY994899941@qq.com
	时间：2018-04-12
	描述：以上信息显示
-->
			<div class="col-4">
				<div style="background-color: white; margin-left: 10px;">
				<p style=" margin-right:20px; height: 20px; ">(╯▽╰) 唉！她还没有收到礼物</p>
				
                    <div class="row " style="margin-left: 10px; margin-top: 15px; ">
                  

                     <div class="col-4 ">
                     
                     	<a href="# "> <img src="img/yky/liwu1.png "/></a>
                     </div>
                      <div class="col-4 ">
                     	<a href="# "> <img src="img/yky/liwu2.png "/></a>
                     </div>
                      <div class="col-4 ">
                     	<a href="# "> <img src="img/yky/liwu3.png "/></a>
                     </div>
                     </div>
                     <button type="button " style="background-color: #A9A0C9; margin-top: 20px; margin-left: 30px; width: 80%; color: white; border-radius: 3px; margin-bottom: 20px; ">快来做第一个送TA礼物的人</button>
				</div>
	
					 <div style="background-color: white; margin-left: 10px; margin-top: 20px">
	                   <div style="background-color: #9D90D1;">
	                   <h2 style="text-align: center; color: white; ">星级特权</h2>
	                    <p style="text-align: center; color: white; font-size: 0.8em; margin-top: 10px; margin-bottom: 10px;">搜索提前，尊贵标识，更多曝光，更多机会</p>
					    <p>&nbsp;</p>
	                   </div>
					 <div class="row" >
					 	<div class="col-2">
					 		
					 	</div>
					 	<div class="col-10">
					 		<div class="form-check">
  <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="option1" checked>
  <label class="form-check-label" for="exampleRadios1">
    1个月&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1元/天
  </label>
</div>
					 	</div>
					 	
					 	
					 </div>
					 
					 		 <div class="row" >
					 	<div class="col-2">
					 		
					 	</div>
					 	<div class="col-10">
					 		<div class="form-check">
  <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="option1" checked>
  <label class="form-check-label" for="exampleRadios2">
    3个月&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;0.9元/天
  </label>
</div>
					 	</div>
					 	
					 	
					 </div>
					 		 <div class="row" >
					 	<div class="col-2">
					 		
					 	</div>
					 	<div class="col-10">
					 		<div class="form-check">
  <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios3" value="option1" checked>
  <label class="form-check-label" for="exampleRadios3">
    12个月&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;0.27元/天
  </label>
</div>
<button type="button" style="background-color: #EB5454; color: white; margin-top: 20px; margin-left: 30px; width: 50%; border-radius: 3px; margin-bottom: 20px;" >立即开通</button>
					 	</div>
					
					 	 </div>
					 
					
					 </div>
	     <div style="margin-top: 20px; margin-left: 10px;">
					<a href="#"><img src="img/yky/shenji.png" style="width: 100%;"/></a>	
					</div> 	
					<!--<div style="background-color: white; margin-left: 10px;margin-top: 20px; " >
					 <div class="row" >
					 	<div class="col-3">
					 		<span   style="font-size: 0.8em; margin-left: 5px;">
							猜你喜欢
							</span>
					 	</div>
					 	<div class="col-6"></div>
					 	<div class="col-3">
					 		<span ><a href="#"  style="font-size: 0.8em;">换一组</a></span>
					 	</div>
					 </div>-->
					
					
					</div>
	
			</div>

		<div >
       <jsp:include page="/footer.jsp"></jsp:include>
		</div>
		
		<script src="js/jquery-3.3.1.min.js "></script>
		<script src="js/bootstrap.bundle.min.js"></script>
		<script src="js/bootstrap.min.js "></script>
		
   		
		
	</body>

</html>