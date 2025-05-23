<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="sp" %>

<html>
<head>
    <title>Add Electronics</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f7f7f7;
            text-align: center;
            padding-top: 100px;
        }

        h2 {
            color: #333;
        }

        .link-container {
            display: flex;
            justify-content: center;
            gap: 50px;
            margin-top: 30px;
        }

        .link-box a {
            text-decoration: none;
            padding: 15px 25px;
            background-color: #007BFF;
            color: white;
            border-radius: 8px;
            font-size: 16px;
            transition: background-color 0.3s ease;
        }

        .link-box a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>


    <h2><sp:message code="select.category.product"/></h2>

    <div class="link-container">
    <div class="link-box">
        <a href="Add_smartphones?lang=${param.lang}"><sp:message code="category.addproduct.smartphones"/></a>
    </div>
    <div class="link-box">
        <a href="Add_Laptops?lang=${param.lang}"><sp:message code="category.addproduct.Laptops"/></a>
    </div>
    <div class="link-box">
        <a href="Add_appliances?lang=${param.lang}"><sp:message code="category.addproduct.Appliences"/></a>
    </div>
    <div class="link-box">
        <a href="Add_Fashion_items?lang=${param.lang}"><sp:message code="category.addproduct.Fashion"/></a>
    </div>
</div>


</body>
</html>
