<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
div#adminChangeUser {
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
	<div id="adminChangeUser">
		<center style="color: blue;">查询用户名</center> 
		
		<form method="post" action="${pageContext.request.contextPath }/adminQueryUserServlet">
			<div style="padding-top:20px;">
				请输入要查询的用户名：<input type="text" name="username" value="${User.username }">
			</div>
			<center>
				<input type="submit" value="查询" style="margin-top:20px;">
			</center>
			<div style="padding-top:20px;margin-left:100px;">
				用户ID：${User.uuid }
			</div>
		</form>
		
	</div>
	
</body>
</html>


