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

<h2><%= vo.getName() %> �� ������ ȯ���մϴ�.</h2>
<A href="index.html">HOME���� ����</A><P>
<A href="AllServletMember">��ü ȸ�� ����</A>
</body>
</html>