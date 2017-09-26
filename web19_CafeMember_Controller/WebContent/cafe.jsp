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
	if(vo!= null){
%>
<%= vo.getAddress() %>에 사는 <%= vo.getName() %>님 까페 입장 환영!!<br>
<a href="index.jsp">홈으로</a>
<% }else{ %>
<%--직접 cafe 주소를 치고 들어오는 사람이 있기에 넣어주자!! --%>
	<script type="text/javascript">
		alert("로그인 하셔야 까페입장 하실수 있습니다..");
		location.href="login.jsp";
	</script>
<% } %>
</body>
</html>
















