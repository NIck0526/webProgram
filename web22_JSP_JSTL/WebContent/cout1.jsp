<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- 
    1. 가장 먼저 lib를 추가해야한다.
       1) standard.jar   2) jstl.jar
    2. 지시어에 반드시 tag lib에 대한 값을 연결하고 시작
    	2가지 속성을 기입... prefix, uri
     -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl :: 출력을 담당하는 out기능을 살펴보겠다.</title>
</head>
<body>
<c:out value="<input>는 <form>의 서브 태그입니다."></c:out><p>
<c:out value="<h1>오늘의 과제</h1>" escapeXml="false"></c:out><p>
<c:out value="<font size=7>커다란 글씨</font>" escapeXml="false"></c:out><p>
</body>
</html>