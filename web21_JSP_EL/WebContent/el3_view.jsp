<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
1. Scriptlet으로 출력<p>
<%
	String[] menus = request.getParameterValues("menu");
	for(String menu : menus){
		
%>
<%= menu %>
<%} %>
<hr>
2. EL 로 출력 :: EL에서는 Looping문을 다룰 수 없다. -->>> JSTL에서 다루겠다.<P>
${paramValues.menu[0]} ${paramValues.menu[1]} ${paramValues.menu[2]} ${paramValues.menu[3]}
</body>
</html>















