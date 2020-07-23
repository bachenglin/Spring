<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Date and Email Validation</title>
    </head>
    <body>
        <html:form action="/userAction" >
            <table>
                <tr>
                    <td>
                        Date Of Birth :
                    </td>
                    <td>
                        <html:text property="dob" />
                    </td>
                    <td>
                        <html:errors property="dob" />
                    </td>
                </tr>
                <tr>
                    <td>
                        Email Id :
                    </td>
                    <td>
                        <html:text property="emailId" />
                    </td>
                    <td>
                        <html:errors property="emailId" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <html:submit />
                    </td>
                </tr>
            </table>
        </html:form>
    </body>
</html>
