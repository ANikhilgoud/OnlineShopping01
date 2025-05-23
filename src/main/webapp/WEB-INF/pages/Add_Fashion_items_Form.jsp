<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="sp" %>
<html>
<head>
    <title>Add Fashion Item</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f4f4f4;
            padding: 50px;
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 30px;
        }

        .form-container {
            max-width: 500px;
            background-color: #ggg;
            padding: 30px;
            border-radius: 10px;
            margin: 0 auto;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
        }

        .form-row {
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin-bottom: 8px;
            font-weight: 600;
            color: #444;
        }

        input[type="text"],
        input[type="number"],
        input[type="file"],
        select {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 6px;
            font-size: 14px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 12px;
            background-color: #007BFF;
            border: none;
            color: white;
            font-size: 16px;
            border-radius: 6px;
            cursor: pointer;
            font-weight: bold;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<h2><sp:message code="fashion.title"/></h2>

<div class="form-container">
    <form:form modelAttribute="items" method="post" enctype="multipart/form-data">
        <input type="hidden" name="lang" value="${param.lang}" />
        
        <div class="form-row">
            <label><sp:message code="add.fashionProduct.image"/>:</label>
            <input type="file" name="imagefile" required>
        </div>

        <div class="form-row">
            <label><sp:message code="add.fashionProduct.brand"/>:</label>
            <form:input path="brand" required="true"/>
        </div>

        <div class="form-row">
            <label><sp:message code="add.fashionProduct.size"/>:</label>
            <form:input path="product_size" required="true"/>
        </div>

        <div class="form-row">
            <label><sp:message code="add.fashionProduct.color"/>:</label>
            <form:input path="color" required="true"/>
        </div>

        <div class="form-row">
            <label><sp:message code="add.fashionProduct.price"/>:</label>
            <form:input path="price" type="number" required="true"/>
        </div>

        <div class="form-row">
            <label><sp:message code="add.fashionProduct.material"/>:</label>
            <form:input path="material" required="true"/>
        </div>

        <div class="form-row">
            <input type="submit" value="<sp:message code='save.product'/>">
        </div>

    </form:form>
</div>

</body>
</html>
