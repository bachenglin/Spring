<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HTML Tag Program</title>
</head>
<body>
<b>FeedBack Form</b>
<html:form action="/feedbackAction">
<table>
<tr>
<td>Name :
</td>
<td><html:text name="feedbackForm" property="name"></html:text>
</td>
</tr>
<tr>
<td>Gender :
</td>
<td>
<html:radio name="feedbackForm" property="gender" value="M">M</html:radio>
<html:radio name="feedbackForm" property="gender" value="F">F</html:radio>
</td>
</tr>
<tr>
<td>Comments :
</td>
<td>
<html:textarea cols="20" rows="5" name="feedbackForm" property="comments"></html:textarea>
</td>
</tr>
<tr>
<td>
<html:submit />
</td>
<td>
<html:reset />
</td>
</tr>
</table>
</html:form>
</body>
</html>