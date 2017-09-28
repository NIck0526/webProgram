<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">${item.name} 의 정보</h1><p>
<table align="center" width="600">
		<tr>
			<td>조회수 : ${item.count}</td><td align="right"><a href="itemCartAdd.do?itemnumber=${item.itemnumber}">장바구니 담기</a></td>
		</tr>
		<tr>
			<td><img alt="${item.name}" src="${item.url}" /></td>
			<td>종류 : ${item.name}
				<p /> 가격 : ${item.price}
				<p />
				<p /> 설명 : ${item.description}
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center"><a href="itemList.do">상품 목록 보기</a></td>
		</tr>
	</table>	
</body>
</html>



















