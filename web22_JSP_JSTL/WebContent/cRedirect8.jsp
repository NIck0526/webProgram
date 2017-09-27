<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl에서의 c:redirect 사용시 특이점</title>
</head>
<body>
Hello Redirect...
<%-- <c:redirect url="cRedirect8_result.jsp?name=HaBaRee%%addr=newyork"></c:redirect> --%>
<!-- jstl로 redirect를 사용하게 되면 param을 이용해서 값을 추가로 넘길 수 있다.  -->
	<c:redirect url="cRedirect8_result.jsp">
		<c:param name="name" value="HaBaRee"/>
	</c:redirect>
</body>
</html>












