<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
<form name="frmUser" action="/notice/login/submit" method="post">
	ID : <input name="id">
	<br>
	PASSWD : <input name="passwd">
	<br>
	<button type="submit">SUBMIT</button>
</form>
</body>
</html>