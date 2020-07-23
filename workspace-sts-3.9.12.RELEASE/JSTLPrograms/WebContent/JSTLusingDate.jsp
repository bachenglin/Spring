<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "fmt" uri ="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:blue">Date Parsing</h1>
<c:set var="now" value="08-05-2020"/>
<fmt:parseDate value="${now}" var="abcd" pattern="dd-MM-yyyy"/>
<p>Parsed Date is : <c:out value="${abcd}"></c:out></p>
</body>
</html>