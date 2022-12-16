<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: email
  Date: 12/12/2022
  Time: 11:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Products</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container d-flex flex-row mt-4 justify-content-between">
<c:forEach items="${products}" var="product">
<div class="card" style="width: 18rem;">
  <img src="" class="card-img-top" alt="Product Image">
  <div class="card-body">
    <h5 class="card-title"><span>Product Title : </span> ${product.title}</h5>
    <p class="card-text"><span>Product Price : </span> ${product.initialPrice}</p>
    <a href="show/${product.id}" class="btn btn-primary">See Product </a>
  </div>
</div>
</c:forEach>
</div>
</body>
</html>
