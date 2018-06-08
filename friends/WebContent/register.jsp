<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>friends-注册</title>
	<link rel="stylesheet"
		href="${pageContext.request.contextPath}/css/bootstrap-reboot.min.css">
	<link rel="stylesheet"
		href="${pageContext.request.contextPath}/css/bootstrap.min.css">
	<link rel="stylesheet"
		href="${pageContext.request.contextPath}/css/register.css">
	<link rel="stylesheet"
		href="${pageContext.request.contextPath}/css/headerCSS.css">

<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/jquery.validate.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/messages_zh.js" type="text/javascript"></script>
  </head>
	<script>
		function changeCode(obj){
			obj.src = "${pageContext.request.contextPath }/CheckImgServlet?time="+new Date();
		}
	</script>
  <body>
	<script>
		$(function(){	
			$("#form-register").validate({
				rules:{
					username:{
						required:true,
						minlength:11
					},
					password:{
						required:true,
						digits:true,
						minlength:6
					},
					repassword:{
						required:true,
						digits:true,
						minlength:6,
						equlTo:"[name='password']"
					},
					email:{
						required:true,
						email:true
					},
					realName:{
						required:true,
						minlength:2
					},
					sex:{
						required:true
					},
					birthday:{
						required:true,
						minlength:10
					},
					marital:{
						required:true
					}
				},
				messages:{
					username:{
						required:'手机号不能为空！',
						minlength:'手机号格式不正确！'
					},
					password:{
						required:"密码不能为空！",
						digits:"密码必须是数字！",
						minlength:"密码长度不得少于6位！"
					},
					repassword:{
						required:"确认密码不能为空！",
						digits:"密码必须是数字！",
						minlength:"密码长度不得少于6位！",
						equalTo:"两次密码不一致！"
					},
					email:{
						required:"邮箱不能为空！",
						email:"邮箱格式不正确！"
					},
					realName:{
						required:"姓名不能为空！",
						minlength:"姓名不得少于2个字符！"
					},
					sex:{
						required:"性别必须勾选！"
					},
					birthday:{
						required:"出生日期不能为空！",
						minlength:"出生日期格式不正确！"
					},
					marital:{
						required:"婚姻状况必须勾选！"
					}

				}
			});
		});
		
	</script>
	
	<script type="text/javascript">
		$(function(){
			$("#username").blur(function() {
				// 发送异步请求
				$.get("${pageContext.request.contextPath }/checkUsernameServlet",
					{"username" : $("#username").val()},
					function(data) {
						/* alert(data.isExist); */
						if (data.isExist) {// 存在
							$("#checkResult").text("手机号已存在！");
							$("#checkResult").css("color","red");
						} else {
							$("#checkResult").text("手机号可用");
							$("#checkResult").css("color","green");
						}
					},
				"json");
			});
		});
	</script>

	
	
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
		</section>
	</header>

    <div class="container" style="margin-bottom:20px;">
      <div class="row">
        <div class="col-left">
          <form action="${pageContext.request.contextPath }/RegisterServlet" id="form-register" method="POST">
          
			<div class="row form-group">
              <div class="col-1"></div>
              <div class="col-10 text-left" id="form-top">
                <h4>注册信息填写</h4>
                <p>已经注册？<a href="${pageContext.request.contextPath}/login.jsp">立即登录!</a></p>
              </div>
              <div class="col-1"></div>
            </div>   
            
            <div class="row form-group">
              <div class="col-3 text-right">
                <label for="username">手机号</label>
              </div>
              <div class="col-6">
                <input class="form-control" type="text" id="username" placeholder="请输入手机号" name="username">
                <span id="checkResult"></span>
              </div>
              <div class="col-3"></div>
            </div>
            
      		<div class="row form-group">
              <div class="col-3 text-right">
                <label for="password">密码</label>
              </div>
              <div class="col-6">
                <input class="form-control" type="password" id="password" placeholder="请输入密码" name="password">                
              </div>
              <div class="col-3"></div>
            </div>
            
            <div class="row form-group">
              <div class="col-3 text-right">
                <label for="repassword">确认密码</label>
              </div>
              <div class="col-6">
                <input class="form-control" type="password" id="repassword" placeholder="请确认密码" name="repassword">
              </div>
              <div class="col-3"></div>
            </div>
            
            <div class="row form-group">
              <div class="col-3 text-right">
                <label for="emial">Email</label>
              </div>
              <div class="col-6">
                <input class="form-control" type="text" id="emial" placeholder="请输入邮箱" name="email">
              </div>
              <div class="col-3"></div>
            </div>
            
            <div class="row form-group">
              <div class="col-3 text-right">
                <label for="realName">姓名</label>
              </div>
              <div class="col-6">
                <input class="form-control" type="text" id="realName" placeholder="请输入姓名" name="realName">
              </div>
              <div class="col-3"></div>
            </div>
            
            <div class="row form-group">
              <div class="col-3 text-right">
                <label for="sex">性别</label>
              </div>
              <div class="col-6">
                <input type="radio" id="male" value="男" name="sex">
                <label for="male">男</label>
                <input type="radio" id="female" value="女" name="sex">
                <label for="female">女</label>
              </div>
              <div class="col-3"></div>
            </div>
            
            <div class="row form-group">
              <div class="col-3 text-right">
                <label for="birthday">出生日期</label>
              </div>
              <div class="col-6">
                <input class="form-control" type="text" id="date" name="birthday" placeholder="年-月-日 例：1996-01-01">
              </div>
              <div class="col-3"></div>
            </div>
            
            <div class="row form-group">
              <div class="col-3 text-right">
                <label for="marital">婚姻状况</label>
              </div>
              <div class="col-6">
                <input type="radio" id="not" value="未婚" name="marital">
                <label for="not">未婚</label>
                <input type="radio" id="have" value="已婚" name="marital">
                <label for="have">已婚</label>
                <input type="radio" id="haved" value="丧偶" name="marital">
                <label for="haved">丧偶</label>
              </div>
              <div class="col-3"></div>
            </div>
            
            <div class="row form-group">
              <div class="col-3 text-right">
                <label for="education">学历</label>
              </div>
              <div class="col-6">
                <select class="custom-select custom-select-md mb-2" name="education">
                  <option selected>请选择学历</option>
                  <option value="高中及以下" >高中及以下</option>
                  <option value="中专" >中专</option>
                  <option value="大专" >大专</option>
                  <option value="本科" >本科</option>
                  <option value="硕士" >硕士</option>
                  <option value="博士" >博士</option>
                </select>
              </div>
              <div class="col-3"></div>
           	</div>
           	
           	<div class="row form-group">
              <div class="col-3 text-right">
                <label for="salary">月薪</label>
              </div>
              <div class="col-6">
                <select class="custom-select custom-select-md mb-2" name="salary">
                  <option selected>请选择月薪</option>
                  <option value="3000元以下" >3000元以下</option>
                  <option value="3001-5000元" >3001-5000元</option>
                  <option value="5001-8000元" >5001-8000元</option>
                  <option value="8001-12000元" >8001-12000元</option>
                  <option value="12001-30000元" >12001-30000元</option>
                  <option value="30000元以上" >30000元以上</option>
                </select>

              </div>
              <div class="col-3"></div>
            </div>

            <div class="row form-group">
              <div class="col-3 text-right">
                <label for="checkcode">验证码</label>
              </div>
              <div class="col-6">
                <input type="text" id="checkcode" style="width:40%;" name="checkcode">
                <img style="margin-left: 60px;margin-bottom:6px;"  src="${pageContext.request.contextPath }/CheckImgServlet" onclick="changeCode(this)" >         
                <div style="color:red">
                     ${checkcodeERROR }
                </div>
              </div>
              <div class="col-3"></div>
            </div>


            <div class="row form-group">
              <div class="col-3"></div>
              <div class="col-6">
                <button style="width:30%;" class="btn btn-danger">注册</button>
              </div>
              <div class="col-6"></div>
            </div>
            
          </form>

        </div>
        
        <div class="col-right">
          <h2>这里是广告</h2>
        </div>
        
      </div>
    </div>
    
	<!-- 添加footer.jsp -->
	<jsp:include page="/footer.jsp"></jsp:include>

	<script
		src="${pageContext.request.contextPath}/js/bootstrap.bundle.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/script.js" ></script>
  </body>

</html>