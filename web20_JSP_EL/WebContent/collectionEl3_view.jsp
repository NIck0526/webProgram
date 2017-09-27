<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">1. 우승자 명단 확인. </h2><p>
First. ${winner[0]}<br>
Second. ${winner[1]}<br>
Third. ${requestScope.winner[2]}<br>
<hr>
<h2 align="center">이 달에 가장 많이 팔린 과일입니다..(포도, 오렌지 순으로)</h2><p>
1위 과일 :: ${items[1]}<br>
2위 과일 :: ${items[2]}<br>
<hr>
<h2 align="center">Edgar의 주소를 출력합니다..</h2><p>
Edgar의 주소 :: ${map.Edgar}<br>
Gosling의 주소 :: ${map["Gosling"]}<br>
 (Edgar)  :: ${param.name} 가 사는 곳은 ... ${map[param.name]} 입니다 ...<br>
 (Edgar)  :: ${param.name} 가 사는 곳은 ... ${map.param.name} 입니다 ...<br>
</body>
</html>















