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
<h2>jstl1_if.jsp 에서 넘어온 파라미터 값을 받습니다...</h2><p>
1. 전달된 값 :: ${param.command}<p>
<hr>
<!-- id가 jstl이고 age가 66일때만 id,age값을 출력하도록...  -->
<!-- c:if 사용 -->
2. 전달된 값의 파라미터 ID ::    , AGE ::      <p>
   


<hr>

<!-- 받아온 나이가 19세 미만이면 ~~세 미성년자라서 까페 출입을 제한합니다..를 출력하시고
     그렇지 않다면 ~~세는 성인인증 가능 나이임으로 까페 출입을 환영합니다...를 웹으로 출력
	 c:if  사용함.
 -->
 
3. 받아온 나이 출력 ::     세는 세 미성년자라서 까페 출입을 제한합니다.<br>


3. 받아온 나이 출력 ::    세는 성인인증 가능 나이임으로 까페 출입을 환영합니다.<br>

</body>
</html>




















