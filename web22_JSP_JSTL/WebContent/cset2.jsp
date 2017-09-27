<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>c:set :: Attribute에 값을 "이름" 으로 지정하는 방법</title>
</head>
<body>
<!--  num1 이라는 변수에 7 값 할당 -->
<c:set var = "num1" value="7"/>
<c:set var = "num2" value="9"/>

<c:set var ="multiple" value="${num1*num2}"/>
<b>${num1} 과 ${num2} 를 곱한 값은 :: ${multiple}</b>
</body>
</html>










