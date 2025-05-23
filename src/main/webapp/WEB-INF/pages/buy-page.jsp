<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="sp" %>

<html>
<head>
<title>Buy Item</title>
<style>
.item-container {
	border: 1px solid #ccc;
	padding: 20px;
	max-width: 500px;
	margin: 40px auto;
	font-family: Arial, sans-serif;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.item-title {
	font-size: 24px;
	margin-bottom: 10px;
	color: #333;
}

.item-field {
	margin-bottom: 8px;
}

.label {
	font-weight: bold;
}
</style>
</head>
<body>

	<c:choose>
		<c:when test="${not empty items}">
			<div class="item-container">
				<div class="item-title">
					<c:if test="${not empty items.image}">
						<img src="data:image/jpeg;base64,${items.imageBase64}"
							alt="${items.brand} Image" />
					</c:if>
				</div>
<div class="item-field">
					<span class="label"></span> ${items.brand}
				</div>

				<div class="item-field">
					<span class="label"><sp:message code="fashion.id"/>:</span> ${items.id}
				</div>

				<div class="item-field">
					<span class="label"><sp:message code="add.fashionProduct.price"/>:</span><sp:message code="currency.symbol"/> ${items.price}
				</div>
				

				<br>
				<div>
					<a
						href="confirmPurchase?id=${items.id}&category=${items.category}&lang=${param.lang}">
						<sp:message code="fashion.purchase"/></a>
				</div>
		</c:when>

		<c:otherwise>
			<p style="color: red; text-align: center;">Item not found or
				invalid category.</p>
		</c:otherwise>
	</c:choose>

</body>
</html>
