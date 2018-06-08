<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style type="text/css">
div#admin {
	position: absolute;
	top: 50%;
	left: 50%;
	margin: -150px 0 0 -200px;
	width: 400px;
	height: 300px;
	border: 1px solid red;
}
</style>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath }/adminServlet">
		<div id="admin">
			<center>管理员登录</center>
			<div style="padding-left: 100px; padding-top: 80px;">
				管理员账号：<input type="text" style="width: 100px; height: 20px;" name="AdminUsername">
			</div>
			<br>
			<div style="padding-left: 160px;">
				密码:<input type="password" style="width: 100px; height: 20px;" name="AdminPassword">
			</div>
			<div style="color:red;padding-left:130px;">
				${ERROR }
			</div>
			<div style="padding-left: 160px;margin-top:30px;">
				<input type="submit" value="管理员登入">
			</div>
		</div>
	</form>



</body>
</html>