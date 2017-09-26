<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function registerData(){
		var f=document.registerForm;
		if(f.id.value==""){
			alert("아이디를 입력하세요");
			return false;
		}
		if(f.password.value==""){
			alert("패스워드를 입력하세요");
			return false;
		}
		if(f.name.value==""){
			alert("이름을 입력하세요");
			return false;
		}
		if(f.address.value==""){
			alert("주소를 입력하세요");
			return false;
		}
		if(f.flag.value=="false"){
			alert("아이디 중복확인하세요");
			return false;
		}
	}//registerData()	
	
	function checkId(){
		//입력된 id값을 먼저 받아와야 한다.
		var str=document.registerForm.id.value;
		//alert(str);
		//입력된 id값이 DB에 있는지의 여부를 묻는 비지니스 로직이 돌아야 한다..새창 띄워서 연결
		window.open("IdcheckServlet?id="+str,"","width=300,height=200,top=100,left=400");
	}//checkId()
	
</script>
</head>
<body>
<h3>회원가입</h3>
<!-- register_action에서 하고있는 기능이  RegisterServletd으로 이동
	 register_result.jsp로 결과를 보낸다.
-->
	<form action="RegisterServlet" name="registerForm" 
	method="post" onsubmit="return registerData()">
		아이디 : <input type="text" name="id">
		<input type="button" value="중복확인" onclick="checkId()">
		<br>		
		패스워드 : <input type="password" name="password"><br>
		이름 : <input type="text" name="name"><br>
		주소 : <input type="text" name="address"><br>	
		<input type="hidden" value="false" name="flag">		
		<input type="submit" value="회원가입">
	</form>
</body>
</html>























