<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/login" method="post" >
	<div>
		<div>用户名：</div>
		<div>
			<input type="text" name="user.username">
		</div>
	</div>
	<div>
		<div>密码：</div>
		<div>
			<input type="password" name="user.password">
		</div>
	</div>
	<div>
		<div>
			 <input type="submit" value="登录"/>
		</div>
	</div>
</form>		
</body>
</html>