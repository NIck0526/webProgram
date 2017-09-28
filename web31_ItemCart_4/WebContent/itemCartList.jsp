<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CART LIST</title>
<style type="text/css">
body {
}
table { 
margin: 0px auto;
width:40%;
}
td {
border : 1px black solid;
text-align:center;
}
img {
	width:150px;
	height:100px;
}
.arrow {
	width:15px;
	height:15px;
}
</style>
<script type="text/javascript">
function deleteItems() {
	var names = document.getElementsByName('deleteItems');
	var query = "?";
	for(var i=0;i<names.length;i++){
		if(names[i].checked){
			if(query=="?") query += names[i].value+"=true";
			else query += "&" + names[i].value+"=true";
		}
	}
	location.href="removeCart.do"+query+"";
}
</script>
</head>
<body>
<h1 align="center">장바구니</h1>
<table>
<tr>
<td colspan="6" style="text-align:right;"><a href="itemList.do">쇼핑 계속하기</a></td>
</tr>
<tr>
	<td>번호</td><td>상품이미지</td><td>상품명</td><td>상품가격</td><td>수량</td><td><input type="button" name="deleteBtn" value="삭제" onclick="deleteItems()"/></td>
</tr>
	<c:forEach var="item" items="${cartList}" varStatus="vst">
		<tr>
			<td>${vst.count}</td><td><img alt="${item.name}" src="${item.url}" /></td>
			<td>${item.name}</td><td>${item.price} 원</td>
			<td>
			<a href="updateCart.do?itemname=${item.name}&count=1"><img alt="수량증가" src="img/up.jpg" class="arrow"/></a><br />
			${item.quantity}<br />
			<a href="updateCart.do?itemname=${item.name}&count=-1"><img alt="수량감소" src="img/down.jpg" class="arrow"/></a><br />
			</td>
			<td><input type="checkbox" name="deleteItems" value="${item.name}" /></td>
		</tr>
	</c:forEach>
<tr>
	<td colspan="6" align="right">총 결제금액 : ${totalPrice}</td>
</tr>
</table>
</body>
</html>