<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="sp"%>


<html>
<head>
    <title>Purchase Confirmed</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            padding: 50px;
        }
        .message {
            font-size: 20px;
            color: green;
        }
    </style>
</head>
<body>
    <div class="message">
        <h2><sp:message code="confirm.message"/></h2>
    </div>
    <br>
    <a href="home"><sp:message code=".home"/></a>
</body>
</html>
