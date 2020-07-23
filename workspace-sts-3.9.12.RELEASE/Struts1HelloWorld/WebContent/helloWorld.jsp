<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<html>
<head>
<meta charset="UTF-8">
<title>Hello world program</title>
</head>
<body>
<bean:write name="helloWorldForm" property="message" />
</body>
</html>