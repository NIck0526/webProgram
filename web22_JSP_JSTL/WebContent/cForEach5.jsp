<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
                 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>for문 사용법</title>
</head>
<body>
<c:forEach var="cnt" begin="1" end="10" step="2"> <!-- step 은 없어두 괜찮아요. -->
	<font size="${cnt}">야호~~ 점심시간이당~~<br></font>

</c:forEach>
</body>
</html>