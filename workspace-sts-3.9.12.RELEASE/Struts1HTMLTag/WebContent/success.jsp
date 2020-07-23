<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
    <%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<b>Feedback Successfully Submitted</b>
<br> You have submitted the following Feedback.
<table>
<tr>
<td>Name :</td>
<td><bean:write name="feedbackForm" property="name" />
</td>
</tr>
<tr>
<td>Gender :</td>
<td><logic:equal name="feedbackForm" property="gender" value="M">M</logic:equal>
</td>
<td><logic:equal name="feedbackForm" property="gender" value="F">F</logic:equal>
</td>
</tr>
<tr>
<td>Comments :</td>
<td><bean:write name="feedbackForm" property="comments" />
</td>
</tr>
</table>
</body>
</html>