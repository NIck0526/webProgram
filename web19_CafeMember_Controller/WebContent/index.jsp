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
<h1>LoginMember MODEL2 회원관리</h1><p>
<%--
	로그인하지 않은 사용자는 단순한 회원검색, 로그인, 회원 가입 기능만 할수 있도록 한다
	로그인 한 사용자는 단순한 회원검색, 전체회원보기,회원정보수정, 로그아웃 기능을 할수 있도록 한다
 --%>
 <a href="find.jsp" >회원 검색</a><br>
 <%
 	MemberVO vo = (MemberVO)session.getAttribute("mvo");
 	if(vo !=null){
 %>
 <a href="front.do?command=logout" >로그 아웃</a><br>
 <a href="front.do?command=allView" >전체 회원 보기</a><br>
 <a href="update.jsp" >회원 정보 수정</a><br>
 <a href="selectAddress.jsp" >주소별 검색</a><br>
 <% }else{ %>
 <a href="login.jsp" >로그인 </a><br>
 <a href="register.jsp" >회원 가입</a><br>
<% } %>
</body>
</html>















