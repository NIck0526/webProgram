<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><h2> 오늘의 점심 메뉴입니다...</h2>
1. EL :: <br>
${MENU[0]},${MENU[1]},${MENU[2]},${MENU[3]}
<hr>
2. JSTL :: <br>
<ul>
	<c:forEach var="dish" items="${MENU}">
	<li>${dish}</li>
	</c:forEach>

</ul>
</body>
</html>











