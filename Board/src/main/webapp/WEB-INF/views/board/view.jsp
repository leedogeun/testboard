<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 작성</title>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$('.modify'}).on('click',function(e){ 
			var password = $('#password').val(); 
			console.log(password);;
		}); 
	});

</script>

</head>
<body>
	<label>제목</label> ${view.tTitle}
	<br />
	<label>작성자</label> ${view.tWriter}
	<br />
	<label>내용</label> ${view.tContents }

	<div>
		<label>비밀번호</label>
		<input id= "password" type="password" name="password" />

		<input type="button" id="modify" class="modify?tNo=${view.tNo}" value="수정"/>
		<input type="button" class="delete?tNo=${view.tNo}" value="삭제"/>
		<a href="/board/list">게시물 목록</a>
	</div>
</body>
</html>