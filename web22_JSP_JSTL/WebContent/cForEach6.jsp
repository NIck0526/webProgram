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
<%
	String [] arr ={"삼계탕","샌드위치","곰탕","된장찌개"};
	request.setAttribute("MENU", arr);
	
%>
<jsp:forward page="cForEach_result.jsp"></jsp:forward>
</body>
</html>