<%@page import="java.util.ArrayList"%>
<%@page import="vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>EL로 정보확인 하기. </h3><P>
1. JSP Element로 정보출력하기...<br>
<%
	MemberVO vo = (MemberVO)session.getAttribute("vo");
%>
MemberVO의 정보 출력 ::  <%=session.getAttribute("vo") %>  <br>

2. EL로 정보 출력하기....<br>
MemberVO의 정보 출력 ::  ${vo} <br>
<hr>
<%--------------------------------------------------------- --%>

1. ArrayList의 내용을 JSP Element로 출력하기 <br>
<% ArrayList list= (ArrayList)session.getAttribute("list"); %>
list에 담긴 내용들 ::<%=list %>     <br>
율리아만 출력 ::<%= list.get(1) %> 
<p>
2. ArrayList의 내용을 EL로 출력하기<br>
율리아만 출력 ::${list[1]}
<hr>
<%--------------------------------------------------------- --%>

1. map에 담긴 내용을 JSP Element로 출력하기 <br>
 map에 담긴 내용들 ::  <%=session.getAttribute("map") %>   <br>
 			
2.map에 담긴 내용을 EL 로 출력하기 <br>
 map에 담긴 내용들 :: ${map}    <br>
</body>
</html>






























