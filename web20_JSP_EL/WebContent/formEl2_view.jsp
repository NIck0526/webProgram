<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>:: Form에 넘어온 값을 일단 받아서(컨트롤러) EL로 출력하기 :: </title>
</head>
<body>
<h2>html폼에 넘겨진 값을 받습니다...</h2><p>
<b>1. 기존의 JSP Element (Scriptlet Eelement, Expression Element)를 사용해서 값 출력하기</b><p>
<%
	String id = request.getParameter("id");
%>
<b><%= id %></b>
<hr>
<b>2. EL 식을 이용해서 값 출력하기. </b><P>
아이디 : ${param.id}<br><!-- request.getParameter("id") -->
<hr>
선택된 동물들 ::<br>
${paramvalues.pet[0]}
${paramvalues.pet[1]}
${paramvalues.pet[2]}
${paramvalues.pet[3]}
${paramvalues.pet[4]}

</body>
</html>































