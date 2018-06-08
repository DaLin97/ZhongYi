<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap-reboot.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/headerCSS.css">

<div class="container-fluid">
	<header id="jcZAHeader" class="header"
		style="background: rgb(242, 242, 242);">
		<section class="row">
			<div class="row-4">
				<img src="header/headerimg/logo_c269fa4.png" alt="Logo" id="Logo">
			</div>
			<div class="row-4">
				<img src="header/headerimg/ad-word_07de3f2.png" alt="Slogan"
					id="Slogan">
			</div>
			<div class="row-4" id="ulxuanze">
				<ul class="list-inline">
					<li class="list-inline-item">

						<div class="btn-group">
							<img data-toggle="dropdown" aria-haspopup="true"
								aria-expanded="false" src="header/headerimg/phone.png">
							<div class="dropdown-menu">
								<img class="dropdown-item" src="header/headerimg/QRcode.jpg"></a>
							</div>
						</div> <a href="#" title="PY网app下载">手机版</a>&nbsp;|
						<div class="" style="display: none;">
							扫一扫下载客户端 <i></i>
						</div>
					</li>
					<li class="list-inline-item"><a href="#">收藏本站</a>&nbsp;|</li>
					<li class="list-inline-item"><a href="#">在线客服</a>&nbsp;|</li>
					<li class="list-inline-item"><a href="#">安全中心</a>&nbsp;|</li>
					<li class="list-inline-item"><a href="#" class="help-center"
						rel="nofollow">帮助中心</a>&nbsp;|</li>
					<img src="header/headerimg/phone2.png">
					<li class="list-inline-item" style="color: #0056d3">红娘热线：66666-66666</li>
				</ul>

			</div>
		</section>
		<section>
			<nav class="navbar navbar-expand-lg navbar-dark " id="headerRoll"
				style="background: #703987; position: relative; top: auto; width: auto; opacity: 1; height: 50px;">
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarText" aria-controls="navbarText"
					aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarText">
					<ul class="navbar-nav mr-auto" id="MyPy">
						<li class="nav-item active"><a class="navbar-brand" href="#"><a
								href="${pageContext.request.contextPath}/indexServlet"><label>我的Ta</label></a>
						</a></li>
						<li class="nav-item active"><a class="navbar-brand" href="#"><a
								href="${pageContext.request.contextPath}/search.jsp"><label>搜索</label></a>
						</a></li>
						<li class="nav-item"><a class="navbar-brand" href="#"> <a
								href="#"><label>直营门店</label></a>
						</a></li>
						<li class="nav-item"><a class="navbar-brand" href="#"><a
								href="#"><label>真心会员</label></a> </a></li>
						<li class="nav-item"><a class="navbar-brand" href="#"> <a
								href="#"><label>成功故事</label></a>
						</a></li>
						<li class="nav-item"><a class="navbar-brand" href="#"><a
								href="#"><label>一个论坛</label></a> </a></li>
					</ul>
					<div class="btn-group" id="Listmenu">
						<img data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false" src="header/headerimg/icon-1_2a898ac.png"
							alt="mail">
						<div class="dropdown-menu" style="color: gray">
							<a class="dropdown-item" href="#">邮件</a> <a class="dropdown-item"
								href="${pageContext.request.contextPath}//messageServlet">消息</a> <a class="dropdown-item" href="#">关注</a> <a
								class="dropdown-item" href="#">谁看过我</a> <a class="dropdown-item"
								href="#">系统通知</a> <a class="dropdown-item" href="#">交往对象</a>
						</div>
					</div>

					<div class="btn-group" id="Listmenu">
						<img data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false" src="header/headerimg/icon-2_b536323.png"
							alt="Personal information">
						<div class="dropdown-menu" style="color: gray">
							<a class="dropdown-item" href="${pageContext.request.contextPath}/TOregInfo">编辑资料</a> <a
								class="dropdown-item" href="#">诚信认证</a> <a class="dropdown-item"
								href="${pageContext.request.contextPath}/TOalbum">个人相册</a> 
								<a class="dropdown-item" href="${pageContext.request.contextPath}/TOmodifyPassword">系统设置</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="">退出</a>
						</div>
					</div>
				</div>
			</nav>
		</section>

	</header>
	<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
	<script
		src="${pageContext.request.contextPath}/js/bootstrap.bundle.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/script.js"></script>
</div>

<br>
