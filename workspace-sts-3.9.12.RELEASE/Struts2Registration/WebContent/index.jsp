<%@ taglib uri="/struts-tags" prefix = "s"%>
<s:form action = "register">
<s:textfield name="name" label="Username"></s:textfield>
<s:textfield name="password" label="Password"></s:textfield>
<s:textfield name="email" label="Email"></s:textfield>
<s:radio list="{'male','female'}" name = "gender"></s:radio>
<s:select cssStyle = "width:150px;" list="{'USA','India','China','UK'}" name = "country" label="UserCountry"}"></s:select>
<s:submit value = "register"></s:submit>
</s:form>