<!-- ���尴ü
request, response, out
page, session,
application, exception
  -->


<!-- Directive Element(���þ�) :: �����Ͻ����� �����̳ʿ��� �˷��ִ� ����  -->
<%@ page import="context.model.MemberVO, java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- jsp comment :: Scriptlet Element �ڹ� �ڵ常 ����.--%>
<%
	MemberVO vo = (MemberVO)request.getAttribute("vo");
	out.println(vo);
%>
<hr>
<jsp:include page="include.jsp"/>
<h2>����� ������ ����մϴ�...</h2><p>
<!-- thml :: Expression Element -->
ID : <%= vo.getId() %><br>
NAME : <%= vo.getName() %><br>
ADDRESS : <%= vo.getAddress() %><br>
</body>
</html>