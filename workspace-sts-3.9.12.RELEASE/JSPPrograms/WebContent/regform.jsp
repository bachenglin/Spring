<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form Page</title>
<style>
table#marlabs
{
width: 50%;
background-color:#19826F;
}

</style>
</head>
<body>
<%
String a = request.getParameter("name");
String b = request.getParameter("address");
String c = request.getParameter("age");
String d = request.getParameter("qual");
String e = request.getParameter("percent");
String f = request.getParameter("yop");
%>
<table id = "marlabs">
<tr>
<td>Name</td>
<td><%=a %></td>
</tr>
<tr>
<td>Address</td>
<td><%=b %></td>
</tr>
<tr>
<td>Age</td>
<td><%=c %></td>
</tr>
<tr>
<td>Qualification</td>
<td><%=d %></td>
</tr>
<tr>
<td>Percentage</td>
<td><%=e %></td>
</tr>
<tr>
<td>Year of Passout</td>
<td><%=f %></td>
</tr>
</table>
</body>
</html>