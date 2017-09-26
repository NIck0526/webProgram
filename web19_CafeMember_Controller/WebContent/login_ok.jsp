<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	MemberVO vo = (MemberVO)session.getAttribute("mvo");
	System.out.println(vo);
	if(vo!=null){
%>
<%= vo.getName() %>님 로그인 성공!!<br>
<a href="cafe.jsp">까페 입장하러 가기</a>
<% } %>
	
</body>
</html>















