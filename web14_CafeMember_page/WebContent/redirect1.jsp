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
	String url = "https://search.naver.com/search.naver?where=nexearch";
	String keyword = request.getParameter("word");
	url += "&query="+keyword;
	
	response.sendRedirect(url);
%>
</body>
</html>







