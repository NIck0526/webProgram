<%@page import="vo.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>1. 상품정보를 EL 식으로 출력</h2><P>
상품명 : ${requestScope.product.name} <BR>
상품가격 : ${product.price} <BR>
상품의 모든 정보 :: ${requestScope.product} 
<hr>
<h2>2. 상품정보를 JSP Element로 출력</h2><P>
상품명 :  <%= ((Product)request.getAttribute("product")).getName() %><BR>
상품가격 : <%= ((Product)request.getAttribute("product")).getPrice()%><BR>
상품의 모든 정보 <%= ((Product)request.getAttribute("product"))%>:: 
</body>
</html>
















