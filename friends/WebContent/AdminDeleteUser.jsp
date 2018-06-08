<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
div#adminDeleteUser {
	position: absolute;
	top: 50%;
	left: 50%;
	margin: -150px 0 0 -200px;
	width: 400px;
	height: 250px;
	border: 1px solid red;
}
</style>
</head>
<body>
	<div id="adminDeleteUser">
		<center style="color: blue;">删除用户</center> 
		
		<form method="post" action="${pageContext.request.contextPath }/adminDeleteUserServlet">
			<div style="padding-top:20px;">
				请输入要删除的用户ID：<input type="text" name="UserID" value="${User.uuid }">
			</div>
			<center>
				<input type="submit" value="删除" style="margin-top:20px;">
			</center>
			<center style="padding-top:20px;">
				${DELETE }
			</center>
		</form>
		
	</div>
</body>
</html>