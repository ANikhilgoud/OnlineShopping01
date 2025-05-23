<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="sp"%>

<html>
<head>
    <title>Online Shopping - Add Product</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f8ff;
            margin: 0;
            padding: 20px;
        }

        h1 {
            text-align: center;
            color: #00bcd4;
            margin-bottom: 30px;
        }

        table {
            width: 60%;
            margin: 0 auto;
            padding: 20px;
            border-collapse: collapse;
            background-color: #ffffff;
            border-radius: 8px;
            box-shadow: 0 4px 10px rgba(0,0,0,0.1);
        }

        td {
            padding: 12px 16px;
            text-align: left;
        }

        input[type="text"], input[type="file"] {
            width: 100%;
            padding: 8px;
            margin: 8px 0;
            border-radius: 5px;
            border: 1px solid #ccc;
        }

        input[type="submit"], input[type="reset"] {
            width: 48%;
            padding: 10px 20px;
            border-radius: 5px;
            border: none;
            background-color: #28a745;
            color: white;
            font-weight: bold;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover, input[type="reset"]:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>

<h1><sp:message code="add.product.title"/></h1>

<frm:form modelAttribute="items" method="post" enctype="multipart/form-data">
    
    <input type="hidden" name="lang" value="${param.lang}" />

    <table bgcolor="cyan">
        <tr>
            <td><sp:message code="add.product.name"/>:</td>
            <td><frm:input path="brand" required="true" /></td>
        </tr>
        <tr>
            <td><sp:message code="add.product.image"/>:</td>
            <td><input type="file" name="imagefile" accept="image/*" required="true" /></td>
        </tr>
        <tr>
            <td><sp:message code="add.product.Price"/>:</td>
            <td><frm:input path="price" required="true" /></td> 
        </tr>
        
        <tr>
            <td colspan="2" style="text-align: center;">
                <input type="submit" value="<sp:message code='add.addanchortag'/>" />
                <input type="reset" value="<sp:message code='add.cancel'/>" />
            </td>
        </tr>
    </table>
</frm:form>
</body>
</html>