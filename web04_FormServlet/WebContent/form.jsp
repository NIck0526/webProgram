<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- java code�� �Է� :: doGet() / doPost()
		 jsp���� request, response ��ü�� �̹� �����س��� �����ϰ� �ִ�. = ���尴ü
		 
	 -->
	<%
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charet=utf-8");
		
		String name = request.getParameter("name");
		String add = request.getParameter("address");
	%>
	<ul><li>����� �̸� :: <%= name %> </li></ul><br>
	
	<ul><li>����� �ּ� :: <%= add %> </li></ul><br>
</body>
</html>