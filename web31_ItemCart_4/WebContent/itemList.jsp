<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
img {
	width:150px;
	height:150px;
	border: 1px solid;
}
</style>
</head>
<body>
<h1 align="center">Fruit Total List 1.</h1><p>
<table align="center">
	<tr>
		<c:forEach var="item" items="${list}">
			<td>
				<a href="itemView.do?itemnumber=${item.itemnumber}"><img alt="${item.name}" src="${item.url}" /></a><br />
				상품명 : ${item.name}<br />
				가격 : ${item.price}원
			</td>
		</c:forEach>
	</tr>
</table>
</body>
</html>














