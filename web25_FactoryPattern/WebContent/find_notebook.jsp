<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">Find NoteBook</h2><p>
<form action="DispatcherServlet">
Finding Note Model :: <input type="text" name="model">
<input type="hidden" name="command" value="findModel">
<input type="submit" value="send">
</form>
</body>
</html>












