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
	if(vo !=null){
%>
	<form action="front.do" method="post" >
		아이디 : <input type="text" name="id" value="<%=vo.getId() %>" readonly="readonly"><br>				
		패스워드 : <input type="password" name="password" value="<%=vo.getPassword() %>"><br>
		이름 : <input type="text" name="name" value="<%=vo.getName() %>"><br>
		주소 : <input type="text" name="address" value="<%=vo.getAddress() %>"><br>	
		<input type="hidden" value="update" name="command">
		<input type="submit" value="회원정보수정">
	</form>
<% }else{ %>
	<script type="text/javascript">
		alert("회원에 대한 정보가 없어서 수정 불가능합니다...");
		location.href="index.jsp";
	</script>
<%} %>
</body>
</html>

















