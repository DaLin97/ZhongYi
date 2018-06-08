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
    <link rel="stylesheet" href="css/info_baseinfo_Inner.css">
    <link rel="stylesheet" href="css/info.css">
</head>

<body>
    <!-- 头 -->
    <jsp:include page="/header.jsp"></jsp:include>
    <!-- 基本资料-内心独白 -->


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
                                内心独白
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
                        <form method="post" action="${pageContext.request.contextPath }/InnerServlet">
                        <div id="baseinfo_Inner" style="padding: 30px 30px 0px 30px;">
                            
                                <div id="textAreaInner">
                                    <div>
                                        <p style="font-size:18px;color:#000;font-weight:bold;">
                                            介绍一下自己，描述一下理想的伙伴，说说你对未来的期望
                                        </p>
                                        <p>
                                            让潜在的朋友能深入了解您
                                        </p>
                                    </div>
                                    <div>
                                        <textarea maxlength="120" style="width:100%" rows="8" name="innerinfo" value="${User.innerinfo }">${User.innerinfo }</textarea>
                                        <p>限120字</p>
                                    </div>
                                    <div>
                                        <P>温馨提示：</P>
                                        <p>1. 为了遵守国家法规，保障用户个人信息安全，内心独白中请勿出现QQ、MSN、微信、微博、电话号码等联系方式以及网址、广告、色情、诋毁或其他不健康的内容。</p>
                                        <p>2. 若文字中出现不符合标准的内容，我们将予以删除，请认真填写。</p>
                                    </div>
                                </div>


                                <!-- 下一页按钮 -->
                                <div id="baseInfoButton">
									<input type="submit" id="baseInfoButtonA1" value="保存并继续" class="btn btn-outline-danger" role="button" aria-disabled="true"> 
									<a href="${pageContext.request.contextPath }/TOdetailedInfo" id="baseInfoButtonA2" class="btn btn-outline-danger" role="button" aria-disabled="true">跳过</a>
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
</body>

</html>