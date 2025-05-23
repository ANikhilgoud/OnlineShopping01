<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="sp" %>
<html>
<head>
    <title><sp:message code="title.name"/></title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f6ff;
            padding-top: 50px;
        }

        h1 {
            text-align: center;
            color: #17a2b8;
        }

        table {
            margin: 0 auto;
            background-color: #e0f7fa;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 2px 5px rgba(0,0,0,0.2);
        }

        td {
            padding: 10px;
            font-size: 16px;
        }

        input[type="submit"],
        input[type="reset"] {
            padding: 8px 16px;
            font-size: 14px;
            background-color: #007BFF;
            color: white;
            border: none;
            border-radius: 6px;
            cursor: pointer;
        }

        input[type="reset"] {
            background-color: #6c757d;
        }

        input[type="submit"]:hover,
        input[type="reset"]:hover {
            opacity: 0.9;
        }
    </style>
</head>
<body>

<h1><sp:message code="home.title"/></h1>

<frm:form modelAttribute="customer">
    <table>
        <tr>
            <td><sp:message code="home.username"/>:</td>
            <td><frm:input path="username" htmlEscape="true"  required="required"/></td>
        </tr>
        <tr>
            <td><sp:message code="home.mobile"/>:</td>
            <td><frm:input path="mno" htmlEscape="true" required="required"/></td>
        </tr>
        <tr>
            <td colspan="2" style="text-align:center;">
                <input type="submit" value="<sp:message code='home.ok' />" />

                <input type="reset" value="<sp:message code='home.cancel'/>"/>
            </td>
        </tr>
    </table>
    <p align="center">
    <a href="?lang=en_US">English</a> &nbsp;&nbsp;&nbsp;
    <a href="?lang=fr_FR">French</a>&nbsp;&nbsp;&nbsp;
    
    </p>
</frm:form>

</body>
</html>
