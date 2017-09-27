<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function closeWindow(result) {
		//flag값이 true/false인지를 알아야 로직을 전개할수 있다.
		var of=window.opener.document.registerForm;
		if(result=='true'){ //아이디가 존재...
			of.id.value="";
			of.id.focus();
		}else{ //해당 아이디가 존재하지 않기 때문에 사용 가능
			of.password.focus();
			of.flag.value= of.id.value;
		}
			//window.self.close();
			self.close();
	}
</script>
<%-- <%
	boolean flag=(Boolean)request.getAttribute("flag");
	String id = request.getParameter("id");
	String mess = "해당 ID를 사용할 수 없음!! ";
	if(flag==false) //아이디가 없는 경우
	mess = "해당 ID를 사용할 수 있음!! ";
%> --%>

<c:set var="message" value="사용할 수 없는 아이디"/>
<c:if test="${flag==false }">
	<c:set var="message" value="사용할 수 있는 아이디"/>
</c:if>

</head>
<body bgcolor="orange">
${param.id}, ${message}<br><br>
<input type="button" value="확인" onclick="closeWindow('${flag}')">
</body>
</html>

















