<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
    <%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HTML Selected Tag Program</title>
</head>
<body>
<h1>Selected Values Are :</h1>
<html:form action="/inputAction">
<bean:write name="InputForm" property="country" />
<br />
<bean:write name="InputForm" property="state" />
</html:form>
</body>
</html>