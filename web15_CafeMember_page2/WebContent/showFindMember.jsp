<%@page import="context.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	MemberVO vo = (MemberVO)request.getAttribute("vo");
%>
<hr>
<h2>����� ������ ����մϴ�...</h2><p>
ID : <%= vo.getId() %><br>
NAME : <%= vo.getName() %><br>
ADDRESS : <%= vo.getAddress() %><br>

</body>
</html>