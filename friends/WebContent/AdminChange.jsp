<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<table border="1" width="100%" height="100%">
		<tr>
			<td colspan="2" height="40" bgcolor="blue" align="center" ><h1 style="color: red">管理员管理界面</h1></td>
		</tr>	
		<tr>
			<td width="190" height="500px" valign="top">
				<h2>
					用户资料管理	
				</h2>
				<h3>
					<a href="AdminChangeUser.jsp" target="abc">查看用户资料</a>
				</h3>
				<h3>
					<a href="AdminDeleteUser.jsp" target="abc">删除用户</a>
				</h3>
			</td>
			<td>
			<iframe src="" width="100%" height="500px" name="abc" frameborder="1"></iframe>
			</td>		
		</tr>

	</table>
	</div>
</body>
</html>