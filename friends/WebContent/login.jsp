<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>friends-登录</title>
    
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap-reboot.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/login.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/headerCSS.css">
<link rel="stylesheet" 
	href="${pageContext.request.contextPath}/css/footerCSS.css">
</head>
<script>
	function changeCode(obj){
		obj.src = "${pageContext.request.contextPath }/CheckImgServlet?time="+new Date();
	}
</script>
<body>
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


	</header>

    <div id="containster" style="margin-bottom:250px;">
        <!-- 轮播图 -->
        <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
            <!-- 轮播图的中的小点 -->
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
            </ol>
            <!-- 轮播图的轮播图片 -->
             <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="d-block w-100" src="img/sr/login/1.jpg" alt="First slide">
                </div>
                <div class="carousel-item">
                    <img class="d-block w-100" src="img/sr/login/2.jpg" alt="Second slide">
                </div>
                <div class="carousel-item">
                    <img class="d-block w-100" src="img/sr/login/3.jpg" alt="Third slide">
                </div>
            </div> 

        </div>
        <!-- 登录表单-->

        <div id="div-form">
            <h5>会员登录</h5>&nbsp;&nbsp;&nbsp;&nbsp;还没有注册？<a href="${pageContext.request.contextPath }/register.jsp">立即注册！</a>
            <div>&nbsp;</div>
            <form class="form-horizontal" action="${pageContext.request.contextPath }/LoginServlet" method="post">
                <div class="form-group">
                    <label for="username" class="col-sm-8 control-label">用户名（手机号）</label>
                    <div class="col-sm-12">
                        <input type="text" class="form-control" id="username" name="username" placeholder="请输入用户名（手机号）">
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="col-sm-4 control-label">密码</label>
                    <div class="col-sm-12">
                        <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码">
                         <div style="color:red">
                         	${passERROR }
                         </div>
                    </div>
                </div>
                <div class="form-group" >
                    <label for="checkcode" class="col-sm-4 control-label">验证码</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="checkcode" name="checkcode" placeholder="请输入验证码">
                         <div style="color:red">
                         	${checkERROR }
                         </div>
                        <img  src="${pageContext.request.contextPath }/CheckImgServlet" onclick="changeCode(this)"/>
                    </div>
                    <div class="col-sm  -3">

                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-12">
                        <input class="btn btn-primary" type="submit" value="登录" id="submit">
                    </div>
                </div>
            </form>
        </div>

    </div>
    <footer class="text-nowrap" >
	<div class="">
		<div class="font-weight-light" id="pyfooter">
			<div class="text-center">
				<a class="list-inline-item" href="#"> <label>关于我们</label>
				</a>|&nbsp;&nbsp; <a class="list-inline-item" href="#"> <label>联系我们</label>
				</a>|&nbsp;&nbsp; <a class="list-inline-item" href="#"> <label>加入我们</label>
				</a>|&nbsp;&nbsp; <a class="list-inline-item" href="#" rel="nofollow">
					<label>合作伙伴</label>
				</a>|&nbsp;&nbsp; <a class="list-inline-item" href="#" rel="nofollow">
					<label>意见反馈</label>
				</a>|&nbsp;&nbsp; <a href="#" class="list-inline-item"> <label>网站地图</label>
				</a> |&nbsp;&nbsp; <a href="#" class="list-inline-item"> <label>帮助中心</label>
				</a>|&nbsp;&nbsp; <a href="#" class="list-inline-item"> <label>PY会员</label>
				</a>|&nbsp;&nbsp; <a href="#" class="list-inline-item"> <label>PY相亲</label>
				</a>|&nbsp;&nbsp; <a href="#" class="list-inline-item"> <label>PY网服务协议</label>
				</a>|&nbsp;&nbsp; <a href="#" class="list-inline-item"> <label>个人信息保护政策</label>
				</a>
			</div>
			<br>
			<div class="text-center">
				<span>品牌：100年专业交友服务</span>&nbsp;&nbsp; <span>专业：庞大程序员队伍</span>&nbsp;&nbsp;
				<span>真实：没有任何诚信保证，绝对让你放心</span>
			</div>
			<div class="text-center">
				<span>客服热线：6666666666（号码绝对秒接）</span> <span>客服信箱：Pyfriends@Py.com</span>
			</div>
			<div class="text-center">
				<span> <a style="color: #9f9f9f;" href="#" target="_blank"
					rel="nofollow">违法和不良信息举报</a>
				</span>&nbsp;&nbsp; <span>违法和不良信息举报专线：66666666</span>&nbsp;&nbsp; <span>举报信箱：
					<a style="color: #9f9f9f;" href="Pyfriends@Py.com"
					class="underlines" rel="nofollow">jubao@zhenai.com</a>
				</span>
			</div>
		</div>

		<div class="text-center" id="pyfooter1">
			<p>Copyright © 2018-6666 PYfriends版权所有：杭州指针信息技术有限公司</p>
			<p>
				增值电信业务经营许可证：浙A-666666666 <a target="_blank" href="#">浙ICP备66666666号-1</a>
				乙测资字66666666 <a target="_blank" href="#" class="gongwang"> <img
					src="header/footerimg/gongan.png" alt="">
				</a> 浙公网安备 666666666号
			</p>

			<div class="out-link" id="foot_link">
				<a title="网文证" href="#"> <img
					src="header/footerimg/wen_bc81e4f.png" height="45px" width="45px;">
				</a> <a target="_blank" title="深圳网监备案" href="#"> <img
					src="header/footerimg/licence_29e09a5.png" alt="">
				</a> <a title="深圳举报中心" href="#" class="link6"> <img
					src="header/footerimg/report_625a5f6.png" alt="">
				</a> <a title="违法和不良信息举报中心" href="#"> <img
					src="header/footerimg/report_dfda835.jpg" alt="">
				</a> <a title="诚信示范网站" href="#"> <img
					src="header/footerimg/cert_c313c2f.png" alt="">
				</a> <a title="AAA级信用企业" href="#"> <img
					src="header/footerimg/rate_e612220.png" alt="">
				</a>
			</div>
		</div>
	</div>
</footer>

	<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
	<script
		src="${pageContext.request.contextPath}/js/bootstrap.bundle.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/script.js"></script>
</body>

</html>