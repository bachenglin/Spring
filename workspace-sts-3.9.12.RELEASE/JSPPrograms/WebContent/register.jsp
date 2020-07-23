<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
div.xyz
{
test-align: right width:300px;
padding: 10px;
border: 5px solid red;
margin: 0px;
}
</style>
</head>
<body>
<h1 style="color:blue"> Student Registration Form</h1>
<div class = "xyz">
<form action = "ActionController" method = "post">
<table style = "didth: 50%">
<tr>
<td>Name</td>
<td><input type = "text" name = "name"/></td>
</tr>
<tr>
<td>Address</td>
<td><input type = "text" name = "address"/></td>
</tr>
<tr>
<td>Age</td>
<td><input type = "text" name = "age"/></td>
</tr>
<tr>
<td>Qualification</td>
<td><input type = "text" name = "qual"/></td>
</tr>
<tr>
<td>Percentage</td>
<td><input type = "text" name = "percent"/></td>
</tr>
<tr>
<td>Yesr of Passout</td>
<td><input type = "text" name = "yop"/></td>
</tr>
</table>
<input type = "submit" value = "register/">
</form>
</div>
</body>
</html>