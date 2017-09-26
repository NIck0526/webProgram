<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function closeWindow(result){
		//flag 값이 true/flase 인지를 알아야 로직을 전개할 수 있다.
		var of= window.opener.document.registerForm;
		if(result=='true'){//아이디가 존재...
			of.id.value="";
			of.id.focuse();
		}else{//해당 아이디가 존재하지 않기 때문에 사용 가능.
			of.password.focus();
			of.flag.value= of.id.value;
		}
		//window.self.close();
		self.close();
	}

</script>
<%
	boolean flag = (Boolean)request.getAttribute("flag");
	String id = request.getParameter("id"); // forwarding일시에 그대로 가져올 수 있음 | 바인딩 no필요
	String mess = "해당 아이디를 사용할 수 없음!!";
	if(flag==false) // 아이디가 없는 경우
	mess = "사용 가능한 아이디 입니다.";
%>
</head>
<body bgcolor="orange">
<%=id %> <%=mess %><br><br>
<input type="button" value="확인" onclick="closeWindow('<%=flag %>')">
</body>
</html>

















