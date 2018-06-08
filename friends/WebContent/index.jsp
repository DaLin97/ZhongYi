<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">

<title>中意网主界面</title>
<link rel="stylesheet" href="css/bootstrap-reboot.min.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/indexCSS.css">
<link rel="stylesheet" href="css/shake.css">
<!--瀑布css默认样式-->
<!--<link rel="stylesheet" type="text/css" href="css/default.css">-->
<style>
</style>
</head>

<body style="background-color: gainsboro;">
	<div class="container-fluid">
		<!-- 导入头部 -->
		<jsp:include page="/header.jsp"></jsp:include>

		<!-- Html主体 -->
		<div id="background1">
			<p class="text-center" id="yigeziti">广告位招租！</p>
		</div>
		<div class="row">
			<div class="row-1" id="row-1AA"></div>
			<div class="row-1">
				<img src="img/wdl/imgs/VIP.png" alt="VIP">
			</div>
			<div class="row-1">
				<img src="img/wdl/Beauty/mv1.png" alt="mv1" class="shake shake-slow">
			</div>
			<div class="row-1">
				<img src="img/wdl/Beauty/mv2.jpg" alt="mv2" class="shake shake-slow">
			</div>
			<div class="row-1">
				<img src="img/wdl/Beauty/mv3.png" alt="mv3" class="shake shake-slow">
			</div>
			<div class="row-1">
				<img src="img/wdl/Beauty/mv4.jpg" alt="mv4" class="shake shake-slow">
			</div>
			<div class="row-1">
				<img src="img/wdl/Beauty/mv5.png" alt="mv5" class="shake shake-slow">
			</div>
			<div class="row-1">
				<img src="img/wdl/Beauty/mv6.jpg" alt="mv6" class="shake shake-slow">
			</div>
			<div class="row-1">
				<img src="img/wdl/Beauty/mv7.png" alt="mv7" class="shake shake-slow">
			</div>
			<div class="row-1">
				<img src="img/wdl/Beauty/mv8.jpg" alt="mv8" class="shake shake-slow">
			</div>
			<div class="row-1">
				<img src="img/wdl/Beauty/mv9.jpg" alt="mv9" class="shake shake-slow">
			</div>
			<div class="row-1">
				<a href="${pageContext.request.contextPath}/search.jsp"> <img
					src="img/wdl/imgs/Jiantou.png" alt="">
				</a>
			</div>
		</div>

		<div class="row" id="Middle">
			<div class="row" id="HH">
				<div class="row-4">
					<img src="img/wdl/imgs/HuiHua.png" alt="">
					<p>
						<strong>0</strong>新信息
					</p>
				</div>
				<div class="row-4">
					<img src="img/wdl/imgs/YouXiang.png" alt="">
					<p>
						<strong>0</strong>新邮件
					</p>
				</div>
				<div class="row-4">
					<img src="img/wdl/imgs/Lingdang.png" alt="">
					<p>
						<strong>0</strong>通知
					</p>
				</div>
			</div>
		</div>
		<div class="frame-left">
			<form action="${pageContext.request.contextPath }/searchServlet?Search=KKK" method="post">
				<section>
					<div id="cityleaa">
						<label>要找：地区&nbsp;</label> <select
							class="custom-select custom-select-sm" id="s_province"
							name="s_province">
						</select> <label>城市&nbsp;</label> <select
							class="custom-select custom-select-sm" id="s_city" name="s_city"></select>
						<label>区&nbsp;</label> <select
							class="custom-select custom-select-sm" id="s_county"
							name="s_county">
						</select>
						<script class="resources library" src="js/area.js"
							type="text/javascript"></script>
						<script type="text/javascript">
							_init_area();
						</script>
						<label>年龄&nbsp;</label> <select
							class="custom-select custom-select-sm" name="age">
							<option selected value="年龄">年龄</option>
							<option value="18-22">18-22</option>
							<option value="23-27">23-27</option>
							<option value="28-32">28-32</option>
							<option value="33-37">33-37</option>
							<option value="38-42">38-42</option>
							<option value="43-47">43-47</option>
							<option value="48-52">48-52</option>
						</select> <label>身高&nbsp;</label> <select
							class="custom-select custom-select-sm" name="height" id="height">
							<option selected value="身高">身高</option>
							<option value="150以下">150以下</option>
							<option value="150-155">150-155</option>
							<option value="155-160">155-160</option>
							<option value="165-170">165-170</option>
							<option value="170-175">170-175</option>
							<option value="175-180">175-180</option>
							<option value="180-185">180-185</option>
							<option value="185-190">185-190</option>
							<option value="190-195">190-195</option>
							<option value="195以上">195以上</option>
						</select> <label>收入&nbsp;</label> <select
							class="custom-select custom-select-sm" name="salary">
							<option selected value="工资">工资</option>
							<option value="3000元以下">3000元以下</option>
							<option value="3001-5000元">3001-5000元</option>
							<option value="5001-8000元">5001-8000元</option>
							<option value="8001-12000元">8001-12000元</option>
							<option value="12001-20000元">12001-20000元</option>
							<option value="20001-50000元">20001-50000元</option>
							<option value="50000元以上">50000元以上</option>
						</select> &nbsp; <input type="submit" value="保存"
							class="btn btn-info btn-sm"
							style="width: 47px; height: 30px; margin-top: 10px;">
					</div>
				</section>
			</form>
			<!--交友列表-->
<!-- 			<script>
				function chusi(c,id) {
					alert("111111")
					$.post("${pageContext.request.contextPath }/Member_info",
							{"UUID":id});
				}
			</script> -->
			<section id="gallery-wrapper">
				<c:if test="${empty searList }">
					<c:forEach items="${indexlist }" var="useList">
							<article class="white-panel">
							<a href="${pageContext.request.contextPath}/Member_info?UUID=${useList.uuid }">
							<img src="${useList.album }" class="thumb">
							<h1>
								<a href="#">姓名： <span>${useList.nickname }</span></a>
							</h1>
							<p>
								<span>${useList.age }</span>岁,<span>${useList.s_province }${useList.s_city }</span>,<span>${useList.height }cm</span>
							</p>
							<p>
								交友宣言：<span>${useList.innerinfo }</span>
							</p>
							</a>
						</article>
					</c:forEach>
				</c:if>
				
				<c:if test="${!empty searList }">
					<c:forEach items="${searList }" var="searList">
						<article class="white-panel" onclick="chusi(this,'${useList.uuid}')">
								<a href="${pageContext.request.contextPath}/Member_info?UUID=${useList.uuid }">
							<img src="${searList.album }" class="thumb">
							<h1>
								<a href="#">姓名：</a> <span>${searList.nickname }</span>
							</h1>
							<p>
								<span>${searList.age }</span>岁,<span>${searList.s_province }${useList.s_city }</span>,<span>${useList.height }cm</span>
							</p>
							<p>
								交友宣言：<span>${searList.innerinfo }</span>
							</p>
							</a>
						</article>
					</c:forEach>
				</c:if>
			</section>
		</div>
		<div class="frame-right">

			<div class="card" id="jcMyInfoPanel">
				<div class="exp-p-info">
					<a href="${pageContext.request.contextPath}/TOalbum">
						<img src="http://localhost:8080/friends/picServlet" alt="pic"
							style="width: 100px;height: 110px;margin: 17px;" id="TouXiang" name="album" />
					</a>
					<dt class="myname">
						<a href="#" name="nickname">${reuser.nickname }</a>
						<p>
							ID:
							<lable name="username">${reuser.username }</lable>
						</p>
						<img src="img/wdl/imgs/shouji.png" alt=""> <img
							src="img/wdl/imgs/shenfen.png" alt=""> <img
							src="img/wdl/imgs/zhima.png" alt="">
						<p>
							<a href="${pageContext.request.contextPath}/TOregInfo">完善资料</a> &nbsp;&nbsp; <a href="${pageContext.request.contextPath}/Member_info?UUID=${uuid }">预览</a>
						</p>
					</dt>
				</div>
				<div class="card-body" id="myxinxia1">
					<ul class="list-group list-group-flush text-center" id="ismycolor">
						<li class="list-group-item "><a href="#"> <strong>0</strong>
						</a> <label>照片</label> <a href="${pageContext.request.contextPath}/TOalbum">上传</a></li>
						<li class="list-group-item"><a href="#"> <strong>2</strong>
						</a> <label>诚信值</label> <a href="#">提升</a></li>
						<li class="list-group-item"><a href="#"> <strong>0.0</strong>
						</a> <label>钱</label> <a href="#">充值</a></li>
					</ul>
				</div>
			</div>

			<!-- 广告栏1 -->
			<div id="jcBrandBanner">
				<a href="#"> <img src="img/wdl/imgs/guanggao1.jpg" alt="">
				</a> <a href=""> <img src="img/wdl/imgs/guanggao2.jpg"
					style="margin-top: 20px; margin-left: 20px;" alt="" height=""
					width="">
				</a> <a> <embed src="img/wdl/imgs/gdd9fid.swf"
						style="margin-top: 5px;" height="500px" width=""></a>
			</div>
		</div>
	</div>
	<!-- 尾 -->
	<div
		style="width: 100%; height: 100px; position: relative; top: 1350px;">
		<div style="position: relative; right: 900px;">
			<jsp:include page="/footer.jsp"></jsp:include>
		</div>
	</div>

	<script type="text/javascript">
		var Gid = document.getElementById;
		var showArea = function() {
			Gid('show').innerHTML = "<h3>省" + Gid('s_province').value + " - 市"
					+ Gid('s_city').value + " - 县/区" + Gid('s_county').value
					+ "</h3>"
		}
		Gid('s_county').setAttribute('onchange', 'showArea()');
	</script>

	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/script.js"></script>
	<!--瀑布图引入JS文件-->
	<script src="js/jquery-1.11.0.min.js"></script>
	<script src="js/pinterest_grid.js"></script>
	<script type="text/javascript">
		$(function() {
			$("#gallery-wrapper").pinterest_grid({
				no_columns : 4,
				padding_x : 10,
				padding_y : 10,
				margin_bottom : 50,
				single_column_breakpoint : 700
			});
		});
	</script>
</body>

</html>