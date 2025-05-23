<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="sp" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Fashion Store</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 20px;
        }

        h1 {
            text-align: center;
            color: #333;
            margin-bottom: 30px;
        }

        .grid-container {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            gap: 20px;
        }

        .card {
            background-color: #fff;
            width: 250px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
            overflow: hidden;
            transition: transform 0.2s ease;
        }

        .card:hover {
            transform: scale(1.03);
        }

        .card img {
            width: 100%;
            height: 250px;
            object-fit: cover;
        }

        .card-body {
            padding: 15px;
        }

        .card-body h3 {
            margin: 0 0 10px;
            font-size: 18px;
            color: #333;
        }

        .card-body p {
            margin: 5px 0;
            color: #666;
            font-size: 14px;
        }

        .price {
            color: #e91e63;
            font-weight: bold;
            font-size: 16px;
        }

        .buy-btn {
            display: block;
            text-align: center;
            margin-top: 12px;
            padding: 10px;
            background-color: #00bcd4;
            color: white;
            text-decoration: none;
            border-radius: 5px;
            font-weight: bold;
        }

        .buy-btn:hover {
            background-color: #0097a7;
        }
    </style>
</head>
<body>

<h1><sp:message code="fashion.title"/></h1>

<div class="grid-container">
    <c:forEach var="item" items="${items}">
        <div class="card">
            <c:if test="${not empty item.image}">
                <img src="data:image/jpeg;base64,${item.imageBase64}" alt="${item.brand} Image"/>
            </c:if>
            <div class="card-body">
                <h3>${item.brand}</h3>
                <p><sp:message code="fashion.size"/>: ${item.product_size}</p>
                <p><sp:message code="fashion.color"/>: ${item.color}</p>
                <p><sp:message code="fashion.material"/>: ${item.material}</p>
                <p class="price"><sp:message code="currency.symbol"/>${item.price}</p>
                <a href="buynow?id=${item.id}&category=${item.category}&lang=${param.lang}" class="buy-btn"><sp:message code="buy.button"/></a>
            </div>
        </div>
    </c:forEach>
</div>

</body>
</html>
