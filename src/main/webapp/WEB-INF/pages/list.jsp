<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="sp" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Smart Store</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #fafafa;
            margin: 0;
            padding: 20px;
        }

        h1 {
            text-align: center;
            color: #222;
            margin-bottom: 40px;
        }

        .grid-container {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(260px, 1fr));
            gap: 20px;
            max-width: 1200px;
            margin: 0 auto;
        }

        .card {
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
            overflow: hidden;
            transition: transform 0.2s ease;
            display: flex;
            flex-direction: column;
        }

        .card:hover {
            transform: translateY(-5px);
        }

        .card img {
            width: 100%;
            height: 180px;
            object-fit: contain;
            display: block;
            margin: 0; /* Removes extra spacing */
        }

        .card-body {
            padding: 16px;
            flex-grow: 1;
            display: flex;
            flex-direction: column;
            justify-content: space-between;
        }

        .product-title {
            font-size: 18px;
            font-weight: bold;
            color: #333;
            margin-bottom: 6px;
        }

        .product-id {
            font-size: 13px;
            color: #777;
            margin-bottom: 10px;
        }

        .price {
            font-size: 16px;
            color: #e91e63;
            font-weight: bold;
            margin-bottom: 12px;
        }

        .buy-btn {
            background-color: #007bff;
            color: white;
            padding: 10px 0;
            text-align: center;
            text-decoration: none;
            border-radius: 6px;
            font-weight: bold;
            transition: background-color 0.2s ease;
        }

        .buy-btn:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<h1><sp:message code="select.list.title"/></h1>

<div class="grid-container">
    <c:forEach var="item" items="${items}">
        <div class="card">
            <c:if test="${not empty item.imageBase64}">
                <img src="data:image/jpeg;base64,${item.imageBase64}" alt="${item.brand}" />
            </c:if>
            <div class="card-body">
                <div class="product-title">${item.brand}</div>
                <div class="product-id"><sp:message code="select.list.product.id"/>: ${item.id}</div>
                <div class="product-price"><sp:message code="select.list.product.price"/> :<sp:message code="currency.symbol"/> ${item.price}</div>
               
                
                <a href="buynow?id=${item.id}&category=${item.category}&lang=${param.lang}" class="buy-btn"><sp:message code="buy.button"/></a>
            </div>
        </div>
    </c:forEach>
</div>

</body>
</html>
