<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
<link rel=stylesheet href="css/style.css">
</head>
<body id="body_lightblue">
	<jsp:include page="linkAdmin.jsp" />
	<div style="text-align: center;">
		<h3>Welcome admin, please login!</h3>
		<form id="form1" action="Administration" method="post">
			<table>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name" required="required" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" required="required" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="login" /></td>
				</tr>
			</table>
		</form>
</body>
</html>