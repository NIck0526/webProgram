<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String[ ] jangs=  {"이순신","을지문덕","강감찬","권율"};
	request.setAttribute("jangs", jangs);
%>
1. 배열에 들어있는 장군들을 Scriptlet, Expression tag를 이용해서 출력(순번 찍혀서)<p>
	<%
	String[ ] jangarr = (String[ ])request.getAttribute("jangs");
	for(int i=0; i<jangarr.length; i++){
	%>
	<%= i+1 %>. <%= jangarr[i] %><br>
	<% } %><p><hr>
	
2. 배열안에 있는 장군들을 JSTL을 이용해서 EL로 출력하기.(순번 찍히도록..) <BR>
	



<hr>
<%
	ArrayList list = new ArrayList();
	list.add("김연아"); list.add("이상화");
	list.add("김혜진"); list.add("손연재");
	list.add("조해리"); list.add("신수진");
	request.setAttribute("list", list);
%>	
3. ArrayList안에 들어있는 데이타들을 JSTL을 이용해서 출력하기<P>




	<p><hr>
4. ArrayList안에 들어있는 데이타들중 1~3위 사람만 골라서 출력...<P>




	<p><hr>

</body>
</html>






























