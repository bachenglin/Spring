<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inputs Page</title>
</head>
<body>
<html:form action="/inputAction">
<table>
<tr>
<td>
Select Country :
</td>
<td>
<html:select property="country">
<html:option value="0">Select Country</html:option>
<html:optionsCollection name="InputForm" property="countryList" label="countryName" value="countryId" />
</html:select>
</td>
</tr>
<tr>
<td>
Select State :
</td>
<td>
<html:select property="state">
<html:option value="0">Select State</html:option>
<html:optionsCollection name="InputForm" property="stateList" label="label" value="value" />
</html:select>
</td>
</tr>
<tr>
<td colspan="2" align="center">
<html:submit property="method" value="save" />
</td>
</tr>
</table>
</html:form>
</body>
</html>