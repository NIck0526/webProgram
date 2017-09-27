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
	<c:when test="${mvo!=null}">
		<form action="front.do" method="post" >
			아이디 : <input type="text" name="id" value="${mvo.id}" readonly="readonly"><br>				
			패스워드 : <input type="password" name="password" value="${mvo.password }"><br>
			이름 : <input type="text" name="name" value="${mvo.name}"><br>
			주소 : <input type="text" name="address" value="${mvo.address}"><br>	
				<input type="hidden" value="update" name="command">
				<input type="submit" value="회원정보수정">
		</form>
	</c:when>
	<c:otherwise>
		<script type="text/javascript">
		alert("회원에 대한 정보가 없어서 수정 불가능합니다...");
		location.href="index.jsp";
		</script>
	</c:otherwise>
</c:choose>
</body>
</html>

















