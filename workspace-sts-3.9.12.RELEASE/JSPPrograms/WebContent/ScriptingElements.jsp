<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int x = 1000;
int y = 2000;
int z;
z = x + y;
%>
The value of z is: <%=z %>
<%
for (int a = 0; a<8; a++)
{
	

%><br>
the new value of a is :<%=a %>
<%} %>
<%!
public int add(int i, int j)
{
	return i + j;
}
%>
<%
int k = add(100,300);
%>
the value of k is <%=k %>
</body>
</html>