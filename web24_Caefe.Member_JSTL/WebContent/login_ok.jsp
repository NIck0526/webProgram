<%@page import="model.MemberVO"%>
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
<c:choose>
	<c:when test="${mvo!=null }">
	${mvo.name}님 로그인 성공!!<br>
	<a href="cafe.jsp">까페 입장하러 가기</a>
	</c:when>
	<c:otherwise>
		<script type="text/javascript">
		alert("로그인 부터 다시하세용");
		location.href="login.jsp";	
		</script>
	</c:otherwise>
</c:choose>
</body>
</html>















