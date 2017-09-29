<%@page import="vo.MemberVO"%>
<%@page import="org.eclipse.jdt.internal.compiler.ast.MemberValuePair"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>choose, when, otherwise의 사용법을 익히자.</title>
</head>
<body>
<%
	MemberVO vo = new MemberVO("jstl","1234","제임스","뉴욕");
	request.setAttribute("vo", vo);
%>
1. EL TEST....<br>
<ul>
	<li>NAME :: ${vo.name}</li>
	<li>ADDR :: ${requestScope.vo.address}</li>
</ul><P><HR>
2. JSTL TEST.....choose, when, otherwise<p>
<%--
	주소가 뉴욕이라면 ~~ 님은 뉴욕에 거주하십니다..를 출력
	주소가 판교라면 ~~ 님은 판교에 거주하십니다..를 출력
	위의 주소 둘다 아닐경우 ~~님은 사이판에서 휴양중이십니다..를 출력
 --%>
  
<c:choose>
	<c:when test="${requestScope.vo.address=='뉴욕'}">
		${requestScope.vo.name}님은 뉴욕에 거주하십니다<br>
	</c:when>
	<c:when test="${requestScope.vo.address=='판교'}">
		${requestScope.vo.name}님은 판교에 거주하십니다<br>
	</c:when>
	<c:otherwise>
		${requestScope.vo.name}님은사이판에서 휴양중이십니다...<br>
	</c:otherwise>
</c:choose>
</body>
</html>


















