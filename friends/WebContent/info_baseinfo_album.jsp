<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    <link rel="stylesheet" href="css/info_baseinfo_album.css">
    <link rel="stylesheet" href="css/info.css">

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
								<img src="http://localhost:8080/friends/picServlet" alt="pic"  style="width:100px;height: 100px;" />  
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
                    <div class="col-1">

                    </div>
                    <div class="col-11" id="rightSidebody">
                        <!-- 资料完整度 -->
                        <div class="row" id="previewInfo">
                            <div class="col-3">
                                我的相册
                                <span>+20%</span>
                            </div>
                            <div class="col-2">
                                资料完整度：
                            </div>
                            <div class="col-4">
                                <div class="progress" style="margin-top:5px;">
                                    <div class="progress-bar" role="progressbar" style="width: 25%;" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100">25%</div>
                                </div>
                            </div>
                            <div class="col-3">
                                <a href="/friends/Member_info.html" target=_blank>预览我的资料页</a>
                            </div>
                        </div>
                        <!-- 资料主体 -->
						<form action="${pageContext.request.contextPath }/albumServlet" method="post" enctype="multipart/form-data">
                        <div id="baseinfo_album" style="padding: 30px 30px 0px 30px;text-align: center;margin-bottom:30px;">
                            
                                <div>
                                    <img src="img/ykw/upload1.png" style="margin-bottom:30px;">
                                    <br>
                                    <span>上传头像，征友成功率提升7倍！</span>
                                </div>
								<div style="color:red;">
									${change }
								</div>
								<input type="file" name="uplaod" style="margin-top:30px;"><br>
								<input type="submit" value="现在上传" id="baseInfoButtonA1" class="btn btn-outline-danger" role="button" aria-disabled="true" style="width:233px;margin-top:30px;">
								
                            
                        	</div>
                        </form>
                    </div>

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
</body>

</html>