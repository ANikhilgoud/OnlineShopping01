<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="sp" %>

<style>
    .category-container {
        display: flex;
        justify-content: center;
        gap: 50px;
        margin-top: 30px;
    }
    .category-box {
        text-align: center;
    }
    .category-box img {
        width: 150px;
        height: 120px;
        border-radius: 10px;
        transition: transform 0.3s;
    }
    .category-box img:hover {
        transform: scale(1.05);
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
</style>

<div class="category-container">
    <div class="category-box">
        <a href="electronics?lang=${param.lang}">
            <img src="https://tse4.mm.bing.net/th?id=OIP.6AwfvMS9Z_ujYPRtHs1fYgHaFb&pid=Api&P=0&h=180"
                  /><br/>
            <strong><sp:message code="category.electronics" /></strong>
        </a>
    </div>
    <div class="category-box">
        <a href="retrieve-fashion-items?lang=${param.lang}">
            <img src="https://tse1.mm.bing.net/th?id=OIP.b3DV5DRR8Zr1OM1a3Zzy1wHaFL&pid=Api&P=0&h=180"
                 /><br/>
            <strong><sp:message code="category.fashion" /></strong>
        </a>
        <div class=top-links>
    <a href="?lang=en_US">English</a> &nbsp;&nbsp;&nbsp;
    <a href="?lang=fr_FR">French</a>&nbsp;&nbsp;&nbsp;
    <a href="?lang=hi_HI">हिंदी</a>&nbsp;&nbsp;&nbsp;
    
    </div>
    </div>
</div>
