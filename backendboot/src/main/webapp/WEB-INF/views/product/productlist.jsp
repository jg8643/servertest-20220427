<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){

	});
</script>
</head>
<body>
<h1>상품정보</h1>
<c:forEach items="${productlist }" var="dto">
<h3>코드번호 : ${dto.productCode }<a href="/product?productcode=${dto.productCode }" > 상품명 : ${dto.productName }</a>
가격 : ${dto.price }</h3>
</c:forEach>


</body>
</html>