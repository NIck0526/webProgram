<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<!-- 
EL ::
jsp에서 자바 코드 부분을 줄이고자 나온 기술
tag기반으로 jsp를 만들기 위해서는 필수적인 조건이다.

Attribute에 바인딩된 값을 일단 출력하는 목적
1. $ 브레이스
2.EL안에 들어가는 부분은 변수이름이 아니라 바인딩 할때 지정한 이름이다
3. EL 에서 Attribute는
	requestScope | sessionScope | applicationScope
4. 서로다른 Attribute에 동일한 이름으로 뭔가를 바인딩 하면
	requestScope서 먼저 해당하는 이름을 찾아서 출력해버리고
	다른 
 -->

<body>
<h2>Attribute에 바인딩된 값을 가져오겠습니다...</h2><p>
<b>1~100 까지의 합산 결과는(Basic Element) 1) :: </b>
<%=
	request.getAttribute("RESULT") %><br>
<%=
	session.getAttribute("RESULT") %>	
<HR><P>

<b>1~100 까지의 합산 결과(EL) 2) :: </b>
${requestScope.RESULT}<br>
${sessionScope.RESULT}<br>
${RESULT+7}<br>
${name}<br>
</body>
</html>



















