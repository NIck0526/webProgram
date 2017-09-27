<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:choose>
	<c:when test="${param.num1=='0' }">
		방가방가
	</c:when>
	<c:when test="${param.num1=='1' }">
		뿡뿡뿡뿡
	</c:when>
	<c:otherwise>
		뿌지지직
	</c:otherwise>
</c:choose>
</body>
</html>

<!--
제어문
c:choose  c:when | c:otherwise    /c:choose

c:if


for
  -->











