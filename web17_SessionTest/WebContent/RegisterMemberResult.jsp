<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% String name = request.getParameter("name"); %>
<% String id = request.getParameter("id"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2> <%= name %>  님 <br>
<%= id %>로 회원가입이 되었습니다.<br>
 축하드립니다.</h2>
 <h3><a href="Try05.html">돌아가기<a/></h3>
</body>
</html>