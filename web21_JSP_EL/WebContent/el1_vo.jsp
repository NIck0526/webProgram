<%@page import="vo.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 서블릿 기능... -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Attribute에 바인딩된 VO 객체를 el로 다루는 방법...</title><p>

</head>
<body>
<%
	Product product = new Product();
	product.setName("누가바");
	product.setPrice(900);
	
	
	product.setName("보석바");
	product.setPrice(1000);
	request.setAttribute("product", product);
	request.getRequestDispatcher("el1_view.jsp").forward(request, response);
	
%>
</body>
</html>















