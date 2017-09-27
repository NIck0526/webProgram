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
<c:if test="true">
	<script type="text/javascript">
		alert("JSTL Good!!!");
	</script>
</c:if>
<c:if test="false">
	test에 대한 값이 false이기에 이 부분은 무조건 수행되지 않는다...
</c:if>
<a href="jstl1_result.jsp?command=jstlReview">파라미터를 get 방식으로 다른 페이지에 전달함.</a><p>
<hr>
<a href="jstl1_result.jsp?id=jstl&age=66">파라미터 아이디와 나이를 다른 페이지에 전달함.</a><p>
<hr>
<a href="jstl1_result.jsp?age=33">파라미터로 나이를 다른 페이지에 전달함.</a><p>
<hr>
</body>
</html>



















