<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>编辑资料</title>
<link rel="stylesheet" href="css/bootstrap-reboot.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-grid.min.css">
<link rel="stylesheet" href="css/info_baseinfo_hobby.css">
<link rel="stylesheet" href="css/info.css">
<link rel="stylesheet" href="css/style.css">

</head>

<body>
	<!-- 头 -->
<jsp:include page="/header.jsp"></jsp:include>
	<!-- 兴趣爱好 -->


	<div class="container">
		<!-- 主体 -->
		<div class="row" id="subject">
			<!-- 左侧列表 -->
			<div class="col-3" id="leftSide">

				<!-- 信息详情 -->
				<div id="side1">
					<div>
						<div class="row-4" id="sideDeImg">
							<a href="${pageContext.request.contextPath }/TOalbum"> 
								<!-- <img src="/friends/img/ykw/deImg.jpeg"> -->
								<%-- <img border=0 src="downPhoto.do?fileId=${param.fileId }"> --%>
								<img src="http://localhost:8080/friends/picServlet" alt="pic" style="width:100px;height: 100px;"  />  
							</a>
						</div>

						<div class="row-4" id="sideUse">
							<div>
								<div class="row-6" id="sideUsername">
									<a href="/friends/Member_info.html">会员名字</a>
								</div>
								<div class="row-6" id="validation">
									<a href="#"> <img src="/friends/img/ykw/validation1.png">
									</a> <a href="#"> <img src="/friends/img/ykw/validation2.png">
									</a> <a href="#"> <img src="/friends/img/ykw/validation3.png">
									</a>
								</div>
							</div>
						</div>
						<div class="row-4" id="creditScore">
							<div class="row">
								<div class="col-6">
									<div style="margin-left: 30%;">
										诚信值 <span>2</span>
									</div>
								</div>
								<div class="col-6">
									芝麻积分 <span>--</span>
								</div>
							</div>
						</div>
					</div>
				</div>




				<div class="account-l fl" style="width: 100%; margin-left: 10%">
					<a class="list-title">资料编辑</a>
					<ul id="accordion" class="accordion">
						<li>
							<div class="link">
								<i class="fa fa-leaf"></i>基本信息 <i class="fa fa-chevron-down">></i>
							</div>
							<ul class="submenu">
								<li id="shop"><a href="${pageContext.request.contextPath }/TOregInfo">注册信息</a>
								</li>
								<li id="publicproducts"><a
									href="${pageContext.request.contextPath }/TOsingle">交友需求</a></li>
								<li id="productlists"><a
									href="${pageContext.request.contextPath }/TOinner">内心独白</a></li>
							</ul>
						</li>
						<li>
							<div class="link">
								<i class="fa fa-shopping-cart"></i>详细资料 <i
									class="fa fa-chevron-down">></i>
							</div>
							<ul class="submenu">
								<li><a href="${pageContext.request.contextPath }/TOdetailedInfo">详细资料</a>
								</li>
							</ul>
						</li>
						<li>
							<div class="link">
								<i class="fa fa-pencil-square-o"></i>工作生活 <i
									class="fa fa-chevron-down">></i>
							</div>
							<ul class="submenu">
								<li id="buyerxunpanlist"><a
									href="${pageContext.request.contextPath }/TOlifeInfo">生活状态</a></li>
							</ul>
						</li>
						<li>
							<div class="link">
								<i class="fa fa-file-text"></i>兴趣爱好 <i
									class="fa fa-chevron-down">></i>
							</div>
							<ul class="submenu">
								<li><a href="${pageContext.request.contextPath }/TOhobby">兴趣爱好</a></li>
							</ul>
						</li>
						<li>
							<div class="link">
								<i class="fa fa-globe"></i>我的相册 <i class="fa fa-chevron-down">></i>
							</div>
							<ul class="submenu">
								<li><a href="${pageContext.request.contextPath }/TOalbum">相册</a></li>
							</ul>
						</li>
						<li>
							<div class="link">
								<i class="fa fa-unlock-alt"></i>系统设置 <i
									class="fa fa-chevron-down">></i>
							</div>
							<ul class="submenu">
								<li id="basecomInfo"><a
									href="${pageContext.request.contextPath }/TOmodifyPassword">修改登录密码</a></li>
							</ul>
						</li>

					</ul>
				</div>
			</div>



			<!-- 右侧列表 -->
			<div class="col-9" id="rightSide">
				<div class="row">
					<div class="col-1"></div>
					<div class="col-11" id="rightSidebody">
						<!-- 资料完整度 -->
						<div class="row" id="previewInfo">
							<div class="col-3">
								兴趣爱好 <span>+20%</span>
							</div>
							<div class="col-2">资料完整度：</div>
							<div class="col-4">
								<div class="progress" style="margin-top: 5px;">
									<div class="progress-bar" role="progressbar"
										style="width: 25%;" aria-valuenow="25" aria-valuemin="0"
										aria-valuemax="100">25%</div>
								</div>
							</div>
							<div class="col-3">
								<a href="/friends/Member_info.html" target=_blank>预览我的资料页</a>
							</div>
						</div>
						<!-- 资料主体 -->
						<form method="post"
							action="${pageContext.request.contextPath }/hobbyServlet">
							<div id="baseinfo_lifeInfo" style="padding: 30px 30px 0px 30px;">
								<div id="hobbyInfo">

									<section class="nav">
									<div>
										<input id="label-1" name="lida" type="radio" checked /> <label
											for="label-1" id="item1"><i class="icon-globe"
											id="i1"></i>喜欢的活动</label>
										<div class="content" id="a1">

											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.activity1 == '电脑/网络' }">
														<input type="checkbox" name="activity1" value="电脑/网络" checked="checked">电脑/网络
													</c:if>
													<c:if test="${Hobby.activity1 != '电脑/网络' }">
														<input type="checkbox" name="activity1" value="电脑/网络">电脑/网络
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.activity2 == '电子游戏' }">
														<input type="checkbox" name="activity2" value="电子游戏" checked="checked">电子游戏
													</c:if>
													<c:if test="${Hobby.activity2 != '电子游戏' }">
														<input type="checkbox" name="activity2" value="电子游戏">电子游戏
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.activity3 == '与朋友喝酒' }">
														<input type="checkbox" name="activity3" value="与朋友喝酒" checked="checked">与朋友喝酒
													</c:if>
													<c:if test="${Hobby.activity3 != '与朋友喝酒' }">
														<input type="checkbox" name="activity3" value="与朋友喝酒">与朋友喝酒
                                        			</c:if>	
													
												</div>
												<div class="col-3">
													<c:if test="${Hobby.activity4 == '品茗' }">
														<input type="checkbox" name="activity4" value="品茗" checked="checked">品茗
													</c:if>
													<c:if test="${Hobby.activity4 != '品茗' }">
														<input type="checkbox" name="activity4" value="品茗">品茗
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.activity5 == '看电影/电视' }">
														<input type="checkbox" name="activity5" value="看电影/电视" checked="checked">看电影/电视
													</c:if>
													<c:if test="${Hobby.activity5 != '看电影/电视' }">
														<input type="checkbox" name="activity5" value="看电影/电视">看电影/电视
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.activity6 == '听音乐' }">
														<input type="checkbox" name="activity6" value="听音乐" checked="checked">听音乐
													</c:if>
													<c:if test="${Hobby.activity6 != '听音乐' }">
														<input type="checkbox" name="activity6" value="听音乐">听音乐
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.activity7 == '乐器演奏' }">
														<input type="checkbox" name="activity7" value="听音乐" checked="checked">乐器演奏
													</c:if>
													<c:if test="${Hobby.activity7 != '乐器演奏' }">
														<input type="checkbox" name="activity7" value="听音乐">乐器演奏
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.activity8 == '烹饪' }">
														<input type="checkbox" name="activity8" value="烹饪" checked="checked">烹饪
													</c:if>
													<c:if test="${Hobby.activity8 != '烹饪' }">
														<input type="checkbox" name="activity8" value="烹饪">烹饪
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.activity9 == '摄影' }">
														<input type="checkbox" name="activity9" value="摄影" checked="checked">摄影
													</c:if>
													<c:if test="${Hobby.activity9 != '摄影' }">
														<input type="checkbox" name="activity9" value="摄影">摄影
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.activity10 == '下棋/打牌' }">
														<input type="checkbox" name="activity10" value="下棋/打牌" checked="checked">下棋/打牌
													</c:if>
													<c:if test="${Hobby.activity10 != '下棋/打牌' }">
														<input type="checkbox" name="activity10" value="下棋/打牌">下棋/打牌
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.activity11 == '观光旅游' }">
														<input type="checkbox" name="activity11" value="观光旅游" checked="checked">观光旅游
													</c:if>
													<c:if test="${Hobby.activity11 != '观光旅游' }">
														<input type="checkbox" name="activity11" value="观光旅游">观光旅游
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.activity12 == '逛街购物' }">
														<input type="checkbox" name="activity12" value="逛街购物" checked="checked">逛街购物
													</c:if>
													<c:if test="${Hobby.activity12 != '逛街购物' }">
														<input type="checkbox" name="activity12" value="逛街购物">逛街购物
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.activity13 == '阅读' }">
														<input type="checkbox" name="activity13" value="阅读" checked="checked">阅读
													</c:if>
													<c:if test="${Hobby.activity13 != '阅读' }">
														<input type="checkbox" name="activity13" value="阅读">阅读
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.activity14 == '写作' }">
														<input type="checkbox" name="activity14" value="写作" checked="checked">写作
													</c:if>
													<c:if test="${Hobby.activity14 != '写作' }">
														<input type="checkbox" name="activity14" value="写作">写作
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.activity15 == '舞会/卡拉OK' }">
														<input type="checkbox" name="activity15" value="舞会/卡拉OK" checked="checked">舞会/卡拉OK
													</c:if>
													<c:if test="${Hobby.activity15 != '舞会/卡拉OK' }">
														<input type="checkbox" name="activity15" value="舞会/卡拉OK">舞会/卡拉OK
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.activity16 == '各种收集活动' }">
														<input type="checkbox" name="activity16" value="各种收集活动" checked="checked">各种收集活动
													</c:if>
													<c:if test="${Hobby.activity16 != '各种收集活动' }">
														<input type="checkbox" name="activity16" value="各种收集活动">各种收集活动
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.activity17 == '理财/投资' }">
														<input type="checkbox" name="activity17" value="理财/投资" checked="checked">理财/投资
													</c:if>
													<c:if test="${Hobby.activity17 != '理财/投资' }">
														<input type="checkbox" name="activity17" value="理财/投资">理财/投资
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.activity18 == '文艺表演' }">
														<input type="checkbox" name="activity18" value="文艺表演" checked="checked">文艺表演
													</c:if>
													<c:if test="${Hobby.activity18 != '文艺表演' }">
														<input type="checkbox" name="activity18" value="文艺表演">文艺表演
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.activity19 == '聊天' }">
														<input type="checkbox" name="activity19" value="聊天" checked="checked">聊天
													</c:if>
													<c:if test="${Hobby.activity19 != '聊天' }">
														<input type="checkbox" name="activity19" value="聊天">聊天
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.activity20 == '家务/手工艺' }">
														<input type="checkbox" name="activity20" value="家务/手工艺" checked="checked">家务/手工艺
													</c:if>
													<c:if test="${Hobby.activity20 != '家务/手工艺' }">
														<input type="checkbox" name="activity20" value="家务/手工艺">家务/手工艺
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.activity21 == '书法/绘画' }">
														<input type="checkbox" name="activity21" value="书法/绘画" checked="checked">书法/绘画
													</c:if>
													<c:if test="${Hobby.activity21 != '书法/绘画' }">
														<input type="checkbox" name="activity21" value="书法/绘画">书法/绘画
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.activity22 == '其他' }">
														<input type="checkbox" name="activity22" value="其他" checked="checked">其他
													</c:if>
													<c:if test="${Hobby.activity22 != '其他' }">
														<input type="checkbox" name="activity22" value="其他">其他
                                        			</c:if>	
												</div>
											</div>

										</div>
									</div>
									<div>
										<input id="label-2" name="lida" type="radio" /> <label
											for="label-2" id="item2"><i class="icon-leaf" id="i2"></i>喜欢的体育运动</label>
										<div class="content" id="a2">

											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.sports1 == '足球' }">
														<input type="checkbox" name="sports1" value="足球" checked="checked">足球
													</c:if>
													<c:if test="${Hobby.sports1 != '足球' }">
														<input type="checkbox" name="sports1" value="足球">足球
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.sports2 == '排球' }">
														<input type="checkbox" name="sports2" value="排球" checked="checked">排球
													</c:if>
													<c:if test="${Hobby.sports2 != '排球' }">
														<input type="checkbox" name="sports2" value="排球">排球
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.sports3 == '篮球' }">
														<input type="checkbox" name="sports3" value="篮球" checked="checked">篮球
													</c:if>
													<c:if test="${Hobby.sports3 != '篮球' }">
														<input type="checkbox" name="sports3" value="篮球">篮球
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.sports4 == '骑单车' }">
														<input type="checkbox" name="sports4" value="骑单车" checked="checked">骑单车
													</c:if>
													<c:if test="${Hobby.sports4 != '骑单车' }">
														<input type="checkbox" name="sports4" value="骑单车">骑单车
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.sports5 == '乒乓球' }">
														<input type="checkbox" name="sports5" value="乒乓球" checked="checked">乒乓球
													</c:if>
													<c:if test="${Hobby.sports5 != '乒乓球' }">
														<input type="checkbox" name="sports5" value="乒乓球">乒乓球
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.sports6 == '保龄球' }">
														<input type="checkbox" name="sports6" value="保龄球" checked="checked">保龄球
													</c:if>
													<c:if test="${Hobby.sports6 != '保龄球' }">
														<input type="checkbox" name="sports6" value="保龄球">保龄球
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.sports7 == '健身/跑步' }">
														<input type="checkbox" name="sports7" value="健身/跑步" checked="checked">健身/跑步
													</c:if>
													<c:if test="${Hobby.sports7 != '健身/跑步' }">
														<input type="checkbox" name="sports7" value="健身/跑步">健身/跑步
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.sports8 == '钓鱼' }">
														<input type="checkbox" name="sports8" value="钓鱼" checked="checked">钓鱼
													</c:if>
													<c:if test="${Hobby.sports8 != '钓鱼' }">
														<input type="checkbox" name="sports8" value="钓鱼">钓鱼
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.sports9 == '游泳/冲浪' }">
														<input type="checkbox" name="sports9" value="游泳/冲浪" checked="checked">游泳/冲浪
													</c:if>
													<c:if test="${Hobby.sports9 != '游泳/冲浪' }">
														<input type="checkbox" name="sports9" value="游泳/冲浪">游泳/冲浪
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.sports10 == '网球' }">
														<input type="checkbox" name="sports10" value="网球" checked="checked">网球
													</c:if>
													<c:if test="${Hobby.sports10 != '网球' }">
														<input type="checkbox" name="sports10" value="网球">网球
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.sports11 == '羽毛球' }">
														<input type="checkbox" name="sports11" value="羽毛球" checked="checked">羽毛球
													</c:if>
													<c:if test="${Hobby.sports11 != '羽毛球' }">
														<input type="checkbox" name="sports11" value="羽毛球">羽毛球
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.sports12 == '高尔夫' }">
														<input type="checkbox" name="sports12" value="高尔夫" checked="checked">高尔夫
													</c:if>
													<c:if test="${Hobby.sports12 != '高尔夫' }">
														<input type="checkbox" name="sports12" value="高尔夫">高尔夫
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.sports13 == '滑冰/滑雪' }">
														<input type="checkbox" name="sports13" value="滑冰/滑雪" checked="checked">滑冰/滑雪
													</c:if>
													<c:if test="${Hobby.sports13 != '滑冰/滑雪' }">
														<input type="checkbox" name="sports13" value="滑冰/滑雪">滑冰/滑雪
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.sports14 == '其他' }">
														<input type="checkbox" name="sports14" value="其他" checked="checked">其他
													</c:if>
													<c:if test="${Hobby.sports14 != '其他' }">
														<input type="checkbox" name="sports14" value="其他">其他
                                        			</c:if>	
												</div>
											</div>

										</div>
									</div>
									<div>
										<input id="label-3" name="lida" type="radio" /> <label
											for="label-3" id="item3"><i class="icon-trophy"
											id="i3"></i>喜欢的音乐</label>
										<div class="content" id="a3">

											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.music1 == '中文流行音乐' }">
														<input type="checkbox" name="music1" value="中文流行音乐" checked="checked">中文流行音乐
													</c:if>
													<c:if test="${Hobby.music1 != '中文流行音乐' }">
														<input type="checkbox" name="music1" value="中文流行音乐">中文流行音乐
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.music2 == '轻音乐' }">
														<input type="checkbox" name="music2" value="轻音乐" checked="checked">轻音乐
													</c:if>
													<c:if test="${Hobby.music2 != '轻音乐' }">
														<input type="checkbox" name="music2" value="轻音乐">轻音乐
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.music3 == '民族音乐' }">
														<input type="checkbox" name="music3" value="民族音乐" checked="checked">民族音乐
													</c:if>
													<c:if test="${Hobby.music3 != '民族音乐' }">
														<input type="checkbox" name="music3" value="民族音乐">民族音乐
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.music4 == '老歌' }">
														<input type="checkbox" name="music4" value="老歌" checked="checked">老歌
													</c:if>
													<c:if test="${Hobby.music4 != '老歌' }">
														<input type="checkbox" name="music4" value="老歌">老歌
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.music5 == '舞曲' }">
														<input type="checkbox" name="music5" value="舞曲" checked="checked">舞曲
													</c:if>
													<c:if test="${Hobby.music5 != '舞曲' }">
														<input type="checkbox" name="music5" value="舞曲">舞曲
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.music6 == '歌剧' }">
														<input type="checkbox" name="music6" value="歌剧" checked="checked">歌剧
													</c:if>
													<c:if test="${Hobby.music6 != '歌剧' }">
														<input type="checkbox" name="music6" value="歌剧">歌剧
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.music7 == '西部乡村' }">
														<input type="checkbox" name="music7" value="西部乡村" checked="checked">西部乡村
													</c:if>
													<c:if test="${Hobby.music7 != '西部乡村' }">
														<input type="checkbox" name="music7" value="西部乡村">西部乡村
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.music8 == '英文流行音乐' }">
														<input type="checkbox" name="music8" value="英文流行音乐" checked="checked">英文流行音乐
													</c:if>
													<c:if test="${Hobby.music8 != '英文流行音乐' }">
														<input type="checkbox" name="music8" value="英文流行音乐">英文流行音乐
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.music9 == '交响乐' }">
														<input type="checkbox" name="music9" value="交响乐" checked="checked">交响乐
													</c:if>
													<c:if test="${Hobby.music9 != '交响乐' }">
														<input type="checkbox" name="music9" value="交响乐">交响乐
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.music10 == '地方戏曲' }">
														<input type="checkbox" name="music10" value="地方戏曲" checked="checked">地方戏曲
													</c:if>
													<c:if test="${Hobby.music10 != '地方戏曲' }">
														<input type="checkbox" name="music10" value="地方戏曲">地方戏曲
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.music11 == '摇滚' }">
														<input type="checkbox" name="music11" value="摇滚" checked="checked">摇滚
													</c:if>
													<c:if test="${Hobby.music11 != '摇滚' }">
														<input type="checkbox" name="music11" value="摇滚">摇滚
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.music12 == '另类' }">
														<input type="checkbox" name="music12" value="另类" checked="checked">另类
													</c:if>
													<c:if test="${Hobby.music12 != '另类' }">
														<input type="checkbox" name="music12" value="另类">另类
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.music13 == '灵歌' }">
														<input type="checkbox" name="music13" value="灵歌" checked="checked">灵歌
													</c:if>
													<c:if test="${Hobby.music13 != '灵歌' }">
														<input type="checkbox" name="music13" value="灵歌">灵歌
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.music14 == '爵士/蓝调' }">
														<input type="checkbox" name="music14" value="爵士/蓝调" checked="checked">爵士/蓝调
													</c:if>
													<c:if test="${Hobby.music14 != '爵士/蓝调' }">
														<input type="checkbox" name="music14" value="爵士/蓝调">爵士/蓝调
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.music15 == '其他' }">
														<input type="checkbox" name="music15" value="其他" checked="checked">其他
													</c:if>
													<c:if test="${Hobby.music15 != '其他' }">
														<input type="checkbox" name="music15" value="其他">其他
                                        			</c:if>	
												</div>
											</div>

										</div>
									</div>
									<div>
										<input id="label-4" name="lida" type="radio" /> <label
											for="label-4" id="item4"><i class="icon-gift" id="i4"></i>喜欢的影视节目</label>
										<div class="content" id="a4">

											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.film1 == '故事片' }">
														<input type="checkbox" name="film1" value="故事片" checked="checked">故事片
													</c:if>
													<c:if test="${Hobby.film1 != '故事片' }">
														<input type="checkbox" name="film1" value="故事片">故事片
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.film2 == '文艺爱情' }">
														<input type="checkbox" name="film2" value="文艺爱情" checked="checked">文艺爱情
													</c:if>
													<c:if test="${Hobby.film2 != '文艺爱情' }">
														<input type="checkbox" name="film2" value="文艺爱情">文艺爱情
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.film3 == '科幻' }">
														<input type="checkbox" name="film3" value="科幻" checked="checked">科幻
													</c:if>
													<c:if test="${Hobby.film3 != '科幻' }">
														<input type="checkbox" name="film3" value="科幻">科幻
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.film4 == '动作武侠' }">
														<input type="checkbox" name="film4" value="动作武侠" checked="checked">动作武侠
													</c:if>
													<c:if test="${Hobby.film4 != '动作武侠' }">
														<input type="checkbox" name="film4" value="动作武侠">动作武侠
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.film5 == '侦探推理' }">
														<input type="checkbox" name="film5" value="侦探推理" checked="checked">侦探推理
													</c:if>
													<c:if test="${Hobby.film5 != '侦探推理' }">
														<input type="checkbox" name="film5" value="侦探推理">侦探推理
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.film6 == '西部电影' }">
														<input type="checkbox" name="film6" value="西部电影" checked="checked">西部电影
													</c:if>
													<c:if test="${Hobby.film6 != '西部电影' }">
														<input type="checkbox" name="film6" value="西部电影">西部电影
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.film7 == '恐怖电影' }">
														<input type="checkbox" name="film7" value="恐怖电影" checked="checked">恐怖电影
													</c:if>
													<c:if test="${Hobby.film7 != '恐怖电影' }">
														<input type="checkbox" name="film7" value="恐怖电影">恐怖电影
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.film8 == '得奖电影' }">
														<input type="checkbox" name="film8" value="得将电影" checked="checked">得奖电影
													</c:if>
													<c:if test="${Hobby.film8 != '得奖电影' }">
														<input type="checkbox" name="film8" value="得将电影">得奖电影
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.film9 == '艺术电影' }">
														<input type="checkbox" name="film9" value="艺术电影" checked="checked">艺术电影
													</c:if>
													<c:if test="${Hobby.film9 != '艺术电影' }">
														<input type="checkbox" name="film9" value="艺术电影">艺术电影
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.film10 == '音乐歌舞' }">
														<input type="checkbox" name="film10" value="音乐歌舞" checked="checked">音乐歌舞
													</c:if>
													<c:if test="${Hobby.film10 != '音乐歌舞' }">
														<input type="checkbox" name="film10" value="音乐歌舞">音乐歌舞
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.film11 == '肥皂剧' }">
														<input type="checkbox" name="film11" value="肥皂剧" checked="checked">肥皂剧
													</c:if>
													<c:if test="${Hobby.film11 != '肥皂剧' }">
														<input type="checkbox" name="film11" value="肥皂剧">肥皂剧
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.film12 == '喜剧' }">
														<input type="checkbox" name="film12" value="喜剧" checked="checked">喜剧
													</c:if>
													<c:if test="${Hobby.film12 != '喜剧' }">
														<input type="checkbox" name="film12" value="喜剧">喜剧
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.film13 == '其他' }">
														<input type="checkbox" name="film13" value="其他" checked="checked">其他
													</c:if>
													<c:if test="${Hobby.film13 != '其他' }">
														<input type="checkbox" name="film13" value="其他">其他
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.film14 == '什么都看' }">
														<input type="checkbox" name="film14" value="什么都看" checked="checked">什么都看
													</c:if>
													<c:if test="${Hobby.film14 != '什么都看' }">
														<input type="checkbox" name="film14" value="什么都看">什么都看
                                        			</c:if>	
												</div>
											</div>

										</div>
									</div>
									<div>
										<input id="label-5" name="lida" type="radio" /> <label
											for="label-5" id="item5"><i class="icon-coffee"
											id="i5"></i>喜欢的食物</label>
										<div class="content" id="a5">

											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.food1 == '川菜' }">
														<input type="checkbox" name="food1" value="川菜" checked="checked">川菜
													</c:if>
													<c:if test="${Hobby.food1 != '川菜' }">
														<input type="checkbox" name="food1" value="川菜">川菜
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.food2 == '江浙菜' }">
														<input type="checkbox" name="food2" value="江浙菜" checked="checked">江浙菜
													</c:if>
													<c:if test="${Hobby.food2 != '江浙菜' }">
														<input type="checkbox" name="food2" value="江浙菜">江浙菜
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.food3 == '湘菜' }">
														<input type="checkbox" name="food3" value="湘菜" checked="checked">湘菜
													</c:if>
													<c:if test="${Hobby.food3 != '湘菜' }">
														<input type="checkbox" name="food3" value="湘菜">湘菜
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.food4 == '火锅' }">
														<input type="checkbox" name="food4" value="火锅" checked="checked">火锅
													</c:if>
													<c:if test="${Hobby.food4 != '火锅' }">
														<input type="checkbox" name="food4" value="火锅">火锅
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.food5 == '烧烤' }">
														<input type="checkbox" name="food5" value="烧烤" checked="checked">烧烤
													</c:if>
													<c:if test="${Hobby.food5 != '烧烤' }">
														<input type="checkbox" name="food5" value="烧烤">烧烤
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.food6 == '家常菜' }">
														<input type="checkbox" name="food6" value="家常菜" checked="checked">家常菜
													</c:if>
													<c:if test="${Hobby.food6 != '家常菜' }">
														<input type="checkbox" name="food6" value="家常菜">家常菜
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.food7 == '路边摊' }">
														<input type="checkbox" name="food7" value="路边摊" checked="checked">路边摊
													</c:if>
													<c:if test="${Hobby.food7 != '路边摊' }">
														<input type="checkbox" name="food7" value="路边摊">路边摊
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.food8 == '健康食品' }">
														<input type="checkbox" name="food8" value="健康食品" checked="checked">健康食品
													</c:if>
													<c:if test="${Hobby.food8 != '健康食品' }">
														<input type="checkbox" name="food8" value="健康食品">健康食品
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.food9 == '零食' }">
														<input type="checkbox" name="food9" value="零食" checked="checked">零食
													</c:if>
													<c:if test="${Hobby.food9 != '零食' }">
														<input type="checkbox" name="food9" value="零食">零食
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.food10 == '粤菜' }">
														<input type="checkbox" name="food10" value="粤菜" checked="checked">粤菜
													</c:if>
													<c:if test="${Hobby.food10 != '粤菜' }">
														<input type="checkbox" name="food10" value="粤菜">粤菜
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.food11 == '减肥餐' }">
														<input type="checkbox" name="food11" value="减肥餐" checked="checked">减肥餐
													</c:if>
													<c:if test="${Hobby.food11 != '减肥餐' }">
														<input type="checkbox" name="food11" value="减肥餐">减肥餐
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.food12 == '量大管饱' }">
														<input type="checkbox" name="food12" value="量大管饱" checked="checked">量大管饱
													</c:if>
													<c:if test="${Hobby.food12 != '量大管饱' }">
														<input type="checkbox" name="food12" value="量大管饱">量大管饱
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.food13 == '其他' }">
														<input type="checkbox" name="food13" value="其他" checked="checked">其他
													</c:if>
													<c:if test="${Hobby.food13 != '其他' }">
														<input type="checkbox" name="food13" value="其他">其他
                                        			</c:if>	
												</div>
											</div>

										</div>
									</div>

									<div>
										<input id="label-6" name="lida" type="radio" /> <label
											for="label-6" id="item6"><i class="icon-coffee"
											id="i6"></i>喜欢的地方</label>
										<div class="content" id="a6">

											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.local1 == '都市' }">
														<input type="checkbox" name="local1" value="都市" checked="checked">都市
													</c:if>
													<c:if test="${Hobby.local1 != '都市' }">
														<input type="checkbox" name="local1" value="都市">都市
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.local2 == '村庄' }">
														<input type="checkbox" name="local2" value="村庄" checked="checked">村庄
													</c:if>
													<c:if test="${Hobby.local2 != '村庄' }">
														<input type="checkbox" name="local2" value="村庄">村庄
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.local3 == '小镇' }">
														<input type="checkbox" name="local3" value="小镇" checked="checked">小镇
													</c:if>
													<c:if test="${Hobby.local3 != '小镇' }">
														<input type="checkbox" name="local3" value="小镇">小镇
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.local4 == '山区' }">
														<input type="checkbox" name="local4" value="山区" checked="checked">山区
													</c:if>
													<c:if test="${Hobby.local4 != '山区' }">
														<input type="checkbox" name="local4" value="山区">山区
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.local5 == '办公室/学校' }">
														<input type="checkbox" name="local5" value="办公室/学校" checked="checked">办公室/学校
													</c:if>
													<c:if test="${Hobby.local5 != '办公室/学校' }">
														<input type="checkbox" name="local5" value="办公室/学校">办公室/学校
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.local6 == '游乐场' }">
														<input type="checkbox" name="local6" value="游乐场" checked="checked">游乐场
													</c:if>
													<c:if test="${Hobby.local6 != '游乐场' }">
														<input type="checkbox" name="local6" value="游乐场">游乐场
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.local7 == '购物中心' }">
														<input type="checkbox" name="local7" value="购物中心" checked="checked">购物中心
													</c:if>
													<c:if test="${Hobby.local7 != '购物中心' }">
														<input type="checkbox" name="local7" value="购物中心">购物中心
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.local8 == '家里' }">
														<input type="checkbox" name="local8" value="家里" checked="checked">家里
													</c:if>
													<c:if test="${Hobby.local8 != '家里' }">
														<input type="checkbox" name="local8" value="家里">家里
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.local9 == '海滨' }">
														<input type="checkbox" name="local9" value="海滨" checked="checked">海滨
													</c:if>
													<c:if test="${Hobby.local9 != '海滨' }">
														<input type="checkbox" name="local9" value="海滨">海滨
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.local10 == '岛屿' }">
														<input type="checkbox" name="local10" value="岛屿" checked="checked">岛屿
													</c:if>
													<c:if test="${Hobby.local10 != '岛屿' }">
														<input type="checkbox" name="local10" value="岛屿">岛屿
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.local11 == '沙漠' }">
														<input type="checkbox" name="local11" value="沙漠" checked="checked">沙漠
													</c:if>
													<c:if test="${Hobby.local11 != '沙漠' }">
														<input type="checkbox" name="local11" value="沙漠">沙漠
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.local12 == '雪野' }">
														<input type="checkbox" name="local12" value="雪野" checked="checked">雪野
													</c:if>
													<c:if test="${Hobby.local12 != '雪野' }">
														<input type="checkbox" name="local12" value="雪野">雪野
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.local13 == '图书馆/书店' }">
														<input type="checkbox" name="local13" value="图书馆/书店" checked="checked">图书馆/书店
													</c:if>
													<c:if test="${Hobby.local13 != '图书馆/书店' }">
														<input type="checkbox" name="local13" value="图书馆/书店">图书馆/书店
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.local14 == '展览馆' }">
														<input type="checkbox" name="local14" value="展览馆" checked="checked">展览馆
													</c:if>
													<c:if test="${Hobby.local14 != '展览馆' }">
														<input type="checkbox" name="local14" value="展览馆">展览馆
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.local15 == '宗教圣地' }">
														<input type="checkbox" name="local15" value="宗教圣地" checked="checked">宗教圣地
													</c:if>
													<c:if test="${Hobby.local15 != '宗教圣地' }">
														<input type="checkbox" name="local15" value="宗教圣地">宗教圣地
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.local16 == '古迹' }">
														<input type="checkbox" name="local16" value="古迹" checked="checked">古迹
													</c:if>
													<c:if test="${Hobby.local16 != '古迹' }">
														<input type="checkbox" name="local16" value="古迹">古迹
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.local17 == '森林' }">
														<input type="checkbox" name="local17" value="森林" checked="checked">森林
													</c:if>
													<c:if test="${Hobby.local17 != '森林' }">
														<input type="checkbox" name="local17" value="森林">森林
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.local18 == '公园' }">
														<input type="checkbox" name="local18" value="公园" checked="checked">公园
													</c:if>
													<c:if test="${Hobby.local18 != '公园' }">
														<input type="checkbox" name="local18" value="公园">公园
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.local19 == '咖啡厅/酒吧' }">
														<input type="checkbox" name="local19" value="咖啡厅/酒吧" checked="checked">咖啡厅/酒吧
													</c:if>
													<c:if test="${Hobby.local19 != '咖啡厅/酒吧' }">
														<input type="checkbox" name="local19" value="咖啡厅/酒吧">咖啡厅/酒吧
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.local20 == '动物园' }">
														<input type="checkbox" name="local20" value="动物园" checked="checked">动物园
													</c:if>
													<c:if test="${Hobby.local20 != '动物园' }">
														<input type="checkbox" name="local20" value="动物园">动物园
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.local21 == '夜市赶集' }">
														<input type="checkbox" name="local21" value="夜市赶集" checked="checked">夜市赶集
													</c:if>
													<c:if test="${Hobby.local21 != '夜市赶集' }">
														<input type="checkbox" name="local21" value="夜市赶集">夜市赶集
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.local22 == '各种俱乐部' }">
														<input type="checkbox" name="local22" value="各种俱乐部" checked="checked">各种俱乐部
													</c:if>
													<c:if test="${Hobby.local22 != '各种俱乐部' }">
														<input type="checkbox" name="local22" value="各种俱乐部">各种俱乐部
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.local23 == '其他' }">
														<input type="checkbox" name="local23" value="其他" checked="checked">其他
													</c:if>
													<c:if test="${Hobby.local23 != '其他' }">
														<input type="checkbox" name="local23" value="其他">其他
                                        			</c:if>	
												</div>
											</div>

										</div>
									</div>

									<div>
										<input id="label-7" name="lida" type="radio" /> <label
											for="label-7" id="item7"><i class="icon-coffee"
											id="i7"></i>喜欢的宠物</label>
										<div class="content" id="a7">

											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.pet1 == '狗' }">
														<input type="checkbox" name="pet1" value="狗" checked="checked">狗
													</c:if>
													<c:if test="${Hobby.pet1 != '狗' }">
														<input type="checkbox" name="pet1" value="狗">狗
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.pet2 == '猫' }">
														<input type="checkbox" name="pet2" value="猫" checked="checked">猫
													</c:if>
													<c:if test="${Hobby.pet2 != '猫' }">
														<input type="checkbox" name="pet2" value="猫">猫
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.pet3 == '鱼' }">
														<input type="checkbox" name="pet3" value="鱼" checked="checked">鱼
													</c:if>
													<c:if test="${Hobby.pet3 != '鱼' }">
														<input type="checkbox" name="pet3" value="鱼">鱼
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.pet4 == '兔' }">
														<input type="checkbox" name="pet4" value="兔" checked="checked">兔
													</c:if>
													<c:if test="${Hobby.pet4 != '兔' }">
														<input type="checkbox" name="pet4" value="兔">兔
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.pet5 == '鸟' }">
														<input type="checkbox" name="pet5" value="鸟" checked="checked">鸟
													</c:if>
													<c:if test="${Hobby.pet5 != '鸟' }">
														<input type="checkbox" name="pet5" value="鸟">鸟
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.pet6 == '乌龟' }">
														<input type="checkbox" name="pet6" value="乌龟" checked="checked">乌龟
													</c:if>
													<c:if test="${Hobby.pet6 != '乌龟' }">
														<input type="checkbox" name="pet6" value="乌龟">乌龟
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.pet7 == '蜥蜴' }">
														<input type="checkbox" name="pet7" value="蜥蜴" checked="checked">蜥蜴
													</c:if>
													<c:if test="${Hobby.pet7 != '蜥蜴' }">
														<input type="checkbox" name="pet7" value="蜥蜴">蜥蜴
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.pet8 == '鼠' }">
														<input type="checkbox" name="pet8" value="鼠" checked="checked">鼠
													</c:if>
													<c:if test="${Hobby.pet8 != '鼠' }">
														<input type="checkbox" name="pet8" value="鼠">鼠
                                        			</c:if>	
												</div>
											</div>
											<div class="row">
												<div class="col-3">
													<c:if test="${Hobby.pet9 == '蛇' }">
														<input type="checkbox" name="pet9" value="蛇" checked="checked">蛇
													</c:if>
													<c:if test="${Hobby.pet9 != '蛇' }">
														<input type="checkbox" name="pet9" value="蛇">蛇
                                        			</c:if>	
												</div>
												<div class="col-3">
													<c:if test="${Hobby.pet10 == '另类宠物' }">
														<input type="checkbox" name="pet10" value="另类宠物" checked="checked">另类宠物
													</c:if>
													<c:if test="${Hobby.pet10 != '另类宠物' }">
														<input type="checkbox" name="pet10" value="另类宠物">另类宠物
                                        			</c:if>	
												</div>
											</div>

										</div>
									</div>
									</section>

								</div>



								<!-- 下一页按钮 -->
								<div id="baseInfoButton">
									<input type="submit" id="baseInfoButtonA1" value="保存并继续"
										class="btn btn-outline-danger" role="button"
										aria-disabled="true"> <a
										href="${pageContext.request.contextPath }/TOregInfo"
										id="baseInfoButtonA2" class="btn btn-outline-danger"
										role="button" aria-disabled="true">跳过</a>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>




	<!-- 尾 -->
<jsp:include page="/footer.jsp"></jsp:include>


	<script src="js/jquery-3.3.1.min.js"></script>
	<script src="js/bootstrap.bundle.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src='js/Accordion.js'></script>
	<script src="js/motor.js"></script>
</body>

</html>