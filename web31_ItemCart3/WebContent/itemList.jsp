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
<h1 align="center">Fruit Total List 3.</h1><p>
<table align="center">

	<tr>
		<c:forEach var="item" items="${requestScope.list}" varStatus="i">
			<td>
				<a href="itemView.do?itemnumber=${item.itemnumber }">
				<img  src="${item.url}" height="150" width="150" border="2"></a><br>
				상품명 : ${item.name}<br>
				가 격 :${item.price}원
			</td>	
			<c:if test="${i.count%5==0}">
			<tr></tr>
			</c:if>
		</c:forEach>
	</tr>
</table><br><br>


<!-- ㅇ ㅣ부분의 정보는 오늘 본 상품정보를 출력하는 부분이다.  -->
<h2 align="center"><font color="oragne">오늘 본 상품정보</font></h2>
<table align="center">
<Tr>
	<c:forEach var="image" items="${images}">
		<td><img src="${image}" width=100 height=100></td>
	</c:forEach>
</tr>
</table>

</body>
</html>














