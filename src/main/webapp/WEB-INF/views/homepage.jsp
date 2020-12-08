<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel ="stylesheet" href='<c:url value="/resources/styles/demo.css/"></c:url>'>
</head>
<body>
<h1>Hello World</h1>
<div class="row">
<c:forEach var="listHP" items="${listHP}">
	<div class="col-4">
		<img alt="" src='<c:url value="/resources/images/products/${listHP.getProductImage() }"></c:url>'>
		<h4>${listHP.getProductName()}</h4>
		<p>${listHp.getProductPrice()}</p>
	</div>
</c:forEach>
</div>
</body>
</html>