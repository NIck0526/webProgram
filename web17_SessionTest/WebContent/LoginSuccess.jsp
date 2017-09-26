<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <% String id = (String)session.getAttribute("user"); %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>
<%= id %>님 로그인 되었습니다.<br></h2>
 <h3><a href="Try05.html">메인페이지로 돌아가기<a/></h3>
</body>
</html>