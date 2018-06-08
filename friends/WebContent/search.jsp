<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap-reboot.min.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/searchCSS.css">
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" href="css/cityselect.css">
</head>
<body style="background-color: gainsboro;">
	<!-- 导入头部 -->
	<jsp:include page="/header.jsp"></jsp:include>

	<!-- 主界面 -->
	<div class="container-fluid">
		<div class="card">
			<div class="cardone1">
				<div class="row" style="width: 100%;">
					<div class="col-7">
						<label
							style="font-family: 'Courier New', Courier, monospace; font-size: 15px; color: dimgrey;">已选条件：</label>
						<form action="${pageContext.request.contextPath }/searchServlet?Search=condition" method="post">
						<select class="custom-select  custom-select-sm" name="sex">
							<option value="男">男士</option>
							<option value="女">女士</option>
						</select> <select class="custom-select custom-select-sm"
							style="width: 10.5%" name="age">
							<option selected value="18-22">18-22</option>
							<option value="23-27">23-27</option>
							<option value="28-32">28-32</option>
							<option value="33-37">33-37</option>
							<option value="38-42">38-42</option>
							<option value="43-47">43-47</option>
							<option value="48-52">48-52</option>
						</select> <input type="text" class="form-control-addon" id="citySelect"
							placeholder="选择城市" name="Mycitys"> 
							<select class="custom-select custom-select-sm" name="wedding">
							<option value="未婚">未婚</option>
							<option value="离异">离异</option>
							<option value="丧偶">丧偶</option>
							<option value="不限">不限</option>
						</select> <select class="custom-select custom-select-sm"
							style="width: 86px" name="hight">
							<option selected value="175-180">175-180</option>
							<option value="150以下">150以下</option>
							<option value="150-155">150-155</option>
							<option value="155-160">155-160</option>
							<option value="165-170">165-170</option>
							<option value="170-175">170-175</option>
							<option value="180-185">180-185</option>
							<option value="185-190">185-190</option>
							<option value="190-195">190-195</option>
							<option value="195以上">195以上</option>
						</select> <select class="custom-select custom-select-sm"
							style="width: 123px">
							<option value="1" selected>职业</option>
							<option value="2">销售</option>
							<option value="3">客户服务</option>
							<option value="4">计算机/互联网</option>
							<option value="5">通信/电子</option>
							<option value="6">生产/制造</option>
							<option value="7">物流/仓储</option>
							<option value="8">商贸/采购</option>
							<option value="9">人事/行政</option>
							<option value="10">高级管理</option>
							<option value="11">广告/市场</option>
							<option value="12">传媒/艺术</option>
							<option value="13">生物/制药</option>
							<option value="14">医疗/护理</option>
							<option value="15">金融/银行/保险</option>
							<option value="16">建筑/房地产</option>
							<option value="17">咨询/顾问</option>
							<option value="18">法律</option>
							<option value="19">财会/审计</option>
							<option value="20">教育/科研</option>
							<option value="21">服务业</option>
							<option value="22">交通运输</option>
							<option value="23">政府机构</option>
							<option value="24">军人/警察</option>
							<option value="25">农林牧渔</option>
							<option value="26">自由职业</option>
							<option value="27">在校学生</option>
							<option value="28">待业</option>
							<option value="29">其他行业</option>
						</select> <select class="custom-select custom-select-sm"
							style="width: 98px" name="money">
							<option value="3000元以下">3000元以下</option>
							<option value="3001-5000元">3001-5000元</option>
							<option value="5001-8000元">5001-8000元</option>
							<option value="8001-12000元">8001-12000元</option>
							<option value="12001-20000元">12001-20000元</option>
							<option value="20001-50000元">20001-50000元</option>
							<option value="50000元以上">50000元以上</option>
						</select>
						<button type="submit">
								<img src="img/wdl/imgs/sousuo.png" alt="搜索">
							</button>
						</form>
					</div>
					<div class="col-3"></div>

					<div class="col-2">
						<form method="post"
							action="${pageContext.request.contextPath }/searchServlet?Search=accurate">
							<input type="text" placeholder="ID称呼搜索" id="sousuo"
								name="SearchIdNiName">
							<button type="submit">
								<img src="img/wdl/imgs/sousuo.png" alt="搜索">
							</button>
						</form>


					</div>

				</div>
			</div>

			<!-- <script type="text/javascript">
				function search(data) {
					$
							.post(
									"${pageContext.request.contextPath }/searchServlet?flag=accurate",
									{
										"data" : data
									}, function() {
										window.location.load(true);
									}, "json")

				}
			</script> -->

			<!--按指定条件查询-->
			<div class="cardone2">
				<div class="row" style="width: 100%;">
					<div class="col-8">
						<ul class="list-inline">
							<li class="list-inline-item"><label>热门标签:</label></li>
							<li class="list-inline-item"><a href="#"
								style="color: orange">天生一对</a></li>
							<li class="list-inline-item"><a href="#" style="color: red">倾国倾城</a>
							</li>
							<li class="list-inline-item"><a href="#" style="color: blue">才华横溢</a>
							</li>
							<li class="list-inline-item"><a href="#"
								style="color: green">家财万贯</a></li>
							<li class="list-inline-item"><a href="#" style="color: pink">凹凸有致</a>
							</li>
							<li class="list-inline-item"><a href="#"
								style="color: black">谁在找我</a></li>
						</ul>
						<button type="submit" class="btn btn-danger">搜索</button>
					</div>
					<div class="col-4"></div>
				</div>
			</div>
		</div>
	</div>

	<!--排序-->


	<!--无限显示-->
	<div class="htmleaf-container">
		<div class="htmleaf-content bgcolor-3">
			<div id="div1">
				<c:if test="${empty listlook }">
					<c:forEach items="${indexlist }" var="indexlist">
						<div class="box">
						<a href="${pageContext.request.contextPath}/Member_info?UUID=${indexlist.uuid }">
							<img src="${indexlist.album }" alt="">
							<p>
								<a href="#">${indexlist.nickname }</a>
							</p>
							<span>${indexlist.age }</span> <span>岁,</span> <span>${indexlist.s_province }${indexlist.s_city }</span>,
							<span>${indexlist.height }cm</span>
							<p>
								<label>交友宣言：</label> <span>${indexlist.innerinfo }</span>
							</p>
							</a>
						</div>
					</c:forEach>
				</c:if>
				
				<c:if test="${!empty listlook }">
					<c:forEach items="${listlook }" var="listlook">
						<div class="box">
						<a href="${pageContext.request.contextPath}/Member_info?UUID=${listlook.uuid }">
							<img src="${listlook.album}" alt="">
							<p>
								<a href="#">${listlook.nickname }</a>
							</p>
							<span>${listlook.age }</span> <span>岁,</span> <span>${listlook.s_province }${listlook.s_city }</span>,
							<span>${listlook.height }cm</span>
							<p>
								<label>交友宣言：</label> <span>${listlook.innerinfo }</span>
							</p>
							</a>
						</div>
					</c:forEach>
				</c:if>
				
				<c:if test="${!empty condList }">
					<c:forEach items="${condList }" var="condList">
						<div class="box">
						<a href="${pageContext.request.contextPath}/Member_info?UUID=${condList.uuid }">
							<img src="${condList.album}" alt="">
							<p>
								<a href="#">${condList.nickname }</a>
							</p>
							<span>${condList.age }</span> <span>岁,</span> <span>${condList.s_province }${condList.s_city }</span>,
							<span>${condList.height }cm</span>
							<p>
								<label>交友宣言：</label> <span>${condList.innerinfo }</span>
							</p>
							</a>
						</div>
					</c:forEach>
				</c:if>
			</div>
		</div>
	</div>

	<!-- 尾部 -->
	<jsp:include page="/footer.jsp"></jsp:include>
	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/bootstrap.bundle.min.js"></script>
	<script src="js/jquery.waterfall.js"></script>
	<script src="js/cityselect.js"></script>
	<script>
		$("#div1")
				.waterfall(
						{
							itemClass : ".box",
							minColCount : 2,
							spacingHeight : 10,
							resizeable : true,
							ajaxCallback : function(success, end) {
								var data = {
									"data" : [ {
										"src" : "03.jpg"
									}, {
										"src" : "04.jpg"
									}, {
										"src" : "02.jpg"
									}, {
										"src" : "05.jpg"
									}, {
										"src" : "01.jpg"
									}, {
										"src" : "06.jpg"
									} ]
								};
								var str = "";
								var templ = '<div class="box" style="opacity:0;filter:alpha(opacity=0);"><div class="pic"><img src="img/wdl/searchimg/{{src}}" /> <p><a href="#">用户名</a></p>  <span>22</span><span>岁,</span><span>浙江杭州</span>,<span>161cm</span> <p><label>交友宣言：</label><span>爱我你怕了吗？</span></p></div></div>'
								for (var i = 0; i < data.data.length; i++) {
									str += templ.replace("{{src}}",
											data.data[i].src);
								}
								$(str).appendTo($("#div1"));
								success();
								end();
							}
						});
		var test = new Vcity.CitySelector({
			input : 'citySelect'
		});
	</script>
</body>
</html>