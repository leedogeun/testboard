<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 조회</title>
</head>
<body>
	<form method="post">
	<label>제목</label>
	<input type="text" name="tTitle" /><br />
	
	<label>작성자</label>
	<input type="text" name="tWriter" /><br />
	
	<label>비밀번호</label>
	<input type="password" name="tPassword" /><br />
	
	<label>내용</label>
	<textarea cols="50" rows="5" name="tContents"></textarea>
	
	<button type="submit">작성</button>
	</form>
</body>
</html>