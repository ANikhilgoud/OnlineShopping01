<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="sp" %>

<html>
<head>
    <title>Electronics</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }

        .top-links {
            position: absolute;
            top: 10px;
            right: 10px;
        }

        .top-links a {
            margin-left: 20px;
            text-decoration: none;
            font-weight: bold;
            color: #007BFF;
        }

        .category-container {
            display: flex;
            justify-content: center;
            gap: 40px;
            margin-top: 100px;
        }

        .category-box {
            text-align: center;
        }

        .category-box img {
            width: 200px;
            height: 130px;
            border-radius: 8px;
            box-shadow: 0 2px 5px rgba(0,0,0,0.2);
            transition: transform 0.3s;
        }

        .category-box img:hover {
            transform: scale(1.05);
        }

        .category-label {
            margin-top: 8px;
            display: block;
            font-size: 16px;
            font-weight: bold;
            color: #333;
        }
    </style>
</head>
<body>

<div class="top-links">
    <a href="Add_Product?lang=${param.lang}"><sp:message code="category.addproduct"/></a>
    <a href="home?lang=${param.lang}"><sp:message code=".home"/></a>
    
</div>

<div class="category-container">
    <div class="category-box">
        <a href="retriveSmartPhones?lang=${param.lang}">
            <img src="https://tse1.mm.bing.net/th?id=OIP.263WYzcD87nAI1ip7sWDXgHaDB&pid=Api&P=0&h=180" alt="Smartphones"/>
            <span class="category-label"><sp:message code="category.electronics.smartphones"/></span>
        </a>
    </div>
    <div class="category-box">
        <a href="retrive_Laptops?lang=${param.lang}">
            <img src="https://tse1.mm.bing.net/th?id=OIP.fSkdCUHyPZWBd2UDSduNUgHaEK&pid=Api&P=0&h=180" alt="Laptops"/>
            <span class="category-label"><sp:message code="category.electronics.Laptops"/></span>
        </a>
    </div>
    <div class="category-box">
        <a href="retrive_appliances?lang=${param.lang}">
            <img src="https://tse2.mm.bing.net/th?id=OIP.mxPN2bI5AAw2FGTLKT-WngHaFi&pid=Api&P=0&h=180" alt="Appliances"/>
            <span class="category-label"><sp:message code="category.electronics.appliences"/></span>
        </a>
    </div>
</div>

</body>
</html>
