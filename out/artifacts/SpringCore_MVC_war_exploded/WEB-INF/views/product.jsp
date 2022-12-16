<%--
  Created by IntelliJ IDEA.
  User: email
  Date: 12/13/2022
  Time: 10:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Product Details</title>
</head>
<body>
  <div class="card" style="width: 18rem;">
  <img src="" class="card-img-top" alt="Product Image">
  <div class="card-body">
    <h5 class="card-title"><span>Product Title : </span>${product.title}</h5>
  <p class="card-text"><span>Product Description : </span>${product.description}</p>
    <div class="card-info"> <span>Product Quantity : </span> ${product.quantity}  </div>
    <div class="card-info"> <span>Product Price : </span> ${product.initialPrice}  </div>
    <h4></h4>
    <a href="" class="btn btn-success">Commander </a>
  </div>
  </div>
</body>
</html>
