<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 수정</title>
</head>
<body>

	<form action="/board/modify" method="post">
		<label>제목</label>
		<input type="text" name="tTitle" value="${view.tTitle}" /><br />
		
		<label>내용</label>
		<textarea cols="50" rows="5" name="tContents">${view.tContents}</textarea><br />
		
		<button type="submit">완료</button>
	
	</form>
	<p>
		<a href="/board/list">게시물 목록</a>
	</p>
</body>
</html>